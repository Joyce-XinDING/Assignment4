import java.util.Scanner;
public class Reserver{
	// program is not correct, if the string contains only one word, what is your output?
	// for example: string "test"?
	public String back(String s){
		char[] list=s.toCharArray();
		int j=s.length()-1;
		// in the simple program, please use StringBuilder instead.
		StringBuffer output=new StringBuffer();
		for(int i=j;i>=0;i--){
			if(list[i]==' '){
				for(int n=i+1;n<=j;n++){
				// indentation
				System.out.print(list[n]);
				output.append(list[n]);
				}
				System.out.print(list[i]);
				output.append(list[i]);
				j=i-1;
			}
		}
		for(int z=0;z<s.length();z++){
			if(list[z]==' '){
				for(int q=0;q<z;q++){
					System.out.print(list[q]);
					output.append(list[q]);
				}
			break;
			}
			}
		String last=output.toString();
		return last;
		
	}
	public static void main(String[] args){
		System.out.println("Please enter a sentence:");
		Scanner enter= new Scanner(System.in);
		String input=enter.nextLine();
		Reserver rs=new Reserver();
		rs.back(input);
	}
}