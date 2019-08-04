package english;

import java.util.HashMap;

public class Dictionary {
	
	
	public static HashMap<String, String> words = new HashMap<String, String>() ;
	
    public Dictionary(HashMap<String, String> words) 
    { 
        this.words = words;  
    }
    
	public static void addwords() {
		
		words.put("Attenuate", "Make thin;Weaken");
		words.put("Brevity", "Conciseness");
		words.put("Censure", "Criticism");
		words.put("Dissent", "Disagreement");
		words.put("Enmity", "Ill will;Hatred");
		words.put("Equitable", "Fair;Impartial");
		words.put("Mitigate", "Appease;Moderate");
		words.put("Reverence", "Deep respect");
		words.put("Savor", "Enjoy");
		words.put("Venerate", "Revere");

		
	}
	
	
}
