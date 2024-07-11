import java.util.*;
class sumofdig
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num : ");
int num=sc.nextInt();
int rem,sum=0;
while(num!=0)
{
rem=num%10;
sum=sum+rem;

}
System.out.println(+sum);
}
}