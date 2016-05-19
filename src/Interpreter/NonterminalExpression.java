package Interpreter;

/**
 * Created by Asus on 19.05.2016.
 */
public class NonterminalExpression extends Expression {

    Expression expression;

    public NonterminalExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public double interpret(Context context) {
        return expression.interpret(context)*0.5;
    }
}
