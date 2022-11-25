package main.lab2.HumanBuilder;

public abstract class HumanBuilder {
    private Human human;

    public Human getHuman(){
        return human;
    }
    public HumanBuilder()
    {
        human = new Human();
    }
    public void specifyHairColor(String hairColor){
        human.setHairColor(hairColor);
    }
    public void specifyEyeColor(String eyeColor){ human.setEyeColor(eyeColor); }
    public void specifySkinColor(String skinColor){
        human.setSkinColor(skinColor);
    }
    public void specifyHandedness(String handedness){ human.setHairColor(handedness); }

    public abstract void returnHumanDescription();

}
