package suo.buzhengquefangwenziyuan;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * p674-676
 */
public class EvenChecker implements Runnable{
    private IntGenerator generator;
    private final int id;
    public EvenChecker(IntGenerator g, int ident) {
        generator = g;
        id = ident;
    }

    @Override
    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + "not even!");
                generator.cancle();
            }
        }
    }

    public static void test(IntGenerator gp, int count) {
        System.out.println("Press Control-C to exit");
        //线程池这么用
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            //向线程池提交任务--线程任务类即可
            exec.execute(new EvenChecker(gp, i));
        }
        //线程池关闭用法
        exec.shutdown();
    }
    //测验

    /**
     * 测验什么情况下会出现意外结果--因为并发
     * next方法本身不独立
     * ++操作不是原子操作
     * 两个线程任务之间存在关联
     * 多个线程可以读取同一片内存，执行逻辑和代码逻辑不符
     * @param gp
     */
    public static void test(IntGenerator gp) {
        test(gp,10);
    }
}
