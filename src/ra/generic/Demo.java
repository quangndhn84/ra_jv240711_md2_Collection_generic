package ra.generic;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //Khởi tạo doi tuong tu lop ClassGeneric
        ClassGeneric<String, String> cg1 = new ClassGeneric<>("Study", "Học");
        ClassGeneric<Integer, String> cg2 = new ClassGeneric<>(1, "Một");
        System.out.printf("Nghĩa của từ %s là %s\n", cg1.getKey(), cg1.getValue());
        System.out.printf("Phiên âm của %d là %s\n", cg2.getKey(), cg2.getValue());
        GenericInheritace1 gi1 = new GenericInheritace1();
        GenericInheritance2<Integer> gi2 = new GenericInheritance2<>();
        GenericInheritance3<Float, Double, Integer> gi3 = new GenericInheritance3<>();

        MethodGeneric mg = new MethodGeneric();
        Integer[] arrInt = {1, 3, 5, 7};
        Float[] arrFloat = {3.2F, 5.7F};
        String[] arrString = {"Nguyễn Văn A", "Nguyễn Văn B"};
        mg.printElementOfArray(arrInt);
        mg.printElementOfArray(arrFloat);
        mg.printElementOfArray(arrString);
        //Wildcard ?: Đại diện cho bất cứ kiểu dữ liệu nào
        Person person = new Person();
        Teacher teacher = new Teacher();
        Employee employee = new Employee();


    }

    public List<?> getObject1(){
        //Wildcard ?: Đại diện cho bất cứ kiểu dữ liệu nào
        return new ArrayList<Integer>();
    }

    public List<? extends Teacher> getObject2(){
        //Wildcard ? extends A: Đại diện cho tất cả các kiểu dữ liệu kế thừa từ A
        return new ArrayList<Employee>();
    }
    public List<? super Teacher> getObject3(){
        //Wildcard ? super A: Đại diện cho tất cả các kiểu dữ liệu mà A kế thừa
        return new ArrayList<Person>();
    }
}
