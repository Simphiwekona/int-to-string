import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String s = Integer.toString(n);

        if(s.equals(Integer.toString(n)))
        {
            System.out.println("Good job");
        }else
        {
            System.out.println("Wrong answer");
        }
    }
}