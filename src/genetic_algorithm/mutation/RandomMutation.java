package genetic_algorithm.mutation;

import java.util.Random;

import genetic_algorithm.population.Population;

/**
 * This is my RandomMutation Class
 * This is one way to do mutation, which is just pure random. It is a subclass of the Mutation interface.
 *
 * @author AISHWARYA SUKALE,20251514
 */

public class RandomMutation implements Mutation {
    /**
     * This will call the actual mutate method on the population.
     *
     * @param population This is the Population being worked on
     */

    public RandomMutation(Population population) {
        mutate(population);
    }

    /**
     * This method performs the mutation by flipping values with the Individuals
     *
     * @param population The population to be worked on.
     * @return Population
     */

    public Population mutate(Population population) {
        Random randomNum = new Random();

        // Select a random mutation point
        int mutationPoint = randomNum.nextInt(population.getIndividuals()[0].getGeneLength());

        // Flip values at the mutation point
        if (population.getFittestIndividual().getGenes()[mutationPoint] == 0) {
            population.getFittestIndividual().getGenes()[mutationPoint] = 1;
        } else {
            population.getFittestIndividual().getGenes()[mutationPoint] = 0;
        }

        mutationPoint = randomNum.nextInt(population.getIndividuals()[0].getGeneLength());

        if (population.getSecondFittestIndividual().getGenes()[mutationPoint] == 0) {
            population.getSecondFittestIndividual().getGenes()[mutationPoint] = 1;
        } else {
            population.getSecondFittestIndividual().getGenes()[mutationPoint] = 0;
        }
        return population;
    }
}