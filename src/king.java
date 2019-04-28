public class king extends Chessman{
    public king(String color, int alphabetCoordinate, int numCoordinate) {
        super(color, alphabetCoordinate, numCoordinate);
    }
    public boolean move(int alpCoordinate, int numCordinate, String[][] field) {
        if (alpCoordinate -1 == alpCoordinate || alpCoordinate +1 == getAlphabetCoordinate() || numCordinate -1 == getNumCoordinate() || numCordinate + 1 == getNumCoordinate()){
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
