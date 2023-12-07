package Question2.test;

import Question2.Generator;

public class GeneratorTestDrive {
    public static void main(String[] args) {
        final int testNum = 100;
        Generator generator = new Generator();

        for (int i = 0; i < 10000; i++) {
            int randomNumber = generator.getRandomInMax(testNum);

            if (randomNumber > 100 || randomNumber < 0) System.out.println("Test Failed");
        }

        System.out.println("Test pass");
    }
}
