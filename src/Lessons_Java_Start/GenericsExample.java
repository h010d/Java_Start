package Lessons_Java_Start;

import util.PrintBorders;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// 56 Lesson
class Car implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class ParentExample <T, U>{
    T t; // Object t
    U u; // Object u

    //static T t; //static value un genuri won't implement
    T genericMethod(T t, U u) {
        return t;
    }
void method() {
    System.out.println("Hi Im Parent");
}

}

class Child extends ParentExample {
    @Override
    void method() {
        super.method();
        System.out.println("Hi Im Child");
    }
}

class Son extends Child {
    @Override
    void method() {
        super.method();
        System.out.println("Hi Im Son");
    }
}
public class GenericsExample <T extends Math & Comparable & Serializable> {
    public static void main(String[] args) {
        GenericsExample genericsExample = new GenericsExample();
        genericsExample.<String>method("HI");
        genericsExample.<GenericsExample>method(genericsExample);
        genericsExample.<GenericsExample>method(new GenericsExample());
        genericsExample.method2();
        Gen <String> gen = new Gen<>();
        gen.var = "sdf";
        System.out.println(gen.var);
        Gen <Car> car = new Gen<>();
        car.var = new Car();
        System.out.println(car.var);
        PrintBorders.print();
        List<ParentExample> list = new ArrayList<>();
       //list<Parentexample>[]List2=NewArraylist<Parentexample>();Can'TCreateArrayFromGeneric
        list.add(new ParentExample());
        list.add(new Child());
        list.add(new Son());
        ParentExample parentExample = new ParentExample();
        Child child = new Child();
        Son son = new Son();
        genericsExample.method5(list);
        PrintBorders.print();
        genericsExample.method6(list);
    }
    <T> T method(T type){
        System.out.println(type);
        return type;
    }

    <T> void method2(){
        System.out.println(1 + 2);
        /*return type;*/
    }

    <T, U, K> void method3(T type, U u, K k){
        System.out.println(type + " " + u + "" + k);
        /*return type;*/
    }
    
    T method4(T type){
        type.notifyAll();
        type.compareTo(new Object());
        System.out.println(type);
        return type;
    }
    void method5(List <? super Child> list){
        list.add(new Son());
        for (Object o : list) {
            ParentExample p = (ParentExample)o;
            p.method();
            System.out.println("------------");
        }
    }
    void method6(List <? extends Child> list){
        //list.add(new ParentExample()); We can't add here new object!!!
        for (Object o : list) {
            ParentExample p = (ParentExample)o;
            p.method();
            System.out.println("------------");
        }
    }
}

class Gen <T>{
    T var;
}
