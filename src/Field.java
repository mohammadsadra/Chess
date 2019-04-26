import java.util.ArrayList;

public class Field {
    private String[][] field = new String[8][8];


    public Field() {
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                field[i][j] = " ";
            }

        }

        king wKing = new king("white", 4, 7);
        king bKing = new king("black", 4, 0);
        field[4][7] = "wKing";
        field[4][0] = "bKing";

        Queen wQueen = new Queen("white", 3, 7);
        Queen bQueen = new Queen("black", 3, 0);
        field[3][7] = "wQueen";
        field[3][0] = "bQueen";

        ArrayList<Pawn> wPawn = new ArrayList<>();
        ArrayList<Pawn> bPawn = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Pawn pawn = new Pawn("white", i, 6);
            wPawn.add(pawn);
            field[i][6] = "wPawn " + (i+1);
        }
        for (int i = 0; i < 8; i++) {
            Pawn pawn = new Pawn("black", i, 1);
            bPawn.add(pawn);
            field[i][1] = "bPawn " + (i+1);
        }

        ArrayList<Bishop> wBishop = new ArrayList<>();
        ArrayList<Bishop> bBishop = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Bishop bishop = new Bishop("white", 2, 7);
                wBishop.add(bishop);
                field[2][7] = "wBishop 1";
            } else if (i != 0) {
                Bishop bishop = new Bishop("white", 5, 7);
                wBishop.add(bishop);
                field[5][7] = "wBishop 2";
            }
        }

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Bishop bishop = new Bishop("black", 2, 0);
                bBishop.add(bishop);
                field[2][0] = "bBishop 1";
            } else if (i != 0) {
                Bishop bishop = new Bishop("black", 5, 0);
                bBishop.add(bishop);
                field[5][0] = "bBishop 2";
            }


        }


        ArrayList<Horse> wHorse = new ArrayList<>();
        ArrayList<Horse> bHorse = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Horse horse = new Horse("white", 1, 7);
                wHorse.add(horse);
                field[1][7] = "wHorse 1";
            } else if (i != 0) {
                Horse horse = new Horse("white", 6, 7);
                wHorse.add(horse);
                field[6][7] = "wHorse 2";
            }
        }
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Horse horse = new Horse("black", 1, 0);
                bHorse.add(horse);
                field[1][0] = "bHorse 1";
            } else if (i != 0) {
                Horse horse = new Horse("black", 6, 0);
                bHorse.add(horse);
                field[6][0] = "bHorse 2";
            }
        }

        ArrayList<Rook> wRook = new ArrayList<>();
        ArrayList<Rook> bRook = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Rook rook = new Rook("white", 0, 7);
                wRook.add(rook);
                field[0][7] = "wRook 1";
            } else if (i != 0) {
                Rook rook = new Rook("white", 7, 7);
                wRook.add(rook);
                field[7][7] = "wRook 2";
            }
        }
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Rook rook = new Rook("black", 0, 0);
                bRook.add(rook);
                field[0][0] = "bRook 1";
            } else if (i != 0) {
                Rook rook = new Rook("black", 7, 0);
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
    }

}
