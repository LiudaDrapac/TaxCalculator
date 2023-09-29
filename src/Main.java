import calculator.Calculator;

public class Main {
    public static void main(String[] args)

    {
        Calculator shirt = new Calculator();
shirt.price = 1000.5;
shirt.tax = 1.5;
shirt.quantity = 20;
 shirt.total = shirt.price * shirt.quantity * shirt.tax;


        System.out.println("I want to but" + shirt.quantity + "shirt!");
               System.out.println("Total cost with tax is = " + shirt.total);
    }
}