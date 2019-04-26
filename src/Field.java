import java.util.ArrayList;

public class Field {
    private int[][] field = new int[8][8];

    public void firstClip(int field[][]) {
        king wKing = new king("white", 4, 7);
        king bKing = new king("black", 4, 0);
        Queen wQueen = new Queen("white", 3, 7);
        Queen bQueen = new Queen("black", 3, 0);

        ArrayList<Pawn> wPawn = new ArrayList<>();
        ArrayList<Pawn> bPawn = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Pawn pawn = new Pawn("white", i, 6);
            wPawn.add(pawn);
        }
        for (int i = 0; i < 8; i++) {
            Pawn pawn = new Pawn("black", i, 1);
            bPawn.add(pawn);
        }

        ArrayList<Bishop> wBishop = new ArrayList<>();
        ArrayList<Bishop> bBishop = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Bishop bishop = new Bishop("white", 2, 7);
                wBishop.add(bishop);
            }
            else if (i != 0) {
                Bishop bishop = new Bishop("white", 5, 7);
                wBishop.add(bishop);
            }
        }

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Bishop bishop = new Bishop("black", 2, 0);
                bBishop.add(bishop);
            }
            else if (i != 0) {
                Bishop bishop = new Bishop("black", 5, 0);
                bBishop.add(bishop);
            }
        }


        ArrayList<Horse> wHorse = new ArrayList<>();
        ArrayList<Horse> bHorse = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Horse horse = new Horse("white",1,7 );
                wHorse.add(horse);
            }
            else if (i != 0) {
                Horse horse = new Horse("white",6, 7 );
                wHorse.add(horse);
            }
        }
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Horse horse = new Horse("black",1,0 );
                bHorse.add(horse);
            }
            else if (i != 0) {
                Horse horse = new Horse("black",6, 0 );
                bHorse.add(horse);
            }
        }

        ArrayList<Rook> wRook = new ArrayList<>();
        ArrayList<Rook> bRook = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Rook rook = new Rook("white",0, 7);
                wRook.add(rook);
            }
            else if (i != 0) {
                Rook rook = new Rook("white",7,7);
                wRook.add(rook);
            }
        }
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                Rook rook = new Rook("black",0, 0);
                bRook.add(rook);
            }
            else if (i != 0) {
                Rook rook = new Rook("black",7,0);
                bRook.add(rook);
            }
        }
    }

}
