package javase;
import java.util.*;

public class stud {
	Scanner sc = new Scanner(System.in);
	String s_name,per;
	int roll_no;
	float sub1,sub2,sub3,avg;
	stud(String name,int roll,float s1,float s2,float s3)
	{
		s_name = name;
		roll_no = roll;
		sub1=s1;
		sub2=s2;
		sub3=s3;
		avg = (sub1+sub2+sub3)/3;
		per = avg+"%";
	}
	stud(String name,int roll)
	{
		s_name = name;
		roll_no = roll;
		System.out.println("enter marks of subject 1");	
		sub1=sc.nextFloat();
		System.out.println("enter marks of subject 2");
		sub2=sc.nextFloat();
		System.out.println("enter marks of subject 3");
		sub3=sc.nextFloat();
		avg = (sub1+sub2+sub3)/3;
		per = avg+"%";
	}
	stud()
	{
		System.out.println("enter name");
		s_name = sc.nextLine();
		System.out.println("enter roll no");
		roll_no = sc.nextInt();
		System.out.println("enter marks of subject 1");	
		sub1=sc.nextFloat();
		System.out.println("enter marks of subject 2");
		sub2=sc.nextFloat();
		System.out.println("enter marks of subject 3");
		sub3=sc.nextFloat();
		avg = (sub1+sub2+sub3)/3;
		per = avg+"%";
	}
	void display()
	{
		System.out.println(s_name+"\t\t"+roll_no+"\t\t"+sub1+"\t\t"+sub2+"\t\t"+sub3+"\t\t"+avg+"\t\t"+per);
	}
	
	
	

	public static void main(String[] args) {
		stud std1 = new stud("shashank",8,90,95,99);
		stud std2 = new stud("parihar",99,80,100,99);
		stud std3 = new stud("john",11);
		stud std4 = new stud("doe",10);
		stud std5 = new stud();
		System.out.println("name\t\tRollNo.\t\tsub1\t\tsub2\t\tsub3\t\tavg\t\tper");
		std1.display();
		std2.display();
		std3.display();
		std4.display();
		std5.display();
	}

}
