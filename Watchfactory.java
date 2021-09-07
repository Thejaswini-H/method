class Watchfactory{
static String[] factoryName=new String[6];
public static void main(String a[])
{
factoryName[0]="Rolex";
factoryName[1]="Fastrack";
factoryName[2]="Titan";
factoryName[3]="Timex";
factoryName[4]="Sonata";
factoryName[5]="rado";
getFactoryName();
}
public static void getFactoryName(){
System.out.println(factoryName.length);
for(int z=0;z<factoryName.length;z++)
{
System.out.println(factoryName[z]+ " ");
}
}
}