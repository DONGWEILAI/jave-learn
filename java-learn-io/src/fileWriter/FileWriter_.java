package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author Dylan
 * @Date 2023/8/30
 */
public class FileWriter_ {

    public static void test1() throws IOException {
        String filePath = "D:\\temp\\a.txt";
        FileWriter fw = null;
        char[] chars = {'a', 'b', 'c'};
        try {
            fw = new FileWriter(filePath, true);
            fw.write(chars);
            fw.write("HHHHHHHH");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert fw != null;
            fw.close();
        }
    }

    public static void main(String[] args) throws IOException {
        test1();
    }
}
