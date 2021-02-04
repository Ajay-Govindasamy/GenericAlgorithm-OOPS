package genetic_algorithm.mutation;

import genetic_algorithm.population.Population;

/**
 * This class will be used to perform the mutation Operation of the Genetic Algorithm
 * The mutate method should be implemented by every subclass.
 * It takes in a population and returns it.
 *
 * @author AISHWARYA SUKALE,20251514
 */

public interface Mutation {
    /**
     * This method will be defined by all subclasses.
     *
     * @param population is the Population Object.
     * @return Population
     */

    public abstract Population mutate(Population population);
}