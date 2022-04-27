import java.awt.*;
import java.util.Scanner;

public class B12 {
//    static void myMethod(String fname){
//        System.out.println(fname + "thành");
//    }
//
//    public static void main(String[] args) {
//        myMethod("Chào ông chủ ");
//    }


    //Kiểub truyền trong java
    /*
    * Truyền kiểu Java
    Ép kiểu là khi bạn gán giá trị của một kiểu dữ liệu nguyên thủy cho một kiểu khác. Trong Java, có hai kiểu ép kiểu:

    Mở rộng Truyền (tự động) - chuyển đổi một loại nhỏ hơn thành một kích thước loại lớn hơn
    byte-> short-> char-> int-> long-> float->double

    Thu hẹp Truyền (thủ công) - chuyển đổi loại lớn hơn sang loại kích thước nhỏ hơn
    double-> float-> long-> int-> char-> short->byte
    * */

    public static void main(String[] args) {
//        int myInt =  9;
//        double myDouble = myInt;
//        System.out.println(myInt);
//        System.out.println(myDouble);
//
//        double myDouble = 1.99999;
//        int myInt = (int)myDouble;
//
//        System.out.println(myDouble);
//        System.out.println(myInt);
        String txt = "1,2,3,4,5";
        System.out.println(txt.indexOf("5"));
    }
}

