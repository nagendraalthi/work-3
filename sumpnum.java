import java.util.*;
class sumpnum
{
public static void main(String[] args)
{
int n,i=1,nsum=0,psum=0,num;
Scanner sc= new Scanner(System.in);
System.out.print("Enter a n ");
n= sc.nextInt();
i=1;
while(i<=n)
{
System.out.print("Enter a num ");
num= sc.nextInt();
if(num>0)
psum=psum+num;
else
nsum=nsum+num;
i++;
}
System.out.println("sum of pos numbers are:" +psum);
System.out.println("sum no nev numbers are:" +nsum);
}
}