package Builder;
public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new PartsBuilder());
        Parcel parcel = director.BuildParcel();
        System.out.println(parcel.toString());
    }
}
