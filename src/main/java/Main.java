public class Main {
    public static void main(String[] args) {
//        6. ООП
//        Задание 4
//        Задание 3
//        Задание 2

//        Задаем значения с указанием двух Точек
//        Line line1 = new Line(new Point(1, 3), new Point(5, 8));
//        Line line2 = new Line(new Point(10,11), new Point(15,19));
//        Line line3 = new Line(line1.coordinateFinish, line2.coordinateStart);

//        Задаем значения с указанием четырех целых чисел (x y начала и x y конца)
        Line line1 = new Line(1, 3, 5, 8);
        Line line2 = new Line(10, 11, 15, 19);
        Line line3 = new Line(line1.coordinateFinish.x, line1.coordinateFinish.y, line2.coordinateStart.x, line2.coordinateStart.y);

//        Текстовое представление Линии 3
        System.out.println("Текстовое представление Линии 3");
        System.out.println("line3 " + line3);
        System.out.println(" ");

//        Измененное текстовое представление Линии 3 (переделать)
        line3.coordinateStart.x = 2;
        line3.coordinateStart.y = 4;
        line3.coordinateFinish.x = 6;
        line3.coordinateFinish.y = 8;

        System.out.println("Измененное представление Линии 3");
        System.out.println("line3 " + line3);
        System.out.println(" ");

//        Суммарная длина всех трех линий
        System.out.println("Суммарная длина всех трех линий:");
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