import java.util.Scanner;

public class B10 {
   // Viết một chương trình tính giai thừa của một số nguyên dương n. Với n được nhập từ bàn phím. Ví dụ, n = 8 thì kết quả đầu ra phải là 1*2*3*4*5*6*7*8 = 40320.
    public static Scanner sc = new Scanner(System.in);

    public static long Tinhgiaithua(int  n){
        if (n > 0){
            return n * Tinhgiaithua(n - 1 );
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {

        System.out.println("Nhập số nguyên dương:");
        int n = sc.nextInt();
        System.out.println("Giai thừa của " + n + " Là: " + Tinhgiaithua(n));
    }
}
