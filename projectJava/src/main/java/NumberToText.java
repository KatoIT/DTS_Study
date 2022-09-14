public class NumberToText {
    public static void main(String[] args) {
        long number = 1000;
        String numberText = String.valueOf(number);

        String result = numberLessThanTen(10);
        System.out.println(result);
    }

    private static String numberLessThanTen(int number) {
        return switch (number) {
            case 0 -> "không";
            case 1 -> "một";
            case 2 -> "hai";
            case 3 -> "ba";
            case 4 -> "bốn";
            case 5 -> "năm";
            case 6 -> "sáu";
            case 7 -> "bảy";
            case 8 -> "tám";
            case 9 -> "chín";
            default -> "";
        };
    }
}
