import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static class Pair{
        int hp;
        int wt;
        Pair(int h , int w)
        {
            hp=h;
            wt=w;
        }
    }
    public static int FibDP(int N)
    {
        int[] dp = new int[N+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=N;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[N];
    }
    public static int FibDPRec(int N , int[] dp)
    {
        if(N<=1)
            return N;
        if(dp[N]!=-1)
            return dp[N];
        dp[N]=FibDPRec(N-1,dp)+FibDPRec(N-2,dp);
        return dp[N];
    }
    public static int MinDenom (int N,int[] dp)
    {
        if(N==0)
            return 0;
        if(N<0)
            return -1;
        if(dp[N]!=-1)
            return dp[N];
        int ans= Integer.MAX_VALUE;

        ans=Math.min(ans,MinDenom(N-50,dp));
        //System.out.println("ans from 50 is "+ans);
        ans=Math.min(ans,MinDenom(N-30,dp));
        //System.out.println("ans from 30 is "+ans);
        ans=Math.min(ans,MinDenom(N-5,dp));
        //System.out.println("ans from 5 is "+ans);

        return dp[N]=ans+1;

    }
    public static double FKP(int[] Hp , int[] Wt , int Cap)
    {
        int N =Hp.length;
        Pair[] p = new Pair[N];
        for(int i=0;i<N;i++)
        {
            p[i]=new Pair(Hp[i],Wt[i]);
        }
        Arrays.sort(p, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                double r1=((double)((double)o1.hp/(double)o1.wt)*1.0 );
                double r2=((double)((double)o2.hp/(double)o2.wt)*1.0 ) ;
                if(r1<r2)
                    return 1;
                else if(r1>r2)
                    return -1;
                else
                    return 0;
            }
        });
        for(int i=0;i<N;i++)
        {
            System.out.println("hp="+p[i].hp+" weight ="+p[i].wt);
        }
        double ans=0;
        for(int i=0;i<N;i++)
        {
            if(p[i].wt<=Cap)
            {
                ans+=p[i].hp;
                Cap=Cap-p[i].wt;
                System.out.println("ans is "+ans+" remaining capacity is "+Cap);
            }
            else
            {
                System.out.println("happiness is "+p[i].hp+" weight  "+p[i].wt);
                System.out.println("ratio is "+(double)((double)p[i].hp/(double)p[i].wt)*1.0*Cap+" remaining capacity is "+Cap);
                ans=ans+(((double)p[i].hp/(double)p[i].wt)*Cap*1.0);
                break;
            }
        }

        return ans;


    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        // dynamic programming
       /* int FibN=5;
        System.out.println("Fibonacci using DP of "+FibN+" is "+FibDP(FibN));
        */
        // using recursion


        /*int[] dp = new int[FibN+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        System.out.println("Fibonacci using DP of "+FibN+" and recursion is "+FibDPRec(FibN,dp));
         */
        /*int MinDenoms=100;
        int[] dp = new int[MinDenoms+1];
        Arrays.fill(dp,-1);
        System.out.println("Minimum denominations (50,30,5) using DP and recursion is "+MinDenom(MinDenoms,dp));
        */

        // fractional knapsack
       /* int[] hp ={3,8,10,2,5};
        int[] wt ={10,4,20,8,15};
        int cap=40;
        System.out.println("maximimum happiness which can be obtained is"+FKP(hp,wt,cap));
        */

        // Rotten oranges
        



    }
}