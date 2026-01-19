package vt.java_core.collection.list;

import vt.java_core.collection.object.User;

import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListFunc {
    public static void main(String[] args) {

        // Khởi tạo LinkedList
        LinkedList<User> users = new LinkedList<User>();

        System.out.println("List trống: " + users.isEmpty());


        // Thêm phần tử vào LinkedList .add()
        users.add(new User("Quan",20));
        users.add(new User("Hai",25));
        users.add(new User("Vinh",23));

        System.out.println("Sau khi thêm phần từ: " + users);


        // Kích thước của LinkedList: .size()
        System.out.println("Kích thước của List: " + users.size());


        // Thêm phần tử vào đầu/cuối danh sách: .addFirst() .addLast()
        users.addFirst(new User("An", 26));
        users.addLast(new User("Binh", 24));
        System.out.println("Sau khi thêm phần tử vào đầu và cuối: " + users);


        // Lấy phần tử đầu/cuối danh sách: .getFirst() .getLast()
        System.out.println("Phần tử đầu danh sách: " + users.getFirst());
        System.out.println("Phần tử cuối danh sách: " + users.getLast());


        // Xóa phần tử đầu/cuối danh sách: .removeFirst() .removeLast()
        users.removeFirst();
        users.removeLast();
        System.out.println("Sau khi xóa phần tử đầu và cuối: " + users);


        // Lấy phần tử tại vị trí index cụ thể: .get(index)
        System.out.println("Phần tử tại vị trí index 2: " + users.get(2));


        // set phần tử tại vị trí index cụ thể: .set(index, element)
        users.set(1, new User("Cuong", 28));
        System.out.println("Sau khi set phần tử tại index 1: " + users);


        // Xóa phần tử tại vị trí index cụ thể: .remove(index)
        users.remove(0);
        System.out.println("Sau khi xóa phần tử tại index 0: " + users);


        //Xóa phần tử cụ thể: .remove(object)
        users.remove(new User("Cuong", 28));
        System.out.println("Sau khi xóa phần tử User Cuong: " + users);


        // Kiểm tra phần tử có tồn tại trong LinkedList hay không: .contains(object)
        System.out.println("Kiểm tra phần tử User Hai có tồn tại: " + users.contains(new User("Hai", 25)));


        // Index của phần tử trong LinkedList: .indexOf(object)
        System.out.println("Index của phần tử User Vinh: " + users.indexOf(new User("Vinh", 23)));


        // Index của phần tử cuối cùng trong LinkedList: .lastIndexOf(object)
        users.add(new User("Vinh",23));
        System.out.println("Index cuối cùng của phần tử User Vinh: " + users.lastIndexOf(new User("Vinh", 23)));


        // sắp xếp LinkedList: .sort(Comparator)
        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println("Sau sort theo age: " + users);


        // Xóa tất cả phần tử trong LinkedList: .clear()
        users.clear();
        System.out.println("Sau khi xóa tất cả phần tử: " + users);
        System.out.println("List trống: " + users.isEmpty());
    }
}
