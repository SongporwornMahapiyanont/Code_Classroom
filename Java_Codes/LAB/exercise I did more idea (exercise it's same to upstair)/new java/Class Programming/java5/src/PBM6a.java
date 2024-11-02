class Grader{
    public String name;
    public String desc;
    public int[] pts;
    public String[] sols;

    Grader(String name, String desc, int[] pts, String[] sols){
        this.name = name;
        this.desc = desc;
        this.pts = java.util.Arrays.copyOf(pts, pts.length);;
        this.sols = java.util.Arrays.copyOf(sols, sols.length);
        
    }
}

class SimpleMath{
    double findMaxInArray(double[] num){
        double max = -Double.MAX_VALUE;
        
        for(int i=0; i<num.length ; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;
    } 
}


public class PBM6a {
    public static void main(String[] args) { 	

    }
}
