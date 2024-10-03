package ra.collection;

public class Student implements Comparable<Student> {
    private String studentId;
    private String studentName;
    private int age;

    public Student() {
    }

    public Student(String studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentId: " + this.studentId + " - Student Name: " + this.studentName + " - Age: " + this.age;
    }

    @Override
    public int compareTo(Student o) {
        //Cài đặt sắp xếp
//        if (this.age>o.age){
//            return 1;
//        }else if (this.age==o.age){
//            return 0;
//        }else{
//            return -1;
//        }
        return this.age - o.age;
    }
}
