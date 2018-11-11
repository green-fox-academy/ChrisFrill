public class DivideByZero {

    public static void main(String[] args) {
        divideTen(-1);
    }

    public static void divideTen (int inputNumber) {
        try {
            int result = 10 / inputNumber;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
    }
}
