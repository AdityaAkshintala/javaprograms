import java.util.Scanner;
class Factorial
{
Scanner obj=new Scanner(System.in);
int i,f,n;

void input()
{
System.out.println("Enter any number:");
n=obj.nextInt();
}

void operation()
{
f=1;
for(i=n;i>=1;i--)
{
f=f*i;
}
}

void output()
{
System.out.println("The factorial of the given number is:"+f);
}

public static void main(String[] args)
{
Factorial fact=new Factorial();
fact.input();
fact.operation();
fact.output();
}
}