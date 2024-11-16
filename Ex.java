 import java.util.*;
class Ex
{
public static void main(String k[])
{
int a,b,c;
Scanner ob=new Scanner(System.in);
try
{
a=ob.nextInt();
b=ob.nextInt();
c=a/b;
System.out.println(c);

}
catch(ArithmeticException e)
{
System.out.println("Cannot be divide by zero");
}

int arr[]={1,2,3,4,5,6,7,8,9,10};
try
{
System.out.println(arr[12]);
}
catch(Exception err)
{
System.out.println("Such index does not exists");
}

finally
{
System.out.println("Finished");
}
}
}