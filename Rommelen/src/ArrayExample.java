import java.util.Random;

/**
 * Created by Jasper on 19-2-2016.
 */
public class ArrayExample {

    public int[] removeRandom(int[] array) {
        int[] result = new int[array.length-1];
        int randomnumber = new Random().nextInt(array.length);
        System.out.println(randomnumber);

        for(int i = 0; i < randomnumber; i++) {
            result[i] = array[i];
        }
        for(int i = randomnumber+1; i < array.length; i++) {
            result[i-1] = array[i];
        }
        return result;
    }

    public static void main(String[] args){
        Random number = new Random();
        int randomnumber = number.nextInt(5);
        //System.out.println("eerst een random number als test");
        System.out.println(randomnumber);
        //System.out.println("Nu komt de test van de assignment method");

        int[] testarray = {1, 5, 3, 7, 6, 8, 9, 1, 1, 14, 18, 5};
        // testarray.removeRandom();
        /**
         * Dit werkt niet want testarray is niet een class, dus je kunt er geen method op uitvoeren....
         * jammer joh
         */

        ArrayExample ae = new ArrayExample();
        int[] result = ae.removeRandom(testarray);
        for (int thing : result) {
            System.out.print("["+thing+"]");
        }
        /**
         * Dit werkt wel omdat je nu een instance aanmaakt van AssignmentImplement, in die instantie de
         * method aanroept en je testarray aan de method meegeeft ipv de method aan de testarray.
         */

    }

}
