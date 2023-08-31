package system;

import java.util.Scanner;

/**
 * @Author Dylan
 * @Date 2023/8/30
 */
public class SystemInOut {

    public static void test1(){
        System.out.println(System.in); //java.io.BufferedInputStream@1b6d3586
        System.out.println(System.in.getClass()); // class java.io.BufferedInputStream
        System.out.println(System.out.getClass()); // class java.io.PrintStream
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入内容：");
        String next = scanner.next();
        System.out.println("你刚输入的文本是：" + next);
    }
    public static void main(String[] args) {
        test1();
    }
}
