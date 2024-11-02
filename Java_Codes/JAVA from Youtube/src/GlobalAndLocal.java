public class GlobalAndLocal {
    public static void  main (String[] args)
    {
        // global variable
        int a = 200;
        int b = 300;

        System.out.println("a = " + a);
        {
            // Local variable
            int c = 100;
             System.out.println("c = " + c);
        }
        System.out.println("b = " + b);


    }
}
