import java.util.Scanner;
class Main
{
    public static void main(String[] agrs)
    /**
     * To print the even number
     * until we print the even the loop continusoly get thr number from the user
     * @param args
     */
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number");
        int number=scan.nextInt();
        if(number%2==0)
        {
            System.out.println("This is  a even number");
        }
        else
        {
            for(int i=0;i<50;i++)
            {
                Scanner scan2=new Scanner(System.in);
                System.out.print("Enter a number");
                int number2=scan2.nextInt();
                if(number2%2==0)
                {
                    System.out.println("This is even number");
                    break;
                }
            }
        }
    }
}