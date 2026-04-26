class Vehicle {   // Create a class named Vehicle
    
    // Declare two private variables
    
    private String brand;
    private String color;
    
    // Create a public constructor that initializes these variables
    
    public Vehicle(String b, String c) {
        brand = b;
        color = c;
    }
        
    
    // Create a public method start() that match the sample input and output respectively
    
    public void start() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle is starting...");
    }
}
        
    
    
    // Create another class named IT24013 containing the main() method
    
public class IT24013 {

    public static void main(String[] abc) {

       // Use command line arguments to create objects
        // Each pair of arguments represents brand and color
        
        for(int i=0; i<abc.length; i++) {
            Vehicle v = new Vehicle(abc[i], abc[++i]);
            v.start();
        }
    }
}

        
