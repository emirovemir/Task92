package T72new;

public class  Toy  extends Products  {
    private int age;
    public Toy(String name,int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getName();
    }

}
