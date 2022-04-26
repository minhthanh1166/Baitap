package qlnh;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static int menu() {
        System.out.println("============================");
        System.out.println("1.Thêm khách hàng");
        System.out.println("2.Xoá khách hàng");
        System.out.println("3.Hiển thị DS khách hàng");
        System.out.println("4.Tìm kiếm khách hàng");
        System.out.println("Lựa chọn");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        return k;
    }
    private static ArrayList<Nhanvien> dsnv = new ArrayList<Nhanvien>();


    private static void ThemKH(ArrayList<Nhanvien> dsnv, int n){
        for(int i = 0; i < n; i ++ ){
            Nhanvien nv = new Nhanvien();
            System.out.println("Nhập khách hàng thứ: " + (i + 1));
            nv.Input();
            dsnv.add(nv);
        }
    }

    private static void Hienthi(ArrayList<Nhanvien> dsnv){
        for ( Nhanvien ds: dsnv) {
            System.out.println("\t ====Hiển thị DS Khách hàng====");
            ds.Output();
        }
    }

    private static void XoaKH(ArrayList<Nhanvien> dsnv, String id){
        for (int i = 0; i < dsnv.size(); i++){
            if(dsnv.get(i).getMaKH().equals(id)){
                dsnv.remove(dsnv.get(i));
                for (Nhanvien dskh: dsnv) {
                    System.out.println("\t ====Hiển thị DS Khách hàng====");
                    dskh.Output();
                }
            }
        }
    }

    private static void Timkiem(ArrayList<Nhanvien> dsnv, String tk){
        for(int i = 0; i < dsnv.size(); i++ ){
            if(dsnv.get(i).getMaKH().equals(tk)){
                System.out.println("\t ====Hiển thị DS Khách hàng====");
                dsnv.get(i).Output();
            }
        }
    }

    public static void main(String[] args) {
        boolean f = true;
        do {
            Scanner sc = new Scanner(System.in);
            int n = 0;
            try{
                switch (menu()){
                    case 1:
                        System.out.println("\t Nhập số khách hàng: ");
                        n = sc.nextInt();
                        sc.nextLine();
                        ThemKH(dsnv, n);
                        break;
                    case 2:
                        System.out.println("\t Nhập mã cần xoá: ");
                        String id = sc.nextLine();
                        XoaKH(dsnv, id);
                        break;
                    case 3:
                        Hienthi(dsnv);
                        break;
                    case 4:
                        System.out.println("\t Nhập mã khách hàng cần tìm kiếm: ");
                        String tk = sc.nextLine();
                        Timkiem(dsnv, tk);
                        break;
                }
            }catch (Exception e){
                System.out.println("Lỗi: " + e);
                f = false;
            }
        }while(f);
    }
}
