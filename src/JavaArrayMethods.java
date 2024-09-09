import java.util.Arrays;
import java.util.Scanner;

public class JavaArrayMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);   /* This method is used to sort the array */

        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }


        int result=Arrays.compare(arr,arr2);        /* if all the elements in the array are same it returns true if not false */
        System.out.println(result);

        int[] arr3=new int[100];
        arr3=Arrays.copyOf(arr,100);  /* arr3 does contains the value of arr with value of 0 after the arr elements */

        int[] arr4=new int[100];
        arr4=Arrays.copyOfRange(arr,0,2); /* Now the arr4 will have the elements of arr from 0th index to index 2 (where fromindex is inclusive and toindex is exclusive [not be added] ) */

        boolean areEqual=Arrays.equals(arr,arr2);
        System.out.println(areEqual);     /* checks whether the array elements are equal or not only if the array has same length and each pair of elements matches */

        /* sort method also has the fromindex and toindex where the only the index from 'fromindex' and to 'toindex' will be sorted */

    }
}
