package hellocucumber;

public class Calculator {
    public Calculator() {
    }
    public int addition(int a, int b) {
        return a + b;
    }
    public int subtraction(int a, int b) {
        return a - b;
    }
    public int multiplication(int a, int b) {
        return a * b;
    }
    public int division(int a, int b) {
        return a / b;
    }

    public int root(int base) {
        return (int)Math.sqrt(base);
    }
}
