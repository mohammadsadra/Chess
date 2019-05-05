import java.util.ArrayList;
import java.lang.Math;

public class Bishop extends Chessman {
    public Bishop(String color, int alphabetCoordinate, int numCoordinate) {
        super(color, alphabetCoordinate, numCoordinate);
    }

    public boolean check(int alpCoordinate, int numCordinate, ArrayList<Chessman> menArr) {
        int n, m;
        n = alpCoordinate - getAlphabetCoordinate();
        m = numCordinate - getNumCoordinate();
        for (Chessman chessman : menArr) {
            if (chessman.getAlphabetCoordinate() == alpCoordinate && chessman.getNumCoordinate() == numCordinate) {
                if (chessman.getColor() == getColor())
                    return false;
            }
        }
        if (n > 0 && m > 0) {
            for (int i = 0; i != Math.sqrt(n); i++) {
                for (Chessman chessman : menArr) {
                    if (chessman.getNumCoordinate() == getNumCoordinate() + i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i)
                        return false;
                }
            }

        }
        if (n > 0 && m < 0) {
            for (int i = 0; i != Math.sqrt(n); i++) {
                for (Chessman chessman : menArr) {
                    if (chessman.getNumCoordinate() == getNumCoordinate() - i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i)
                        return false;
                }
            }

        }
        if (n < 0 && m > 0) {
            for (int i = 0; i != Math.sqrt(n); i++) {
                for (Chessman chessman : menArr) {
                    if (chessman.getNumCoordinate() == getNumCoordinate() + i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i)
                        return false;
                }
            }

        }
        if (n < 0 && m < 0) {
            for (int i = 0; i != Math.sqrt(n); i++) {
                for (Chessman chessman : menArr) {
                    if (chessman.getNumCoordinate() == getNumCoordinate() - i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i)
                        return false;
                }
            }

        }

        return true;
    }

    public boolean move(int alpCoordinate, int numCordinate, String[][] field) {
        int n = alpCoordinate - getAlphabetCoordinate();
        if (n < 0)
            n *= -1;
        if ((getAlphabetCoordinate() - n == alpCoordinate || getAlphabetCoordinate() + n == alpCoordinate) && (getNumCoordinate() - n == numCordinate || getNumCoordinate() + n == numCordinate)) {
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
