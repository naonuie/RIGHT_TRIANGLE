import java.util.Scanner

public class rightTriangle
{
  public static void main (String [] args)
    {
      Scanner scan = new Scanner (System.in);
        
        System.out.println("This program will determine if a triangle is a right-angled triangle");
        System.out.println("Enter the first value:");
        int X = scan.nextInt();
        System.out.println("Enter the second value:");
        int Y = scan.nextInt();
        System.out.println("Enter the third value:");
        int Z = scan.nextInt();
        
        if ((Math.pow(X, 2) + Math.pow(Y, 2) == Math.pow(Z, 2))
                || (Math.pow(X, 2) + Math.pow(Z, 2) == Math.pow(Y, 2))
                || (Math.pow(Z, 2) + Math.pow(Y, 2) == Math.pow(X, 2))){
            System.out.println ("This triangle is a right-angled triangle");
            } else {
                System.out.println ("This triangle is not a right-angled triangle.");
            }
            

    }
}

