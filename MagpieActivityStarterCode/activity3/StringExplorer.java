/**
 * A program to allow students to try out different
 * String methods.
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";

		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);

		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);

		//  Try other methods here:
		int notFoundPsn = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);

		/*
		indexOf(String str, int fromIndex)
		returns the index within this string of the first occurrence of the specified substring,
		<< starting at the specified index. >>
		*/

	}

}
