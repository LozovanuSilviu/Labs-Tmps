package Composite;

import java.util.ArrayList;
import java.util.List;

public class HumanInfo {
    private String name;
    private String race;
    private int age;
    private List<HumanInfo> group;

    public HumanInfo(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
        group = new ArrayList<HumanInfo>();
    }

    public void addGroupmate(HumanInfo human) {
        group.add(human);
    }

    public void removeGroupmate(HumanInfo human) {
        group.remove(human);
    }

    public List<HumanInfo> getGroup() {
        return group;
    }

    public String toString() {
        return "Human : | Name: " + name + ", Race: " + race + ", Age: "
                + age + " |";
    }
}
