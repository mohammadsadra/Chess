
public class Pawn extends Chessman {
    private int firstMove = 0;

    public Pawn(String color, int alphabetCoordinate, int numCoordinate) {
        super(color, alphabetCoordinate, numCoordinate);
    }


    public boolean move(int alpCoordinate, int numCordinate, String[][] field) {
        if (getColor() == "white") {
            if (firstMove == 0) {
                if ((alpCoordinate == getAlphabetCoordinate() && numCordinate == getNumCoordinate() - 2) || (numCordinate == getNumCoordinate() - 1 && alpCoordinate == getAlphabetCoordinate())) {
                    field[getAlphabetCoordinate()][getNumCoordinate()] = " ";
                    setAlphabetCoordinate(alpCoordinate);
                    setNumCoordinate(numCordinate);
                    field[getAlphabetCoordinate()][getNumCoordinate()] = getName();
                    firstMove++;
                    return true;
                }
            }
            if ((numCordinate == getNumCoordinate() - 1 && alpCoordinate == getAlphabetCoordinate())) {
                field[getAlphabetCoordinate()][getNumCoordinate()] = " ";
                setAlphabetCoordinate(alpCoordinate);
                setNumCoordinate(numCordinate);
                field[getAlphabetCoordinate()][getNumCoordinate()] = getName();
                return true;
            }
        } else {
            if (firstMove == 0) {
                if ((alpCoordinate == getAlphabetCoordinate() && (numCordinate == getNumCoordinate() + 2)) || numCordinate == (getNumCoordinate() + 1))
                {
                    field[getAlphabetCoordinate()][getNumCoordinate()] = " ";
                    setAlphabetCoordinate(alpCoordinate);
                    setNumCoordinate(numCordinate);
                    field[getAlphabetCoordinate()][getNumCoordinate()] = getName();
                    firstMove++;
                    return true;
                }
            }
            if (numCordinate == getNumCoordinate() + 1 && alpCoordinate == getAlphabetCoordinate()) {
                field[getAlphabetCoordinate()][getNumCoordinate()] = " ";
                setAlphabetCoordinate(alpCoordinate);
                setNumCoordinate(numCordinate);
                field[getAlphabetCoordinate()][getNumCoordinate()] = getName();
                return true;

            }
        }
        System.out.println("Wrong input");
        return false;
    }
}
