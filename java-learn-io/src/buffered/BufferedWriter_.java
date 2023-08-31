package buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author Dylan
 * @Date 2023/8/30
 */
public class BufferedWriter_ {

    public static void test1() throws IOException {
        String filePath = "D:\\temp\\x.txt";
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(filePath));
            String s = "hello java";
            bw.write(s);
            bw.newLine();
            bw.write(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert bw != null;
            bw.close();
        }
    }

    public static void main(String[] args) throws IOException {
        test1();
    }
}
