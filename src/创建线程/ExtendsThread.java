package 创建线程;

//继承 Thread ，让 ExtendsThread 变为线程类
public class ExtendsThread extends Thread {
    @Override
    public void run() {
        System.out.println("用继承 Thread 的方式实现线程");
    }
}

class Main1 {
    public static void main(String[] args) {
        //创建线程
        Thread t1 = new ExtendsThread();
        //线程开始
        t1.start();
    }
}
