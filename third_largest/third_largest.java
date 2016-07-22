// Using the Java language, have the function ThirdGreatest(strArr)
// take the array of strings stored in strArr and return the third largest word within in.
// So for example: if strArr is ["hello", "world", "before", "all"]
// your output should be "world" because "before" is 6 letters long, and "hello" and "world" are both 5, but the output should be world because it appeared as the last 5 letter word in the array. If strArr was ["hello", "world", "after", "all"] the output should be after because the first three words are all 5 letters long, so return the last one. The array will have at least three strings and each string will only contain letters.

// use the main method only for calling the function where your logic lies. :-)

public class ThirdGreatest {

	public ThirdGreatest() {}
		// TODO Auto-generated constructor stub

		/**
	 * @param args
		 * @return
	 */
	public static String main(String[] StrArr) {
		// TODO Auto-generated method stub
		String result = "null";
		String SortedString = "null";
		boolean canSort = true;
		while(canSort){
			for(int i = 0;i<StrArr.length - 1;i++){
				if(StrArr[i].length()<StrArr[i+1].length()){
					SortedString = StrArr[i+1];
					StrArr[i] = StrArr[i+1];
					StrArr[i+1] = SortedString;
					canSort = false;
				}
			}
		}

return StrArr[2];}}
