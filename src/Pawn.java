import java.util.ArrayList;

/**
 * @author M.Sadra Haeri
 * @version 1.0
 */

public class Pawn extends Chessman {


    public Pawn(String color, int alphabetCoordinate, int numCoordinate) {
        super(color, alphabetCoordinate, numCoordinate);
    }

    /**
     * @param alpCoordinate new position
     * @param numCordinate  new position
     * @param menArr        array of chessman
     * @return if you can move piece return true
     */
    public boolean check(int alpCoordinate, int numCordinate, ArrayList<Chessman> menArr) {
        if (getColor().equals("white")) {
            if (getFirstMove() == 0) {
                if ((numCordinate == getNumCoordinate() - 2 && alpCoordinate == getAlphabetCoordinate()) || (numCordinate == getNumCoordinate() - 1 && alpCoordinate == getAlphabetCoordinate())) {
                    {
                    }
                } else
                    return false;

            } else if ((numCordinate == getNumCoordinate() - 1 && alpCoordinate == getAlphabetCoordinate())) {
            } else
                return false;
        } else {
            if (getFirstMove() == 0) {
                if ((numCordinate == getNumCoordinate() + 2 && alpCoordinate == getAlphabetCoordinate()) || (numCordinate == getNumCoordinate() + 1 && alpCoordinate == getAlphabetCoordinate())) {
                    {
                    }
                } else
                    return false;

            } else if ((numCordinate == getNumCoordinate() + 1 && alpCoordinate == getAlphabetCoordinate())) {
            } else
                return false;
        }


        //////////////////////////////////////////
        for (Chessman chessman : menArr) {
            if (chessman.getAlphabetCoordinate() == alpCoordinate && chessman.getNumCoordinate() == numCordinate) {
                if (chessman.getColor().equals(getColor()))
                    return false;
            }
        }

        if (getColor().equals("white")) {
            for (Chessman chessman : menArr) {
                if (chessman.getAlphabetCoordinate() == getAlphabetCoordinate() && chessman.getNumCoordinate() == getNumCoordinate() - 1)
                    return false;
                if (chessman.getAlphabetCoordinate() == getAlphabetCoordinate() && chessman.getNumCoordinate() == getNumCoordinate() - 2 && getFirstMove() == 0)
                    return false;
            }
        } else {
            for (Chessman chessman : menArr) {
                if (chessman.getAlphabetCoordinate() == getAlphabetCoordinate() && chessman.getNumCoordinate() == getNumCoordinate() + 1)
                    return false;
                if (chessman.getAlphabetCoordinate() == getAlphabetCoordinate() && chessman.getNumCoordinate() == getNumCoordinate() + 2 && getFirstMove() == 0)
                    return false;
            }
        }

        return true;
    }


}
