package id;

import java.util.UUID;

/**
 * @Author Dylan
 * @Date 2023/8/29
 */
public class UUIDGenerator {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        System.out.println(uuid.length());
        String uuidWithoutSign = uuid.replaceAll("-", "");
        System.out.println(uuidWithoutSign);
        System.out.println(uuidWithoutSign.length());
    }
}
