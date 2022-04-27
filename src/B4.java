import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        boolean t = true;
        do {
            int n = 0, s = 0;

            Scanner sc = new Scanner( System.in );
            System.out.println( "Nhập số nguyên: " );
            n = sc.nextInt();

            if (n >= 10 && n <= 20) {
                System.out.println( "Thoả mãn !" );
                for (int i = 1; i <= n; i++) {

                    s = s + i;
                }
                System.out.println( "Tổng các số từ 1 đến " + n + " là: " + s );
                t = false;
            } else {
                System.out.println( "Không thoả mãn! " );

            }

        } while (t == true);
    }
}
