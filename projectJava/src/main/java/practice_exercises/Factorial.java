package practice_exercises;

public class Factorial {
    private byte number;

    Factorial(byte number) {
        this.number = number;
    }

    public long factorial() {
        long factorial = 1;
        if (number == 0 || number == 1) {
            return factorial;
        } else {
            for (int index = 2; index <= number; index++) {
                factorial *= index;
            }
            return factorial;
        }
    }

    public long factorialRecursive() {
        return factorialRecursive(this.number);
    }

    private long factorialRecursive(byte number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorialRecursive((byte) (number - 1));
        }
    }
}
