package football;

import java.util.Random;

public class Football {
    public static void main(String[] args){
        
        Random r =new Random();
        String A[] ={"العامرة","كفر رماح","كفر العامرة","كفرشبرا بلولة"};
        String B[] = {"الحامول","منوف","سدود","شبرابلولة"};
        System.out.println(A[r.nextInt(A.length)]+" X "+B[r.nextInt(B.length)]);
        /*
        int []x = {1,2,4,1,8};
        int c = 0;
        for(int i=0;i<4;i++){
            if ((x[i]==x[i+1]) || (x[i]==x[i+2]) || (x[i]==x[i+3])) {
                c++;
                System.out.println(c);
            }
        }
     */   
    }
}
