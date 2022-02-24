package Pack1;

public class innercla1 { 
	private String msg="Welcome to Java"; 

class Inner{  
      void hello(){
    	  System.out.println(msg+", Let us start learning Inner Classes");
    	  }  
}  


	public static void main(String[] args) {
		innercla1 j=new innercla1();
		innercla1.Inner in=j.new Inner();  
		in.hello();  

		


	}

}
