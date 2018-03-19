package Lesson_06;


public class Shape {

    public static void main(String[] args) {
        Point point1 = new Point(10, 11);
        point1.printPoint();
        Point point0 = new Point(24, 22);
        Length length = new Length(point0);
        length.lineLength(length);
        length.printLength();
    }

}

//////////// Point
class Point {
    private int coordX;
    private int coordY;

    public Point() {
        this.coordX = 0;
        this.coordY = 0;
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

    public void printPoint() {
        System.out.println("coordX: " + getCoordX() + ", coordY: " + getCoordY());
    }
}

//////////// Length HAS-A
class Length {
    Point point1;
    Point point2;

    public Length(Point point) {
        this.point1 = point;
        this.point2 = new Point();
    }

    public Length() {
        this.point1 = new Point();
        this.point2 = new Point();
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
}

//////////// Length2 IS-A
class Length2 extends Point {
    private int x2, y2;

    public Length2(int x, int y, int x2, int y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public Length2 setLength2(int x1, int y1, int x2, int y2) {
        Length2 length2 = new Length2(x1, y1, x2, y2);
        return length2;
    }

    public Length2 getLength2Coord() {
        Length2 length2 = new Length2(super.getCoordX(), super.getCoordY(), this.x2, this.y2);
        return length2;
    }

    public void printLength2() {
        super.printPoint();
        System.out.println("coordX2: " + getCoordX() + ", coordY2: " + getCoordY());

    }
}

//////////// Triangle HAS-A
class Triangle {
    Point point1, point2, point3;
}

//////////// Square
//	class Square extends Length {
//		Length length1, length2, length3, length4;
//	}
