/**
 * Created by Sripath Mishra on 9/8/2017.
 *
 */
import java.util.Scanner;
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
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String difficulty = scan.nextLine();
        //Todo:start the game print the welcome message and ask for correct difficulty level.
        System.out.println("Welcome to the Blackbox Game. Please choose the difficulty level:easy/medium/hard or quit to end the game");
        //Todo: end the game if the user says quit.
        while (!difficulty.equals("quit") && !difficulty.equals("easy") && !difficulty.equals("medium") && !difficulty.equals("hard")){
            System.out.println("Please enter a valid choice.");
        }
        if (difficulty.equals("quit")) {
            System.exit(1);
        }
        else if {

        }
        else if {

        }
        else if {

        }
        //Todo:call the functions initialize and playgame()
        // Todo: take care of high score
    }
    /**
     * The initialize funtion
     */
    public void initialize() {
        //Todo:initialise the Box[][]
        //Todo: place the 'X' and the '#'
        // Todo: place 3 '0''s randomly.
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
        //Todo:Check for a Hit
        //Todo:Check for a reflection
        //Todo:Check for a bounce
        //Todo:Print a statement telling the user they cannot place a fourth ball.
    }
    /**
     * The hitcheck funtion takes in the row and column in the matrix, checks for Hit (H)
     *
     */
    public boolean hitcheck(int i,int j) {
        //todo: check if the ray causes a HIT as defined in the handout
    }
    /**
     * The check funtion takes in the row and column in the matrix, checks for Reflection (R)
     *
     */
    public boolean reflectionCheck(int i,int j) {
        //todo: check if the ray causes a Reflection as defined in the handout
    }
    /**
     * The check funtion takes in the row and column in the matrix, checks for Divergence(#num)
     *
     */
    public boolean deflectionCheck(int i,int j) {
        //todo: check if the ray causes a Deflection as defined in the handout
    }
    /**
     * The straightRay funtion takes in the row and column in the matrix, checks for Straight ray
     *
     */
    public boolean straightRay(int i,int j){
        //todo: check if the ray is a straight ray as defined in the handout
    }
    /**
     * The following definitions are the getters and setter functions which have to be implemented
     *
     */
    public char[][] getbox(String difficulty) {
        char[][] box;
        if (difficulty.equals("easy")) {
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

        }
        else if (difficulty.equals("medium")) {
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

        }
        else if (difficulty.equals("hard")) {
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

        return  box;
    }
    public int getscore() {

    }
    public int getNumball() {

    }
    public int getNumlink() {

    }
    public boolean getend() {

    }
    public void setbox(char box[][]) {

    }
    public void setSize(int size){
    }
    public void setNumball(int Numball) {

    }
    public void setNumlink(int Numlink) {

    }
    public void setEnd(boolean end) {

    }
    public void setScore(int score) {

    }
}