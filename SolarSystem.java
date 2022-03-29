package solarsystem;

import exceptions.DuplicateCelestialBodyException;
import exceptions.InvalidCelestialBodyException;

/**
 * Tests the implementation of solar system package and exceptions package
 *
 * @author
 * @since
 * @version
 */
public class SolarSystem {
    public static void main(String[] args) throws InvalidCelestialBodyException {
        try {
            Star sun = new Star("sun", 5778000);
            Planet mercury = new Planet("mercury", sun);
            Planet venus = new Planet("venus", sun);
            Planet earth = new Planet("earth", sun);
            Planet mars = new Planet("mars", sun);
            Planet jupiter = new Planet("jupiter", sun);
            Planet saturn = new Planet("saturn", sun);
            Planet uranus = new Planet("uranus", sun);
            Planet neptune = new Planet("neptune", sun);

            sun.add(mercury);
            sun.add(venus);
            sun.add(earth);
            sun.add(mars);
            sun.add(jupiter);
            sun.add(saturn);
            sun.add(uranus);
            sun.add(neptune);

            Moon moon = new Moon("moon", earth);
            earth.add(moon);

            Moon phobos = new Moon("phobos", mars);
            Moon deimos = new Moon("deimos", mars);
            mars.add(phobos);
            mars.add(deimos);
            Moon x = new Moon("x", sun);
        }catch (DuplicateCelestialBodyException e) {
            System.out.println("The celestial body already exists in the collection");
        }
    }
}

