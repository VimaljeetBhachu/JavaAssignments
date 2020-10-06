import org.apache.log4j.Logger;

public class ReverseString {
	static Logger logger = Logger.getLogger(ReverseString.class);
	
	public static String reverseString(String str) {
		logger.info("Inside reverseString Method");
		String[] words = str.split("\\s");
		String newString="";
		
		for(int i=0;i<words.length;i++) {
			int len = words[i].length();
			char[] String2 = words[i].toCharArray();
			
			if(len>=5) {
				
				for(int j=0,k=len-1;j<k;k--,j++) {
					char temp = String2[j];
					String2[j] = String2[k];
					String2[k] = temp;					
				}				
			}
			
			 String String3 = String.valueOf(String2);
			 newString += " " + String3;
		}
		
		logger.info("Final Result " + newString.trim());
			return newString.trim();
	}
}
