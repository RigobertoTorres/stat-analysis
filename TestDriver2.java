
/**
 * Write a description of class TestDriver2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class TestDriver2
{
    public static void main(String []args) throws IOException
    {
        String fileName;
        Scanner keyInput = new Scanner(System.in);
        Scanner fileInput;
        
        System.out.println("Please enter the file name of the file containing the list of numbers");
        fileName = keyInput.nextLine();
        
        fileInput = new Scanner(new File(fileName));
        
        int count;
        LinkedList<Integer> numList = new LinkedList<Integer>();
        while(fileInput.hasNext())
        {
            numList.add(Integer.parseInt(fileInput.next()));
        }
        int[] tempArr;
        int[] numArr = new int[numList.size()];
        
        for(int i = 0; i < numList.size(); i++)
        {
            numArr[i] = numList.get(i);
        }
        
        RadixSort radSort = new RadixSort(numArr);
        radSort.sort();
    }
    
}
