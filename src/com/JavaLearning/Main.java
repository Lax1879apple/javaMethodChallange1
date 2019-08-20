package com.JavaLearning;

public class Main {

    public static void main(String[] args) {


        int  highScorePosition = calculateHighScorePosition(1500);
         calculateHighScorePosition("Laxu", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        calculateHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        calculateHighScorePosition("Shyam", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        calculateHighScorePosition("HariRam", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Mike", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Harish", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + "managed to get into position " + highScorePosition + "on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
//        if(playerScore >= 100){
//            return 1;
//        } else if(playerScore >= 500 ){
//            return 2;
//        } else if(playerScore >= 100 ){
//            return 3;
//        }else {
//            return 4;
//        }
        int position = 4;
        if(playerScore >= 1000){
            position = 1;
        } else if(playerScore >= 500){
            position = 2;
        } else if(playerScore >= 100){
            position = 3;
        }
        return position;
    }

    }



