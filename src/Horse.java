import java.util.ArrayList;

public class Horse extends Chessman {

    public Horse(String color, int alphabetCoordinate, int numCoordinate) {
        super(color, alphabetCoordinate, numCoordinate);
    }

    public boolean check(int alpCoordinate, int numCordinate, ArrayList<Chessman> menArr) {
        for (Chessman chessman : menArr) {
            if (chessman.getAlphabetCoordinate() == alpCoordinate && chessman.getNumCoordinate() == numCordinate) {
                if (chessman.getColor() == getColor())
                    return false;
            }
        }
        return true;
    }

    public boolean move(int alpCoordinate, int numCordinate, String[][] field) {
        if ((getNumCoordinate() - 1 == numCordinate && getAlphabetCoordinate() + 2 == alpCoordinate) || (getNumCoordinate() - 2 == numCordinate && getAlphabetCoordinate() + 1 == alpCoordinate) || (getNumCoordinate() - 1 == numCordinate && getAlphabetCoordinate() - 2 == alpCoordinate) || (getNumCoordinate() - 2 == numCordinate && getAlphabetCoordinate() - 1 == alpCoordinate) || (getNumCoordinate() + 1 == numCordinate && getAlphabetCoordinate() + 2 == alpCoordinate) || (getNumCoordinate() + 2 == numCordinate && getAlphabetCoordinate() + 1 == alpCoordinate) || (getNumCoordinate() + 1 == numCordinate && getAlphabetCoordinate() - 2 == alpCoordinate) || (getNumCoordinate() + 2 == numCordinate && getAlphabetCoordinate() - 1 == alpCoordinate)) {
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
