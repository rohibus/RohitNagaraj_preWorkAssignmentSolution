import java.util.*;

public class Main 
{
	Scanner sc = new Scanner(System.in);

    //function to checkPalindrome
    public void checkPalindrome()  
    {
    	System.out.println("Enter the number ");
    	int num = sc.nextInt();

    	if (num < 0)
    	{
    		System.out.println(num + "	is not a palindrome number, Negative numbers are not palindromic.\n");
    		return;
    	}

    	int n = num;
    	String s = "";
    	while (num > 0)
    	{
    		int rem = num % 10;
    		num /= 10;
    		s += rem;
    	}

    	boolean flag = true;
    	int len = s.length();
    	for (int i = 0; i < len/2; i++)
    	{
    		if (s.charAt(i) != s.charAt(len-1-i))
    		{
    			flag = false;
    			break;
    		}
    	}

    	if (flag)
    	{
    		System.out.println(n + "	is a palindrome number");
    	}
    	else
    	{
    		System.out.println(n + "	is not a palindrome number");
    	}
    	System.out.println();
    }

    //function to printPattern
    public void printPattern() 
    {
    	System.out.println("Enter the number to print * pattern");
    	int num = sc.nextInt();


    	for (int i = 0; i < num; i++)
    	{
    		for (int j = num - i; j > 0; j--)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }

    //function to check no is prime or not
    public void checkPrimeNumber() 
    {
    	System.out.println("Enter the number ");
    	int num = sc.nextInt();

    	if (num < 2)
    	{
    		System.out.println(num + "	is not a prime number.\n");
    		return;
    	}

    	boolean flag = true;

    	for (int i = 2; i <= Math.sqrt(num); i++)
    	{
    		if (num % i == 0)
    		{
    			flag = false;
    			break;
    		}
    	}

    	if (flag)
    	{
    		System.out.println(num + "	is a prime number");
    	}
    	else
    	{
    		System.out.println(num + "	is not a prime number");
    	}
    	System.out.println();
    }

    // function to print Fibonacci Series
    public void printFibonacciSeries() 
    {

    	//initialize the first and second value as 0,1 respectively.
    	System.out.println("Enter the number ");
    	int num = sc.nextInt();
    	int[] arr = new int[num];

    	arr[0] = 0;
    	arr[1] = 1;

    	for (int i = 2; i < num; i++)
    	{
    		arr[i] = arr[i-1] + arr[i-2];
    	}

    	System.out.println("Fibonacci series of first " + num + " numbers");
    	for (int i = 0; i < num; i++)
    	{
    		System.out.print(arr[i] + "	");
    	}
    	System.out.println();
    }

	//main method which contains switch and do while loop
    public static void main(String[] args) 
    {

        Main obj = new Main();

        int choice;

        Scanner sc = new Scanner(System.in);

		do {

				System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

				System.out.println();
				choice = sc.nextInt();

				switch (choice) 
				{
					case 0:	choice = 0;
							break;
					case 1: {
								obj.checkPalindrome();
							}
							break;
					case 2: {
								obj.printPattern();
							}
							break;

					case 3: {
								obj.checkPrimeNumber();
							}
							break;

					case 4: {
								obj.printFibonacciSeries();
							}
							break;
					default:
							System.out.println("Invalid choice. Enter a valid no.\n");
				}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");
		sc.close();
	}
}