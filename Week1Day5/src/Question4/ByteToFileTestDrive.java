package Question4;

public class ByteToFileTestDrive {
    public static void main(String[] args) {
        String filePath = "./outputFile.txt";
        byte[] byteArr = {104, 116, 116, 112, 115, 58, 47, 47, 119, 119, 119, 46, 121, 111, 117, 116, 117, 98,
                101, 46, 99, 111, 109, 47, 119, 97, 116, 99, 104, 63, 118, 61, 100, 81, 119, 52, 119, 57, 87,
                103, 88, 99, 81};
        ByteToFile btf = new ByteToFile();

        btf.convertByteArrayToFile(byteArr, filePath);
    }
}
