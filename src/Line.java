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
}
