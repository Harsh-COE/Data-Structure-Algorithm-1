import java.util.*;
public class shortestUncommon{
	public static void solve(String str,String str2){
		int dp[][]= new int[str.length()+1][str.length()+1];
		for(int i=dp.length-1;i>=0;i--){
			for(int j=dp[0].length-1;j>=0;j--){
				if(i==dp.length-1 && j==dp[0].length-1)	{ dp[i][j]=-1;}
				else if(i==dp.length-1){
					dp[i][j]=-1;
				}else if(j==dp[0].length-1){
					dp[i][j]=-1;
				}else{
					if(str.charAt(i)==str2.charAt(j)){
						dp[i][j]=dp[i+1][j+1];
					}else{
						dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+1;
					}
				}
			}
		}
		System.out.println(dp[0][0]);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String str2= sc.nextLine();
		solve(str,str2);
	}
}