public class Square {

    int leftPointX;
    int leftPointY;
    public int sideLength;


    public Square(int leftPointX, int leftPointY, int sideLength) {
        this.leftPointX = leftPointX;
        this.leftPointY = leftPointY;
        if (sideLength < 0) throw new IllegalArgumentException("Длина стороны должена быть положительной");
        this.sideLength = sideLength;
    }

    public Square(int leftPointX, int leftPointY) {
        this.leftPointX = leftPointX;
        this.leftPointY = leftPointY;
    }

    @Override
    public String toString() {
        return "Квадрат в точке {" + leftPointX +
                "; " + leftPointY + "} со стороной " +
                sideLength;
    }

    public Square lowLeft(int sideLength) {
        int newLeftPoint = leftPointX - sideLength;
        return new Square(newLeftPoint, leftPointY);
    }




//
//    public int lowRight (int leftPointY, int sideLength) {
//        return leftPointY + sideLength;
//    }
//
//    public int lowRight (int leftPointX, int leftPointY, int sideLength) {
//        return leftPointY + sideLength;
//    }
}
