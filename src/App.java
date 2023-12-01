public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Line Comparison Program");

        // Line l1
        Line l1 = new Line(new Point(2, 5), new Point(7, 11));

        // calculating length of l1
        System.out.println("Length of line l1 is: " + l1.calculateLength());

        // Line l2
        Line l2 = new Line(new Point(-3, 0), new Point(12, 9));

        // checking if lengths of l1 and l2 are equal
        System.out.println("The lines have equal lengths: " + Line.checkEquality(l1, l2));
    }
}