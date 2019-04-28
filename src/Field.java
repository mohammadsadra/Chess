import java.util.ArrayList;

public class Field {
    public String[][] field ;
    private king wKing;
    private king bKing;
    private Queen wQueen;
    private Queen bQueen;
    private ArrayList<Pawn> wPawn;
    private ArrayList<Pawn> bPawn;
    private ArrayList<Bishop> wBishop;
    private ArrayList<Bishop> bBishop;
    private ArrayList<Horse> wHorse;
    private ArrayList<Horse> bHorse;
    private  ArrayList<Rook> wRook;
    private ArrayList<Rook> bRook;


    public Field() {
        field = new String[8][8];

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                field[i][j] = " ";
            }

        }

        wKing = new king("white", 4, 7);
        bKing = new king("black", 4, 0);
        field[4][7] = "wKing";
        wKing.setName("wKing");
        field[4][0] = "bKing";
        bKing.setName("bKing");

        wQueen = new Queen("white", 3, 7);
        bQueen = new Queen("black", 3, 0);
        field[3][7] = "wQueen";
        field[3][0] = "bQueen";
        wQueen.setName("wQueen");
        bQueen.setName("bQueen");
        wPawn = new ArrayList<>();
        bPawn = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Pawn pawn = new Pawn("white", i, 6);
            pawn.setName("wPawn " + (i+1));
            wPawn.add(pawn);
            field[i][6] = "wPawn " + (i+1);

        }
        for (int i = 0; i < 8; i++) {
            Pawn pawn = new Pawn("black", i, 1);
            pawn.setName("bPawn " + (i+1));
            bPawn.add(pawn);
            field[i][1] = "bPawn " + (i+1);
        }

        wBishop = new ArrayList<>();
        bBishop = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Bishop bishop = new Bishop("white", 2, 7);
                wBishop.add(bishop);
                bishop.setName("wBishop 1");
                field[2][7] = "wBishop 1";
            } else if (i != 0) {
                Bishop bishop = new Bishop("white", 5, 7);
                bishop.setName("wBishop 2");
                wBishop.add(bishop);
                field[5][7] = "wBishop 2";
            }
        }

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Bishop bishop = new Bishop("black", 2, 0);
                bishop.setName("bBishop 1");
                bBishop.add(bishop);
                field[2][0] = "bBishop 1";
            } else if (i != 0) {
                Bishop bishop = new Bishop("black", 5, 0);
                bishop.setName("bBishop 2");
                bBishop.add(bishop);
                field[5][0] = "bBishop 2";
            }


        }


        wHorse = new ArrayList<>();
        bHorse = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Horse horse = new Horse("white", 1, 7);
                horse.setName("wHorse 1");
                wHorse.add(horse);
                field[1][7] = "wHorse 1";
            } else if (i != 0) {
                Horse horse = new Horse("white", 6, 7);
                horse.setName("wHorse 2");
                wHorse.add(horse);
                field[6][7] = "wHorse 2";
            }
        }
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Horse horse = new Horse("black", 1, 0);
                horse.setName("bHorse 2");
                bHorse.add(horse);
                field[1][0] = "bHorse 1";
            } else if (i != 0) {
                Horse horse = new Horse("black", 6, 0);
                horse.setName("bHorse 2");
                bHorse.add(horse);
                field[6][0] = "bHorse 2";
            }
        }

        wRook = new ArrayList<>();
        bRook = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Rook rook = new Rook("white", 0, 7);
                rook.setName("wRook 1");
                wRook.add(rook);
                field[0][7] = "wRook 1";
            } else if (i != 0) {
                Rook rook = new Rook("white", 7, 7);
                rook.setName("wRook 2");
                wRook.add(rook);
                field[7][7] = "wRook 2";
            }
        }
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Rook rook = new Rook("black", 0, 0);
                rook.setName("bRook 1");
                bRook.add(rook);
                field[0][0] = "bRook 1";
            } else if (i != 0) {
                Rook rook = new Rook("black", 7, 0);
                rook.setName("bRook 2");
                bRook.add(rook);
                field[7][0] = "bRook 2";
            }
        }
    }


    public void display() {

        for (int i = 0; i < 8; i++) {
            System.out.print("|");
            for (int j = 0; j < 8; j++) {
                System.out.printf("%9s", field[j][i]);

                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public king getbKing() {
        return bKing;
    }

    public king getwKing() {
        return wKing;
    }

    public ArrayList<Bishop> getbBishop() {
        return bBishop;
    }

    public ArrayList<Bishop> getwBishop() {
        return wBishop;
    }

    public ArrayList<Horse> getbHorse() {
        return bHorse;
    }

    public ArrayList<Rook> getbRook() {
        return bRook;
    }

    public ArrayList<Rook> getwRook() {
        return wRook;
    }

    public Queen getwQueen() {
        return wQueen;
    }

    public Queen getbQueen() {
        return bQueen;
    }

    public ArrayList<Horse> getwHorse() {
        return wHorse;
    }

    public ArrayList<Pawn> getbPawn() {
        return bPawn;
    }

    public ArrayList<Pawn> getwPawn() {
        return wPawn;
    }

    public String[][] getField() {
        return field;
    }
}
