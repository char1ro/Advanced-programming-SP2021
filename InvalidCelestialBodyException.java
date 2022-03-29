package exceptions;

import solarsystem.CelestialBody;

/**
 * Exception handling for adding invalid celestial body to orbit
 *
 * @author
 * @since
 * @version
 */
public class InvalidCelestialBodyException extends Exception {
    public <T extends CelestialBody> InvalidCelestialBodyException(T celestialBody1, T celestialBody2) {
        System.out.println("A " + celestialBody1.getName() + " must orbit a " + celestialBody2.getName());
    }
}

