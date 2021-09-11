package suo.buzhengquefangwenziyuan;

public class EvenGenerator extends IntGenerator{
    private volatile int currentEvenValue = 0;
    @Override
    public  int next() {
        ++currentEvenValue;
        //Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }
    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
