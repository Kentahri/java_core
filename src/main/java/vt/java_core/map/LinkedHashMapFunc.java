package vt.java_core.map;

import vt.java_core.object.User;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapFunc {
    public static void main(String[] args) {

        // Khai báo LinkedHashMap
        // 16 - iniitial capacity: Số lượng bucket ban đầu, kích thước bảng băm
        // , 0.75f - load factor: Hệ số tải, tỉ lệ phần trăm sử dụng trước khi tăng kích thước
        // , true - access order: Sắp xếp theo thứ tự truy cập (true) hoặc thứ tự chèn (false)
        Map<User,String> userMap = new LinkedHashMap<>(16, 0.75f, true);

        // Thêm phần tử vào LinkedHashMap: .put(key, value)
        userMap.put(new User("Quan", 20), "Developer");
        userMap.put(new User("Hai", 25), "Manager");
        userMap.put(new User("Vinh", 23), "Designer");

        System.out.println("Sau khi thêm phần từ: " + userMap);


        // Truy cập phần tử để thay đổi thứ tự truy cập
        userMap.get(new User("Hai", 25));
        System.out.println("Sau khi truy cập phần từ Hai: " + userMap);


        //Truy cập phần tử khác
        userMap.get(new User("Quan", 20));
        System.out.println("Sau khi truy cập phần từ Quan: " + userMap);


        //Thêm lại phần tử đã tồn tại
        userMap.put(new User("Vinh", 23), "Lead Designer");
        System.out.println("Sau khi thêm lại phần từ Vinh: " + userMap);
    }
}
