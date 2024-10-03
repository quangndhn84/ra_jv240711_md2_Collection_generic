package ra.generic;

public class MethodGeneric {
    public <T> void printElementOfArray(T[] arr) {
        System.out.println("Các phần tử của mảng:");
        for (T element : arr) {
            System.out.println(element);
        }
    }
}
