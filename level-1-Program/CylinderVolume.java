/* Write a program to calculate the volume of a cylinder. Take the radius and
height as inputs and use the formula:
Volume = π * radius^2 * height. */
public class CylinderVolume {
    public static void main(String[] args) {
        double radius = 3.0;
        double height = 5.0;

        double volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.printf("The volume of the cylinder with radius %.2f and height %.2f is %.2f%n", radius, height, volume);
    }
}

