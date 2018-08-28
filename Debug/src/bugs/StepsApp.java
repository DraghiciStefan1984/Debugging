package bugs;

public class StepsApp
{
	public static void main(String[] args)
	{
		ClassWithMethods classWithMethods=new ClassWithMethods();
		classWithMethods.runJustMe();
		classWithMethods.lookInsideMe();
		System.out.println("back to calling the method...");
	}
}