package vt.java_core.map;

import java.util.HashMap;
import java.util.Map;

import vt.java_core.object.User;

public class HashMapFunc {
    public static void main(String[] args) {

        Map<String, User> users = new HashMap<>();


        // Thêm phần tử vào HashMap: .put(key, value)
        users.put("u1", new User("Quan", 20));
        users.put("u2", new User("Hai", 25));
        users.put("u3", new User("Vinh", 23));

        System.out.println("Sau khi thêm phần từ: " + users);


        // Thêm phần tử trùng key vào HashMap
        users.put("u2", new User("Hai", 26)); // Thay thế
        System.out.println("Sau khi thêm phần từ trùng key u2: " + users);


        // Lấy phần tử từ HashMap: .get(key)
        System.out.println("Phần tử với key 'u1': " + users.get("u1"));
        System.out.println("Phần tử với key 'ux': " + users.get("ux")); // null


        //Kiểm tra tồn tại key/value trong HashMap: .containsKey(key) .containsValue(value)
        System.out.println("Kiểm tra tồn tại key 'u3': " + users.containsKey("u3"));
        System.out.println("Kiểm tra tồn tại value User Vinh: " + users.containsValue(new User("Vinh", 23)));


        // Lấy phần tử mặc định nếu key không tồn tại: .getOrDefault(key, defaultValue)
        System.out.println("Lấy phần tử với key 'u4' hoặc mặc định: " + users.getOrDefault("u4", new User("Default", 0)));


        // Thêm phần tử nếu key không tồn tại: .putIfAbsent(key, value)
        users.putIfAbsent("u3", new User("New Vinh", 30));
        users.putIfAbsent("u4", new User("An", 28));
        System.out.println("Sau khi sử dụng putIfAbsent: " + users);


        // Thay thế phần tử nếu key tồn tại: .replace(key, value)
        users.replace("u1", new User("Updated Quan", 21));
        System.out.println("Sau khi sử dụng replace: " + users);


        // Xóa phần tử từ HashMap: .remove(key)
        users.remove("u2");
        System.out.println("Sau khi xóa phần tử với key 'u2': " + users);


        // Duyệt các phần tử trong HashMap: .entrySet()
        System.out.println("Duyệt các phần tử trong HashMap:");
        for (Map.Entry<String, User> entry : users.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // xóa tất cả phần tử: .clear()
        users.clear();
        System.out.println("Sau khi xóa tất cả phần tử: " + users);
    }
}
