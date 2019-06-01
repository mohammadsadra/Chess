import java.util.ArrayList;

/**
 * @author M.Sadra Haeri
 * @version 1.0
 */
public class Rook extends Chessman {
    public Rook(String color, int alphabetCoordinate, int numCoordinate) {
        super(color, alphabetCoordinate, numCoordinate);
    }

    /**
     * @param alpCoordinate new position
     * @param numCordinate  new position
     * @param menArr        array of chessman
     * @return if you can move piece return true
     */
    public boolean check(int alpCoordinate, int numCordinate, ArrayList<Chessman> menArr) {
        if ((alpCoordinate == getAlphabetCoordinate() || numCordinate == getNumCoordinate()) && !(alpCoordinate == getAlphabetCoordinate() && numCordinate == getNumCoordinate())) {
        } else
            return false;
/////////////////////
        for (Chessman chessman : menArr) {
            if (chessman.getAlphabetCoordinate() == alpCoordinate && chessman.getNumCoordinate() == numCordinate) {
                if (chessman.getColor() == getColor())
                    return false;
            }
        }
/////////////////////////
        if (numCordinate == getNumCoordinate() && alpCoordinate != getAlphabetCoordinate()) {

            int n = alpCoordinate - getAlphabetCoordinate();
            if (n == 0)
                return false;
            else if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    for (Chessman chessman : menArr) {
                        if ((chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i) && chessman.getNumCoordinate() == getNumCoordinate())
                            return false;
                    }
                }
            } else {
                for (int i = 1; i <= (n * (-1)); i++) {
                    for (Chessman chessman : menArr) {
                        if ((chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i) && chessman.getNumCoordinate() == getNumCoordinate())
                            return false;
                    }
                }
            }
        } else if (alpCoordinate == getAlphabetCoordinate()) {

            int n = numCordinate - getNumCoordinate();
            if (n == 0)
                return false;
            else if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    for (Chessman chessman : menArr) {
                        if ((chessman.getNumCoordinate() == getNumCoordinate() + i) && chessman.getAlphabetCoordinate() == getAlphabetCoordinate())
                            return false;
                    }
                }
            } else {
                for (int i = 1; i <= (n * -1); i++) {
                    for (Chessman chessman : menArr) {
                        if ((chessman.getNumCoordinate() == getNumCoordinate() - i) && chessman.getAlphabetCoordinate() == getAlphabetCoordinate())
                            return false;
                    }
                }
            }
        }

        return true;
    }


}
