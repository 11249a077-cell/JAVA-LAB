class MultiThreadDemo extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
    }

    public static void main(String args[])
    {
        MultiThreadDemo t1 = new MultiThreadDemo();
        MultiThreadDemo t2 = new MultiThreadDemo();

        t1.start();
        t2.start();
    }
}