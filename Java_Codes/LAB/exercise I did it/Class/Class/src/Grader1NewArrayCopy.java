import java.util.Arrays;

class Grader{
    public String name ;
    public String desc ; 
    public int[] pts ;
    public String[] sols;
    public Grader (String name,String desc,int[] pts,String[] sols)
    {
        this.name = name;
        this.desc = desc;
        this.pts = Arrays.copyOf(pts, pts.length);
        this.sols = sols.clone();
    }
}

public class Grader1NewArrayCopy {
    public static void main(String[] args) {
        // Book n = new Book(null, null, null, 0);
        // BookStore M = new BookStore();
    }
}