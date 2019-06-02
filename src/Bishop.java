import java.util.ArrayList;
import java.lang.Math;

/**
 * @author M.Sadra Haeri
 * @version 1.0
 */
public class Bishop extends Chessman {
    public Bishop(String color, int alphabetCoordinate, int numCoordinate) {
        super(color, alphabetCoordinate, numCoordinate);
    }

    public boolean check(int alpCoordinate, int numCordinate, ArrayList<Chessman> menArr) {
        int q = alpCoordinate - getAlphabetCoordinate();
        if (q < 0)
            q *= -1;
        if ((getAlphabetCoordinate() - q == alpCoordinate || getAlphabetCoordinate() + q == alpCoordinate) && (getNumCoordinate() - q == numCordinate || getNumCoordinate() + q == numCordinate)) {

        } else
            return false;

        ///////////
        for (Chessman chessman : menArr) {
            if (chessman.getAlphabetCoordinate() == alpCoordinate && chessman.getNumCoordinate() == numCordinate) {
                if (chessman.getColor() == getColor())
                    return false;
            }
        }

        ////////////
        int e, w;
        e = alpCoordinate - getAlphabetCoordinate();
        w = numCordinate - getNumCoordinate();
        if (Math.abs(e) != Math.abs(w)){
            return false;
        }
        else if (e > 0 && w > 0) {
            for (int i = 1; i <= Math.abs(e); i++) {
                for (Chessman chessman : menArr) {
                    if (chessman.getNumCoordinate() == getNumCoordinate() + i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i && i == Math.abs(e) && chessman.getColor() != getColor()){

                    }
                    else if (chessman.getNumCoordinate() == getNumCoordinate() + i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i)
                        return false;
                }
            }

        }
        else if (e > 0 && w < 0) {
            for (int i = 1; i <= Math.abs(e); i++) {
                for (Chessman chessman : menArr) {
                    if (chessman.getNumCoordinate() == getNumCoordinate() - i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i && i == Math.abs(e) && chessman.getColor() != getColor()){

                    }
                    else if (chessman.getNumCoordinate() == getNumCoordinate() - i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i)
                        return false;
                }
            }

        }
        else if (e < 0 && w > 0) {
            for (int i = 1; i <= Math.abs(e); i++) {
                for (Chessman chessman : menArr) {
                    if (chessman.getNumCoordinate() == getNumCoordinate() + i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i && i == Math.abs(e) && chessman.getColor() != getColor()){

                    }
                    else if (chessman.getNumCoordinate() == getNumCoordinate() + i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i)
                        return false;
                }
            }

        }
        else if (e < 0 && w < 0) {
            for (int i = 1; i <= Math.abs(e); i++) {
                for (Chessman chessman : menArr) {
                    if (chessman.getNumCoordinate() == getNumCoordinate() - i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i && i == Math.abs(e) && chessman.getColor() != getColor()){

                    }
                    else if (chessman.getNumCoordinate() == getNumCoordinate() - i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i)
                        return false;
                }
            }

        }

        return true;
    }


}
