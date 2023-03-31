/**
 *  MyList.java
 *  This generic class holds an ArrayList of type parameter T.
 *  @author Joshua Williams
 *  3/22/2023
 */

import java.util.ArrayList;

public class MyList <T extends Number>
{
    ArrayList<T> list;

    /**
        Constructor, creates new ArrayList of type parameter T.
     */
    public MyList()
    {
        list = new ArrayList<T>();
    }

    /**
        This method adds a variable to the ArrayList.
        @param var the variable to be added
     */
    public void add(T var)
    {
        list.add(var);
    }

    /**
        This method goes through and finds the largest value in the ArrayList.
        @return the largest value in the ArrayList
     */
    public T largest()
    {
        T largest = list.get(0);
        for(int i = 1; i < list.size(); i++)
        {
            T check = list.get(i);
            if(check.doubleValue() > largest.doubleValue())
            {
                largest = list.get(i);
            }
        }
        return largest;
    }

    /**
        This method goes through and finds the smallest value in the ArrayList.
        @return the smallest value in the ArrayList
     */
    public T smallest()
    {
        T smallest = list.get(0);
        for(int i = 1; i < list.size(); i++)
        {
            T check = list.get(i);
            if(check.doubleValue() < smallest.doubleValue())
            {
                smallest = list.get(i);
            }
        }
        return smallest;
    }

    /**
        This method displays the ArrayList.
        @return the ArrayList
     */
    public String toString()
    {
        String val = "";
        for(int i = 0; i < list.size(); i++)
        {
            if(i == 0)
            {
                val += "<" + list.get(i) + ", ";
            }
            else if(i == list.size() - 1)
            {
                val += list.get(i) + ">";
            }
            else
            {
                val += list.get(i) + ", ";
            }
        }
        return val;
    }
}
