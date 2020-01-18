package lesson20;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class File {
    public static void main(String[] args) throws IOException {
        InputStream inFile = new FileInputStream("C:\\Users\\JediKirk\\Desktop\\JavaProject\\Test3.txt");
        readFullyByByte(inFile);
        System.out.println("\n\n\n");

        InputStream inUrl = new URL("http://google.com").openStream();

        System.out.println("\n\n\n");

        InputStream inArray = new ByteArrayInputStream(new byte[]{65, 66, 67, 68, 69});

        System.out.println("\n\n\n");
    }

    public static void readFullyByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
}
