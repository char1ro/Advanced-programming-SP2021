package solarsystem;

/**
 * Implementation of Star
 *
 * @author
 * @since
 * @version
 */
public class Star extends CelestialBody{
    private int surfaceTemp;

    /**
     *
     * @param name name of the Star
     * @param surfaceTemp Surface temperature of the Star
     */
    public Star(String name, int surfaceTemp) {
        super(name, "star");
        this.surfaceTemp = surfaceTemp;
    }

    /**
     *
     * @return Surface temperature of the star
     */
    public int getSurfaceTemp() {
        return surfaceTemp;
    }
}



