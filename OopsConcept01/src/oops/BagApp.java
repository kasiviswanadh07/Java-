package oops;

public class BagApp {
     public static void main(String[]args) {
    	 Bag B1=new Bag();
    	 System.out.println("Material="+B1.material+", Brand="+B1.brand+", Height="+B1.height+", Manufacture date"+B1.mf);
    	     
    	     B1.material="Black";
    	     B1.brand="KodNest";
    	     B1.height=5.8;
    	     B1.mf=20/04/2023;
    	     B1.carrying();
    	     B1.store();
    	     System.out.println("Material="+B1.material+", Brand="+B1.brand+", Height="+B1.height+", Manufacture date"+B1.mf);
    	     
     }
}
