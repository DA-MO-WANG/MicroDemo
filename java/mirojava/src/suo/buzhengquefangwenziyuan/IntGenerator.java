package suo.buzhengquefangwenziyuan;

import javax.print.DocFlavor;

public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancle() {
        canceled = true;
    }
    public boolean isCanceled() {
        return canceled;
    }
}
