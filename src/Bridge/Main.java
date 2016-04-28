package Bridge;
public class Main {

    public static void main(String[] args) {
        IOffice postOffice = new PostOffice();
        AbstractOffice post = new SomePostOffice(postOffice,"вул. Головна 12");
        post.getAddress();
        post.getCapacity();
    }
}
