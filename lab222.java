import java.util.*;
public class lab222
{
public static void main(String ar[])
{
Vector<String> hs=new Vector<String>();
hs.add("Karthi");
hs.add("Software Engineer");
hs.add("Coder");
Enumeration e=hs.elements();
while(e.hasMoreElements())
{
System.out.println(e.nextElement());
}
}
}
