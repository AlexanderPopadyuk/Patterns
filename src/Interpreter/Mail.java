package Interpreter;

/**
 * Created by Asus on 17.05.2016.
 */
public class Mail {
    public static void main(String[] args) {
        String str = "100";
        Context context = new Context(str);

        Expression price = new PriceInterpreter();
        price.interpret(context);
    }
}
