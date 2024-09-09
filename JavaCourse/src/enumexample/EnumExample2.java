package enumexample;

public class EnumExample2 {

	public static void main(String[] args) {

		//Case 1:
//		System.out.println(Planet.EARTH.surfaceGravity());
		
		//Iterating Over Enums
//		for (Planet p : Planet.values()) {
//            System.out.printf("%s: mass = %f, radius = %f, ordinal = %d%n", p, p.mass(), p.radius(), p.ordinal());
//        }
//		

//				Planet pl = new Planet();
				 Planet planet = Planet.valueOf("EARTH");
//
	        // Output the result
	        System.out.println("Planet: " + planet);
	        System.out.println("Mass: " + planet.mass());
	        System.out.println("Radius: " + planet.radius());
	        
	}

}

/**
 * Internal representation of enum in java/jvm
 * public class Planet {
 * 		public static final Planet MERCURY = new Planet(3.303e+23, 2.4397e6);
 * 
 * 		MERCURY.surfaceGravity();
 * }
 * */

 enum Planet {
    
    VENUS(4.869e+24, 6.0518e6),
    MERCURY(3.303e+23, 2.4397e6),
    EARTH(5.976e+24, 6.378e6),
    MARS(6.421e+23, 3.397e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);

    private final double mass;   // in kilograms
    private final double radius; // in meters

      Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double mass() {
        return mass;
    }

    public double radius() {
        return radius;
    }

    public double surfaceGravity() {
        final double G = 6.67300E-11; // Universal gravitational constant
        return G * this.mass / (this.radius * this.radius);
    }

    public double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
}
 
 /**
  * public class Weekend {
  * 	public static final Weekend SUNDAY = new Weekend("Market Day");
  * } 
  * */
 
enum Weekend {
	    SUNDAY("Market Day"), SATURDAY("Half Day School");
	
	//instance variable
	private final String comment;
	 Weekend(String comment){
		this.comment = comment;
	}
	
	String getComment() {
		return this.comment;
	}
}

