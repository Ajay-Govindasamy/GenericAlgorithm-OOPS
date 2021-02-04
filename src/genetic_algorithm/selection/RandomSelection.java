package genetic_algorithm.selection;

import java.util.Random;

import genetic_algorithm.population.Population;


/**
 * This is my RandomSelection class.
 * This class is used to do selection process by choosing the two random
 * Individual among the Population, it implements @see GeneticFunctions
 *
 * @author HRITIK GUPTA,20251132
 */

public class RandomSelection implements Selection {
    public RandomSelection(Population population) {
        performSelection(population);
    }


    /**
     * @return population
     * @purpose This function executes the operation of the Random Selection genetic Operation
     */

    public Population performSelection(Population population) {
        Random random = new Random();
        population.setFittestIndividual(population.getIndividuals()[random.nextInt(population.getPopulationSize())]);
        population.setSecondFittestIndividual(population.getIndividuals()[random.nextInt(population.getPopulationSize())]);
        return population;
    }
}


