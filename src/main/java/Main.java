public class Main {
    static public void main(String args[])
    {
        //Adapter
        Dog husky = new DogImpl("Benji", 5);
        System.out.print(husky.Info());
        DogAdapter huskyROM = new DogAdapterImpl(husky);
        System.out.print(huskyROM.Info());

        //Factory
        PolygonFactory polygonFactory = new PolygonFactory();
        Polygon pol1 = polygonFactory.getPolygon(new Point[]{
                new Point(0, 1),
                new Point(1, 1),
                new Point(1, 0),
                new Point(0, 0)});
        System.out.print(pol1.Area());
        Polygon pol2 = polygonFactory.getPolygon(new Point[]{
                new Point(-1, 1.5),
                new Point(1, -2),
                new Point(3, 1.5)});
        System.out.print(pol2.Area());
    }
}
