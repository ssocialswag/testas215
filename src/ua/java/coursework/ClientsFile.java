package ua.java.coursework;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ClientsFile extends ContractsMenu {

    public void makeNoise() {
        try {
            File file = new File("ClientsFile.txt");

            if (!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("Oscar Isaac,phone number - 0982738723,contract ID-0xe0932x9fds923eac");
            pw.println("Ethan Hawke,phone number - 0969833792,contract ID-32fjf9dsf9923d32dd");
            pw.println("Karim El Hakim,phone number - 0672379238,contract ID-ds98aud8s82dad23a");
            pw.println("Ann Akinjirin,phone number - 0982833972,contract ID-d8as8da28d8asd2d8a");
            pw.close();
        } catch (IOException e) {
            System.out.print("Error" + e);
        }
    }

}
