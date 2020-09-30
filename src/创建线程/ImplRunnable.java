package 创建线程;

public class ImplRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("用 Runnable 的方式实现线程");
    }
}

class Main {
    public static void main(String[] args) {
        //起一个线程
        Thread t =  new Thread(new ImplRunnable());
        //运行线程
        t.start();
    }
}
