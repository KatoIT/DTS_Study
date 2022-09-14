public class Factorial {
    public static void main(String[] args) {
        int value = 7;

        System.out.println("Giai thừa của " + value + " là: " + giaiThua(value));
        System.out.println("Giai thừa của " + value + " là: " + giaiThuaDeQuy(value) + " (*Đệ quy)");
    }

    private static long giaiThua(int number) {
        long giaiThua = 1;
        if (number == 0 || number == 1) {
            return giaiThua;
        } else {
            for (int index = 2; index <= number; index++) {
                giaiThua *= index;
            }
            return giaiThua;
        }
    }

    private static long giaiThuaDeQuy(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * giaiThuaDeQuy(number - 1);
        }
    }
}
