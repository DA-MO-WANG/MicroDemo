package suo.buzhengquefangwenziyuan;

public class Task implements Runnable{
    private User user = new User();
    @Override
    public void run() {
        user.live();
        if (user.age % 2 != 0) {
            System.out.println("并发失败");
        }
    }
}
