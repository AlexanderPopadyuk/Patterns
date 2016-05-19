package Interpreter;

/**
 * Created by Asus on 17.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        String str = "100";
        Context context = new Context(str);

        Expression expression = new NonterminalExpression(new TerminalExpression());
        System.out.println(expression.interpret(context) + " UAH");
    }
}
