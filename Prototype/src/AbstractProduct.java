
abstract public class AbstractProduct implements Cloneable {
	public static AbstractProduct thePrototype;
	public static AbstractProduct makeProduct()
	{
		try 
		{
			return (AbstractProduct) thePrototype.clone();
	   	 } 
		catch(CloneNotSupportedException e)
		{
			return null;
	   	 }
	}
}
