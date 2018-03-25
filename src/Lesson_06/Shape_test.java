package Lesson_06;

public class Shape_test {
    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
    }
}

class PointTest {
    private int coordX;
    private int coordY;
    public PointTest(){
        System.out.println("I'm class Point");
    }
}

class LengthTest {
    PointTest pointTest1;
    PointTest pointTest2;
    public LengthTest(){
this.pointTest1 = new PointTest();
this.pointTest2 = new PointTest();
        System.out.println("I'm class LengthTest");
    }
}

class TriangleTest {
    private LengthTest lengthTest1, lengthTest2, lengthTest3;
    public TriangleTest(){
        this.lengthTest1 = new LengthTest();
        this.lengthTest2 = new LengthTest();
        this.lengthTest3 = new LengthTest();
        System.out.println("I'm class TriangleTest");
    }
}