import java.util.Scanner;

public class Student {
	String nm;
	int rolno,age,score;
	Student()
	{
		
	}
	public Student(String nm, int rolno, int age, int score) {
		
		this.nm = nm;
		this.rolno = rolno;
		this.age = age;
		this.score = score;
	}
	
	public String toString() {
		return "Student [nm=" + nm + ", rolno=" + rolno + ", age=" + age + ", score=" + score + "]";
	}

	
	
	
	public static void main(String[] args) 
	{
		int no1=0,no2=0,no3=0,no4=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no.->");
		int no=s.nextInt();
		Student p[]=new Student[no];
		Student s1=new Student();
		String nm1;
		int rolno1;
		int age1;
		int score1;
		for(int i=0;i<p.length;i++)
		{
			System.out.println("enter name->");
			nm1=s.next();
			System.out.println("enter roll no->");
			rolno1=s.nextInt();
			System.out.println("enter age->");
			age1=s.nextInt();
			System.out.println("enter score->");
			score1=s.nextInt();
		
			p[i]=new Student(nm1,rolno1,age1,score1);
		}

		Student p1[]=new Student[no];
		Student p2[]=new Student[no];
		Student p3[]=new Student[no];
		Student p4[]=new Student[no];
		
		for(int i=0;i<p.length;i++)
		{
			if(p[i].score >0 && p[i].score <=50)
			{
			p1[i]=p[i];
			}
			else if(p[i].score >50 && p[i].score <65)
			{
				p2[i]=p[i];
			}
			else if(p[i].score >=65 && p[i].score <80)
			{
				p3[i]=p[i];
			}
			else
			{
				p4[i]=p[i];
			}
		}
		System.out.println("Group of[0-50]");
		for(int i=0;i<p1.length;i++)
		{

			if(p1[i]!=null)
				{
				System.out.println(p1[i]);
				}
		}
		
		
		System.out.println("Group of[50-65]");
		for(int i=0;i<p2.length;i++)
		{	
			if(p2[i]!=null)
				{
			System.out.println(p2[i]);
				}
		}
	
		System.out.println("Group of[65-80]");
		for(int i=0;i<p3.length;i++)
		{
			if(p3[i]!=null)
			{
				System.out.println(p3[i]);
			}
		}
		
		
		System.out.println("Group of[80-100]");
		for(int i=0;i<p4.length;i++)
		{
			if(p4[i]!=null)
			{
				System.out.println(p4[i]);
			}
		}
	
	}
	
	
}
