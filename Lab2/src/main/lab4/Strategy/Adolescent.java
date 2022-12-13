package Strategy;

public class Adolescent implements Strategy{
    @Override
    public String build(Integer age) {
        return "Returning an adolescent of age of:" + age;
    }
}
