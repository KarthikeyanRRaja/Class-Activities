import java.util.*;
public class lab228
{
public static void main(String ar[])
{
ArrayList<String> hs=new ArrayList<String>();
hs.add("Karthi");
hs.add("Software Engineer");
hs.add("Coder");
Collections.sort(hs);
Iterator<String> it=hs.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}
