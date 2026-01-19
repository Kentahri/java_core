package vt.java_core.collection.map;

import vt.java_core.collection.object.User;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapFunc {

    public static void main(String[] args) {
        // TreeMap là một cấu trúc dữ liệu ánh xạ (map) trong Java,
        // nó lưu trữ các cặp khóa-giá trị (key-value pairs) theo thứ tự tăng dần của khóa (key).
        // TreeMap triển khai giao diện NavigableMap và kế thừa từ AbstractMap.
        // Nó sử dụng cấu trúc dữ liệu cây đỏ-đen (Red-Black tree) để lưu trữ các phần tử,
        // điều này cho phép TreeMap duy trì thứ tự sắp xếp tự động của các khóa.

        // Một số đặc điểm chính của TreeMap:
        // 1. Sắp xếp tự động: Các phần tử trong TreeMap được sắp xếp theo thứ tự tăng dần của khóa.
        // 2. Hiệu suất: Các thao tác như thêm, xóa và tìm kiếm phần tử trong TreeMap có độ phức tạp thời gian là O(log n).
        // 3. Không cho phép khóa null: TreeMap không cho phép sử dụng giá trị null làm khóa.
        // 4. Giao diện NavigableMap: TreeMap cung cấp các phương thức để duyệt qua các phần tử theo thứ tự sắp xếp,
        //    cũng như các phương thức để lấy các phần tử gần nhất với một khóa cụ thể.

        Map<User,String> treeMap = new TreeMap<>(new UserComparator());

        // Thêm phần tử vào TreeMap: .put(key, value)
        treeMap.put(new User("Quan", 20), "Developer");
        treeMap.put(new User("Hai", 25), "Manager");
        treeMap.put(new User("Vinh", 23), "Designer");
        treeMap.put(new User("Hai", 27), "Guest"); // Key trùng, sẽ ghi đè giá trị cũ

        System.out.println("Sau khi thêm phần từ: " + treeMap);


        // Lấy phần tử từ TreeMap: .get(key)
        System.out.println("Phần tử với key 'Hai,25': " + treeMap.get(new User("Hai", 25)));
        System.out.println("Phần tử với key 'Hai,27': " + treeMap.get(new User("Hai", 27)));


        // Kiểm tra tồn tại key trong TreeMap: .containsKey(key)
        System.out.println("Kiểm tra tồn tại key 'Vinh,23': " + treeMap.containsKey(new User("Vinh", 23)));


        // Kiểm tra đầu/cuối TreeMap: .firstKey() .lastKey()
        System.out.println("Phần tử đầu TreeMap: " + ((TreeMap<User,String>)treeMap).firstKey());
        System.out.println("Phần tử cuối TreeMap: " + ((TreeMap<User,String>)treeMap).lastKey());


        // Kiểm tra key thấp/cao hơn: .lowerKey(key) .higherKey(key)
        System.out.println("Key thấp hơn 'Hai,25': " + ((TreeMap<User,String>)treeMap).lowerKey(new User("Hai", 25)));
        System.out.println("Key cao hơn 'Hai,25': " + ((TreeMap<User,String>)treeMap).higherKey(new User("Hai", 25)));


        // Kiểm tra key thấp/cao hơn hoặc bằng: .floorKey(key) .ceilingKey(key)
        System.out.println("Key thấp hơn hoặc bằng 'Hai,26': " + ((TreeMap<User,String>)treeMap).floorKey(new User("Hai", 26)));
        System.out.println("Key cao hơn hoặc bằng 'Hai,26': " + ((TreeMap<User,String>)treeMap).ceilingKey(new User("Hai", 26)));


        // Cắt một phần TreeMap: .subMap(fromKey, toKey)
        System.out.println("Cắt phần TreeMap từ 'Vinh,23' đến 'Hai,25': " +
            ((TreeMap<User,String>)treeMap).subMap(new User("Vinh", 23), new User("Hai", 25)));


        // Lấy và xóa phần tử đầu/cuối TreeMap: .pollFirstEntry() .pollLastEntry()
        System.out.println("Lấy và xóa phần tử đầu TreeMap: " + ((TreeMap<User,String>)treeMap).pollFirstEntry());
        System.out.println("Sau khi xóa phần tử đầu: " + treeMap);
        System.out.println("Lấy và xóa phần tử cuối TreeMap: " + ((TreeMap<User,String>)treeMap).pollLastEntry());
        System.out.println("Sau khi xóa phần tử cuối: " + treeMap);

    }
}
