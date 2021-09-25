package jvm;

/**
 * testGC() 方法执行后，objA objB 会不会被gc呢？
 * @author zzm
 */
public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];
    public static void main(String[] args) {
        //按引用计数算法，这里a对象+1
        ReferenceCountingGC objA = new ReferenceCountingGC();
        //b对象+1
        ReferenceCountingGC objB = new ReferenceCountingGC();
        //a对象+1（内部属性维护）
        objA.instance = objB;
        //b对象+1
        objB.instance = objA;

        objA = null;//a对象-1
        objB = null;//b对象-1
        System.gc();
        /*
        * [GC (System.gc()) [PSYoungGen: 11991K->464K(153088K)] 11991K->472K(502784K), 0.0014362 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[Full GC (System.gc()) [PSYoungGen: 464K->0K(153088K)] [ParOldGen: 8K->341K(349696K)] 472K->341K(502784K), [Metaspace: 3043K->3043K(1056768K)], 0.0041395 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
Heap
 PSYoungGen      total 153088K, used 3947K [0x0000000715580000, 0x0000000720000000, 0x00000007c0000000)
  eden space 131584K, 3% used [0x0000000715580000,0x000000071595af98,0x000000071d600000)
  from space 21504K, 0% used [0x000000071d600000,0x000000071d600000,0x000000071eb00000)
  to   space 21504K, 0% used [0x000000071eb00000,0x000000071eb00000,0x0000000720000000)
 ParOldGen       total 349696K, used 341K [0x00000005c0000000, 0x00000005d5580000, 0x0000000715580000)
  object space 349696K, 0% used [0x00000005c0000000,0x00000005c00555e0,0x00000005d5580000)
 Metaspace       used 3064K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 327K, capacity 388K, committed 512K, reserved 1048576K
        *
        * */
    }
}
