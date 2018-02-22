public class test {
    public static void main(String[] args) {
        char[][] gameBox = getbox("easy");
    }

    public char[][] getbox(String difficulty) {

        char[][] box;
        if (difficulty.equals("easy"))

        {
            box = new char[7][7];
            box[0][0] = 'X';
            box[0][6] = 'X';
            box[6][0] = 'X';
            box[6][6] = 'X';
            for (int i = 1; i < 5; i++) {
                box[0][i] = '#';
            }

            for (int i = 1; i < 5; i++) {
                box[i][0] = '#';
            }

            for (int i = 1; i < 5; i++) {
                box[6][i] = '#';
            }

            for (int i = 1; i < 5; i++) {
                box[i][6] = '#';
            }

        } else if (difficulty.equals("medium"))

        {
            box = new char[9][9];
            box[0][0] = 'X';
            box[0][8] = 'X';
            box[8][0] = 'X';
            box[8][8] = 'X';
            for (int i = 1; i < 7; i++) {
                box[0][i] = '#';
            }

            for (int i = 1; i < 7; i++) {
                box[i][0] = '#';
            }

            for (int i = 1; i < 7; i++) {
                box[8][i] = '#';
            }

            for (int i = 1; i < 7; i++) {
                box[i][8] = '#';
            }

        } else if (difficulty.equals("hard"))

        {
            box = new char[11][11];
            box[0][0] = 'X';
            box[0][10] = 'X';
            box[10][0] = 'X';
            box[10][10] = 'X';
            for (int i = 1; i < 9; i++) {
                box[0][i] = '#';
            }

            for (int i = 1; i < 9; i++) {
                box[i][0] = '#';
            }

            for (int i = 1; i < 9; i++) {
                box[10][i] = '#';
            }

            for (int i = 1; i < 9; i++) {
                box[i][10] = '#';
            }

        }

        return box;
    }
}