import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private static int nextId = 1;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
