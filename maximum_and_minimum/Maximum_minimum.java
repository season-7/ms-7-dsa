// Using java solve the problem below:

//Create your own array of integers
// Find the maximum and minimum of this array that you just created.
// create a variable to hold the maximum
// create a variable to hold the minimum
// take in the array of numbers
// begin to loop through them
// put the lowest in its array 
// put the highest in its array
// output the highest then output the lowest
public static void main(String[] args){
		int[] arrayIn = {56,9,21,78,91,64,84,53,25};
		Arrays.sort(arrayIn);
		int min = arrayIn[0];
		int max = arrayIn[arrayIn.length-1];
                
                int[] minA = new int[1];
                int[] maxA = new int[1];
                
                for(int i = 0; i <= arrayIn.length - 1; i++){
                    if (arrayIn[i] <= max){
                        maxA[0] = arrayIn[i];
                    }
                    if (arrayIn[i] <= min){
                        minA[0] = arrayIn[i];
                    }
                }
                System.out.println(Arrays.toString(arrayIn));
                System.out.println("Max integer is " + Arrays.toString(maxA));
                System.out.println("Min integer is " + Arrays.toString(minA));
	}
