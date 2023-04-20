package Test_AI.day0331;

/**
 * @author Jerforce
 * @date 2023/4/8 星期六 16:32:37
 */
public interface Demo111 {

    // Interface for polymorphism example
    interface Shape {
        double getArea();
    }

    // Rectangle class implementing Shape interface
    class Rectangle implements Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Implement getArea method from Shape interface
        @Override
        public double getArea() {
            return length * width;
        }
    }

    // Circle class implementing Shape interface
    class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        // Implement getArea method from Shape interface
        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    // Polymorphism example
    public class PolymorphismExample {
        public static void main(String[] args) {
            Shape[] shapes = new Shape[2];
            shapes[0] = new Rectangle(5, 10);
            shapes[1] = new Circle(7);

            for (Shape shape : shapes) {
                System.out.println("Area: " + shape.getArea());
            }
        }
    }
}
