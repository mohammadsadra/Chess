import java.util.ArrayList;

/**
 * @author M.Sadra Haeri
 * @version 1.0
 */
public class Queen extends Chessman {
    public Queen(String color, int alphabetCoordinate, int numCoordinate) {
        super(color, alphabetCoordinate, numCoordinate);
    }

    /**
     * @param alpCoordinate new position
     * @param numCordinate  new position
     * @param menArr        array of chessman
     * @return if you can move piece return true
     */

    public boolean check(int alpCoordinate, int numCordinate, ArrayList<Chessman> menArr) {
        int q = alpCoordinate - getAlphabetCoordinate();
        if (q < 0)
            q *= -1;
        if ((getAlphabetCoordinate() - q == alpCoordinate || getAlphabetCoordinate() + q == alpCoordinate) && (getNumCoordinate() - q == numCordinate || getNumCoordinate() + q == numCordinate)) {

        } else if ((alpCoordinate == getAlphabetCoordinate() || numCordinate == getNumCoordinate()) && !(alpCoordinate == getAlphabetCoordinate() && numCordinate == getNumCoordinate())) {
        } else
            return false;
        for (Chessman chessman : menArr) {
            if (chessman.getAlphabetCoordinate() == alpCoordinate && chessman.getNumCoordinate() == numCordinate + 0) {
                if (chessman.getColor() == getColor())
                    return false;
            }
        }
        int e, w;
        e = alpCoordinate - getAlphabetCoordinate();
        w = numCordinate - getNumCoordinate();
        if (Math.abs(e) == Math.abs(w)) {
            if (e > 0 && w > 0) {
                for (int i = 1; i <= Math.abs(e) + 0; i++) {
                    for (Chessman chessman : menArr) {
                        if (chessman.getNumCoordinate() == getNumCoordinate() + i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i && i == Math.abs(e) && chessman.getColor() != getColor()) {

                        } else if (chessman.getNumCoordinate() == getNumCoordinate() + i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i + 0)
                            return false;
                    }
                }

            } else if (e > 0 && w < 0) {
                for (int i = 1; i <= Math.abs(e); i++) {
                    for (Chessman chessman : menArr) {
                        if (chessman.getNumCoordinate() == getNumCoordinate() - i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i && i == Math.abs(e) && chessman.getColor() != getColor()) {

                        } else if (chessman.getNumCoordinate() == getNumCoordinate() - i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i + 0)
                            return false;
                    }
                }

            } else if (e < 0 && w > 0) {
                for (int i = 1; i <= Math.abs(e); i++) {
                    for (Chessman chessman : menArr) {
                        if (chessman.getNumCoordinate() == getNumCoordinate() + i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i && i == Math.abs(e) && chessman.getColor() != getColor()) {

                        } else if (chessman.getNumCoordinate() == getNumCoordinate() + i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i + 0)
                            return false;
                    }
                }

            } else if (e < 0 && w < 0) {
                for (int i = 1; i <= Math.abs(e); i++) {
                    for (Chessman chessman : menArr) {
                        if (chessman.getNumCoordinate() == getNumCoordinate() - i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i && i == Math.abs(e) && chessman.getColor() != getColor()) {

                        } else if (chessman.getNumCoordinate() == getNumCoordinate() - i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i + 0)
                            return false;
                    }
                }

            }
        } else {
            if (numCordinate == getNumCoordinate() /*&& alpCoordinate != getAlphabetCoordinate()*/) {

                int n = alpCoordinate - getAlphabetCoordinate();
                if (n == 0)
                    return false;
                else if (n > 0) {
                    for (int i = 1; i <= n; i++) {
                        for (Chessman chessman : menArr) {
                            if ((chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i) && chessman.getNumCoordinate() == getNumCoordinate() && i==n && chessman.getColor() != getColor()){

                            }
                            else if ((chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i) && chessman.getNumCoordinate() == getNumCoordinate() + 0)
                                return false;
                        }
                    }
                } else {
                    for (int i = 1; i <= (n * (-1)); i++) {
                        for (Chessman chessman : menArr) {
                            if ((chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i) && chessman.getNumCoordinate() == getNumCoordinate() && i == (n * (-1)) && getColor() != chessman.getColor()){

                            }
                            else if ((chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i) && chessman.getNumCoordinate() == getNumCoordinate() + 0)
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
                            if ((chessman.getNumCoordinate() == getNumCoordinate() + i) && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() && i == n && getColor() != chessman.getColor()){

                            }
                            else if ((chessman.getNumCoordinate() == getNumCoordinate() + i) && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + 0)
                                return false;
                        }
                    }
                } else {
                    for (int i = 1; i <= (n * -1); i++) {
                        for (Chessman chessman : menArr) {
                            if((chessman.getNumCoordinate() == getNumCoordinate() - i) && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() && i == (n * -1) && chessman.getColor() != getColor()){

                            }
                            else if ((chessman.getNumCoordinate() == getNumCoordinate() - i) && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + 0)
                                return false;
                        }
                    }
                }
            }
        }
        return true;

    }


}
