package Bridge;
/**
 * Created by Asus on 31.03.2016.
 */
public abstract class AbstractOffice implements IOffice {
    protected String address;

    protected IOffice office;

    public AbstractOffice(IOffice office, String address) {
        this.office = office;
        this.address = address;
    }

    public void getAddress(){
        System.out.println(address);
    };

    @Override
    public void getCapacity() {
        office.getCapacity();
    }
}
