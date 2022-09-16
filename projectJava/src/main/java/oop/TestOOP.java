package oop;

import java.util.ArrayList;
import java.util.List;

public class TestOOP {
    public static void main(String[] args) {
        List<HinhHoc> danhSachHinhHoc = new ArrayList<HinhHoc>();
        danhSachHinhHoc.add(new HinhTron(3.5));
        danhSachHinhHoc.add(new HìnhTamGiac(3,4,6));
        danhSachHinhHoc.add(new HinhChuNhat(4,3));
        danhSachHinhHoc.add(new HinhVuong(5));
        danhSachHinhHoc.add(new HinhTamGiacVuong(3,4,5));
        //
        for (HinhHoc hinhHoc:
             danhSachHinhHoc) {
            hinhHoc.output();
            System.out.println("Chu vi: " + hinhHoc.chuVi());
            System.out.println("Diện tích: " + hinhHoc.dienTich());
        }


    }
}
