import java.util.*;
public class Main
{
    public static int[] getSeries(int n){
        if(n == 0) return new int[]{};
        int[] res_list = new int[n];
        int index=0;
        if(n % 2 == 0){
           for(int i = 1; i < n; i++) {
               if(i%2 == 1){
                   res_list[index++] = n-i;
                   res_list[index++] = n+i;
               }
           } 
    
        }else if(n % 2 == 1) {
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
	    int[] res = new int[n];
	    res = getSeries(n);
	    for(int i=0;i<n-1;i++)
		System.out.print(res[i]+",");
		if(n!=0)
		System.out.print(res[n-1]);
	}
}