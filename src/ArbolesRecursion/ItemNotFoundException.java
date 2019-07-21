package ArbolesRecursion;

public class ItemNotFoundException extends Exception {
	 public ItemNotFoundException( )	    {
	        super( );
	    }
	    /**
	     * Construct this exception object.
	     * @param message the error message.
	     */
	    public ItemNotFoundException( String message )
	    {
	        super( message );
	    }
}
