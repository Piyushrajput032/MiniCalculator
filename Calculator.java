public class Calculator{
    public static int a = 1, b = 3;
    public static int c;

    public void Add() {
        c = a + b;
        System.out.println("Sum is:"+ c);


    }

    public void Sub() {
        c = a - b;
        System.out.println("Diff is:"+ c);


    }

    public void Mul() {
        c = a * b;
        System.out.println("Mul is:"+ c);


    }

    public void div() {
        c = a / b;
        System.out.println("division is:"+ c);


    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();
        obj.Add();
        obj.Sub();
        obj.Mul();
        obj.div();



    }


}