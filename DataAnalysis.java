
/**
 * This object will 
 * -take in an amount of data 
 * -sort this data
 * -analyze data with statistical analysis
 *      -Mode
 *      -Median
 *      -Mean
 *          -Quartiles
 *          -Percentiles
 *      -Standard Deviation
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataAnalysis
{
    private int[] myArr;
    private double size;
    private double mean;
    private double median;
    private double mode;
    private double range;
    private double Q1;
    private double Q2;
    private double Q3;
    private double stanDev;
    //p
    /**
     * Default Constructor
     */
    public DataAnalysis()
    {
        size = 0;
        mean = 0;
        median = 0;
        mode = 0;
        range = 0;
        Q1 = 0;
        Q2 = 0;
        Q3 = 0;
        stanDev = 0;
    }

    /**
     */
    public DataAnalysis(int[] inArr)
    {
        myArr = inArr;
        size = myArr.length;
    }
    
    /**
     * 
     */
    public void mean()
    {
        double sum = 0;
        for(int i = 0; i < myArr.length; i++)
        {
            sum += myArr[i];
        }
        
        mean = sum / size;
    }
    
    /**
     * 
     */
    public void median()
    {
        if(myArr.length % 2 == 0)
        {
            int temp1 = myArr[(myArr.length / 2) - 1];
            int temp2 = temp1 + 1;
            
            median = (myArr[temp1] + myArr[temp2]) / 2;
        }
        
        if(myArr.length % 2 != 0)
        {
            int temp = (myArr.length + 1) / 2;
            median = myArr[temp - 1];
        }
    }
    
    /**
     * 
     */
    public void mode()
    {
        //Don't think I can do this with just array
        //Use second array to contain occurance values? (How to connect the two arrays)
        //array of Word<T>'s? is that a thing? 
        //linked list using nodes and something similar to Word<T> class in DSProg4?
        //binary search tree?
        
    }
    
    /**
     * 
     */
    public void range()
    {
        range = myArr[myArr.length - 1] - myArr[0];
    }
}
