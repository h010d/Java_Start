package Lessons_Java_Start.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
    public static void main(String[] args) throws Exception {
UserChild user = new UserChild();
user.lifeLevel = 55;
user.staticField = 45;
Sord sord = new Sord();
sord.level = 5;
user.sord = sord;
user.childLevel = 65;
        FileOutputStream fileOutputStream = new FileOutputStream("tmpUser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        user.staticField = 25;

        FileInputStream fileInputStream = new FileInputStream("tmpUser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        UserChild newUser = (UserChild)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.lifeLevel);
        System.out.println(newUser.staticField);
        System.out.println(newUser.sord);
        System.out.println(newUser.childLevel);

    }
}
