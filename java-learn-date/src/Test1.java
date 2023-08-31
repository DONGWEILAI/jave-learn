import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author Dylan
 * @Date 2023/8/29
 */
public class Test1 {

    /**
     * 返回当前日期时间的字符串 比如：2023-08-29 15:25:23
     */
    public static void LocalDateTime2String(){
        String pattern = "yyyy-MM-dd HH:mm:ss";
        LocalDateTime now = LocalDateTime.now();
        String dateString = now.format(DateTimeFormatter.ofPattern(pattern));
        System.out.println(dateString);
    }

    /**
     * 时间字符串转为LocalDateTime对象
     */
    public static void String2LocalDateTime(){
        String pattern = "yyyy-MM-dd HH:mm:ss";
        String dateString = "2023-08-29 15:28:20";
        LocalDateTime localDateTime = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern(pattern));
        System.out.println(localDateTime);
    }

    /**
     * 时间戳转日期时间字符串
     */
    public static void timeStamp2DateString(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(System.currentTimeMillis());
        System.out.println(format);
    }

    /**
     * 获取当前时间戳（毫秒）
     */
    public static void getCurrentTimeStamp(){
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    public static void main(String[] args) {
        String2LocalDateTime();
        LocalDateTime2String();
        getCurrentTimeStamp();
        timeStamp2DateString();
    }
}
