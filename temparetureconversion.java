//write a java program which reads a temperature in fahrenheit into celsius
import java.util.*;
class temparetureconversion
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float ct,ft;
System.out.pintln("enter fahrenheit temperature");
ft=sc.nextFloat();
ct=(ft-32.0f)*5/9;
System.out.pintln("celsius temperature="+ct);
}
}
