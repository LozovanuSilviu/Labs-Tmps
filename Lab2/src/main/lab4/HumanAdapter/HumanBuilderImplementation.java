package HumanAdapter;

public class HumanBuilderImplementation implements HumanBuilder{
    HumanAdapter humanAdapter;
    @Override
    public void build(String gender, String eyecolor) {
        if(gender.equalsIgnoreCase("Woman") || gender.equalsIgnoreCase("Man")) {
            humanAdapter = new HumanAdapter(gender);
            humanAdapter.build(gender, eyecolor);
        } else {
            System.out.println("Invalid gender specified.");
        }
    }
}
