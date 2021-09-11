package suo.buzhengquefangwenziyuan;

public class Task implements Runnable{
    private User user;
    private final int id;


    public Task(User user, int id) {
        this.user = user;
        this.id = id;
    }


    @Override
    public void run() {
        user.live();
        if (user.age % 2 != 0) {
            System.out.println("并发失败");
        }
    }
}
