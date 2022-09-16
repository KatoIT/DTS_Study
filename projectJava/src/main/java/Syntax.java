public class Syntax {
    public static void main(String[] args) {
        cauDieuKien();
        vongLapFor();
        System.out.println();
        vongLapWhile();
        System.out.println(numberLessThanTen(5));
    }

    private static void cauDieuKien() {
        byte numberOne = 1;
        byte numberTwo = 2;
        if (numberOne % numberTwo == 0) {
            System.out.println(numberOne + " chia hết cho " + numberTwo);
        } else {
            System.out.println(numberOne + " chia " + numberTwo + " dư " + numberOne % numberTwo);
        }
    }

    private static void vongLapFor() {
        byte size = 10;
        System.out.print("For 1: ");
        for (int index = 0; index < size; index += 2) {
            System.out.print(index + " ");
        }
        System.out.print("\nFor 2: ");
        for (int index = size; index > 0; index -= 2) {
            System.out.print(index + " ");
        }
        System.out.print("\nFor 3: ");
        for (int index = 0; index < size; index--) {
            if (index == -5) continue;
            System.out.print(index + " ");
            if (index <= -5) break;
        }
    }

    private static void vongLapWhile() {
        byte size = 6;
        byte max = 5;
        while (size < max) {
            System.out.print(size + " ");
            size++;
        }
        System.out.println("\nsize while: " + size);
        size = 6;
        do {
            System.out.print(size + " ");
            size++;
        } while (size < max);
        System.out.println("\nsize do-while: " + size);
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
            default -> "Số này tôi không biết =))";
        };
    }
}
