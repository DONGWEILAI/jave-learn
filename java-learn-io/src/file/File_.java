package file;

import java.io.File;
import java.io.IOException;

/**
 * @Author Dylan
 * @Date 2023/8/30
 */
public class File_ {

    public static void test1() {
        File file = new File("D:\\temp\\a.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void test2() {
        File parentFile  = new File("D:\\temp");
        try {
            File file = new File(parentFile, "b.txt");
            boolean newFile = file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void test3() {
        try {
            File file = new File("D:\\temp", "c.txt");
            boolean newFile = file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void test4(){
        File file = new File("D:\\temp\\a.txt");
        //调用相应的方法，得到对应信息
        System.out.println("文件名字=" + file.getName());
        //getName、getAbsolutePath、getParent、length、exists、isFile、isDirectory
        System.out.println("文件绝对路径=" + file.getAbsolutePath());
        System.out.println("文件父级目录=" + file.getParent());
        System.out.println("文件大小(字节)=" + file.length());
        //按字节计算，utf-8编码下，一个英文字母一个字节，一个汉字三个字节
        System.out.println("文件是否存在=" + file.exists());
        System.out.println("是不是一个文件=" + file.isFile());
        System.out.println("是不是一个目录=" + file.isDirectory());
    }

    public static void test5(){
        String directoryPath = "D:\\temp\\a\\b\\c";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath + "存在..");
        } else {
            if (file.mkdirs()) { //创建一级目录使用mkdir() ，创建多级目录使用mkdirs()
                System.out.println(directoryPath + "创建成功..");
            } else {
                System.out.println(directoryPath + "创建失败...");
            }
        }
    }



    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
    }
}
