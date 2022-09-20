package practice_exercises;

public class PTBac2 {
    private final float heSoBac2;
    private final float heSoBac1;
    private final float soHangTuDo;

    public PTBac2(float heSoBac2, float heSoBac1, float soHangTuDo) {
        this.heSoBac2 = heSoBac2;
        this.heSoBac1 = heSoBac1;
        this.soHangTuDo = soHangTuDo;
    }

    public String ketQua() {
        String result = "Phương trình %.1fx^2 + %.1fx + %.1f ".formatted(heSoBac2, heSoBac1, soHangTuDo);
        if (heSoBac2 == 0) {
            if (heSoBac1 == 0) {
                result += "vô nghiệm!";
            } else {
                result += "có một nghiệm: "
                        + "x = %.3f".formatted(-soHangTuDo / heSoBac1);
            }
            return result;
        }
        double delta = heSoBac1 * heSoBac1 - 4 * heSoBac2 * soHangTuDo;
        double nghiemSo1;
        double nghiemSo2;
        if (delta > 0) {
            nghiemSo1 = ((-heSoBac1 + Math.sqrt(delta)) / (2 * heSoBac2));
            nghiemSo2 = ((-heSoBac1 - Math.sqrt(delta)) / (2 * heSoBac2));
            result += "có 2 nghiệm là: "
                    + "x1 = %.4f và x2 = %.4f".formatted(nghiemSo1, nghiemSo2);
        } else if (delta == 0) {
            nghiemSo1 = (-heSoBac1 / (2 * heSoBac2));
            result += " có nghiệm kép: "
                    + "x1 = x2 = %.4f".formatted(nghiemSo1);
        } else {
            result += "vô nghiệm!";
        }
        return result;
    }
}
