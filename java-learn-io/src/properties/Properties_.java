package properties;

import java.io.*;
import java.util.Properties;

/**
 * @Author Dylan
 * @Date 2023/8/30
 */
public class Properties_ {

    public static void test1() throws IOException {
        String path = "C:\\Users\\10564\\Desktop\\mylearn\\java-learn\\java-learn-io\\src\\properties\\mysql.properties";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = "";
        while ((line = br.readLine()) != null) { //循环读取
            String[] split = line.split("=");
            //如果我们要求指定的ip值
            if("ip".equals(split[0])) {
                System.out.println(split[0] + "值是: " + split[1]);
            }
        }
        br.close();
    }

    public static void test2() throws IOException{
        String path = System.getProperty("user.dir")+"\\java-learn-io\\src\\properties\\mysql.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(path));
        properties.list(System.out);
        System.out.println(properties.getProperty("ip"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("username"));
    }

    public static void test3() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("age", "12");
        properties.setProperty("name", "曹操");
        properties.store(new FileWriter("D:\\temp\\test.peoperties"), "comments");

    }

    public static void main(String[] args) throws IOException {
//        test2();
        test3();
//        System.out.println(Properties_.class);
//        System.out.println(Properties_.class.getClassLoader());
    }
}
