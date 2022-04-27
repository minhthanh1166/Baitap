import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {


        String c = "t";
        do {
            float Sotientra;
            float st = 0;
            Scanner sc = new Scanner( System.in );
            System.out.println( "Nhập số tiền trả: " );

            Sotientra = Float.parseFloat(sc.nextLine());
            if (Sotientra >= 200 && Sotientra < 300) {
                st = (float) (Sotientra * 0.2);

                System.out.println( "Số tiền khuyến mại là: " + st );
            } else if (Sotientra >= 300) {
                st = (float) (Sotientra * 0.3);

                System.out.println( "Số tiền khuyến mại là: " + st );
            } else {
                st = 0;
                System.out.println( "số tiền khuyến mại: " + st );
            }
            System.out.println( "Continue: " );
            c = sc.nextLine();
            if (c.equals("f")) {
                break;
            }
        } while (c.equals("t"));

    }
}
