import java.util.Random;

public class AssignmentImplement {

	//Implementation Assignment Algorithms & Datastructures week 2.
		
		/**
		 * Takes the array and removes a random element,
		 * shifting the rest of the elements left. I.e.
		 * [1, 4, 7, 9], with random deciding to remove the value in index 0 would result in:
		 * [4,7,9].
		 * @param array to remove an entry from
		 * @return the shorter array
		 */
	public static int[] removeRandom(int[] array) {
		
		int lengte = array.length;			
		Random number = new Random();
		int random1 = number.nextInt(lengte);
		
		for (int i = random1; i < array.length; i++) {
			array[i] = array[i+1];
		}
		int[] result = array;
		return result;
	}
	
	public static void main(String[] args){
		Random number = new Random();
		int randomnumber = number.nextInt(5);
		System.out.println("eerst een random number als test");
		System.out.println(randomnumber);
		System.out.println("Nu komt de test van de assignment method");
		
		int[] testarray = {1, 5, 3, 7, 6, 8, 9, 1, 1, 14, 18, 5};
		// testarray.removeRandom();
		/**
		 * Dit werkt niet want testarray is niet een class, dus je kunt er geen method op uitvoeren....
		 * jammer joh
		 */

		AssignmentImplement ai = new AssignmentImplement();
		ai.removeRandom(testarray);
		/**
		 * Dit werkt wel omdat je nu een instance aanmaakt van AssignmentImplement, in die instantie de
		 * method aanroept en je testarray aan de method meegeeft ipv de method aan de testarray.
		 */
		
	}
	
}
