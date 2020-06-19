public class Singleton {
	private volatile static Singleton obj; 		//Used volatile so that it is loaded in main memory and can be synchronized efficiently
	private Singleton(){
		//just to make sure it cannot be instantiated
	}
	public static Singleton getInstance()
	{
		if(obj == null);
		{
			// To make thread safe 
			synchronized(Singleton.class)
			{
				// check again as multiple threads can reach above step 
				if(obj == null)
				{
					obj = new Singleton();
				}
			}
		}
		return obj;
	}
	//non- static method
	public void printSingle()
	{
		System.out.println("Class instantiated with only one object at a time");
	}
}
