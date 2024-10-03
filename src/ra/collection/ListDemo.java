package ra.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //Khai báo 1 danh sách từ List interface và lớp triển khai ArrayList
        List<Student> listStudent = new ArrayList<>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 18);
        Student student3 = new Student("SV003", "Nguyễn Văn D", 20);
        Student student4 = new Student("SV004", "Nguyễn Văn C", 20);
        Student student5 = new Student("SV005", "Nguyễn Văn F", 22);
        //add(obj): Thêm một đối tượng vào cuối danh sách
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);
        //size(): Số phần tử của danh sách
        System.out.println("Số phần tử của danh sách: " + listStudent.size());
        //boolean isEmpty(): Kiểm tra danh sách có phần tử chưa
        System.out.println("Kiểm tra danh sách có phần tử chưa: " + listStudent.isEmpty());
        //remove(obj): xóa 1 phần tử trong danh sách
        listStudent.remove(student3);
        //boolean containsAll(listChild): Kiểm tra danh sách con có trong danh sách hiện tại khong
        List<Student> listChild = new ArrayList<>();
        listChild.add(student1);
        listChild.add(student2);
        System.out.println("Danh sách listChild có trong listStudent không: " + listStudent.containsAll(listChild));
        //addAll(list): Thêm danh sách list vào danh sách hiện tại
        listStudent.addAll(listChild);
        //removeAll(list): Xóa danh sách list trong danh sách hiện tại
//        listStudent.removeAll(listChild);
        //clear(): xóa tất cả các phần tử
//        listStudent.clear();
        //get(int index): lấy phần tử theo chỉ số
        System.out.println("Tên sinh viên của phần tử có chỉ số 2 trong danh sách: " + listStudent.get(2).getStudentName());
        //set(int index, Object o): Đè đối tượng o vào chỉ số index
        listStudent.set(4, student3);
        //indexOf(Object o): Lấy chỉ số phần tử o trong danh sách
        System.out.println("Chỉ số của đối tượng SV003 trong danh saách: " + listStudent.indexOf(student3));
        //subList(int begin, int end): Cắt chuỗi từ chỉ số begin đến end
        List<Student> listSub = listStudent.subList(0, 4);
        System.out.println("Danh sách các sinh viên trong SubList:");
        listSub.forEach(student -> {
            System.out.println(student);
        });
        //add(int index, Object o): Chèn đối tượng o vào chỉ số index trong danh sách
        listStudent.add(2, student3);
        //foreach: duyệt tất cả các phần tử của danh sách
        System.out.println("Danh sách các sinh viên trong listStudent:");
        listStudent.forEach(student -> {
            System.out.println(student);
        });

    }

}
