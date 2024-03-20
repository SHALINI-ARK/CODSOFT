package codsoft;
import java.util.*;
public class Task1
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
Random ran = new Random();
System.out.println("Welcome to Word Game..!");
System.out.println("You have ten attempts to Guess number..");
while(true)
{
int i=10,d=0;
int x = ran.nextInt(100);
while(i>0)
{
System.out.println();
System.out.println("Enter number to check:");
int y =s.nextInt();
if(x==y)
{
System.out.println("congratulations..!");
System.out.println("Your Guess is Correct..!The number is:"+x+".");
System.out.println("You have guessed number in "+(4-i)+" time.");
System.out.println("Your accuracy is "+(100/(11-i))+"%");
d++;
break;
}
else if(Math.abs(y-x)<10)
{  
if(i-1>0)
System.out.print("Try again,");
        System.out.println("Your Guess is too near");
}
else
{
if(i-1>0)
System.out.print("Try again,");
System.out.println("Your Guess is too far.");
}
i--;
}
if(d==0)
{
System.out.println("The number is "+x+".");
}
System.out.println();
System.out.println("Did you want to play again(yes/no):");
s.nextLine();
String str = s.nextLine();
if(str.equals("no"))
{
System.out.println("Thanks for playing the game...!");
break;
}
 }
s.close();
   }
}
