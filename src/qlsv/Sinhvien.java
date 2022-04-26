package qlsv;

import java.util.Scanner;

    public class Sinhvien  extends lop{
        private String Masv;
        private String Tensv;
        private String Gioitinh;

        public String getMasv() {
            return Masv;
        }

        public void setMasv(String masv) {
            Masv = masv;
        }

        public String getTensv() {
            return Tensv;
        }

        public void setTensv(String tensv) {
            Tensv = tensv;
        }

        public String getGioitinh() {
            return Gioitinh;
        }

        public void setGioitinh(String gioitinh) {
            Gioitinh = gioitinh;
        }


        public Sinhvien(String masv, String tensv, String gioitinh) {
            Masv = masv;
            Tensv = tensv;
            Gioitinh = gioitinh;
        }

        public Sinhvien() {
        }

        public void Input(){
            Scanner sc = new Scanner(System.in );
            System.out.println("Nhập mã sinh viên: ");
            setMasv( sc.nextLine() );
            System.out.println("Nhập tên sinh viên: ");
            setTensv( sc.nextLine() );
            System.out.println("Nhập giới tính");
            setGioitinh( sc.nextLine() );
            super.Inputlop();
        }

        public void Output(){
            System.out.println("Mã sinh viên của bạn là: " + getMasv());
            System.out.println("Tên sinh viên của bạn là: " + getTensv());
            System.out.println("Giới tính: " + getGioitinh());
            super.Outputlop();
        }
    }
