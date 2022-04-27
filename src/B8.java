import java.util.Scanner;

public class B8 {
    public static boolean Songuyento(int n){
        if (n < 2) {
            return false;
        }
        else if(n != 2 && n%2 == 0){
            return false;
        }
        else{
            for(int i = 3; i <= Math.sqrt( n ); i++){
                if (n%i == 0);
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean kt = true;
        Scanner sc = new Scanner( System.in );

           System.out.println("Nhập n: ");
           int n = sc.nextInt();
           int s = 0, dem = 0;
           for(int i = 0; i <= n ; i++ ){
               if(Songuyento(i)){
                   dem++;
                   s  += i;
               }
           }
           System.out.println("Tổng các số nguyên tố trong khoản từ 1 đến " + n + " là: " + s );
           System.out.println("Có " + dem + " số nguyên tố ! ");

    }
}
