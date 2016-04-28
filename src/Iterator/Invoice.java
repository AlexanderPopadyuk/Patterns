package Iterator;

/**
 * Created by Asus on 14.04.2016.
 */
public class Invoice implements IAggregate{
    String[] parcels = {"Наушники. 10кг. Львів."
                       ,"Колонки. 30кг. Львів."
                       ,"Монітор. 10кг. Київ."};

    @Override
    public IIterator getIterator() {
        return new ParcelIterator();
    }

    private class ParcelIterator implements IIterator{
        int index = 0;

        @Override
        public Object first() {
            return parcels[0];
        }

        @Override
        public Object next() {
            return parcels[index++];
        }

        @Override
        public boolean hasMoreElements() {
            if (index < parcels.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object getCurrentElement() {
            return parcels[index];
        }
    }
}
