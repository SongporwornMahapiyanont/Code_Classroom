public class StringToInt {
    public static void main(String[] args) throws Exception{
        String a="100",b="200";

        int c;
        c=Integer.parseInt(a);
        c=c+900;

        double d;
        d=Double.parseDouble(b);
        d=d+809;

        float j;
        j=Float.parseFloat(a);
        j=j+1101;

        int g=100;
        String A = String.valueOf(g);


        System.out.println(c);
        System.out.println(d);
        System.out.println(j);
        System.out.println(d);
        System.out.println(A);
    }
}
