package genetic_algorithm.selection;


import genetic_algorithm.population.Population;

/**
 * This class is used to do selection process by choosing the first and second
 * fittest Individual among the Population, it implements @see GeneticFunctions
 *
 * @author HRITIK GUPTA,20251132
 */

public class RankSelection implements Selection {

    public RankSelection(Population population) {
        performSelection(population);
    }

    /**
     * @return population
     * @purpose This function executes the operation of the Rank Selection genetic Operation
     */

    public Population performSelection(Population population) {
        population.setFittestIndividual(population.getMostFittest());
        population.setSecondFittestIndividual(population.getSecondFittest());
        return population;
    }
}



