import java.lang.Math;
import java.util.ArrayList;

public class Rook extends Chessman {
    public Rook(String color, int alphabetCoordinate, int numCoordinate) {
        super(color, alphabetCoordinate, numCoordinate);
    }

    public boolean check(int alpCoordinate, int numCordinate, ArrayList<Chessman> menArr) {
        for (Chessman chessman : menArr) {
            if (chessman.getAlphabetCoordinate() == alpCoordinate && chessman.getNumCoordinate() == numCordinate) {
                if (chessman.getColor() == getColor())
                    return false;
            }
        }
        if (numCordinate == getNumCoordinate()) {
            int n = alpCoordinate - getAlphabetCoordinate();
            if(n > 0){
                for (int i = 0; i != n; i++){
                    for (Chessman chessman : menArr) {
                        if (chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i)
                            return false;
                    }
                }
            }
            else {
                for (int i = 0; i != (n*(-1)); i++){
                    for (Chessman chessman : menArr) {
                        if (chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i)
                            return false;
                    }
                }
            }
        }
        else if(alpCoordinate == getAlphabetCoordinate()){
            int n = numCordinate - getNumCoordinate();
            if (n > 0){
                for (int i = 0; i != n; i++){
                    for (Chessman chessman : menArr) {
                        if (chessman.getNumCoordinate() == getNumCoordinate() + i)
                            return false;
                    }
                }
            }
            else {
                for (int i = 0; i != (n * -1); i++){
                    for (Chessman chessman : menArr) {
                        if (chessman.getNumCoordinate() == getNumCoordinate() - i)
                            return false;
                    }
                }
            }
        }

        return true;
    }

    public boolean move(int alpCoordinate, int numCordinate, String[][] field) {
        if ((alpCoordinate == getAlphabetCoordinate() || numCordinate == getNumCoordinate()) /*&& ((alpCoordinate != getAlphabetCoordinate() && numCordinate != getNumCoordinate()) */) {
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
