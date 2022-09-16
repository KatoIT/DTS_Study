package oop;

public class HinhTron implements HinhHoc {
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double chuVi() {
        return banKinh * 2 * Math.PI;
    }

    @Override
    public double dienTich() {
        return banKinh * Math.PI * Math.PI;
    }

    @Override
    public void output() {
        System.out.println("Đây là Hình Tròn có bán kính " + banKinh);
    }
}
