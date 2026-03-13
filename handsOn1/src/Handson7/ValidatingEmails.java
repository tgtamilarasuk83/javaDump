package Handson7;
import java.util.Scanner;
public class ValidatingEmails {
	public static void main(String args[]) {
		
		Scanner scanf = new Scanner(System.in);
		
		
		
		
		
		System.out.println("Enter the e-mail :");
		String Str = scanf.nextLine();
		char array[] = Str.toCharArray();
		
		int valid =0;
		
		//check 1 
		if((array[0] < 97 || array[0] > 122)) {
            	
			System.out.println("Invalid character found such as starting only small alphabets ");
        }
        
		
		// checking the invalid symbols
		
		for(int i=0; i<array.length; i++) {
			if(array[i] == '!' || array[i] == '#' || array[i] == '$' || array[i] == '%' ||
					   array[i] == '^' || array[i] == '&' || array[i] == '*' || array[i] == '(' ||
					   array[i] == ')' || array[i] == '=' || array[i] == '{' || array[i] == '}' ||
					   array[i] == '[' || array[i] == ']' || array[i] == '|' || array[i] == '\\' ||
					   array[i] == ';' || array[i] == ':' || array[i] == '\'' || array[i] == '"' ||
					   array[i] == '<' || array[i] == '>' || array[i] == ',' || array[i] == '?') 
					{
					    System.out.println("Invalid character found");
					    return ;
					}
		}
		
		//checking for the vaild symbols but not repeated 
		for(int i=0; i<array.length; i++) {
			if(array[i] == '@' || array[i] == '.' || array[i] == '-' || array[i] == '_' ){
				if(array[i] == array[i+1] ){
					System.out.println("Invalid character found Such as repeating symbols");					
					return ;
				}
				
			}
		}
		
		// validate dot atlesat one dot
		int count =0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]== '@') {
				count ++;
			}
		}
		
		// validate dot atlesat one @
				int count2 =0;
				
				for(int i=0; i<array.length; i++) {
					if(array[i]== '@') {
						count2 ++;
					}
				}
				
				if((count>0)&&(count2==1)){
					 System.out.println("This is a valid mail");
					
				}
				else {
					 System.out.println("Invalid character found NOT a valid formate ");
				}
			
		
	}

}
