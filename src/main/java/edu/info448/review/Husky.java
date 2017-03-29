package edu.info448.review; //package declaration (needed)

public class Husky extends Dog implements Huggable {

  /* class body goes here */
   public Husky(String name) {
      super();
   }
   
   public Husky() {
      super();
   }
   
   public void bark() {
		System.out.println(this+" says: Woof Woof!");
	}
  
   public void hug() {
      System.out.println(this+" gave a hug");
   }
  
   public void pullSled() {
      System.out.println("pulled the sled");
   }
}