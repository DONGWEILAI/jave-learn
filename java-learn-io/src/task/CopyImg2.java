package task;

import java.io.*;

/**
 * @Author Dylan
 * @Date 2023/8/30
 */
public class CopyImg2 {

    public static void test1() throws IOException {
        String srcFilePath = "D:\\temp\\picture.png";
        String destFilePath = "D:\\temp\\picture_copy1.png";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
            byte[] readBuff = new byte[1024];
            int readLen = 0;
            while ((readLen = bis.read(readBuff)) != -1){
                bos.write(readBuff, 0, readLen);
            }
            System.out.println("拷贝完成");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            assert bis != null;
            bis.close();
            assert bos != null;
            bos.close();
        }
    }

    public static void main(String[] args) throws IOException {
        test1();
    }
}
