import java.awt.*;
import java.util.ArrayList;

/**
 * @author M.Sadra Haeri
 * @version 1.0
 */
public class king extends Chessman {
    public king(String color, int alphabetCoordinate, int numCoordinate) {
        super(color, alphabetCoordinate, numCoordinate);
    }

    /**
     * @param alpCoordinate new position
     * @param numCordinate  new position
     * @param menArr        array of chessman
     * @return if you can move piece return true
     */
    public boolean check(int alpCoordinate, int numCordinate, ArrayList<Chessman> menArr) {
        for (Chessman chessman : menArr) {
            if (chessman.getAlphabetCoordinate() == alpCoordinate && chessman.getNumCoordinate() == numCordinate) {
                if (chessman.getColor() == getColor())
                    return false;
            }
        }
        ////////
        if ((getAlphabetCoordinate() - 1 == alpCoordinate || getAlphabetCoordinate() + 1 == alpCoordinate) && (getNumCoordinate() - 1 == numCordinate || getNumCoordinate() + 1 == numCordinate)) {

        } else if ((((alpCoordinate == getAlphabetCoordinate() + 1 || alpCoordinate == getAlphabetCoordinate() - 1) && numCordinate == getNumCoordinate()) || ((alpCoordinate == getAlphabetCoordinate() && (numCordinate == getNumCoordinate() + 1 || numCordinate == getNumCoordinate() - 1)))) && !(alpCoordinate == getAlphabetCoordinate() && numCordinate == getNumCoordinate())) {
        } else
            return false;
        ///////////////
        for (Chessman man : menArr) {
            if (man.getColor() != getColor()) {
                if (man.getName().contains("Pawn")) {
                    if (!getColor().equals("white")) {
                        if (numCordinate == man.getNumCoordinate() - 1 && alpCoordinate == man.getAlphabetCoordinate() + 1) {
                            return false;
                        }
                        if (numCordinate == man.getNumCoordinate() - 1 && (alpCoordinate == man.getAlphabetCoordinate() - 1)) {
                            return false;
                        }
                    } else {
                        if (numCordinate == man.getNumCoordinate() + 1 && (alpCoordinate == man.getAlphabetCoordinate() - 1)) {
                            return false;
                        }
                        if (numCordinate == man.getNumCoordinate() + 1 && alpCoordinate == man.getAlphabetCoordinate() + 1) {
                            return false;
                        }
                    }
                } else if (man.check(alpCoordinate, numCordinate, menArr)) {
                    return false;
                }
            }

        }

        return true;
    }

    /**
     * @param menArr array of chessman
     * @return if king does not have problem return true
     */

    public boolean kCheck(int alp, int num, ArrayList<Chessman> menArr) {
//        for (Chessman man : menArr) {
//            if (man.getColor() != getColor()) {
//                if (man.check(alp, num, menArr)) {
//                    return false;
//                }
//            }
//        }
        return true;
    }

}
