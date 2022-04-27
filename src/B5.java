import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        float a, s, t;
        Scanner sc = new Scanner( System.in );
        System.out.println( "Nhập số tiền gửi tiết kiệm: " );
        a = sc.nextFloat();
        System.out.println( "Nhập lãi suất % hàng tháng: " );
        s = sc.nextFloat();
        System.out.println( "Nhập số tháng đã gửi tiết kiệm: " );
        t = sc.nextFloat();
        System.out.println( "Số tháng gửi: " );
        System.out.println( "Tổng số tiền: " );
        for (int i = 0; i < t; i++) {
            if (i % 6 == 0) {
                for (int k = 0; k < 6; k++) {
                    a *= (1 + s / 100);
                }
            }
                System.out.println( "\n        " + i + "        " + a + "           \n" );

        }
    }
}
