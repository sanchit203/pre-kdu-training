import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.next();
        String second = input.next();
        int len1 = first.length();
        int len2 = second.length();

        System.out.println("The Length of the first string is " + len1);
        System.out.println("The Length of the second string is " + len2);

        if(len1==len2)
        {
            System.out.println("The length of the two strings are the same");
            if(first.equals(second))
            {
                System.out.println("Two strings are equal");
            }
            else
            {
                System.out.println("Two strings are not equal");
            }
        }
        else
        {
            System.out.println("The length of the two strings is not the same");
            System.out.println("Two strings are not equal");
        }
    }
}