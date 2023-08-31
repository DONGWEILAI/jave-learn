package inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Author Dylan
 * @Date 2023/8/30
 */
public class FileInputStream_ {

    public static void test1() throws IOException {
        String filePath = "D:\\temp\\a.txt";
        byte[] buff = new byte[64]; // 每次最多存64字节到这个数组中
        int readLen = 0; // 读取字节长度
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filePath);
            while ((readLen = fis.read(buff)) != -1){
                System.out.println(readLen); // 38 读取的实际字节长度
                System.out.println(Arrays.toString(buff));
                System.out.println(new String(buff, 0, readLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert fis != null;
            fis.close();
        }
    }

    public static void main(String[] args) throws IOException {
        test1();
    }


}
