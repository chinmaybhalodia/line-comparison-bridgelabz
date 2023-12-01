public class Line {
    Point p1;
    Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // UC1: calculate the length of the line
    public double calculateLength() {
        double x1 = this.p1.x;
        double y1 = this.p1.y;

        double x2 = this.p2.x;
        double y2 = this.p2.y;

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // UC2: check if 2 lines have equal lengths
    public static boolean checkEquality(Line l1, Line l2) {
        return l1.calculateLength() == l2.calculateLength();
    }

    // UC3: compare the lengths of the lines
    public static void compareLengths(Line l1, Line l2) {
        int res = Double.compare(l1.calculateLength(), l2.calculateLength());
        if (res > 0) {
            System.out.println("Line 1 is longer than Line 2");
        } else if (res < 0) {
            System.out.println("Line 2 is longer than Line 1");
        } else {
            System.out.println("Both lines have equal lengths");
        }
    }
}
