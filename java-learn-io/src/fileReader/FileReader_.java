package fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author Dylan
 * @Date 2023/8/30
 */
public class FileReader_ {

    public static void test1() throws IOException {
        String filePath = "D:\\temp\\a.txt";
        FileReader fr = null;
        int dataLen = 0;
        char[] buff = new char[8];
        try {
            fr = new FileReader(filePath);
            while ((dataLen = fr.read(buff)) != -1){
                System.out.println(new String(buff, 0, dataLen));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            assert fr != null;
            fr.close();
        }
    }
    public static void main(String[] args) throws IOException {
        test1();
    }
}
