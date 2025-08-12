import java.util.HashSet;

public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areUnique(int[] otpArray) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otpArray) {
            if (!set.add(otp)) {
                // Duplicate found
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Print the OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if all OTPs are unique
        if (areUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicates.");
        }
    }
}
