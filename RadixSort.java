
/**
 * Write a description of class RadixSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
public class RadixSort
{
    private int[] list; // = {400, 890, 10230, 5490, 3, 190, 500200, 40, 290, 1, 0, 900000};
    private int maxDig;
    private Queue<Integer>[] digQueues = (Queue<Integer>[])(new Queue[10]);
    private LinNode<Integer> nLn;

    /**
     * 
     */
    public RadixSort()
    {
        maxDig = 0;
        for (int digitVal = 0; digitVal <= 9; digitVal++)
            digQueues[digitVal] = new Queue<Integer>();
    }

    /**
     * 
     */
    public RadixSort(int[] nums)
    {
        list = nums;
        for (int digitVal = 0; digitVal <= 9; digitVal++)
            digQueues[digitVal] = new Queue<Integer>();
        maxDig = 0;
        findMaxDig();
    }
    
    private void findMaxDig()
    {
        int[] tempList = list;
        int maxDigit = 0;
        StringTokenizer strTkn;
        String temp;
        for(int i = 0; i < tempList.length; i++)
        {
            temp = new String(Integer.toString(tempList[i]));
            
            int dig = 0;
            dig = temp.length();
        
            if(dig > maxDigit)
            {
                maxDigit = dig;
            }
        }
        
        maxDig = maxDigit;
    }
    
    public void sort()
    {
        int digit, num;
        String temp;
        
        String zeroPad;
        int pad;
        
        for (int position=0; position < maxDig; position++)
        {
            for (int scan=0; scan < list.length; scan++)
            {
                temp = String.valueOf(list[scan]);
                zeroPad = "";
                if(temp.length() < maxDig)
                {
                    pad = maxDig - temp.length();
                    
                    for(int i = 0; i < pad; i++)
                    {
                        zeroPad += "0";
                    }
                    
                    zeroPad += temp;
                    temp = zeroPad;
                }
                
                if(maxDig - position < 0)
                {
                    digit = 0;
                }
                else
                {
                    digit = Character.digit(temp.charAt((maxDig - 1)-position), 10);
                }
                nLn = new LinNode(list[scan]);
                digQueues[digit].enqueue(list[scan]);
            }

            // gather numbers back into list
            num = 0;
            for (int digitVal = 0; digitVal <= 9; digitVal++)
            {
                while (!(digQueues[digitVal].isEmpty()))
                {
                    nLn = new LinNode(digQueues[digitVal].dequeue());
                    list[num] = nLn.getElement();
                    num++;
                }
            }
        }
        
        for (int scan=0; scan < list.length; scan++)
            System.out.println(list[scan]);
    }
    
    public void printArr()
    {
        for (int scan=0; scan < list.length; scan++)
            System.out.println(list[scan]);
    }
    
    public int[] getList()
    {
        return list;
    }
}
