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
            //共享同一片内存，有写操作，有读操作--读写操作，多线程下就出问题
            System.out.println("并发失败--"+user.age+"-"+id);
        }
    }
}
