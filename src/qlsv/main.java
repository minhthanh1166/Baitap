package qlsv;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {


    public static void Menu() {
        System.out.println("=======CHỌN=======");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Xoá sinh viên");
        System.out.println("4. Tìm kiếm");
    }

    public static void TimKiemSV(ArrayList<Sinhvien> dssv, String msv) {
        for (int i = 0; i < dssv.size(); i++) {
            if (dssv.get(i).getMasv().equals(msv)) {
                System.out.println("\t ====Hiển thị====");
                dssv.get(i).Output();
            }
        }
    }

    public static void ThemSV(ArrayList<Sinhvien> dssv, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\t Nhập sinh viên thứ: " + (i + 1));
            Sinhvien sv = new Sinhvien();
            sv.Input();
            dssv.add(sv);
        }
    }


    public static void XoaSV(ArrayList<Sinhvien> dssv, String msv) {
        for (int i = 0; i < dssv.size(); i++) {
            if (dssv.get(i).getMasv().equals(msv)) {
                dssv.remove(dssv.get(i));
                for (Sinhvien ht : dssv){
                    System.out.println("\t ====Hiển thị====");
                    ht.Output();
                }
            }
        }
    }

    public static void Hienthi(ArrayList<Sinhvien> dssv ){
        for (Sinhvien s_item : dssv) {
            System.out.println("\t ====Hiển thị====");
            s_item.Output();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sinhvien> sv = new ArrayList<Sinhvien>();
        boolean f = true;
        do {
            Menu();
            System.out.println("Mời lựa chọn: ");
            int c = sc.nextInt();
            sc.nextLine();
            switch (c) {
                case 1:
                    System.out.println("\t Số lượng sinh viên cần nhập: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    ThemSV(sv, n);

                    break;
                case 2:
                    System.out.println("\t Danh sách sinh viên: ");
                    Hienthi(sv);
                    break;

                case 3:
                    System.out.println("\t Xoá sinh viên");
                    System.out.print("\t Nhập mã của sinh viên cần xoá: ");
                    String id = sc.nextLine();
                    XoaSV(sv, id);
                    break;
                case 4:
                    System.out.println("\t Nhập mã sinh viên cần tìm");
                    String masv = sc.nextLine();
                    TimKiemSV(sv, masv);
                    break;
            }
        } while (f);
    }
}
