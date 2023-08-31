package task;

import java.io.*;

/**
 * @Author Dylan
 * @Date 2023/8/30
 */
public class CopyFile2 {

    public static void test1() throws IOException {
        String fileSrcPath = "D:\\temp\\a.txt";
        String fileDestPath = "D:\\temp\\y.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(fileSrcPath));
            bw = new BufferedWriter(new FileWriter(fileDestPath));
            while ((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
            }
            System.out.println("拷贝完成");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            assert br != null;
            br.close();
            assert bw != null;
            bw.close();
        }
    }

    public static void main(String[] args) throws IOException {
        test1();
    }
}
