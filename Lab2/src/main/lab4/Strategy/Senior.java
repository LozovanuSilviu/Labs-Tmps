package Strategy;

public class Senior implements Strategy{
    @Override
    public String build(Integer age) {
        return "Returning a senior of age of:" + age;
    }
}
