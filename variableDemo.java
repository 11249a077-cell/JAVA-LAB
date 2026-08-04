public class variableDemo{
    int instanceVar=10;
    static String staticVar="i am static";
    public void showVariables()
    {
        int localVar=5;
        System.out.println("instance variable:"+instanceVar);
        System.out.println("static variable:"+staticVar);
        System.out.println("local variable:"+localVar);
    }
    public static void main(String[] args)
    {
        variableDemo obj1=new variableDemo();
        obj1.showVariables();
        System.out.println("accessing static variable via class:"+variableDemo.staticVar);
    }
}