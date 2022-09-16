package oop;

public class HinhTamGiacVuong extends HìnhTamGiac {
    private double canhGocVuongThuNhat;
    private double canhGocVuongThuHai;
    private double canhHuyen;

    public HinhTamGiacVuong(double canhGocVuongThuNhat, double canhGocVuongThuHai, double canhHuyen) {
        super(canhGocVuongThuNhat, canhGocVuongThuHai, canhHuyen);
        this.canhGocVuongThuNhat = canhGocVuongThuNhat;
        this.canhGocVuongThuHai = canhGocVuongThuHai;
        this.canhHuyen = canhHuyen;
    }

    @Override
    public double dienTich() {
        return canhGocVuongThuHai * canhGocVuongThuNhat / 2;
    }

    @Override
    public void output() {
        System.out.println("Đây là Hình tam giác Vuông với cạnh huyền = "
                + canhHuyen + "độ dài 2 cạnh góc vuông là: "
                + canhGocVuongThuNhat + " - "
                + canhGocVuongThuHai);
    }
}
