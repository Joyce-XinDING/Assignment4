import java.util.Scanner;

public class Capital {
	public static String firstLetterToUpper(String string) {
	    char[] buffer = string.toCharArray();
	    for(int i=0;i<buffer.length;i++){
	    if(buffer[i]==' '){
	    	// this is not correct, if the string ends up with ' ', it will get array out of boundary exception.
	    	buffer[i+1] = Character.toUpperCase(string.charAt(i+1));
	    }
	    }
	    buffer[0] = Character.toUpperCase(string.charAt(0));
	    System.out.println(buffer);
	    return new String(buffer);
	}
	// why leave these space lines?
		  
		  
		 
		

	
	public static void main(String args[]){
			System.out.println("Please enter a sentence:");
			Scanner input= new Scanner(System.in);
			String in=input.nextLine();
			Capital cap=new Capital();
			cap.firstLetterToUpper(in);
			
		
	}
} 