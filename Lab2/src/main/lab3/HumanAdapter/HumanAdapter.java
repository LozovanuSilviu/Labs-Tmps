package main.lab3.HumanAdapter;

public class HumanAdapter implements HumanBuilder {
    AdvancedHumanBuilder advancedHumanBuilder;

    public HumanAdapter(String gender) {
        if(gender.equalsIgnoreCase("Woman")) {
            advancedHumanBuilder = new WomanBuilder();
        } else if(gender.equalsIgnoreCase("Man")) {
            advancedHumanBuilder = new ManBuilder();
        }
    }
    @Override
    public void build(String gender, String eyecolor) {
        if(gender.equalsIgnoreCase("Woman")) {
            advancedHumanBuilder.buildWoman(eyecolor);
        } else if(gender.equalsIgnoreCase("Man")) {
            advancedHumanBuilder.buildMan(eyecolor);
        }

    }
}
