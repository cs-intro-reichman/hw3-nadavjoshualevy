/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {

		
		// Tests the isAnagram function.
		System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true

		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed");
	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		String word1 = preProcess(str1);
		String word2 = preProcess(str2);
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; word1.length()>i;i ++){
			char c = word1.charAt(i);
			int newValue = (int) c;
			sum1 += newValue;
		}
		for (int j = 0 ; word2.length()>j; j++){
			char d = word2.charAt(j);
			int newvalue2 = (int) d ; 
			sum2 += newvalue2;
		}
		if (sum1 == sum2){return true;}
		else return false;
	}
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		String mod = "";
		for (int i = 0; str.length()>i; i++){
			char c = str.charAt(i);
			if (c >= 'A' && c<= 'Z'){
				mod += c ;
			}
			if (c >= 'a' && c<= 'z') {
				mod += c ;
			}
		}
			
		return mod.toLowerCase();
	} 
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		int length = str.length();
		String anagram = "";
		for (int i=0; i<length; i++){
			int randomIndex = (int)(Math.random()*str.length());
			char rnd = str.charAt(randomIndex);
			anagram = anagram +rnd;
			str = str.substring(0, randomIndex) + str.substring(randomIndex +1);
		}
		return anagram;
		
	}
}
