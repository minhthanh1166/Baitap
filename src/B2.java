import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a , b , Hoandoi;
        // Yêu cầu người dùng nhập vào 2 số a, b.
        System.out.println("Nhập vào số a: ");
        a = sc.nextFloat();
        System.out.println("Nhập vào số b: ");
        b = sc.nextFloat();
        //Sử dụng thuật toán hoán đổi dùng biến trung gian: "Hoandoi".
        Hoandoi = a;
        a = b;
        b = Hoandoi;
        System.out.println("Sau khi hoán đổi \n a = " + a + "\n b " + b);

        System.out.println("-----------------------------------");
    }
}
