package Lessons_Java_Start;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoCode {
    public static void main(String[] args) throws IOException {


//        Ответ: Программа в обоих случаях работала неккоректно. Пути к файлам необходимо указывать оносительно корня проекта,
//        а не относительно пакета, в котором используется изображение. Т.е. в моем случае:
//
//        File file = new File("src/tmp/assets/icon.png");
//        Image image = ImageIO.read(file);
//
//        или
//
//        Image image = Toolkit.getDefaultToolkit().getImage("src/tmp/assets/icon.png");

        //=============================

//
//        Если я правильно понял ваш вопрос, то вы можете получить путь к папке проекта как
//
//        String path = new File("").getAbsolutePath();
//
//        и затем просто создавать файлы в папке проекта как
//
//        File newFile = new File(path + "\file1.txt");




        File file = new File("src/testTmpDir/input.txt");
        FileReader in = new FileReader(file);
        String[] array = loadAndSort(in);
        for (String s : array) {
            System.out.println(s);

        }


    }

    static String[] loadAndSort(FileReader in) throws IOException {
        BufferedReader reader = new BufferedReader(in);
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
if (!line.isEmpty()) {
                lines.add(line);
            }
        }
        reader.close();
        String[] array = lines.toArray(new String[lines.size()]);
        Arrays.sort(array);
        return array;
    }


}
