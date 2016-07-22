package toyprobs;

import java.util.Arrays;

/**@author kimaiga**/

public class Third_largest {
	
	public String ThirdGreatest(String[] strArr){
		
		int[] words = new int[strArr.length];
		for(int x=0;x<strArr.length;x++){   // loop through array elements
			words[x]= strArr[x].length(); 	//specify the length of array since elements could be any number
		}
		Arrays.sort(words); 				// sort the array in ascending order
		String ThrdLargest = "";	
			for(int y=0;y<strArr.length; y++){
			if(strArr[y].length() == words[words.length-3]){
				ThrdLargest = strArr[y];
			}
		}

		return ThrdLargest;
	}

//calling function in method
	public static void main(String[] args){
		
		Third_largest third = new Third_largest();
		
		String[] strArr = {"mwangi", "kalamashaka", "eat","food"};
		
		
		System.out.println(third.ThirdGreatest(strArr));
		
		
		
	}
}