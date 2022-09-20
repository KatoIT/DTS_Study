import log.LogCustom;

public class Syntax {
    LogCustom log = new LogCustom(this.getClass().getName());

    public void start() {
        demoIfElse(4096, 33098);
        demoFor(5);
        demoWhile(5);
        demoSwitchCase(6);
    }

    public void demoIfElse(int numberOne, int numberTwo) {
        log.info("Demo If-Else");
        if (numberOne > numberTwo) {
            log.info("%d lớn hơn %d".formatted(numberOne, numberTwo));
        } else {
            log.info("%d lớn hơn %d".formatted(numberTwo, numberOne));
        }
    }

    public void demoFor(int size) {
        log.info("Demo For");
        for (int index = 0; index < size; index++) {
            log.info(String.valueOf(index));
        }
    }

    public void demoWhile(int size) {
        log.info("Demo While");
        int var = 0;
        while (var < size) {
            log.info(String.valueOf(var));
            var++;
        }
        log.info("Demo Do - While");
        var = 0;
        do {
            log.info(String.valueOf(var));
            var++;
        } while (var < size);
    }

    public void demoSwitchCase(int number) {
        String textOfNumber = switch (number) {
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
        log.info("Demo Switch - Case");
        log.info(textOfNumber);
    }
}
