package oop;

public class HìnhTamGiac implements HinhHoc {
    private double canhThuNhat;
    private double canhThuHai;
    private double canhThuBa;

    public HìnhTamGiac(double canhThuNhat, double canhThuHai, double canhThuBa) {
        this.canhThuNhat = canhThuNhat;
        this.canhThuHai = canhThuHai;
        this.canhThuBa = canhThuBa;
    }

    @Override
    public double chuVi() {
        return canhThuNhat + canhThuHai + canhThuBa;
    }

    @Override
    public double dienTich() {
        double nuaChuVi = chuVi();
        return Math.sqrt(nuaChuVi * (nuaChuVi - canhThuNhat) * (nuaChuVi - canhThuHai) * (nuaChuVi - canhThuBa));
    }

    @Override
    public void output() {
        System.out.println("Đây là hình Tam giác có độ dài ba cạnh là: "
                + canhThuNhat + " - "
                + canhThuHai + " - "
                + canhThuBa);
    }
}
