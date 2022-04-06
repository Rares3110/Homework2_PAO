public class Square implements Polygon {
    Point up_left, up_right, down_right, down_left;
    public Square(Point up_left, Point up_right, Point down_right, Point down_left){
        this.up_left = up_left;
        this.up_right = up_right;
        this.down_right = down_right;
        this.down_left = down_left;
    }
    @Override
    public String Area() {
        Double rez = Math.sqrt((up_left.getX() - up_right.getX()) * (up_left.getX() - up_right.getX()) +
                (up_left.getY() - up_right.getY()) * (up_left.getY() - up_right.getY()));
        rez = rez * rez;
        return "The square has area = " + rez.toString() + "\n";
    }
}
