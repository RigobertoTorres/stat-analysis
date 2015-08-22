
/**
 * This queue will hold a number of data elements in linear nodes
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Queue<T>
{
    private LinNode<T> front;
    private LinNode<T> rear;
    private int count;

    /**
     * default constructor
     */
    public Queue()
    {
        front = null;
        rear = null;
        count = 0;
    }

    /**
     * 
     */
    public void enqueue(T elem) 
    {
        LinNode nLn = new LinNode(elem);
        
        if(count == 0)
        {
            front = nLn;
        }
        else
        {
            rear.setNext(nLn);
        }
        
        rear = nLn;
        count++;
    }
    
    public T dequeue() throws EmptyCollectionException
    {
        if(count == 0)
        {
            throw new EmptyCollectionException(" queue");
        }
        
        T result = front.getElement();
        front = front.getNext();
        count--;
        return result;
    }
    
    public int size()
    {
        return count;
    }
    
    public boolean isEmpty()
    {
        return count == 0;
    }
}
