package Chain_of_responsibility;

/**
 * Created by Asus on 28.04.2016.
 */
public abstract class Transporter {
    int capacity;
    Transporter next;

    public void setNext(Transporter next) {
        this.next = next;
    }

    public Transporter(int capacity) {
        this.capacity = capacity;
    }

    public void loadCargo(int weight) {
        if(weight<=capacity){
            System.out.println("Вантажопідйомності достатньо. Вантаж завантажено для відправки.");
        } else {
            System.out.println("Вантажопідйомності недостатньо.");
            if(next!=null){
                next.loadCargo(weight);
            }
        }
    }
}
