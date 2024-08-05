import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        6. ООП
//        Задание 2. Квадрат
        Square squareHighLeft =new Square(5,2,3);
        System.out.println(squareHighLeft);
//        Square squareLowLeft = squareHighLeft.
        squareHighLeft.setLeftPointX(5);
        squareHighLeft.setLeftPointY(7);
        squareHighLeft.setSideLength(12);

        System.out.println(squareHighLeft);

//        Задание 1. Дробь
/*
        Fraction f1=new Fraction(1, 3);
        Fraction f2=new Fraction(2, 5);
        Fraction f3=new Fraction(7, 8);

        System.out.println(f1.sum(f2).sum(f3).minus(5));
*/
//        Задание 4

//        SetOfPaths path1= new SetOfPaths("Самара", 3);
//        SetOfPaths path2= new SetOfPaths("Саратов", 4);
//        SetOfPaths path3= new SetOfPaths("Воронеж", 120);
//        SetOfPaths path4= new SetOfPaths("Питер", 230);
//        SetOfPaths path5= new SetOfPaths("Волгоград", 180);
//
//        List<SetOfPaths> paths1 = new ArrayList<>();
//        paths1.add(0, path1); // C
//        paths1.add(1, path2); // D
//        paths1.add(2, path3); // E
//        paths1.add(3, path4); //
//        paths1.add(4, path5); //
//
//        System.out.println(paths1);
//
//        City city1= new City("Москва", paths1);
//        System.out.println(city1);
//
//        paths1.add(5,path1);
//        System.out.println(city1);

//        city1.travelBy(3);



/*
//        Задание 3
//        создание ломанной  {1;5}, {2;8}, {5;3}, {8,9}
        Point point1 = new Point(1,5);
        Point point2 = new Point(2,8);
        Point point3 = new Point(5,3);
        Point point4 = new Point(8,9);

        PolyLine polyLine = new PolyLine(point1, point2, point3, point4);

        System.out.println(polyLine);
//        длина ломаной
        System.out.print("Длина Ломаной = ");
        System.out.println(polyLine.getLength());
//        получить массив ломаной
        System.out.print("Массив ");
        Line[] polyLineLength = polyLine.getLines();
        System.out.println(Arrays.toString(polyLineLength));
//        длина массива Линий
        System.out.print("Длина массива Линий = ");
        System.out.println(polyLine.getLengthArrLines(polyLineLength));
//        Сравнение длины Ломаной и длины массива Линий
        System.out.println(polyLine.getLength()==polyLine.getLengthArrLines(polyLineLength));
//      Изменение координаты Точки {2,8} на значение {12,8}
        point2.setX(12);

        System.out.println(polyLine);
        System.out.print("Длина Ломаной = ");
        System.out.println(polyLine.getLength());
        System.out.print("Массив ");
        System.out.println(Arrays.toString(polyLineLength));
        System.out.print("Длина массива Линий = ");
        System.out.println(polyLine.getLengthArrLines(polyLineLength));
        System.out.println(polyLine.getLength()==polyLine.getLengthArrLines(polyLineLength));

//        Задание 2

//        Задаем значения с указанием двух Точек
        Line line1 = new Line(new Point(1, 3), new Point(5, 8));
        Line line2 = new Line(new Point(10,11), new Point(15,19));
        Line line3 = new Line(line1.coordinateFinish, line2.coordinateStart);

//        Задаем значения с указанием четырех целых чисел (x y начала и x y конца)
//        Line line1 = new Line(1, 3, 5, 8);
//        Line line2 = new Line(10, 11, 15, 19);
//        Line line3 = new Line(line1.coordinateFinish.x, line1.coordinateFinish.y, line2.coordinateStart.x, line2.coordinateStart.y);

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