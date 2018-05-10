import java.util.*;

/*
 * @name HackerEart Zulu and alarm clock
 * @author Jhon Velasco
 */
public class maxpr {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int a[] = new int[n+1];
			int r[] = new int[100001];
			int p[] = new int[n+1];
			int max=0 , pos=0;
			long ans = 1;
			long mod = 1000000007;
			int q=0;
			for(int i=1;i<=n;i++)
			{
				int m = sc.nextInt();
				r[m] = i;
			}
			for(int j=100000;j>0;j--){
				if(r[j]>q && r[j]!=0){
					ans = q>0?(ans*(r[j]-q+1))%mod:1;
					q=r[j];
				}
			}
			
			System.out.println(ans);
			
		}
		
	}
 
}
