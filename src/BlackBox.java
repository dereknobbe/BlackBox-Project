/**
 * Created by Sripath Mishra on 9/8/2017.
 *
 */
import java.util.*;
public class BlackBox {
    public static char box[][]; // The matrix for the game.
    public static int size;       // to store the number of rows and columns.
    public static int numball;
    public static int numlink;
    public static boolean end;
    public static int score;
    public static int high_score = -1;
    /**
     * The default constructor which places default values to the class variables
     */
    public BlackBox()
    {
        this.box = new char[0][0];
        this.size = 0;
        this.numball = 0;
        this.numlink = 0;
        this.end = false;
        this.score = 0;
    }
    /**
     * The parameterized constructor which places values to the class variables
     */
    public BlackBox(int size, int numball, int numlink, boolean end, int score)
    {
        this.box = new char[size][size];
        this.size = size;
        this.numball = numball;
        this.numlink = numlink;
        this.end = end;
        this.score = score;
    }
    /**
     * The main function takes input for the difficulty level and call the functions initialize(int) and
     * playgame()
     */
 /*   public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String difficulty = scan.nextLine();
        //Todo:start the game print the welcome message and ask for correct difficulty level.
        //Todo: end the game if the user says quit.


        //Todo:call the functions initialize and playgame()
        // Todo: take care of high score
    } */
    /**
     * The initialize funtion
     */
    public void initialize(String difficulty) {
        //Todo:initialise the Box[][]
        //Todo: place the 'X' and the '#'
        // Todo: place 3 '0''s randomly.
        numball = 3;
        if (difficulty.equals("easy")) {

            box[0][0] = 'X';
            box[0][6] = 'X';
            box[6][0] = 'X';
            box[6][6] = 'X';
            for (int i = 1; i < 6; i++) {
                box[0][i] = '#';
            }

            for (int i = 1; i < 6; i++) {
                box[i][0] = '#';
            }

            for (int i = 1; i < 6; i++) {
                box[i][6] = '#';
            }

            for (int i = 1; i < 6; i++) {
                box[6][i] = '#';
            }
            for (int i = 1; i < 6; i++) {

                for (int j = 1; j < 6; j++) {
                    box[i][j] = ' ';
                }
            }
            randomBalls(difficulty);
        }

        else if (difficulty.equals("medium")) {
            box[0][0] = 'X';
            box[0][8] = 'X';
            box[8][0] = 'X';
            box[8][8] = 'X';
            for (int i = 1; i < 8; i++) {
                box[0][i] = '#';
            }

            for (int i = 1; i < 8; i++) {
                box[i][0] = '#';
            }

            for (int i = 1; i < 8; i++) {
                box[i][8] = '#';
            }

            for (int i = 1; i < 8; i++) {
                box[8][i] = '#';
            }
            for (int i = 1; i < 8; i++) {

                for (int j = 1; j < 8; j++) {
                    box[i][j] = ' ';
                }
            }
            randomBalls(difficulty);
        }

        else if (difficulty.equals("hard")) {
            box[0][0] = 'X';
            box[0][10] = 'X';
            box[10][0] = 'X';
            box[10][10] = 'X';
            for (int i = 1; i < 10; i++) {
                box[0][i] = '#';
            }

            for (int i = 1; i < 10; i++) {
                box[i][0] = '#';
            }

            for (int i = 1; i < 10; i++) {
                box[i][10] = '#';
            }

            for (int i = 1; i < 10; i++) {
                box[10][i] = '#';
            }
            for (int i = 1; i < 10; i++) {

                for (int j = 1; j < 10; j++) {
                    box[i][j] = ' ';
                }
            }
            randomBalls(difficulty);
        }
    }
    /**
     * The printbox funtion prints out the matrix in a particular format as given in the handout.
     */
    public static void printbox() {
        //Todo:print the box in the correct order
        // for  5*5 example
        /* 1  2  3  4  5  6  7
         ======================
        1|X |# |# |# |# |# |X |
        2|# |  |  |  |  |  |# |
        3|# |  |  |  |  |  |# |
        4|# |  |  |  |  |  |# |
        5|# |  |  |  |  |  |# |
        6|# |  |  |  |  |  |# |
        7|X |# |# |# |# |# |X |
         ======================*/
        //place the guesses as the come and print the balls when the player enter sumbit.
if (box.length == 7) {
    System.out.print("  1  2  3  4  5  6  7");
    System.out.println();
    System.out.print("  ======================");
    System.out.println();
}
else if (box.length == 9) {
    System.out.print("  1  2  3  4  5  6  7  8  9");
    System.out.println();
    System.out.print("  ===========================");
    System.out.println();
}
else if (box.length == 11) {
    System.out.print("  1  2  3  4  5  6  7  8  9  10  11");
    System.out.println();
    System.out.print("  ===================================");
    System.out.println();
}
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box.length; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("1");
                }
                else if (i == 1 && j == 0) {
                    System.out.print("2");
                }
                else if (i == 2 && j == 0) {
                    System.out.print("3");
                }
                else if (i == 3 && j == 0) {
                    System.out.print("4");
                }
                else if (i == 4 && j == 0) {
                    System.out.print("5");
                }
                else if (i == 5 && j == 0) {
                    System.out.print("6");
                }
                else if (i == 6 && j == 0) {
                    System.out.print("7");
                }
                else if (i == 7 && j == 0) {
                    System.out.print("8");
                }
                else if (i == 8 && j == 0) {
                    System.out.print("9");
                }
                else if (i == 9 && j == 0) {
                    System.out.print("10");
                }
                else if (i == 10 && j == 0) {
                    System.out.print("11");
                }
                else if (i == 11 && j == 0) {
                    System.out.print("12");
                }

