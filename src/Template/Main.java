package Template;

public class Main {

    public static void main(String[] args) {
        AbstractTransporter firstTransporter = new FirstConcreteTransporter();
        firstTransporter.templateMethod();
        System.out.println();
        AbstractTransporter secondTransporter = new SecondConcreteTransporter();
        secondTransporter.templateMethod();
    }
}