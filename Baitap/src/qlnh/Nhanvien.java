package qlnh;

import java.util.Scanner;

public class Nhanvien extends nguoi{
    private float Sotiencanvay;
    private int Ngaytrano;
    private String kiten;

    public float getSotiencanvay() {
        return Sotiencanvay;
    }

    public void setSotiencanvay(float sotiencanvay) {
        Sotiencanvay = sotiencanvay;
    }

    public int getNgaytrano() {
        return Ngaytrano;
    }

    public void setNgaytrano(int ngaytrano) {
        Ngaytrano = ngaytrano;
    }

    public String getKiten() {
        return kiten;
    }

    public void setKiten(String kiten) {
        this.kiten = kiten;
    }

    public Nhanvien(float sotiencanvay, int ngaytrano, String kiten) {
        Sotiencanvay = sotiencanvay;
        Ngaytrano = ngaytrano;
        this.kiten = kiten;
    }

    public Nhanvien() {
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng");
        setMaKH(sc.nextLine());
        System.out.println("Họ tên khách hàng: ");
        setHoten(sc.nextLine());
        System.out.println("Địa chỉ khách hàng: ");
        setDiachi(sc.nextLine());
        System.out.println("CMND/CCCD khách hàng: ");
        setCmnd(sc.nextInt());
        System.out.println("Số tiền cần vay: ");
        setSotiencanvay(sc.nextFloat());
        System.out.println("Ngày trả nợ: ");
        setNgaytrano(sc.nextInt());
        sc.nextLine();
        System.out.println("Ký tên khách hàng: ");
        setKiten(sc.nextLine());
    }

    public void Output(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ tên khách hàng: " + getHoten());
        System.out.println("Địa chỉ khách hàng: " + getDiachi());
        System.out.println("CMND/CCCD khách hàng: " + getCmnd());
        System.out.println("Số tiền cần vay: " + getSotiencanvay());
        System.out.println("Ngày trả nợ: " + getNgaytrano());
        System.out.println("Ký tên khách hàng: " + getKiten());
    }
}
