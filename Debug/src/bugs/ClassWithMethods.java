package bugs;

public class ClassWithMethods
{
	public void runJustMe()
	{
		System.out.println("Run just me.");
	}
	
	public void lookInsideMe()
	{
		String deep="I have deep ";
		String thoughts="thougts.";
		System.out.println(deep+thoughts);
	}
}
