package main.lab3.HumanAdapter;

public class ManBuilder implements AdvancedHumanBuilder{
    @Override
    public void buildWoman(String eyeColor) {

    }
    @Override
    public void buildMan(String eyeColor) {
        System.out.println("Building a man with " + eyeColor.toLowerCase() + " eyeColor");
    }
}
