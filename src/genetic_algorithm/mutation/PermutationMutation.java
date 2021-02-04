package genetic_algorithm.mutation;

import java.util.Random;

import genetic_algorithm.population.Population;

/**
 * This class is used to perform the permutation mutation, it
 * implements @see GeneticFunctions
 *
 * @author AISHWARYA SUKALE,20251514
 */

public class PermutationMutation implements Mutation {
    /**
     * This will call the actual mutate method on the population.
     *
     * @param population The population object
     */

    public PermutationMutation(Population population) {
        mutate(population);
    }

    /**
     * This method performs the normal type of mutation, which is it occurs only 10% of the time.
     *
     * @param population, The population to be worked on
     * @return Population
     */

    public Population mutate(Population population) {
        Random random = new Random();

        int mutationPoint1 = random.nextInt(population.getIndividuals()[0].getGeneLength());
        int mutationPoint2 = random.nextInt(population.getIndividuals()[0].getGeneLength());

        int temp = population.getFittestIndividual().getGenes()[mutationPoint1];
        population.getFittestIndividual().getGenes()[mutationPoint1] = population.getSecondFittestIndividual()
                .getGenes()[mutationPoint2];
        population.getSecondFittestIndividual().getGenes()[mutationPoint2] = temp;
        return population;
    }
}
