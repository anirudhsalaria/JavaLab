import java.util.Scanner;
class q26_dynamic_array_size{
    public static void main(String[] args) {
        int[] arr;
        System.out.println("Enter the size of the array: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        arr = new int[size]; // dynamic size allocation at runtime
    }
}