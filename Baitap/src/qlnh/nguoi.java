package qlnh;

public class nguoi{
    private String MaKH;
    private String Hoten;
    private String Diachi;
    private int cmnd;

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public nguoi(String maKH, String hoten, String diachi, int cmnd) {
        MaKH = maKH;
        Hoten = hoten;
        Diachi = diachi;
        this.cmnd = cmnd;
    }

    public nguoi() {
    }
}
