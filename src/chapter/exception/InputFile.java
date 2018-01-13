package chapter.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static kursk.Kutils.println;

public class InputFile {
    private BufferedReader in;

    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
        } catch ( FileNotFoundException e) {
            println("Could not open " + fname);
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e2) {
                println("in.close() unsuccessful");
            }
            throw  e;
        } finally {

        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(" readLine() failed");
        }
        return  s;
    }

    public void dispose() {
        try {
            in.close();
            println("dispose() successful");
        } catch (IOException e2) {
            throw new RuntimeException("in.close failed");
        }
    }
}
