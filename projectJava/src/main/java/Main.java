public class Main {
    public static void main(String[] args) {
        Number number = new Number(10);
        System.out.println(number);
        process(number);
        System.out.println(number);
    }

    private static void process(Number number){
        number.setNumber(0);
    }


}
class Number{
    private int number;
    Number(int number){
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}
