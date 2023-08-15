import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shape = new ArrayList<>();
        List<Shape> shapeCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setColor("Green");
        circle.setRadius(20);

        shape.add(circle);

        Circle cloneCircle = (Circle) circle.clone();
        shapeCopy.add(cloneCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Red");
        rectangle.setX(20);
        rectangle.setY(20);
        rectangle.setHeight(10);
        rectangle.setWidth(10);

        shape.add(rectangle);


        Rectangle rectangleCopy = (Rectangle) rectangle.clone();
        shapeCopy.add(rectangleCopy);

        Rectangle rectangleCopy2 = (Rectangle) rectangle.clone();
        shapeCopy.add(rectangleCopy2);

        System.out.println("Muestra la lista de los originales");

        for (Shape item : shape) {
            System.out.println("Color de la figura " + item.getColor());
        }

        System.out.println("Muestra la lista de las copias");

        for (Shape value : shapeCopy) {
            System.out.println("Color de la figura " + value.getColor());
        }

    }
}