class Factorial{
public static void main(String a[])
{
System.out.println("main method started");
myFact(5,2);
System.out.println("main method ended");
}
public static void myFact(int n, int r){
System.out.println("myFact method started");
int fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
int rfact=1;
for(int i=1;i<=r;i++){
rfact=rfact*i;
}
int a=(n-r);
 int afact=1;
for(int i=1;i<=a;i++){
afact=afact*i;
}
int b=(rfact*afact);
int f=(fact/b);
System.out.println(f);

System.out.println("myFact method ended");
}
}