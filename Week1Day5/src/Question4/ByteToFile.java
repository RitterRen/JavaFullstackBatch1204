package Question4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteToFile {

    public void convertByteArrayToFile(byte[] byteArr, String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            fos.write(byteArr);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
