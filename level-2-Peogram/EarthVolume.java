/*Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
 */
public class EarthVolume {
    public static void main(String[] args) {
        // Step 1: Declare the radius of Earth in kilometers
        double radiusKm = 6378;

        // Step 2: Calculate the volume in cubic kilometers using the sphere formula
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // Step 3: Convert cubic kilometers to cubic miles
        double kmToMilesFactor = 0.621371;
        double volumeMi3 = volumeKm3 * Math.pow(kmToMilesFactor, 3);

        // Step 4: Print both volumes in one statement
        System.out.println(
            "The volume of Earth in cubic kilometers is " + volumeKm3 + 
            " and in cubic miles is " + volumeMi3
        );
    }
}
