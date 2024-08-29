import java.util.*;
public class numbergame
{
public static void main(String args[])
{
    Scanner a=new Scanner(System.in);
    Random c=new Random();

    int guessnum;
    int newguess;

    System.out.println("Genrate a random number between 1 to 100");
   int randnum= c.nextInt(100);
   System.out.println("Enter the number guessed by user");
   guessnum=a.nextInt();
   if(guessnum<randnum)
   {
    System.out.println("guess too small ");
   }
   else if(guessnum==randnum)
{
System.out.println("Guess is correct");
}
else
{
    System.out.println("guess too large");
}
for(int i=0;i<guessnum;i++)
{
    System.out.println("You have one more chnace:");
    newguess=a.nextInt();
    if(newguess<randnum)
    {
        System.out.println("too small");
    }
    else if(newguess==randnum)
    {
        System.out.println("your guess is correct");
    }
    else
    {
        System.out.println("Too high");
    }
}
}
}