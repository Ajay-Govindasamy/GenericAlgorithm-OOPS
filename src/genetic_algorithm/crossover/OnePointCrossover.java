package genetic_algorithm.crossover;

import java.util.Random;

import genetic_algorithm.population.Population;

/**
 * This class is used to take one single point from the parents and to swap the
 * genes to perform the crossover operation, it implements @see GeneticFunctions
 *
 * @author AJAY GOVINDASAMY ,20251024
 */

public class OnePointCrossover implements Crossover {

    public OnePointCrossover(Population population) {
    	performCrossover(population);
    }


    /**
     * @param population
     * @return population
     * @purpose This function executes the operation of the OnePointCrossover genetic 
     * function
     */

    public Population performCrossover(Population population) {
        Random randomNum = new Random();

        // Select a random crossover point from default Random Class
        int crossOverPoint = randomNum.nextInt(population.getIndividuals()[0].getGeneLength());

        // Swap values among fittest Individuals
        for (int i = 0; i < crossOverPoint; i++) {
            int temp = population.getFittestIndividual().getGenes()[i];
            population.getFittestIndividual().getGenes()[i] = population.getSecondFittestIndividual().getGenes()[i];
            population.getSecondFittestIndividual().getGenes()[i] = temp;
        }
        return population;
    }
}
