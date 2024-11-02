public class PtwMath{

    static double ceil(double num){
        double final_num = (int) num;
        double final_plus = 0;
        int count = 0;
        for(;;){
            count++;
            double ceil = (num - (int) num) * 10;
            int ceil_int = (int) ceil;
            if(ceil_int == 0 && count > 1){
                break;
            }
            if(ceil_int == 9 && count > 1){
                double nfirst = 1;
                for(int i=0; i<count-1; i++){
                    nfirst /= 10.0;
                }
                final_plus += nfirst;
                break;
            } 
            num = ceil;
            double plus_ceil = ceil_int;
            for(int i=0; i<count; i++){
                plus_ceil /= 10.0;
            }
            final_plus += plus_ceil;
        }
        final_num += final_plus;
        return final_num;
    }
}
