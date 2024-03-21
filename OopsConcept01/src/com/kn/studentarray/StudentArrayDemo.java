package com.kn.studentarray;

public class StudentArrayDemo {

	public static void main(String[] args) {

		StudentArray s1=new StudentArray(1,"Kasi",90);
		StudentArray s2=new StudentArray(2,"Vijay",80);
		StudentArray s3=new StudentArray(3,"Anand",30);
		
		StudentArray []srr=new StudentArray[3];
		
		srr[0]=s1;
		srr[1]=s2;
		srr[2]=s3;
		
		for(int i=0;i<srr.length;i++) {
			boolean isswapped=false;
//			if(srr[i].name==("Anand")) {
//				System.out.println("Id = "+srr[i].id+ ","+ "Name= "+srr[i].name+","+"Marks= "+srr[i].marks);
//			}
//			int Existing_Marks=srr[i].marks;
//			if(Existing_Marks<30) {
//				int Upgraded_Marks=(35-Existing_Marks)+Existing_Marks;
//				System.out.println("Existing_Marks= "+Existing_Marks);
//				System.out.println("After Grace_Marks");
//				System.out.println("Grace Marks= "+Upgraded_Marks);
//			}
			for(int j=0;j<srr.length-i-1;j++) {
				if(srr[j].marks>srr[j+1].marks) {
					StudentArray temp=srr[j];
					srr[j]=srr[j+1];
					srr[j+1]=temp;
					isswapped=true;					
				}
			}
				if(isswapped==false) {
					break;
				}
			}
			for(int k=0;k<srr.length;k++) {
			System.out.println("Id = "+srr[k].id+ ","+ "Name= "+srr[k].name+","+"Marks= "+srr[k].marks);
			}
		}
		
	}


