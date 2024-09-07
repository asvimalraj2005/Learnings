import java.util.ArrayList;

public class ArrayListConcepts {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();               /* Creating the ArrayList of type String which can stores the string datatypes */
        list.add("A");                                                  /* 'add' method used to add the element to the ArrayList */
        list.add("B");
        list.add("C");
        list.add("D");
        for(String s : list){
            System.out.print(s+" ");                                    /* The output of the program is A B C D */
        }

        ArrayList<Integer> list1=new ArrayList<Integer>();              /* Created the ArrayList type of Integer */
        list1.add(1);                                                   /* The add method adds the values to the arraylist */
        list1.add(2);                                                   /* Basically the add method adds the value to the end the arraylist */
        list1.add(3);                                                   /* 1 is added first [1]   list1.add(2)  2 is added the list will be displayed like this [1,2] and so on */
        for(Integer i : list1){
            System.out.print(i+" ");                                    /* The output of this loop will look this    1,2,3    */
        }
        list1.remove(1);                                          /* list1.remove(1) states that it will remove the index 1 value */
                                                                        /* index 0 : 1      index 1 : 2    index 2 : 3 */
                                                                        /* After removing the index 1 value the list1 will look like this [1,3] */
    }
}
