import java.util.*;
class HashSetTest
{
	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		/*hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("one");*/
		hs.add(new Student(1,"zhangsan"));
		hs.add(new Student(2,"lisi"));
		hs.add(new Student(3,"wangwu"));
		hs.add(new Student(1,"zhangsan"));
		
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

class Student
{
	int num;
	String name;
	Student(int num,String name)
	{
		this.num=num;
		this.name=name;
	}
	public int hashCode()
	{
		return num*name.hashCode();
	} 
	public boolean equals(Object o)
	{
		Student s=(Student)o;
		return num==s.num && name.equals(s.name);
	}
	public String toString()
	{
		return num+":"+name;
	}
}