package suo.buzhengquefangwenziyuan;

public class Task implements Runnable{
    private volatile int age = 0;
    private final int id;


    public Task(int id) {
        this.id = id;
    }


    public void live() {
        age++;
        age++;
    }
    @Override
    public void run() {
        live();
        if (age % 2 != 0) {
            System.out.println("并发失败");
        }
    }
}
