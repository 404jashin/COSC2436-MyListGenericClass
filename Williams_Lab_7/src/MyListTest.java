/**
 *  MyListTest.java
 *  This program creates 2 lists, one of Integers and one of Doubles, and fills them with their respected values.
 *  This program then displays the lists and the largest/smallest values in those lists.
 *  @author Joshua Williams
 *  3/22/2023
 */

public class MyListTest
{
    public static void main(String[] args) throws Exception
    {
        MyList<Integer> integerList = new MyList<Integer>();
        MyList<Double> doubleList = new MyList<Double>();

        // Fill integerList.
        integerList.add(97);
        integerList.add(68);
        integerList.add(32);
        integerList.add(61);
        integerList.add(12);

        // Fill doubleList.
        doubleList.add(27.42);
        doubleList.add(63.02);
        doubleList.add(73.17);
        doubleList.add(40.03);
        doubleList.add(55.81);

        System.out.println("Integer ArrayList: " + integerList.toString());
        System.out.println("Double ArrayList: " + doubleList.toString());

        System.out.println("\nGreatest Integer Value: " + integerList.largest());
        System.out.println("Smallest Integer Value: " + integerList.smallest());

        System.out.println("\nGreatest Double Value: " + doubleList.largest());
        System.out.println("Smallest Double Value: " + doubleList.smallest());
    }
}
