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
        System.out.println("I'm Point");
    }
}

class LengthTest {
    PointTest pointTest1;
    PointTest pointTest2;
    public LengthTest(){
        System.out.println("I'm LengthTest");
    }
}

class TriangleTest {
    private LengthTest lengthTest1, lengthTest2, lengthTest3;
    public TriangleTest(){
        System.out.println("I'm TriangleTest");
    }
}