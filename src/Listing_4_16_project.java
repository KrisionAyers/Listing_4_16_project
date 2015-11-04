
public class Listing_4_16_project {
	public static void main(String[] args) {

		// uppercase letters/*
		int startingValue = 65; // A was 65, our starting value
		int endingValue = 90 - 65 + 1; /* Z was 90, 
		//*but Math.random excludes the upper limit, so we added on 
		//*more to ensure it included z in the possible outputs.*/
		
		//lowercase letters
		//int startingValue = 97; // A was 65, our starting value
		//int endingValue = 122 - 97 +1; /*Z was 90
		
		/* Math.random example copied from Brennon Cupps
		 * previous work: work_class.java*/
		System.out.println((char)(startingValue + Math.random()*(endingValue)));
	}

}
