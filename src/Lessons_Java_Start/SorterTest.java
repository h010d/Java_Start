package Lessons_Java_Start;

import java.io.File;
import java.io.FileReader;

import static org.junit.Assert.assertArrayEquals;


public class SorterTest {
    @org.junit.Test
    public void test() throws Exception {
        File file = new File("src/testTmpDir/input.txt");
        FileReader in = new FileReader(file);
        String[] actual = DemoCode.loadAndSort(in);
        String[] expected = {"a", "b", "c"};
        assertArrayEquals(expected, actual);
        new Personal("Nik", 28);
    }
}