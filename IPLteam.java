class IPLteam{
 static String[] teamName=new String[8];
public static void main(String a[])
{
teamName[0]="RCB";
teamName[1]="RR";
teamName[2]="MI";
teamName[3]="SRH";
teamName[4]="KkR";
teamName[5]="DC";
teamName[6]="KP";
teamName[7]="CSK";
getIplTeamName();
}
public static void getIplTeamName()
{
System.out.println(teamName.length);
for(int z=0;z<teamName.length;z++)
{
System.out.println(teamName[z]+" ");
}

}
}