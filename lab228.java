import java.util.*;
public class lab228
{
public static void main(String ar[])
{
ArrayList hs=new ArrayList();
hs.add(Integer.valueOf(200));
hs.add(Integer.valueOf(201));
hs.add(470);
Collections.sort(hs);
Iterator<String> it=hs.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}
