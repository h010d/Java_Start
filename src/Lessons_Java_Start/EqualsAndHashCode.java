 package Lessons_Java_Start;
// 49 Lesson
import java.util.HashMap;
import java.util.Map;

class Book {
    String autor;
    String name;
}

class Ticket {
    int number;
    String LibraryName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (number != ticket.number) return false;
        return LibraryName != null ? LibraryName.equals(ticket.LibraryName) : ticket.LibraryName == null;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (LibraryName != null ? LibraryName.hashCode() : 0);
        return result;
    }
}

public class EqualsAndHashCode extends Object {
    int value;

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.number = 123;
        EqualsAndHashCode equalsAndHashCode = new EqualsAndHashCode();
        System.out.println(equalsAndHashCode.toString());
        equalsAndHashCode.value = 5;
        System.out.println(equalsAndHashCode + "");
        Book book = new Book();
        book.autor = "Karnegy";
        book.name = "how to get friends";
        Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket, book);

        Ticket ticket2 = new Ticket();
        ticket2.number = 123;

        Book karnegyBook = library.get(ticket2);
        System.out.println(karnegyBook.autor + " : " + karnegyBook.name);
//        System.out.println(karnegyBook.hashCode());
    }


    @Override
    public String toString() {
        return "value = " + value;
    }
}
