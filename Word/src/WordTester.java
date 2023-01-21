import java.util.Scanner;

public class WordTester 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sentence ending in a period.");
		String input;
		do
		{
			input = in.nextLine();
			Word w = new Word(input);
			int syllables = w.countSyllables();
			System.out.println("Syllables in " + input + ": " + syllables);
		}
		while (!input.endsWith("."));
		in.close();
	}
}