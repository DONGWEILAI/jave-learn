package outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author Dylan
 * @Date 2023/8/30
 */
public class FileOutputStream_ {

    public static void test1() throws IOException {
        String filePath = "D:\\temp\\b.txt";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filePath, true);
            String str = "bbbbbbbbbbbbbbbbbbbb";
            fos.write(str.getBytes());
        } catch (IOException e){
            throw new RuntimeException(e);
        } finally {
            assert fos != null;
            fos.close();
        }
    }

    public static void main(String[] args) throws IOException {
        test1();
    }
}
