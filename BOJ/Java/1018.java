import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        String[] board = new String[m];

        for(int i = 0;i < m;i++) {
            board[i] = input.next();
        }

        int minCount = 64;

        for(int i = 0;i < m - 7;i++) {
            for(int j = 0;j < n - 7;j++) {

                if(checkBoardB(board, i, j) >= checkBoardW(board, i, j)) {
                    if(minCount >= checkBoardW(board, i, j)) {
                        minCount = checkBoardW(board, i, j);
                    }
                }
                else {
                    if(minCount >= checkBoardB(board, i, j)) {
                        minCount = checkBoardB(board, i, j);
                    }
                }
            }
        }

        System.out.print(minCount);
    }

    private static int checkBoardB(String[] board, int m, int n) {

        int count = 0;

        for(int i = 0;i < 8;i++) {
            for(int j = 0;j < 8;j++) {
                if(i % 2 == 0) {
                    if(j % 2 == 0) {
                        if (board[i + m].charAt(j + n) == 'W') {
                            count++;
                        }
                    }
                    else {
                        if(board[i + m].charAt(j + n) == 'B') {
                            count++;
                        }
                    }
                }
                else {
                    if(j % 2 == 0) {
                        if (board[i + m].charAt(j + n) == 'B') {
                            count++;
                        }
                    }
                    else {
                        if(board[i + m].charAt(j + n) == 'W') {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

    private static int checkBoardW(String[] board, int m, int n) {

        int count = 0;

        for(int i = 0;i < 8;i++) {
            for(int j = 0;j < 8;j++) {
                if(i % 2 == 0) {
                    if(j % 2 == 0) {
                        if (board[i + m].charAt(j + n) == 'B') {
                            count++;
                        }
                    }
                    else {
                        if(board[i + m].charAt(j + n) == 'W') {
                            count++;
                        }
                    }
                }
                else {
                    if(j % 2 == 0) {
                        if (board[i + m].charAt(j + n) == 'W') {
                            count++;
                        }
                    }
                    else {
                        if(board[i + m].charAt(j + n) == 'B') {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}