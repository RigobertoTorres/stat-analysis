
/**
 * This exception represents the situation where the queue is empty
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmptyCollectionException extends RuntimeException
{
    public EmptyCollectionException(String collection)
    {
        super ("The " + collection + " is empty.");
    }
}
