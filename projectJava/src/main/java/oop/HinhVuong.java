package oop;

public class HinhVuong extends HinhChuNhat {
    private double canh;

    public HinhVuong(double canh) {
        super(canh, canh);
        this.canh = canh;
    }

    @Override
    public void output() {
        System.out.println("Đây là Hình vuông có độ dài cạnh là: " + canh);
    }
}
