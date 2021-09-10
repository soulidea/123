package shape;

public class Demo {
    public static void main(String[] args) throws UnsupportedShapeException {
        shape shape;
        shape=Factory.getshape(" ");
        shape.draw();
        shape.erase();
    }
}
