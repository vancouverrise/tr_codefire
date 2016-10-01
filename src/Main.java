public class Main {

    public static void main(String[] args) {
        

        Rectangle rect1, rect2;
        Triangle tr1, tr2;
        Circle crc1, crc2;

        rect1 = new Rectangle();
        crc1 = new Circle();
        tr1 = new Triangle();

        System.out.println("Количество прямоугольников = " + Rectangle.count);
        System.out.println("Размеры: " + "сторона А = " + Rectangle.a + ";" + " сторона B = " + Rectangle.b);
        System.out.println("Площадь прямоугольника: " + Rectangle.a * Rectangle.b);

        System.out.println("");
        System.out.println("");

        System.out.println("Количество кругов = " + Circle.count);
        System.out.println("Радиус: " + Circle.d);
        System.out.println("Площадь круга: " + (3.14 * (Circle.d * Circle.d)));

        System.out.println("");
        System.out.println("");

        System.out.println("Количество треугольников = " + Triangle.count);
        System.out.println("Размеры: " + "сторона А = " + Triangle.a + ";" + " сторона B = " + Triangle.b +  ";" + " сторона С = " + Triangle.b);
        System.out.printf("Площадь треугольника :" + Math.round(Math.sqrt(Triangle.p * (Triangle.p - Triangle.a) * (Triangle.p - Triangle.b) * (Triangle.p - Triangle.c))));


    }
}

class Rectangle {
    static int count = 0;
    static int a, b;

    public Rectangle() {
        a = 40;
        b = 10;
        count++;
    }
}

class Circle {
    static int count = 0;
    static int d;

    public Circle() {
        d = 10;
        count++;

    }
}

class Triangle {
    static int count = 0;
    static int a, b, c, p;

    public Triangle() {
        a = 20;
        b = 25;
        c = 25;
        p = (a + b + c) / 2;
        count++;
    }
}