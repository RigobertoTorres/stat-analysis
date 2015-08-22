
/**
 * Write a description of class TestDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestDriver
{
    public static void main(String []args)
    {
        RadixSort radSort = new RadixSort();
        
        radSort.printArr();
        
        System.out.println("\n\n");
        radSort.findMaxDig();
        
        radSort.sort();
    }
}
