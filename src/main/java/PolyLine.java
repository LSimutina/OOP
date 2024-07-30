import java.util.Arrays;

public class PolyLine {
    //массив точек
    Point[] arrPoints;

    public PolyLine(Point... arrPoints) {
        this.arrPoints = arrPoints;
    }

    @Override
    public String toString() {
        return "Линия " + Arrays.toString(arrPoints);
    }

    //метод возвращает массив линий getLines
    public Line[] getLines() {
        Line[] lines = new Line[arrPoints.length - 1];
        for (int i = 0; i < arrPoints.length - 1; i++) {
            lines[i] = new Line(arrPoints[i], arrPoints[i + 1]);
        }
        return lines;
    }

    //метод возвращает свою длину getLength
    public int getLength() {
        int result = 0;
        for (int i = 0; i < arrPoints.length - 1; i++) {
            Line line = new Line(arrPoints[i], arrPoints[i + 1]);
            result += line.getLength();
        }
        return result;
    }

    //метод возвращает длину массива линий
    public int getLengthArrLines(Line[] lines) {
        int result = 0;
        lines = getLines();
        for (int i = 0; i < lines.length; i++) {
            result += lines[i].getLength();
        }
        return result;
    }

}
