import java.io.File;

public class sub {
    public static void main(String[] args) {
        // Create a File object representing a directory
        File directory = new File("C:\\Users\\Nikhil\\Documents\\code\\java programs\\basic\\IO Streams");

        // Check if the directory exists and is a directory
        if (directory.exists() && directory.isDirectory()) {
            // List the files in the directory
            File[] files = directory.listFiles();
            
            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName()); // Print the names of the files
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The specified directory does not exist.");
        }
    }
}
