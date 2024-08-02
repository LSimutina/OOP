public class Line {
    Point coordinateStart;
    Point coordinateFinish;

    public Line(int xS, int yS, int xF, int yF) {
        this.coordinateStart = new Point(xS,yS);
        this.coordinateFinish = new Point(xF,yF);
    }

    public Line(Point coordinateStart, Point coordinateFinish) {
        this.coordinateStart = coordinateStart;
        this.coordinateFinish = coordinateFinish;
    }

    public String toString() {
        return "Линия от " +
                coordinateStart +
                " до " + coordinateFinish;
    }

    public int getLength() {
        return (int) Math.sqrt(Math.pow((coordinateFinish.x - coordinateStart.x), 2) + Math.pow((coordinateFinish.y - coordinateStart.y), 2));
    }
}