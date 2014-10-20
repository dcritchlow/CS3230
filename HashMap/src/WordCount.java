import	java.util.*;
import	java.io.*;


public class WordCount
{
	private	Scanner				input;
	private	HashMap<String, Integer>	words = new HashMap<String, Integer>();


	public WordCount(String name)
	{
		openFile(name);

		while (input.hasNext("[\\w]+"))
		{
			String	word = input.next().toLowerCase();
			//System.out.println(word);

			if (words.containsKey(word))
				words.put(word, words.get(word) + 1);
			else
				words.put(word, 1);
		}

		printReport();
	}


	private void openFile(String name)
	{
		try
		{
			File	f = new File(name);
			input = new Scanner(f);
			input.useDelimiter("[\\p{Punct}|\\p{Space}]+");
		}
		catch (FileNotFoundException fnfe)
		{
			System.err.println(fnfe);
			System.exit(1);
		}
		catch (IllegalArgumentException iae)
		{
			System.err.println(iae);
			System.exit(1);
		}
	}


	private void printReport()
	{
		for (String w : words.keySet())
			System.out.printf("%-15s%5d%n", w, words.get(w));
	}


	public static void main(String[] args)
	{
		new WordCount(args[0]);
	}
}
