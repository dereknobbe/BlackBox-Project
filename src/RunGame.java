import java.util.Scanner;

public class RunGame {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String difficulty = scan.nextLine();
        //Todo:start the game print the welcome message and ask for correct difficulty level.
        System.out.println("Welcome to the Blackbox Game. Please choose the difficulty level:easy/medium/hard or quit to end the game");
        //Todo: end the game if the user says quit.
        difficulty = scan.nextLine();
        while (!difficulty.equals("quit") && !difficulty.equals("easy") && !difficulty.equals("medium") && !difficulty.equals("hard")){
            System.out.println("Please enter a valid choice.");
            difficulty = scan.nextLine();
        }
        if (difficulty.equals("quit")) {
            System.exit(1);
        }
        else {
            if (difficulty.equals("easy")) {
                while (difficulty.equals("easy")) {
                    BlackBox game = new BlackBox(7, 3, 0, true, 1);
                    game.initialize(difficulty);
                    game.printbox();
                    System.out.println();
                    System.out.println("PlaceBall Method Tests");
                    System.out.print(game.placeBall(3,3));
                    System.out.print(game.placeBall(4,3));
                    System.out.print(game.placeBall(7,3));
                    System.out.print(game.placeBall(1,3));
                    System.out.print(game.placeBall(0,3));
                    System.out.print(game.placeBall(12,3));
                    System.out.print(game.placeBall(5,2));
                    System.out.print(game.placeBall(5,0));
                    System.out.print(game.placeBall(0,0));
                    System.out.println();
                    System.out.println("HitCheck Method Tests");
                    System.out.print(game.hitcheck(2,7)); System.out.print(game.box[4][0]);
                    System.out.println();
                    System.out.print(game.hitcheck(3,7)); System.out.print(game.box[4][0]);
                    System.out.println();
                    System.out.print(game.hitcheck(4,7)); System.out.print(game.box[4][0]);
                    System.out.println();
                    System.out.print(game.hitcheck(5,7)); System.out.print(game.box[4][0]);
                    System.out.println();
                    System.out.print(game.hitcheck(6,7)); System.out.print(game.box[4][0]);
                    System.out.println();
                    System.out.println("ReflectionCheck Method Tests");
                    System.out.print(game.reflectionCheck(2,7));
                    System.out.println();
                    System.out.print(game.reflectionCheck(3,7));
                    System.out.println();
                    System.out.print(game.reflectionCheck(4,7));
                    System.out.println();
                    System.out.print(game.reflectionCheck(5,7));
                    System.out.println();
                    System.out.print(game.reflectionCheck(6,7));
                    System.out.println();
                    System.out.print(game.reflectionCheck(3,7));
                    System.out.println(game.straightRay(1,1));
                    System.out.println();
                    System.out.println(game.straightRay(1,2));
                    System.out.println();
                    System.out.println(game.straightRay(1,3));
                    System.out.println();
                    System.out.println(game.straightRay(1,4));
                    System.out.println();
                    System.out.println(game.straightRay(1,5));

                    for (int i = 0; i < game.box.length; i++) {
                        for (int j = 0; j < game.box.length; j++) {
                            System.out.print(game.box[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    game.printbox();
                    difficulty = scan.nextLine();
                    difficulty = scan.nextLine();
                }
            }
            else if (difficulty.equals("medium")) {
                while (difficulty.equals("medium")) {
                    BlackBox game = new BlackBox(9, 3, 0, true, 1);
                    game.initialize(difficulty);
                    game.printbox();
                    difficulty = scan.nextLine();
                }
            }
            else if (difficulty.equals("hard")) {
                while (difficulty.equals("hard")) {
                    BlackBox game = new BlackBox(11, 3, 0, true, 1);
                    game.initialize(difficulty);
                    game.printbox();
                    System.out.print(game.placeBall(3,3));
                    System.out.print(game.placeBall(4,3));
                    System.out.print(game.placeBall(7,3));
                    System.out.print(game.placeBall(1,3));
                    System.out.print(game.placeBall(0,3));
                    System.out.print(game.placeBall(12,3));
                    System.out.print(game.placeBall(5,2));
                    System.out.print(game.placeBall(5,0));
                    System.out.print(game.placeBall(0,0));
                    difficulty = scan.nextLine();
                }
            }

        }

        //Todo:call the functions initialize and playgame()
        // Todo: take care of high score
    }
}
