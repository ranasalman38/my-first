package task;
import java.util.Scanner;
public class First 
{
	public static void main(String[] args) {

	Scanner sc =new Scanner(System.in);
	char ch;
	System.out.println("Enter a character");
	ch=sc.next().charAt(0);
	if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')){
		System.out.println("Its an Alphabat");
		
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
        ch=='u' || ch=='U')
        {
            System.out.print("This is a Vowel");
        }
        if(ch>='A'&& ch<='Z') {
        	System.out.println("  It is also Capital letter");
        }else {
        	System.out.println("  It is not Capital letter");
        }
 }
	else if(ch>='0'&& ch<='9') {
		System.out.println("Its a digit");
		int a=ch;
		if(a%2==0) {
			System.out.println("And is an even number");
		}
		
		else {
			System.out.println("And is an odd number");}
	}
	else
		System.out.println("not a digit and not a char it may b e a special char");

	}
	}