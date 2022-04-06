public class EquilateralTriangle implements Polygon {
    Point a, b, c;

    public EquilateralTriangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String Area() {
        Double rez = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) +
                (a.getY() - b.getY()) * (a.getY() - b.getY()));
        rez = Math.sqrt(3.0) / 4.0 * rez * rez;
        return "Equilateral triangle has area = " + rez.toString() + "\n";
     }
}
