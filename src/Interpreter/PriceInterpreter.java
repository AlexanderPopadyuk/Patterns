package Interpreter;

/**
 * Created by Asus on 17.05.2016.
 */
public class PriceInterpreter extends Expression {
    @Override
    public void interpret(Context context) {
        double price;
        String input = context.getInput();
        price = Integer.valueOf(input);
        price = price * 0.5;

        context.setOutput(Double.toString(price) + " грн");
        System.out.println(context.getOutput());
    }
}
