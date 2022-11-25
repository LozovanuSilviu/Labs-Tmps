package main.lab3.HumanDecorator;

public abstract class HumanDecorator implements IHuman {
    protected IHuman human;

    public HumanDecorator(IHuman human) {
        this.human = human;
    }
    @Override
    public void create() {
        this.human.create();

    }
}
