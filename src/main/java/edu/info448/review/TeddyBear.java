package edu.info448.review;

/**
 * A simple class representing a teddy bear
 * @author Joel Ross
 */
public class TeddyBear implements Huggable {
   private String name;
	private String breed;
	//implied default constructor
   public TeddyBear() {
      name = "Winnie";
      breed = "carebear";
   }

	public void hug() {
		System.out.println("A teddy bear is squished in a great big hug.");
	}
}