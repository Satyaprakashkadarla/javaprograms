import java.util.scanner;
public class Triangularpattern
{
 public static void main(String[] args)
{
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter the number: ");
 int r= sc.nextInt();
 System.out.println();
  for(int i=1;i<=r;i++)
  {
   for(int j=1;j<=i;j++)
  {
   System.out.println("*");
 }
   System.out.println(" ");
   }
 }
}