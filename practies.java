import java.util.*;
public class practies{
    public static void main(String args[]){

     Scanner sc=new Scanner(System.in);

     long N=sc.nextLong();
     long A=sc.nextLong();
     long B=sc.nextLong();


     ArrayList<Long>fib=new ArrayList<>();
     fib.add(1L);
     fib.add(2L);

        while(true){
            long next=fib.get(fib.size()-1)+fib.get(fib.size()-2);
            if(next>N){
                break;    
            }
            fib.add(next);
        }  

        long INF=(long)1e18;

        long[]dp=new long[(int)N+1];

     Arrays.fill(dp,INF);

  dp[1]=0;

   for(int i=1;i<=N;i++){
        if(dp[i]==INF){
            continue;
        }

        for(long jump :fib){
             long next=i+jump;

            if(next>N){
                break;
            }

            dp[(int)next]=Math.min(dp[(int)next],dp[i]+A+B*jump);
        }
    }

 if(dp[(int)N]==INF){
        System.out.println("-1");
    }
else{
    System.out.println(dp[(int)N]);
}
sc.close();
}
}