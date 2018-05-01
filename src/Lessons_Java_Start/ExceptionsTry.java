package Lessons_Java_Start;
// 42 Lesson
import java.io.IOException;

public class ExceptionsTry {
    public static void main(String[] args) {
        System.out.println(new ExceptionsTry().SomeMethod());
    }
void anyMethod() throws Exception, IOException{
        try{
            throw new IOException();

        }catch (IOException io){
            throw new Exception();
        }
        catch (Exception e){

        }
}
    //checked
    //throw new Throwable();
    //throw new Exception();
    //throw new IOException();
    //unchecked
    //throw new Error();
    //throw new RuntimeException();

    String SomeMethod() {
        try {
            System.out.println("try");

            throw new NullPointerException();
            //Object o = null;
           // o.hashCode();
            //return "try2";


        } catch (NullPointerException e) {
            System.out.println("catch");


            return "catch2";

            //throw new IOException();
        }  catch (ArrayIndexOutOfBoundsException e) {
            try {
                throw new RuntimeException();
            } catch (ArrayIndexOutOfBoundsException err) {

            }

        } catch (RuntimeException e) {

        } finally {
            System.out.println("finally");
            //System.exit(0);
            //throw new RuntimeException();
            return "finally2";
        }

    }
}
