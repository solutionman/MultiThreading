public class Main {

    public static void main(String[] args){

        ThreadExample threadExample = new ThreadExample();
        threadExample.setName("first Thread");

        ThreadExample threadExample1 = new ThreadExample();
        threadExample1.setName("second Thread");

        ThreadExample threadExample2 = new ThreadExample();
        threadExample2.setName("third Thread");

        threadExample.start();
        threadExample1.start();
        threadExample2.start();

        new RunnableExample();

    }

}
