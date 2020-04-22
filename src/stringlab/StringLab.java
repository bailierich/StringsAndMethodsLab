package stringlab;

public class StringLab {

	public static void main(String[] args) {

		capitalize("hElOO");
		
		wheresWaldo("I'm tired of Waldo.");
		
		firstThingsFirst("aello" , "bailie");
		
		reverse("love");
		
		soLong("apple", "bailier");
		
		afterMath("The mathematics test was so hard!");
		
		letterize("Karter");

	}

	public static void capitalize(String word) {
		String firstLetter = word.substring(0, 1);
		firstLetter = firstLetter.toUpperCase();
		String theRest = word.substring(1);
		theRest = theRest.toLowerCase();
		String finalAnswer = firstLetter + theRest;
		System.out.println(finalAnswer);

	}

	public static void wheresWaldo(String phrase) {
		System.out.println(phrase.indexOf("Waldo"));
	}
	
	public static void firstThingsFirst(String a, String b) {
		
			String firstLetterA = a.substring(0,1);
			String firstLetterB = b.substring(0,1);
			
			if (firstLetterA.compareToIgnoreCase(firstLetterB) < 0) {
				System.out.println(a + " " + b);
			}else {
				System.out.println(b + " " + a);
			}
	}
	
	public static void reverse(String s) {
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	
	public static void soLong(String a, String b) {
		int StringLengthA = a.length();
		int StringLengthB = b.length();
		
		if (StringLengthA > StringLengthB) {
			System.out.println(a);
		}else if (StringLengthA == StringLengthB) {
			System.out.println(a + " " + b);
		}else {
			System.out.println(b);
		}
	}
	
	public static void afterMath(String phrase) {
		int mathIndex = phrase.indexOf("math");
		String results = phrase.substring(mathIndex);
		System.out.println(results);
 	}
	
	public static void letterize(String word) {
		for (int i = 0; i <= word.length()-1; i++) {
			System.out.println(word.charAt(i));
		}
	}
}
