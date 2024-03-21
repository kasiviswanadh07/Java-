package oops;

public class RestaurantAPP {
       public static void main(String[]args) {
    	   Restaurant R1=new Restaurant();
    	   System.out.println("place="+R1.place+", Name="+R1.name+", Bill="+R1.bill);
    	   
    	      R1. place="BTM Main Road";
    	      R1. name="Five star hotel";
    	      R1.bill=1000.2654;
    	      R1.serving();
    	      R1.eating();
    	      R1.handwash();
    	       
    	   System.out.println("place="+R1.place+", Name="+R1.name+", Bill="+R1.bill);
       }
}
