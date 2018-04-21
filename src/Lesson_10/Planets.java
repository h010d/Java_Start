package Lesson_10;

public class Planets {

	public static void main(String[] args) {
		
		Planet [] planets = Planet.values();
		for(Planet planet : planets) {
			System.out.println(planet + " Gravity = " + planet.Gravity());

		}
	
	}

}
enum Planet{
    Earth  (5.976e+24, 6.37814e6),
    Mars   (6.421e+23, 3.3972e6),
    Jupiter (1.9e+27, 7.1492e7),
    Venus  (4.869e+24, 6.0518e6),
    Urans (8.686e+25, 2.5559e7),
    Neptune (1.024e+26, 2.4746e7),
    Saturn (5.688e+26, 6.0268e7),
	Mercury (3.303e+23, 2.4397e6);
	
	private double radius;
    private double weight;
     
    Planet(double weight, double radius) {
    	this.radius = radius;
        this.weight = weight;
        
    }
   public  double getWeight() {
	  return this.weight;
   }
   public  double getRadius() {
	  return this.radius;
   }
    public static final double G = 6.67300E31;
    double Gravity() {
        return G * weight/ (radius * radius);
    }
}