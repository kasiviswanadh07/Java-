package oops;

public class StudensApp 
{
    public static void main(String[] args) {
	     Student s1=new Student();
	     System.out.println("ID="+s1.id+ ",Name="+s1.name+", Age="+s1.age+", Cgpa="+s1.cgpa+", Height="+s1.height);
	     
	           s1.id=208150366;
	           s1.name="kasi viswanadh";
	           s1.age=23;
	           s1.cgpa=6.9;
	           s1.height=5.7;
	           s1.study();
	           s1.attendence();
	           s1.bunk();
	  	 System.out.println("ID="+s1.id+ ",Name="+s1.name+", Age="+s1.age+", Cgpa="+s1.cgpa+", Height="+s1.height);
	     
	     
    }
	

}
