package ra.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 18);
        Student student3 = new Student("SV003", "Nguyễn Văn D", 20);
        //{Key,Value}
        Map<Integer, Student> mapStudent = new HashMap<>();
        mapStudent.put(1, student1);
        mapStudent.put(2, student2);
        mapStudent.put(3, student3);
        //lấy phần tử trong map
        System.out.println("Tên sinh viên 2: " + mapStudent.get(2).getStudentName());
        //Xóa phần tử trong map
        mapStudent.remove(2);
        System.out.println(mapStudent);

    }
}
