public class testing {
    public static void main(String[] args) {
            String str = "Whatzupp!!!";
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
		System.out.println(mod.toLowerCase());	
	} 
    }

