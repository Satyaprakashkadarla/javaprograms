import java.util.scanner;
public class HollowRectanglepattern
{
 public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number: ");
 int r= sc.nextInt();
 System.out.println("Enter the second number: ");
 int c= sc.nextInt90;
 System.out.println();

  for(int i=1;i<=r;i++)
  {
   for(int j=1;j<=c;j++)
  {
   if(i==1 || i==r || j==1 || j==c)
   System.out.println("*");
    else
   System.out.println(" ");
   }
 }
}