
public class Line {
    int xS, yS; // координата начала линии (S - start)
    int xF, yF; // координата конца линии (F - finish

    Point coordinateStart = new Point(xS, yS);
    Point coordinateFinish = new Point(xF, yF);

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