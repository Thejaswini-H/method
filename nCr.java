class Ncr{
public static void main(String a[])
{
System.out.println("main method started");
int nCr=fact(5)/(fact(2)*fact(5-2));
System.out.println(nCr);
System.out.println("main method ended");
}
public static int fact(int n)
{
System.out.println("fact method started");
int fact=1;
for(int i=1;i<=n;i++){
fact=fact*i;
}
System.out.println("main method ended");
return fact;
}
}

fact(n)/fact(n-r)*fact(r)== n!/(n-r)!*r!