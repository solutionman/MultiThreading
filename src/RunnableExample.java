
public class RunnableExample implements Runnable {

    Thread thread;
    Thread thread1;
    Thread thread2;
    RunnableExample(){
        thread = new Thread(this, "runnable first");
        thread1 = new Thread(this, "runnable second");
        thread2 = new Thread(this, "runnable third");
        thread.start();
        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            try{
                Thread.sleep(1000);
                System.out.println( Thread.currentThread().getName() );
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
