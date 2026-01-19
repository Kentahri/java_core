package vt.java_core.collection.list;

import vt.java_core.collection.object.User;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class ArrayListFunc {
    public static void main(String[] args) {


        // Khởi tạo ArrayList
        List<User> users = new ArrayList<>();


        System.out.println("List trống: " + users.isEmpty());


        // Thêm phần tử vào ArrayList
        users.add(new User("Quan",20));
        users.add(new User("Hai",25));
        users.add(new User("Vinh",23));


        System.out.println("Sau khi thêm phần từ: " + users);


        // Kích thước của ArrayList: .size()
        System.out.println("Kích thước của List: " + users.size());


        // Lấy phần tử từ ArrayList: .get(index)
        System.out.println("Phần tử tại vị trí index 1: " + users.get(1));


        // Thêm phần tử vào vị trí index cụ thể: .add(index, element)
        users.add(1, new User("An", 26));
        System.out.println("Sau khi thêm phần tử vào index 1: " + users);


        // Set phần tử tại vị trí index cụ thể: .set(index, element)
        users.set(2, new User("Binh", 24));
        System.out.println("Sau khi set phần tử tại index 2: " + users);


        // Xóa phần tử tại vị trí index cụ thể: .remove(index)
        users.remove(3);
        System.out.println("Sau khi xóa phần tử tại index 3: " + users);


        // Xóa phần tử cụ thể: .remove(object)
        users.remove(new User("An", 26));
        System.out.println("Sau khi xóa phần tử User An: " + users);


        // Kiểm tra phần tử có tồn tại trong ArrayList hay không: .contains(object)
        System.out.println("Kiểm tra phần tử User Quan có tồn tại: " + users.contains(new User("Quan", 20)));


        // Index của phần tử trong ArrayList: .indexOf(object)
        System.out.println("Index của phần tử User Binh: " + users.indexOf(new User("Binh", 24)));


        // cắt ArrayList con: .subList(fromIndex, toIndex)
        List<User> subList = users.subList(0, 1);
        System.out.println("ArrayList con từ index 0 đến 1: " + subList);


        // sort ArrayList: .sort(Comparator)
        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println("ArrayList sau khi sắp xếp theo tuổi: " + users);


        //xóa tất cả phần tử trong ArrayList: .clear()
        users.clear();
        System.out.println("Sau khi xóa tất cả phần tử: " + users);
        System.out.println("List trống: " + users.isEmpty());
    }
}

