
/**
 * This is a node containing an element of data and a connection to another node
 * 
 * @author Rigo Torres 
 * @version 5/26/2015
 */
public class LinNode<T>
{
    private T element;
    private LinNode next;
    /**
     * Default constructor
     */
    public LinNode()
    {
        element = null;
        next = null;
    }

    /**
     * 
     */
    public LinNode(T elem)
    {
        element = elem;
        next = null;
    }
    
    public LinNode getNext()
    {
        return next;
    }
    
    public void setNext(LinNode nLn)
    {
        next = nLn;
    }
    
    public void setElement(T elem)
    {
        element = elem;
    }
    
    public T getElement()
    {
        return element;
    }
}
