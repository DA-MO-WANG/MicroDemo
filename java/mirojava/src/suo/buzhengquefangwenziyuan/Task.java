package suo.buzhengquefangwenziyuan;

public class Task implements Runnable{
    private int age = 0;
    @Override
    public void run() {
        age++;
        age++;
        if (age % 2 != 0) {
            System.out.println("并发失败");
        }
    }
}
