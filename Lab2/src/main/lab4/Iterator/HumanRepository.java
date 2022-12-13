package Iterator;

public class HumanRepository implements Sector{
    public String[] people = {"Hina", "Scott", "Josh", "Andrew", "Jessica"};

    @Override
    public Iterator getIterator() {
        return new HumanIterator();
    }

    private class HumanIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if(index < people.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return people[index++];
            }
            return null;
        }
    }
}
