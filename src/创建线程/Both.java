package 创建线程;

public class Both {
    public static void main(String[] args) {
        Thread t2 = new Thread();
        t2.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("实现 Runnable 接口");
            }
        }) {
            @Override
            public void run() {
                System.out.println("继承 Thread 类");
            }
        }.start();
    }
}

//继承 Thread 类

/*
* 为什么是这个结果？
        @Override
        public void run() {
            if (target != null) {
                target.run();
            }
        }
*      当继承 Thread 是已经将 run方法重写了
* */
