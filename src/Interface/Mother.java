package Interface;

public interface Mother {
	
	static void nature()
	{
		System.out.println("Mothers Nature");
	}
	default void love()
	{
		System.out.println("methers love method");
	}
	

}
