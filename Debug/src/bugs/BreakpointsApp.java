package bugs;

public class BreakpointsApp
{
	public static void main(String[] args)
	{
		String x="A test";
		String y=new String("A test");
		boolean equals = x==y;
		if(equals)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}