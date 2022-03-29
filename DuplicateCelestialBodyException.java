package exceptions;

import solarsystem.CelestialBody;

/**
 * Exception handling for adding duplicate celestial bodies
 *
 * @author
 * @since
 * @version
 */
public class DuplicateCelestialBodyException extends Exception {
    public DuplicateCelestialBodyException(CelestialBody celestialBody) {
        System.out.println("The " + celestialBody.getType() + " "
                + celestialBody.getName() + " is already in the collection");
    }
}

