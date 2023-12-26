public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7.0);
        System.out.println(" The Area of the circle: "+ circle.getArea() + " and the Circumference of the circle: "+circle.getCircumference());

        circle.setRadius(14.0);

        System.out.println("\nThe Area of the circle: "+ circle.getArea() + " and the Circumference of the circle: "+circle.getCircumference());
    }
}
