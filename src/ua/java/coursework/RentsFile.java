package ua.java.coursework;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class RentsFile {
    public void makeNoise() {
        try {
            File file = new File("RentsFile.txt");

            if (!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("Nike-engaged,contract ID-0xe0932x9fds923eac");
            pw.println("Puma-engaged,contract ID-32fjf9dsf9923d32dd");
            pw.println("Adidas-engaged,contract ID-ds98aud8s82dad23a");
            pw.println("Crosby-engaged,contract ID-d8as8da28d8asd2d8a");
            pw.close();
        } catch (IOException e) {
            System.out.print("Error" + e);
        }
    }

}
