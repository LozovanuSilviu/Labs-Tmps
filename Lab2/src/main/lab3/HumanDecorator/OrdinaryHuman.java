package main.lab3.HumanDecorator;

public class OrdinaryHuman implements IHuman {
    @Override
    public void create() {
        System.out.print("Creating an ordinary human.");
    }
}
