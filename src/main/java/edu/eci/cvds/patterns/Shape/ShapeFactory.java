package edu.eci.cvds.patterns.Shape;

import edu.eci.cvds.patterns.Shape.concrete.Quadrilateral;
import edu.eci.cvds.patterns.Shape.concrete.hexagon;
import edu.eci.cvds.patterns.Shape.concrete.pentagon;
import edu.eci.cvds.patterns.Shape.concrete.triangle;


public class ShapeFactory {

    public Shape create (RegularShapeType type){
        switch(type) {
        case Triangle:
            return new triangle();
        case Quadrilateral:
            return new Quadrilateral();
        case Pentagon:
            return new pentagon();
        case Hexagon:
            return new hexagon();
        }
    }
}
