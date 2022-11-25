package main.lab3.HumanAdapter;

public class WomanBuilder implements AdvancedHumanBuilder{
    @Override
    public void buildWoman(String eyeColor) {
        System.out.println("Building woman with " + eyeColor.toLowerCase() + " eyeColor");
    }

    @Override
    public void buildMan(String eyeColor) {

    }
}
