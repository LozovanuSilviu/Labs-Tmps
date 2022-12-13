package Strategy;

public class Adult implements Strategy{
    @Override
    public String build(Integer age) {
        return "Returning adult of age of:" + age;
    }
}
