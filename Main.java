import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Replace
{
	private int[] number;
	private List<Integer> indexlist;
	char[] thestring;
	
	public Replace(String s)
	{
		indexlist = new LinkedList<Integer>();
		thestring = s.toCharArray();
		int count = 0;
		for(int i=0; i<thestring.length; i++)
		{
			if(thestring[i] == '?')
			{
				count++;
			}
		}
		
		number = new int[count];
		
		for(int i=0; i<count; i++)
		{
			number[i] = 0;
		}
		
		for(int i = 0; i<thestring.length; i++)
		{
			if(thestring[i] == '?')
			{
				indexlist.add(i);
			}
		}
		
	}
	
	public void output(char[] a)
	{
		System.out.println(a);
	}
	
	public void RemoveQ(int[] array, int start, int end)
	{
		if(start == end)
		{
			char[] result = new char[thestring.length];
			int i = 0;
			result = thestring.clone();
			Iterator<Integer> iter = indexlist.iterator();
			while(iter.hasNext())
			{
				result[iter.next()] = (char)(array[i]+48);
				i++;
			}
			
			output(result);
			return;
		}
		else
		{
			array[start] = 0;
			RemoveQ(array, start+1, end);
			array[start] = 1;
			RemoveQ(array, start+1, end);
		}
	}
	
	
	public void run()
	{
		int[] temp = new int[number.length];
		temp = number.clone();
		RemoveQ(temp, 0, temp.length);
	}
	
}






public class Main {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String instring = in.nextLine();
		in.close();
		Replace R = new Replace(instring);
		R.run();
	}

}
