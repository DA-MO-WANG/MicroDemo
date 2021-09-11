package suo.buzhengquefangwenziyuan;

public class User {
    String name;
    int age = 20;
    int score = 100;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void live() {
        this.age++;
        this.age++;
        //this.score++;
    }

}
