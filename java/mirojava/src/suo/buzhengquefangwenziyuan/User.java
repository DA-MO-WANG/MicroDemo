package suo.buzhengquefangwenziyuan;

public class User {
    int age;
    int score;

    public User(int age, int score) {
        this.age = age;
        this.score = score;
    }

    public void live() {
        ++age;
        ++age;
    }

}
