import java.util.Arrays;

class Main{
	public static void main(String[]args) {
		//Sort vowels u,a, and o. StaRt our sorting from 'u','a' and end at 'o'
		char vowels[]={'e','u','a','o','i'};
		int startingIndex =1;
		int endingIndex =4;
		//Starting and ending index to sort our arrays in order 
		Arrays.sort(vowels,startingIndex,endingIndex);

		char key='o';
		int foundItemIndex =Arrays.binarySearch(vowels,key);
		
		System.out.print(Arrays.toString(vowels));
		System.out.print(foundItemIndex);
	}
}