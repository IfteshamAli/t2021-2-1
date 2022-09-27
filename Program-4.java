import java.util.*;

public class Main
{
    public static List<String> getCountOfMultiple(int[] nums){
        List<String> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        for(int i = 1; i <= 9; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] % i==0){
                    map.put(i, map.getOrDefault(i,0)+1);
                }
            }
        }
        for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
            res.add(entry.getKey()+": "+entry.getValue());
        }
        return res;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a size: ");
	    int n = sc.nextInt();
	    int[] arr= new int[n];
	    System.out.println("Enter all the elements: ");
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	    }
		System.out.println(getCountOfMultiple(arr));
	}
}


