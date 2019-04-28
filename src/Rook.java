public class Rook extends Chessman {
    public Rook(String color, int alphabetCoordinate, int numCoordinate) {
        super(color, alphabetCoordinate, numCoordinate);
    }
    public boolean move(int alpCoordinate, int numCordinate, String[][] field) {
        if (alpCoordinate == getAlphabetCoordinate() || numCordinate == getNumCoordinate()){
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
