package solarsystem;

import exceptions.DuplicateCelestialBodyException;
import java.util.ArrayList;
import java.util.List;

public class CelestialBody {
    private String name;
    private String type;
    List<CelestialBody> children = new ArrayList<>();

    public CelestialBody(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    
     public void add(CelestialBody celestialBody) throws DuplicateCelestialBodyException {
        for (CelestialBody child : getChildren()) {
            if (child.getName().equalsIgnoreCase(celestialBody.getName()))
                throw new DuplicateCelestialBodyException(celestialBody);
        }
        getChildren().add(celestialBody);
        System.out.println("The " + celestialBody.getType() + " "
                + celestialBody.getName() + " " + "was added successfully to "
                + getName());
    }
    public List<CelestialBody> getChildren() {
        return children;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    