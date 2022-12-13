package TemplatePattern;

public abstract class Human {
    abstract void growUp();
    abstract void findAJob();
    abstract void becomeAParent();
    abstract void retire();

    public final void live(){
        growUp();
        findAJob();
        becomeAParent();
        retire();
    }
}
