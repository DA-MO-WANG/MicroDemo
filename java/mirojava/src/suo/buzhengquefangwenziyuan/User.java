package suo.buzhengquefangwenziyuan;

public class User {
    static int age = 0;
    int score = 2;

    public User(int age, int score) {
        this.age = age;
        this.score = score;
    }

    public User() {
    }

    public void live() {
        ++age;
        Thread.yield();
        ++age;
    }

}
