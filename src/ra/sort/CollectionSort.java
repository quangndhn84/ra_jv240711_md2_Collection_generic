package ra.sort;

import ra.collection.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSort {
    /*
     * 2 CÁCH SẮP XẾP TRONG COLLECTION: Comparable Interface và Comparator Interface
     * 1. Sử dụng Comparable để sắp xếp
     *   - Bước 1: Lớp sắp xếp phải kế thừa Comparable
     *   - Bước 2: triển khai phương thức compareTo và cài đặt sắp xếp
     *   - Bước 3: Sử dụng phương thức sort của Collections để sắp xếp
     * 2. Sử dụng Comparator để sắp sếp
     *  - Bước 1: Dùng phương thức sort của Collections để sắp xếp theo đối tượng Comparator
     *  - Bươc 2: Triển khai phương thức compare của Comparator v cài đặt sắp xếp
     *
     * */
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<Student>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 18);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 22);
        Student student4 = new Student("SV004", "Nguyễn Văn D", 21);
        Student student5 = new Student("SV005", "Nguyễn Văn F", 25);
        //add(obj): Thêm một đối tượng vào cuối danh sách
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);
        //Sắp xếp danh sách sinh viên theo tuổi tăng dần
//        Collections.sort(listStudent);
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("DANH SÁCH SINH VIÊN SẮP XẾP THEO TUỔI TĂNG DẦN:");
        listStudent.forEach(student -> {
            System.out.println(student);
        });
        //Sắp xếp sinh viên theo tên giảm dần
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -o1.getStudentName().compareTo(o2.getStudentName());
            }
        });
        System.out.println("DANH SÁCH SINH VIÊN SẮP XẾP THEO TÊN GIẢM DẦN:");
        listStudent.forEach(student -> {
            System.out.println(student);
        });
    }
}
