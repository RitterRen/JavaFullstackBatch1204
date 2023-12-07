package Question2;

public class GuessingGame {
    private int answer;
    private final Generator generator;
    private boolean gameOver;
    private int differential;
    private int max;
    private int maxGuessesAllowed;
    private int numGuessesTaken;
    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public Generator getGenerator() {
        return generator;
    }

    public int getDifferential() {
        return differential;
    }

    public void setDifferential(int differential) {
        this.differential = differential;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMaxGuessesAllowed() {
        return maxGuessesAllowed;
    }

    public void setMaxGuessesAllowed(int maxGuessesAllowed) {
        this.maxGuessesAllowed = maxGuessesAllowed;
    }

    public int getNumGuessesTaken() {
        return numGuessesTaken;
    }

    public void setNumGuessesTaken(int numGuessesTaken) {
        this.numGuessesTaken = numGuessesTaken;
    }

    public GuessingGame() {
        this.generator = new Generator();
    }

    public GuessingGame(int maxNumber) {
        this();
        this.max = maxNumber;
    }

    public void newGame(int maxGuessNumber) {
        this.maxGuessesAllowed = maxGuessNumber;
        this.answer = generator.getRandomInMax(this.max);
        this.gameOver = false;
        this.differential = this.max;
        this.numGuessesTaken = 0;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public String guess(int guessNumber) {
        if (numGuessesTaken == maxGuessesAllowed) {
            this.gameOver = true;
            return "Game Over!";
        }
        if (guessNumber > max) {
            return "Guess out of range, the guess must be between 0 and " + max;
        }
        if (guessNumber == answer) {
            this.gameOver = true;
            return "Congratulation!";
        }
        numGuessesTaken++;

        StringBuilder sb = new StringBuilder();
        if (guessNumber > answer) {
            sb.append("Too High");
        } else {
            sb.append("Too Low");
        }

        sb.append("\n");

        int currentDiff = Math.abs(guessNumber - answer);
        if (currentDiff > differential) {
            sb.append("Getting Colder 🥹");
        }else {
            sb.append("Getting Warmer 😁");
        }

        return sb.toString();
    }

}
