
public class Line {
    int xS, yS; // координата начала линии (S - start)
    int xF, yF; // координата конца линии (F - finish

    Point coordinateStart = new Point(xS, yS);
    Point coordinateFinish = new Point(xF, yF);

    public Line(int xS, int yS, int xF, int yF) {
        this.xS = xS;
        this.yS = yS;
        this.xF = xF;
        this.yF = yF;
    }

    public Line(Point coordinateStart, Point coordinateFinish) {
        this.coordinateStart = coordinateStart;
        this.coordinateFinish = coordinateFinish;
    }

    public String toString() {
        return "Линия от {" +
                xS +
                "; " + yS +
                "} до {" + xF +
                "; " + yF +
                "}";
    }

    public String toString(Point coordinateStart, Point coordinateFinish) {
        return "Линия от " +
                coordinateStart +
                " до " + coordinateFinish;
    }

    public int getLength() {
        return (int) Math.sqrt(Math.pow((xF - xS), 2) + Math.pow((yF - yS), 2));
    }
}