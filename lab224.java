import java.util.*;
import java.io.*;
import java.lang.*;
public class lab224
{
public static void main(String ar[])
{
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1,"Karthi");
hm.put(2,"Software Engineer");
hm.put(3,"Coder");
//Iterator<String> it=hm.iterator();
for(Map.Entry m:hm.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());
}
}
}
