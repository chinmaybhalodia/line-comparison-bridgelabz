public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Line Comparison Program");

        // Line l1
        Line l1 = new Line(new Point(2, 5), new Point(7, 11));

        // calculating length of l1
        System.out.println("Length of line l1 is: " + l1.calculateLength());
    }
}