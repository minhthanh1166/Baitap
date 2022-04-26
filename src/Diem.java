import java.util.Scanner;

public class Diem {
    private float Toan;
    private float Ly;
    private float Hoa;

    public float getToan() {
        return Toan;
    }

    public void setToan(float toan) {
        Toan = toan;
    }

    public float getLy() {
        return Ly;
    }

    public void setLy(float ly) {
        Ly = ly;
    }

    public float getHoa() {
        return Hoa;
    }

    public void setHoa(float hoa) {
        Hoa = hoa;
    }

    public Diem(float toan, float ly, float hoa) {
        Toan = toan;
        Ly = ly;
        Hoa = hoa;
    }

    public Diem() {
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Điểm toán: ");
        Toan = sc.nextFloat();
        System.out.println("Điểm lý: ");
        Ly = sc.nextFloat();
        System.out.println("Điểm Hoá: ");
        Hoa = sc.nextFloat();
    }

    public void Output(){
        System.out.println("Điểm toán: " + Toan);
        System.out.println("Điểm lý: " + Ly);
        System.out.println("Điểm hoá: " + Hoa);
    }
}
