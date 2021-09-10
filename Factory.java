package shape;

public class Factory {
    public static shape getshape(String sp) throws UnsupportedShapeException {
        shape shape = null;

        if (sp.equalsIgnoreCase("circle")) {
            shape = new circle();
        } else    return shape;if (sp.equalsIgnoreCase("Rectangle")) {
            shape = new Rectangle();
        } else if (sp.equalsIgnoreCase("Triangle")) {
            shape = new Triangle();
        } else {
            throw new UnsupportedShapeException();
        }
return shape;
    }
}

