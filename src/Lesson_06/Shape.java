package Lesson_06;

public class Shape {

    public static void main(String[] args) {
        Point point1 = new Point(10, 11);
        point1.printPoint();
        Point point0 = new Point(24, 22);
        Length length = new Length(point0);
        length.lineLength(length);
        length.printLength();
        Length2 length2 = new Length2(2, 3, 5, 6);
        System.out.println(length2.getCoordX());
        length2.printLength2Coord();
        System.out.println(length2.getLength2CoordX2());
        length2.printLength2AllCoord();
        length2.setLength2(3, 5, 9, 8);
        length2.printLength2AllCoord();
        length2.lineLength2(length2);
        System.out.println(length2.getClass().getName());
        Length lengthT1 = new Length(8);
        Length lengthT2 = new Length(7);
        Length lengthT3 = new Length(12);
        System.out.println("lengthT1 = " + lengthT1.getLineLength() + " lengthT2 = " + lengthT2.getLineLength() + " lengthT3 = " + lengthT3.getLineLength());
        Triangle triangle = new Triangle(lengthT1, lengthT2, lengthT3);
        System.out.println("Площадь треугольника по 3 стронам = " + triangle.squareTriangle());

    }

}

//////////// Point
class Point {
    private int coordX;
    private int coordY;

    public Point() {
        this.coordX = 5;
        this.coordY = 2;
    }

    public Point(int y) {
        this.coordX = 0;
        setCoordY(y);
    }

    public Point(int x, int y) {
        setCoordX(x);
        setCoordY(y);
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordX() {
        return this.coordX;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getCoordY() {
        return this.coordY;

    }

    public void printPoint() { //Печатаем координаты точки
        System.out.println("coordX: " + getCoordX() + ", coordY: " + getCoordY());
    }
}

//////////// Length HAS-A
class Length {
    Point point1;
    Point point2;
    double linelength;

    public Length(Point point) {
        this.point1 = point;
        this.point2 = new Point();
    }

    public Length() {
        this.point1 = new Point(2, 4);
        this.point2 = new Point(6, 2);
    }

    public Length(double linelength) {
        this.linelength = linelength;
    }

    public void setLength(Point pointX, Point pointY) {
        this.point1 = pointX;
        this.point2 = pointY;
    }

    public Length getLength() {
        Length leng = new Length();
        leng.point1 = point1;
        leng.point2 = point2;
        return leng;
    }

    public void printLength() {
        point1.printPoint();
        point2.printPoint();
    }

    public void lineLength(Length leng) {
        int lnX = leng.point1.getCoordX() - leng.point2.getCoordX();
        int lnY = leng.point1.getCoordY() - leng.point2.getCoordY();
        double line = Math.sqrt(Math.pow(lnX, 2) + Math.pow(lnY, 2));
        System.out.println("Line long = " + line);
    }

    public void setLineLength(double a) {
        this.linelength = a;
    }

    public double getLineLength() {
        return this.linelength;
    }

    public void printLineLength() {
        System.out.println("linelength = " + linelength);
    }
}

//////////// Length2 IS-A
class Length2 extends Point {
    private int x2, y2;

    public Length2(int x, int y, int x2, int y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public void setLength2(int x1, int y1, int x2, int y2) {
        super.setCoordX(x1);
        super.setCoordY(y1);
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getLength2CoordY2() {
        return this.y2;
    }

    public int getLength2CoordX2() {
        return this.x2;
    }

    public Length2 getLength2Coord() {
        Length2 length2 = new Length2(super.getCoordX(), super.getCoordY(), this.x2, this.y2);
        return length2;
    }

    public void printLength2Coord() {
        System.out.println("coordX2: " + getLength2CoordX2() + ", coordY2: " + getLength2CoordY2());
    }

    public void printLength2AllCoord() {
        super.printPoint();
        printLength2Coord();

    }

    public void lineLength2(Length2 leng) {
        int lnX = leng.getCoordX() - leng.getLength2CoordX2();
        int lnY = leng.getCoordY() - leng.getLength2CoordY2();
        double line = Math.sqrt(Math.pow(lnX, 2) + Math.pow(lnY, 2));
        System.out.println("Длина отрезка = " + line);
    }
}

//////////// Triangle HAS-A
class Triangle {
    private Length length1, length2, length3;

    public Triangle(Length length1, Length length2, Length length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    public Triangle() {
        this.length1 = new Length();
        this.length2 = new Length();
        this.length3 = new Length();
    }

    public Triangle getTriangle() {
        Triangle triangle = new Triangle();
        triangle.length1 = this.length1;
        triangle.length2 = this.length2;
        triangle.length3 = this.length3;
        return triangle;
    }

    public void setTriangle(Length length1, Length length2, Length length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    public void printTriangle() {

        System.out.println("length1 = ");
        length1.printLength();
        System.out.println("length2 = ");
        //length2.printLength();
        System.out.println("length3 = ");
        //length3.printLength();
    }

    public double squareTriangle() {
        //Формула Герона
        double sq = (length1.linelength + length2.linelength + length3.linelength) / 2.0; //полупериметр
        return Math.sqrt(sq * (sq - length1.linelength)
                            * (sq - length2.linelength)
                            * (sq - length3.linelength));
    }
}

//////////// Square
//	class Square extends Length {
//		Length length1, length2, length3, length4;
//	}
