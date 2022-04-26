package qlsv;

import java.util.Scanner;

public class lop {
    private String Malop;
    private String Tenlop;
    private String Diachi;

    public String getMalop() {
        return Malop;
    }

    public void setMalop(String malop) {
        Malop = malop;
    }

    public String getTenlop() {
        return Tenlop;
    }

    public void setTenlop(String tenlop) {
        Tenlop = tenlop;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public lop(String malop, String tenlop, String diachi) {
        Malop = malop;
        Tenlop = tenlop;
        Diachi = diachi;
    }

    public lop() {
    }

    public void Inputlop() {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Nhập mã lớp: " );
        setMalop( sc.nextLine() );
        System.out.println( "Nhập tên lớp: " );
        setTenlop( sc.nextLine() );
        System.out.println( "Nhập địa chỉ" );
        setDiachi( sc.nextLine() );
    }

    public void Outputlop(){
        System.out.println("Mã sinh viên của bạn là: " + getMalop());
        System.out.println("Tên sinh viên của bạn là: " + getTenlop());
        System.out.println("Giới tính: " + getDiachi());
    }
}

