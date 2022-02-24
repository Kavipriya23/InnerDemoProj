package Pack1;

abstract class AnInnerClass {
	 public abstract void display();
}

public class aninner {
  public static void main(String[] args) {
	  AnInnerClass a = new AnInnerClass () {

			         public void display() {
			            System.out.println("Anonymous Inner Class");
			         }
			      };
			 a.display();
    }
}
