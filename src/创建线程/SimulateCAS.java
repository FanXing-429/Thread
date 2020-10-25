public class SimulateCAS {
    private volatile int value;
    // 此处的 synchronized 是模拟 CPU 对CAS支持的原子操作
    public synchronized int CompareAndSwap(int expectValue, int newValue) {
        if (expectValue == value) {
            value = newValue ;
        }
        return value;
    }
}
