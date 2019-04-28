public class Queen extends Chessman {
    public Queen(String color, int alphabetCoordinate, int numCoordinate) {
        super(color, alphabetCoordinate, numCoordinate);
    }

    public boolean move(int alpCoordinate, int numCordinate, String[][] field) {
        int n = alpCoordinate - getAlphabetCoordinate();
        if (n < 0)
            n *= -1;
        if ((alpCoordinate == getAlphabetCoordinate() || numCordinate == getNumCoordinate()) || ((getAlphabetCoordinate() - n == alpCoordinate || getAlphabetCoordinate() + n == alpCoordinate) && (getNumCoordinate() - n == numCordinate || getNumCoordinate() + n == numCordinate))) {
            field[getAlphabetCoordinate()][getNumCoordinate()] = " ";
            setAlphabetCoordinate(alpCoordinate);
            setNumCoordinate(numCordinate);
            field[getAlphabetCoordinate()][getNumCoordinate()] = getName();
            return true;
        }
        System.out.println("Wrong input");
        return false;
    }
}
