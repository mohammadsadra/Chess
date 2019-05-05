import java.util.ArrayList;

public class Pawn extends Chessman {
    private int firstMove = 0;

    public Pawn(String color, int alphabetCoordinate, int numCoordinate) {
        super(color, alphabetCoordinate, numCoordinate);
    }

    public boolean check(int alpCoordinate, int numCordinate, ArrayList<Chessman> menArr) {
        for (Chessman chessman : menArr) {
            if (chessman.getAlphabetCoordinate() == alpCoordinate && chessman.getNumCoordinate() == numCordinate) {
                if (chessman.getColor() == getColor())
                    return false;
            }
        }

        if (getColor() == "white") {
            for (Chessman chessman : menArr) {
                if (chessman.getNumCoordinate() == getNumCoordinate() - 1)
                    return false;
                if (chessman.getNumCoordinate() == getNumCoordinate() - 2 && firstMove == 0)
                    return false;
            }
        } else {
            for (Chessman chessman : menArr) {
                if (chessman.getNumCoordinate() == getNumCoordinate() + 1)
                    return false;
                if (chessman.getNumCoordinate() == getNumCoordinate() + 2 && firstMove == 0)
                    return false;
            }
        }

        return true;
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
                if ((alpCoordinate == getAlphabetCoordinate() && (numCordinate == getNumCoordinate() + 2)) || numCordinate == (getNumCoordinate() + 1)) {
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
