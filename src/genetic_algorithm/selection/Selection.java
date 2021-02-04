package genetic_algorithm.selection;

import genetic_algorithm.population.Population;

public interface Selection {
    /**
     * This method should be implemented by each subclass of Selection.
     * This function executes either operation of the Random Selection or Rank Selection genetic Operation
     *
     * @param population, the Population to be worked on.
     * @return Population object
     */
    abstract Population performSelection(Population population);
}

