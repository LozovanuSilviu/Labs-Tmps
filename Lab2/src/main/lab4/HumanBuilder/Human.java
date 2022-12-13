package HumanBuilder;

public class Human {
    private String hairColor = "";
    private String eyeColor ="";
    private String skinColor = "";
    private String handedness = "";

    @Override
    public String toString() {
        return "Human{" +
                "hairColor='" + hairColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", handedness='" + handedness + '\'' +
                '}';
    }
    public Human clone() {
        Human newClone = new Human();
        newClone.skinColor = this.skinColor;
        return newClone;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }


    public String getHandedness() {
        return handedness;
    }

    public void setHandedness(String handedness) {
        this.handedness = handedness;
    }
}
