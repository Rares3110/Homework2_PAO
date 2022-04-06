public class PolygonFactory
{
    public Polygon getPolygon(Point[] points)
    {
        if(points.length == 3)
            return new EquilateralTriangle(points[0], points[1], points[2]);
        else if(points.length == 4)
            return new Square(points[0], points[1], points[2], points[3]);

        return null;
    }
}