                if (j == 0) {
                    System.out.print(" |");
                }
                if (box[i][j] == '0'){
                    System.out.print("  |");
                }
                else {
                    System.out.print(box[i][j] + " |");
                }
            }
            System.out.println();

        }

        if (box.length == 7) {
            System.out.print("  ======================");
        }
        else if (box.length == 9) {
            System.out.print("  ===========================");
        }
        else if (box.length == 11) {
            System.out.print("  ===================================");

        }
    }
    /**
     * The randomBalls method places random balls based on the difficulty. It is called inside the intiitalize
     * fucntion
     */
    private static void randomBalls(String difficulty) {
        int bound = 0;
        if (difficulty.equals("easy")) {
            bound = 5;
        }
        else if (difficulty.equals("medium")) {
            bound = 7;
        }
        else if (difficulty.equals("hard")) {
            bound = 9;
        }

        // Making random ball placements
        Random rand = new Random();
        int ballOneX = rand.nextInt(bound) + 1;
        int ballOneY = rand.nextInt(bound) + 1;
        int ballTwoX = rand.nextInt(bound) + 1;
        int ballTwoY = rand.nextInt(bound) + 1;
        int ballThreeX = rand.nextInt(bound) + 1;
        int ballThreeY = rand.nextInt(bound) + 1;
        // Making sure there are no duplicate balls
        while (ballOneX == ballTwoX && ballOneY == ballTwoY || ballOneX == ballThreeX && ballOneY == ballThreeY || ballTwoX == ballThreeX && ballTwoY == ballThreeY) {
            ballOneX = rand.nextInt(bound) + 1;
            ballOneY = rand.nextInt(bound) + 1;
            ballTwoX = rand.nextInt(bound) + 1;
            ballTwoY = rand.nextInt(bound) + 1;
            ballThreeX = rand.nextInt(bound) + 1;
            ballThreeY = rand.nextInt(bound) + 1;
        }
        box[ballOneX][ballOneY] = '0';
        box[ballTwoX][ballTwoY] = '0';
        box[ballThreeX][ballThreeY] = '0';
    }
    /**
     * The playgame funtion opens the first cell and is the main controller for the game. It calls various function when needed.
     */
    public static void playgame() {
        //Todo:Take input of a guess or hint from the user.
        //Todo:Check for valid input
        //Todo:call required functions
        //Todo:keep tab on score.
    }
    /**
     * The check funtion takes in the row and column in the matrix, checks for Hit (H), Reflection (R) or Divergence(#num)
     *
     */
    public static void check(int i,int j) {
        //Todo:place a guess when the input of i and j are valid
        if (placeBall(i,j)) {
            box[i][j] = '*';
        }
        //Todo:Check for a Hit
        if (hitcheck(i,j)) {

        }8
        //Todo:Check for a reflection
        if (reflectionCheck(i,j)) {

        }
        //Todo:Check for a bounce
        //Todo:Print a statement telling the user they cannot place a fourth ball.
        if (numball == 0) {
            System.out.println("You have placed the maximum number of balls (3). You are out of guesses.");
        }
    }
    /** The placeball method checks if a guess ball can be placed at a given row and column. Returns
     * false if a ball is already there, else returns true.
     */
    public static boolean placeBall(int i, int j){
        i = i--;
        j = j--;
        if (i < 0 || i > box.length - 1 || j < 0 || j > box.length - 1) {
            return false;
        }

        else if (box[i][j] == '*') {
            return false;
        }
        else {
            numball--;
            return true;
        }
    }

    /**
     * The hitcheck funtion takes in the row and column in the matrix, checks for Hit (H)
     *
     */
    public static boolean hitcheck(int i,int j) {
        //todo: check if the ray causes a HIT as defined in the handout
        i--;
        j--;

        if (i == 0 || i == box.length - 1) {
            int checkIt = 0;
            for (int k = 1; k < box.length - 1; k++) {
                if (box[k][j] == '0') {
                    checkIt++;
                }
            }
            if (checkIt > 0) {
                box[i][j] = 'H';
                return true;
            }
        }
        else if (j == 0 || j == box.length - 1) {
            int checkIt = 0;
            for (int k = 1; k < box.length - 1; k++) {
                if (box[i][k] == '0') {
                    checkIt++;
                }
            }
            if (checkIt > 0) {
                box[i][j] = 'H';
                return true;
            }
        }
        return false;
    }
    /**
     * The check funtion takes in the row and column in the matrix, checks for Reflection (R)
     *
     */
    public static boolean reflectionCheck(int i,int j) {
        //todo: check if the ray causes a Reflection as defined in the handout
        i--;
        j--;

        if (i == 0) {
           if (box[i+1][j+1] == '0' || box[i+1][j-1] == '0') {
               box[i][j] = 'R';
               return true;
           }
           else {
               for (int k = 1; k < box.length; k++) {
                   if (box[k][j-1] == '0' && box[k][j+1] == '0') {
                       box[i][j] = 'R';
                       return true;
                   }
               }
           }
        }
        else if (i == box.length - 1) {
            if (box[i-1][j+1] == '0' || box[i-1][j-1] == '0') {
                box[i][j] = 'R';
                return true;
            }
            else {
                for (int k = box.length - 1; k > 0; k--) {
                    if (box[k][i+1] == '0' && box[k][i-1] == '0') {
                        box[i][j] = 'R';
                        return true;
                    }
                }
            }
        }
        else if (j == 0) {
            if (box[i-1][j+1] == '0' || box[i+1][j+1] == '0') {
                box[i][j] = 'R';
                return true;
            }
            else {
                for (int k = 1; k < box.length; k++) {
                    if (box[i+1][k] == '0' && box[i-1][k] == '0') {
                        box[i][j] = 'R';
                        return true;
                    }
                }
            }
        }
        else if (j == box.length-1) {
            if (box[i-1][j-1] == '0' || box[i+1][j-1] == '0') {
                box[i][j] = 'R';
                return true;
            }
            else {
                for (int k = box.length - 1; k > 0; k--) {
                    if (box[i+1][k] == '0' && box[i-1][k] == '0') {
                        box[i][j] = 'R';
                        return true;
                    }
                }
            }
        }
        return false;
    }
    /**
     * The check funtion takes in the row and column in the matrix, checks for Divergence(#num)
     *
     */
    public boolean deflectionCheck(int i,int j) {
        //todo: check if the ray causes a Deflection as defined in the handout
        i--;
        j--;
        int indexOfDeflection = 0;
        // To do Make case exceptions (if on this side, go that way, other side go that way)!!
        if ((i != 0 || j != 0) && (i != 0 || j != box.length - 1) && (i != box.length - 1 || j != box.length - 1) && (i != box.length - 1 || j != 0)) {
            if (i == 0) {
                for (int k = 1; k < box.length - 1; k++) {
                    if (box[k][j + 1] == '0'){
                        box[i][j] = (char) +('0' + numlink);
                        indexOfDeflection = k;
                        numlink++;
                        return true;
                    }
                    if (box[k][j-1] == '0') {
                        indexOfDeflection = k;
                        return true;
                    }
                }
            } else if (i == box.length - 1) {
                for (int k = box.length; k > 0; k--) {
                    if (box[k][j + 1] == '0' || box[k][j - 1] == '0') {
                        box[i][j] = (char) +('0' + numlink);
                        indexOfDeflection = k;
                        numlink++;
                        return true;
                    }
                    if (box[k][j-1] == '0') {
                        indexOfDeflection = k;
                    }
                }
            }else if (j == 0) {
                for (int k = 1; k < box.length; k++) {
                    if (box[i+1][k] == '0'){
                        box[i][j] = (char) +('0' + numlink);
                        indexOfDeflection = k;
                        numlink++;
                        return true;
                    }
                    if (box[i-1][k] == '0') {
                        indexOfDeflection = k;
                        numlink++;
                        return true;
                    }
                }
            }
            else if (j == box.length - 1) {
                for (int k = box.length; k > 0; k--) {
                    if (box[i+1][k] == '0'){
                        box[i][j] = (char) +('0' + numlink);
                        indexOfDeflection = k;
                        numlink++;
                        return true;
                    }
                    if (box[i-1][k] == '0') {
                        indexOfDeflection = k;
                        numlink++;
                        return true;
                    }
                }
            }

        }
        return false;
    }
    /**
     * The straightRay funtion takes in the row and column in the matrix, checks for Straight ray
     *
     */
    public boolean straightRay(int i,int j){
        //todo: check if the ray is a straight ray as defined in the handout
        i--;
        j--;
        if ((i != 0 || j != 0) && (i != 0 || j != box.length - 1) && (i != box.length - 1 || j != box.length - 1) && (i != box.length - 1 || j  != 0)) {
            if (i == 0 || i == box.length - 1) {
                int checkIt = 0;
                for (int k = 1; k < box.length - 1; k++) {
                    if (box[k][j] == '0') {
                        checkIt++;
                    }
                }
                if (checkIt == 0) {
                    numlink++;
                    box[i][j] = (char) ('0' + numlink);
                    return true;
                }
            } else if (j == 1 || j == box.length - 1) {
                int checkIt = 0;
                for (int k = 1; k < box.length - 1; k++) {
                    if (box[i][k] == '0') {
                        checkIt++;
                    }
                }
                if (checkIt == 0) {
                    numlink++;
                    box[i][j] = (char) ('0' + numlink);
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * The following definitions are the getters and setter functions which have to be implemented
     *
     */
    public char[][] getbox() {

        return  box;
    }
    public int getscore() {
        return  10;

    }
    public int getNumball() {
        return  10;
    }
    public int getNumlink() {
        return  10;
    }
    public boolean getend() {
        return  true;
    }
    public void setbox(char box[][]) {

    }
    public void setSize(int size){
        this.size = size;
    }
    public void setNumball(int Numball) {
        this.numball = Numball;

    }
    public void setNumlink(int Numlink) {
        this.numlink = Numlink;
    }
    public void setEnd(boolean end) {
        this.end = end;
    }
    public void setScore(int score) {
        this.score = score;
    }
}