public class ThreadsDemo extends Thread{
    public static void main(String[] args) {
//        Mythread1 t1 = new Mythread1();
//        t1.start();

        Thread t2 = new Thread(new Mythread2());
        t2.start();

    }


}

class Mythread1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread is running "+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Thread is interrupted");
            }
        }
    }
}


class Mythread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread is running "+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Thread is interrupted");
            }
        }
    }
}

