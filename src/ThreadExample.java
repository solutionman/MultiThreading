
public class ThreadExample extends Thread {

    @Override
    public void run(){
        for(int i = 0; i < 3; i++){
            try{
                sleep(1000);
                System.out.println("Thread " + Thread.currentThread().toString());
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
