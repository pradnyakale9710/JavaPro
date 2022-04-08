package Interface;

public interface Father {
	
	void money();
	void rules();
	static void nature()
	{
		System.out.println("Fathers nature method");
	}
	default void love()
	{
		System.out.println("fathers love method");
	}

}
