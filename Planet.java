package solarsystem;

import exceptions.InvalidCelestialBodyException;

/**
 * Implementation of Planet
 *
 * @author
 * @since
 * @version
 */
public class Planet extends CelestialBody implements IOrbit {

    private CelestialBody orbits;

    /**
     *
     * @param name Name of the planet
     * @param orbits The orbit around which the planet revolves
     * @throws InvalidCelestialBodyException
     */
    public Planet(String name, CelestialBody orbits) throws InvalidCelestialBodyException {
        super(name, "planet");
        if (orbits instanceof Star)
            this.orbits = orbits;
        else
            throw new InvalidCelestialBodyException(this, orbits);
    }

    @Override
    public void getOrbit() {
        System.out.println(getName() + " is orbiting the Star " + orbits.getName());
    }
}



























