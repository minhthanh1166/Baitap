import java.sql.SQLOutput;
import java.util.Scanner;

public class Thisinh extends Diem{
    private String Hoten;
    private String Ngaysinh;
    private String Sobaodanh;
    private String Truong;

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public String getSobaodanh() {
        return Sobaodanh;
    }

    public void setSobaodanh(String sobaodanh) {
        Sobaodanh = sobaodanh;
    }

    public String getTruong() {
        return Truong;
    }

    public void setTruong(String truong) {
        Truong = truong;
    }




    public Thisinh(String hoten, String ngaysinh, String sobaodanh, String truong) {
        Hoten = hoten;
        Ngaysinh = ngaysinh;
        Sobaodanh = sobaodanh;
        Truong = truong;

    }

    public Thisinh() {
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        setHoten(sc.nextLine());
        System.out.println("Nhập Ngày sinh: ");
        setNgaysinh(sc.nextLine());
        System.out.println("Nhập số báo danh: ");
        setSobaodanh(sc.nextLine());
        System.out.println("Nhập trường: ");
        setTruong(sc.nextLine());
        super.input();
    }

    @Override
    public void Output(){

        System.out.println("Họ tên: " + getHoten());
        System.out.println("Ngày sinh: " + getNgaysinh());
        System.out.println("Số báo danh: " + getSobaodanh());
        System.out.println("Trường: " + getTruong());
        super.Output();
        System.out.println("Tổng điểm: " + Tongdiem());

    }
    public float Tongdiem(){
        float tongdiem;
        tongdiem = (getToan() + getLy() + getHoa());

        return tongdiem;
    }

}
