import org.w3c.dom.ls.LSOutput;

import javax.swing.text.html.parser.Parser;

public class Bangcuuchuong {
    public static void main(String[] args) {
        System.out.println("\n-----------------CHUONG TRINH IN BANG CUU CHUONG------------------\n");
        String s;
        for(int i = 0; i < 10;i++){
            for(int j = 1; j <= 10; j++){
                s = i + " x " + j + " = " + (i*j);
                System.out.println(s);
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
