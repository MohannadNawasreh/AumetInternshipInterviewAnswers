import java.util.Scanner;

public class PrimeNumberChecker {

    static  boolean isPrime(int num)
    {
        if(num <= 1)
        {
            return false;
        }
        for(int i=2; i<=num/2; i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime: ");
        num = scanner.nextInt();

        if(isPrime(num)) {
            System.out.println(num + " is prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }
}



