public class Recursion{
static factorial(int n)
{
//factorial(n) = n * n-1 *...1
//factorial(5) = 5*4*3*2*1 = 120
//factorial(n)= n + factorial(n-1)


/*static int factorial(int n)
{
if(n==0 || num==1)
{
return 1;

}
else{
	return n*factorial(n: n-1);
	}
}

public static void main(String[] args)

{
int x =4;
System.out.println("the value)*/


static void fun2(int n)
{
if(n>0)
{
fun2(n-1);
System.out.println(n);
}

}


public static void main(String[] args)
{
int n =3;
fun2(n);

}
}
