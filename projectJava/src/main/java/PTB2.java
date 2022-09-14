import java.util.Scanner;

public class PTB2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập hệ số bậc 2, a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số bậc 1, b = ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hằng số tự do, c = ");
        double c = scanner.nextDouble();
        giaiPTBac2(a, b, c);
    }

    private static void giaiPTBac2(double heSoBac2, double heSoBac1, double soHangTuDo) {
        if (heSoBac2 == 0) {
            if (heSoBac1 == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-soHangTuDo / heSoBac1));
            }
            return;
        }
        double delta = heSoBac1*heSoBac1 - 4*heSoBac2*soHangTuDo;
        double nghiemSo1;
        double nghiemSo2;
        if (delta > 0) {
            nghiemSo1 = ((-heSoBac1 + Math.sqrt(delta)) / (2*heSoBac2));
            nghiemSo2 = ((-heSoBac1 - Math.sqrt(delta)) / (2*heSoBac2));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + nghiemSo1 + " và x2 = " + nghiemSo2);
        } else if (delta == 0) {
            nghiemSo1 = (-heSoBac1 / (2 * heSoBac2));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + nghiemSo1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
