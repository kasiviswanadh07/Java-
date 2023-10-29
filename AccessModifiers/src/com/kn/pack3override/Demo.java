package com.kn.pack3override;

public class Demo {

	public static void main(String[] args) {
         System.out.println("<<<<<<Parent Details>>>>>>");
		Parent p1=new Parent();
		p1.eyecolor();
		p1.Height();
		p1.SkinColor();
		p1.weight();
		
		System.out.println("-------------------------");
		System.out.println("<<<<<<<<Child Details>>>>>>>");
		Child c1=new Child();
		c1.eyecolor();
		c1.SkinColor();
		c1.Height();
		c1.Weight();
		c1.Pubg();
		c1.Insta();
	}

}
