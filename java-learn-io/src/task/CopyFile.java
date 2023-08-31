package task;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author Dylan
 * @Date 2023/8/30
 */
public class CopyFile {

    public static void test1() throws IOException {
        String fileSrcPath = "D:\\temp\\a.txt";
        String fileDestPath = "D:\\temp\\y.txt";
        FileReader fr = null;
        FileWriter fw = null;
        int dataLen = 0;
        char[] buff = new char[64];
        try {
            fr = new FileReader(fileSrcPath);
            fw = new FileWriter(fileDestPath);
            while ((dataLen = fr.read(buff)) != -1){
                fw.write(buff, 0, dataLen);
            }
            System.out.println("拷贝完成");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            assert fr != null;
            fr.close();
            assert fw != null;
            fw.close();
        }
    }

    public static void main(String[] args) throws IOException {
        test1();
    }
}
