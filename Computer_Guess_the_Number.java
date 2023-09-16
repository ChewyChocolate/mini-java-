import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);

    boolean condition = true;
    int ans;
    int guess = 50;
    int temp = guess;
	System.out.print("\033[H\033[2J");
	System.out.println("my guess is " + guess);
	System.out.println("1. if the answer is lower");
	System.out.println("2. if the answer is higher");
	System.out.println("3. if the answer is correct");
	    
	ans = scan.nextInt();
	        
	if(ans == 1){
	    guess = guess/2;
	    System.out.println(guess);
	}
	    else if(ans == 2){
    	guess = (guess/2) + guess;
    	System.out.println(guess);
	}
	else{
    	System.out.println("the answer is correct");
	}


    while (condition){
	//System.out.print ("\033[H\033[2J");
	System.out.println ("my guess is " + guess);
	System.out.println ("1. if the answer is lower");
	System.out.println ("2. if the answer is higher");
	System.out.println ("3. if the answer is correct");

	ans = scan.nextInt ();

	if (ans == 1)
	  {
	    guess = temp + ((guess - temp)/2);
	    System.out.println (guess);
	  }
	else if (ans == 2)
	  {
	    guess = (guess / 2) + guess;
	    System.out.println (guess);
	  }
	else
	  {
	    System.out.println ("the answer is correct");
	    condition = false;
	  }
	
	  temp = guess;
      }
  }
}
