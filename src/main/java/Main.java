public class Main {
    public static void main(String[] args) {
//        6. ООП
//        Задание 4
//        Задание 3
//        Задание 2

//        Line line1 = new Line(new Point(1, 3), new Point(5, 8));
//        Line line2 = new Line(new Point(10,11), new Point(15,19));
//        Line line3 = new Line(line1.coordinateFinish, line2.coordinateStart);

        Line line1 = new Line(1, 3, 5, 8);
        Line line2 = new Line(10, 11, 15, 19);
        Line line3 = new Line(line1.xF, line1.yF, line2.xS, line2.yS);

        System.out.println("line1 " + line1);
        System.out.println("line2 " + line2);

//        Текстовое представление Линии 3
        System.out.println("line3 " + line3);
        System.out.println(" ");
//        Измененное текстовое представление Линии 3 (переделать)
        line1.xF = 10;
        line1.yF = 10;
        line2.xS = 10;
        line2.yS = 10;

        Line lineTmp = new Line(line1.xF, line1.yF, line2.xS, line2.yS);
        line3=lineTmp;

        System.out.println("line1 " + line1);
        System.out.println("line2 " + line2);
        System.out.println("line3 " + line3);

//        Суммарная длина всех трех линий
        System.out.println(line1.getLength() + line2.getLength() + line3.getLength());


//        Задание 1
/*
        Point coordinate1 = new Point(1, 3);
        Point coordinate2 = new Point(1, 3);
        Point coordinate3 = new Point(5, 8);

        System.out.println(coordinate1);
        System.out.println(coordinate2);
        System.out.println(coordinate3);

        System.out.println(coordinate1 == coordinate2);
        System.out.println(coordinate2 == coordinate3);
*/
    }
}