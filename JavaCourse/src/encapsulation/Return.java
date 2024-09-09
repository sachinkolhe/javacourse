package encapsulation;

public class Return {
	
	//break statment: break a loop [only one]
	
	//Return statement: break a loop [all] ... return from a method

	public static void main(String[] args) {

		int[] nums = {1,2,3,4,5};
		int count = iterate(nums);
		System.out.println("count is " + count);
	}
	
	public static int iterate(int[] nums) {
		
		int i = 0;
		while(i< nums.length){
			while(i< nums.length) {
				if(i == 2) {
					break;
				}
				i++;
			}
			System.out.println("breaking from inside loop");
		}
		
		return i;
	}

}
