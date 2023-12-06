package Question3;

public class PrintSquareAndCubes {

    public static void printAndCalculateSquareAndCubes() {
        System.out.println("Number           Square              Cube");

        for (int i = 0; i < 11; i++) {
            int squareNum = i * i;
            int cubeNum = i * i * i;
            System.out.println("  " + i + "             " + "  " + squareNum + "                  " + cubeNum);
        }
    }

    public static void main(String[] args) {
        printAndCalculateSquareAndCubes();
    }
}
