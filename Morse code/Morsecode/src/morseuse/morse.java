package morseuse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class morse {
	public static void encryption(String s)
	{
			HashMap<Character, String> morse = new HashMap<Character, String>();
            morse.put('a', ".-");
            morse.put('b', "-...");
            morse.put('c',  "-.-");
            morse.put('d',  "-..");
            morse.put('e',    ".");
            morse.put('f', "..-.");
            morse.put('g',  "--.");
            morse.put('h', "....");
            morse.put('i',   "..");
            morse.put('j', ".---");
            morse.put('k',   "-.");
            morse.put('l', ".-..");
            morse.put('m',   "--");
            morse.put('n',   "-.");
            morse.put('o',  "---");
            morse.put('p', ".--.");
            morse.put('q', "--.-");
            morse.put('r', ".-.");
            morse.put('s',  "...");
            morse.put('t',   "-");
            morse.put('u',  "..-");
            morse.put('v', "...-");
            morse.put('w',  ".--");
            morse.put('x', "-..-");
            morse.put('y', "-.--");
            morse.put('z', "--..");
            morse.put('1', ".----");
            morse.put('2',"..---");
            morse.put('3', "...--");
            morse.put('4', "....-");
            morse.put('5', ".....");
            morse.put('6', "-....");
            morse.put('7', "--...");
            morse.put('8', "---..");
            morse.put('9', "----.");
            morse.put('0', "-----");
            
           String[] words=s.split(" ");
           String ans="";
           for(int i=0;i<words.length;i++)
           {
        	   String word=words[i];
        	   for(int j=0;j<word.length();j++)
        	   {
        		   ans+=morse.get(word.charAt(j))+" ";
        	   }
        	   ans+="   ";
           }
           
           System.out.println(ans);
            
            
		}
	
	public static void decryption(String s)
	{
		HashMap< String,Character> morse = new HashMap<String,Character>();
		morse.put(".-", 'a');
        morse.put("-...", 'b');
        morse.put("-.-",  'c');
        morse.put("-..",  'd');
        morse.put(".",    'e');
        morse.put("..-.", 'f');
        morse.put("--.",  'g');
        morse.put("....", 'h');
        morse.put("..",   'i');
        morse.put(".---", 'j');
        morse.put("-.",   'k');
        morse.put(".-..", 'l');
        morse.put("--",   'm');
        morse.put("-.",   'n');
        morse.put("---",  'o');
        morse.put(".--.", 'p');
        morse.put("--.-", 'q');
        morse.put(".-.", 'r');
        morse.put("...",  's');
        morse.put("-",   't');
        morse.put("..-",  'u');
        morse.put("...-", 'v');
        morse.put(".--",  'w');
        morse.put("-..-", 'x');
        morse.put("-.--", 'y');
        morse.put("--..", 'z');
        morse.put(".----", '1');
        morse.put("..---",'2');
        morse.put("...--", '3');
        morse.put("....-", '4');
        morse.put(".....", '5');
        morse.put("-....", '6');
        morse.put("--...", '7');
        morse.put("---..", '8');
        morse.put("----.", '9');
        morse.put("-----", '0');
        
        String[]words=s.split(" ");
       
        String ans="";
        for(int i=0;i<words.length;i++)
        {
        	String word=words[i];
        	if(word==null || word=="")
        	{
        		ans+=" ";
        	}
        	else
        	{
        		ans+=morse.get(word);
        	}
        		
        }
        System.out.println(ans);
        
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input for encryption");
		String input=sc.nextLine();
		String enp=input.toLowerCase();
		encryption(enp);
		
		
		System.out.println("Enter the input for decryption");
		String input2=sc.nextLine();
		decryption(input2);
		
	}

}
