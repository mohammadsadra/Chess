public class Bishop extends Chessman {
    public Bishop(String color, int alphabetCoordinate, int numCoordinate) {
        super(color, alphabetCoordinate, numCoordinate);
    }

    public boolean move(int alpCoordinate, int numCordinate, String[][] field) {
        int n = alpCoordinate - getAlphabetCoordinate();
        if (n < 0)
            n *= -1;
        if ((getAlphabetCoordinate() - n == alpCoordinate || getAlphabetCoordinate() + n == alpCoordinate) &&(getNumCoordinate() -n == numCordinate || getNumCoordinate() + n == numCordinate)){
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
