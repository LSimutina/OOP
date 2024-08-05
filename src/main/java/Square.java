public class Square {

    int leftPointX;
    int leftPointY;
    public int sideLength;


    public Square(int leftPointX, int leftPointY, int sideLength) {
        this.leftPointX = leftPointX;
        this.leftPointY = leftPointY;
        isPositiveSideLength(sideLength);
        this.sideLength = sideLength;
    }

    public void setLeftPointX(int leftPointX) {
        this.leftPointX = leftPointX;
    }

    public void setLeftPointY(int leftPointY) {
        this.leftPointY = leftPointY;
    }

    public void setSideLength(int sideLength) {
        isPositiveSideLength(sideLength);
        this.sideLength = sideLength;
    }

    private void isPositiveSideLength(int sideLength){
        if (sideLength < 0) {
            throw new IllegalArgumentException("Длина стороны должена быть положительной");
        }
    }

    @Override
    public String toString() {
        return "Квадрат в точке {" + leftPointX +
                "; " + leftPointY + "} со стороной " +
                sideLength;
    }
}
