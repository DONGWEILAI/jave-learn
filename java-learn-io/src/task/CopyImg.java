package task;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author Dylan
 * @Date 2023/8/30
 */
public class CopyImg {

    public static void test1() throws IOException {
        String srcFilePath = "D:\\temp\\picture.png";
        String destFilePath = "D:\\temp\\picture_copy.png";
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(srcFilePath);
            fos = new FileOutputStream(destFilePath);
            byte[] readBuff = new byte[1024];
            int readLen = 0;
            while ((readLen = fis.read(readBuff)) != -1){
                fos.write(readBuff, 0, readLen);
            }
            System.out.println("拷贝完成");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            assert fis != null;
            fis.close();
            assert fos != null;
            fos.close();
        }
    }

    public static void main(String[] args) throws IOException {
        test1();
    }
}
