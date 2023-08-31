package buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author Dylan
 * @Date 2023/8/30
 */
public class BufferedReader_ {

    public static void test1() throws IOException {
        String filePath = "D:\\temp\\x.txt";
        String line;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            assert br != null;
            br.close();
        }
    }

    public static void main(String[] args) throws IOException {
        test1();
    }
}
