class js
{
public static void main(String ar[])
{
int[] a={1,2,3,4};
int s=1,p=1;
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
p=p*s*a[j];
}
if(i==a.length-1)
{
System.out.println(s);
}
else
{
System.out.println(p);
p=1;
s=s*a[i];
}
}
}
}
