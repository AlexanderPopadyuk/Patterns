package Interpreter;

/**
 * Created by Asus on 17.05.2016.
 */
public class TerminalExpression extends Expression {

    @Override
    public double interpret(Context context) {
        return Double.valueOf(context.getInput());
    }
}
