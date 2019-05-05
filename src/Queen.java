import java.util.ArrayList;

public class Queen extends Chessman {
    public Queen(String color, int alphabetCoordinate, int numCoordinate) {
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
        if (Math.abs(n) == Math.abs(m)) {
            for (Chessman chessman : menArr) {
                if (chessman.getAlphabetCoordinate() == alpCoordinate && chessman.getNumCoordinate() == numCordinate) {
                    if (chessman.getColor() == getColor())
                        return false;
                }
            }
            if (n > 0 && m > 0) {
                for (int i = 0; i != Math.abs(n); i++) {
                    for (Chessman chessman : menArr) {
                        if (chessman.getNumCoordinate() == getNumCoordinate() + i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i)
                            return false;
                    }
                }

            }
            if (n > 0 && m < 0) {
                for (int i = 0; i != Math.abs(n); i++) {
                    for (Chessman chessman : menArr) {
                        if (chessman.getNumCoordinate() == getNumCoordinate() - i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i)
                            return false;
                    }
                }

            }
            if (n < 0 && m > 0) {
                for (int i = 0; i != Math.abs(n); i++) {
                    for (Chessman chessman : menArr) {
                        if (chessman.getNumCoordinate() == getNumCoordinate() + i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i)
                            return false;
                    }
                }

            }
            if (n < 0 && m < 0) {
                for (int i = 0; i != Math.abs(n); i++) {
                    for (Chessman chessman : menArr) {
                        if (chessman.getNumCoordinate() == getNumCoordinate() - i && chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i)
                            return false;
                    }
                }

            }
        } else {
            if (numCordinate == getNumCoordinate()) {
                int a = alpCoordinate - getAlphabetCoordinate();
                if (a > 0) {
                    for (int i = 0; i != n; i++) {
                        for (Chessman chessman : menArr) {
                            if (chessman.getAlphabetCoordinate() == getAlphabetCoordinate() + i)
                                return false;
                        }
                    }
                } else {
                    for (int i = 0; i != (n * (-1)); i++) {
                        for (Chessman chessman : menArr) {
                            if (chessman.getAlphabetCoordinate() == getAlphabetCoordinate() - i)
                                return false;
                        }
                    }
                }
            } else if (alpCoordinate == getAlphabetCoordinate()) {
                int a = numCordinate - getNumCoordinate();
                if (a > 0) {
                    for (int i = 0; i != n; i++) {
                        for (Chessman chessman : menArr) {
                            if (chessman.getNumCoordinate() == getNumCoordinate() + i)
                                return false;
                        }
                    }
                } else {
                    for (int i = 0; i != (n * -1); i++) {
                        for (Chessman chessman : menArr) {
                            if (chessman.getNumCoordinate() == getNumCoordinate() - i)
                                return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean move(int alpCoordinate, int numCordinate, String[][] field) {
        int n = alpCoordinate - getAlphabetCoordinate();
        if (n < 0)
            n *= -1;
        if ((alpCoordinate == getAlphabetCoordinate() || numCordinate == getNumCoordinate()) || ((getAlphabetCoordinate() - n == alpCoordinate || getAlphabetCoordinate() + n == alpCoordinate) && (getNumCoordinate() - n == numCordinate || getNumCoordinate() + n == numCordinate))) {
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
