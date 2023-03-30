public class Test {
    String name = "name";
    int age = 23;

    int age_changed;

    public Test() {
        age_changed = change_age(age);
    }

    int change_age(int age) {
        return age+1;
    }
}
