public class Chessman {
    private String color;
    private int alphabetCoordinate;
    private int numCoordinate;
    private String name;

    public Chessman(String color, int alphabetCoordinate, int numCoordinate){
        this.alphabetCoordinate =alphabetCoordinate;
        this.numCoordinate = numCoordinate;
        this.color = color;

    }

    public int getNumCoordinate() {
        return numCoordinate;
    }

    public void setNumCoordinate(int numCoordinate) {
        this.numCoordinate = numCoordinate;
    }



    public int getAlphabetCoordinate() {
        return alphabetCoordinate;
    }

    public String getColor() {
        return color;
    }

    public void setAlphabetCoordinate(int alphabetCoordinate) {
        this.alphabetCoordinate = alphabetCoordinate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
