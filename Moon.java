package solarsystem;

import exceptions.InvalidCelestialBodyException;

/**
 * Implementation of Moon
 *
 * @author
 * @since
 * @version
 */
public class Moon extends CelestialBody implements IOrbit {

    private CelestialBody orbits;

    /**
     *
     * @param name Name of the moon
     * @param orbits The orbit around which the moon revolves
     * @throws InvalidCelestialBodyException
     */
    public Moon(String name, CelestialBody orbits) throws InvalidCelestialBodyException {
        super(name, "moon");
        if (orbits instanceof Planet)
            this.orbits = orbits;
        else
            throw new InvalidCelestialBodyException(this, orbits);
    }

    @Override
    public void getOrbit() {
        System.out.println(getName() + " is orbiting the Planet " + orbits.getName());
    }
}

