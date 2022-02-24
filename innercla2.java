package Pack1;

public class innercla2 {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	public static void main(String[] args) {
		innercla2  obj=new innercla2 ();  
		obj.display();  


	}

}
