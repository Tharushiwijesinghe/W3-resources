public class Main {
    public static void main(String[] args) {
        Rectangle ob1 = new Rectangle(13,43);
        Rectangle ob2 = new Rectangle(41,42);

        System.out.println("\nArea and perimeter of Rectangle 1: "+ ob1.getArea()+ " and "+ob1.getPerimeter());
        System.out.println("\nArea and perimeter of Rectangle 2: "+ ob2.getArea()+ " and "+ob2.getPerimeter());

        ob1.setHeight(9);
        ob2.setWidth(22);

        System.out.println("\nArea and perimeter of Rectangle 1: "+ ob1.getArea()+ " and "+ob1.getPerimeter());
        System.out.println("\nArea and perimeter of Rectangle 2: "+ ob2.getArea()+ " and "+ob2.getPerimeter());
    }
}
