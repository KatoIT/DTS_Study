package oop;

public class HinhChuNhat implements HinhHoc {
    private double canhDai;
    private double canhNgan;

    public HinhChuNhat(double canhDai, double canhNgan) {
        this.canhDai = canhDai;
        this.canhNgan = canhNgan;
    }

    @Override
    public void output() {
        System.out.println("Đây là hình chữ nhật có độ dài hai cạnh là: " + canhDai + " - " + canhNgan);
    }

    @Override
    public double chuVi() {
        return (canhDai + canhNgan) * 2;
    }

    @Override
    public double dienTich() {
        return canhDai * canhNgan;
    }
}
