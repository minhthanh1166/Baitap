import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        boolean kt = true;
        Scanner sc = new Scanner(System.in );
        do {
            System.out.println("Nhập n: ");
            int n = sc.nextInt();
            if(Kiemtra( n )){
                System.out.println(n + "Là số nguyên tố !");
                kt = false;
            }
            else{
                System.out.println(n + "Không phải là số nguyên tố !");
            }
        }while(kt == true);

    }
    public static boolean Kiemtra(int n ){
        if ( n < 2){
            return false;
        }
        else{
            for(int i = 2; i < Math.sqrt( n); i ++){
                if ( n % i == 0);
                return false;
            }
        }
        return true;
    }
}
