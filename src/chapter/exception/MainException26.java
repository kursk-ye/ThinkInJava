package chapter.exception;

import java.io.FileInputStream;

public class MainException26 {
    // Pass all exceptions to the console:
    public static void main(String[] args) throws Exception {
        // Leads to FileNotFoundException:
        FileInputStream file =
                new FileInputStream("null.jv");
        // Use the file ...
        // Close the file:
        file.close();
    }
}
