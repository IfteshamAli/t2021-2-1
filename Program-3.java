import java.util.*;
public class Main
{
    public static int[] getSeries(int n){
        if(n == 0) return new int[]{};
        int[] res_list = new int[n];
        int index=0;
        if(n % 2 == 1) {
            
        
            res_list[index++] = n;
            
            for(int i = 1; i < n; i++) {
                if(i%2 == 0) {
                    res_list[index++] = n-i;
                    res_list[index++] = n+i;
                }
            }
        } 
        Arrays.sort(res_list);
        return res_list;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number");
	    int n = sc.nextInt();
	    int[] res ;
	    if(n%2==0){
	        int copy_n = n-1;
	        res = new int[copy_n];
	        res = getSeries(copy_n);
	        for(int i=0;i<copy_n-1;i++)
		    System.out.print(res[i]+",");
	    	if(copy_n!=0)
		    System.out.print(res[copy_n-1]);
	    }else{
	        res = new int[n];
	        res = getSeries(n);
	        for(int i=0;i<n-1;i++)
		    System.out.print(res[i]+",");
	    	if(n!=0)
		    System.out.print(res[n-1]);
	    }
	}
}