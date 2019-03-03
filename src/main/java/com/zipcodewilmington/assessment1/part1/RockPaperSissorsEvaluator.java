package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        if (handSign == this.ROCK){
            return this.PAPER;
        }else if(handSign == this.PAPER){
            return this.SCISSOR;
        }
        else if(handSign == this.SCISSOR) {
            return this.ROCK;
        }
        return null;


    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if (handSign == this.ROCK){
            return this.SCISSOR;
        }else if(handSign == this.PAPER){
            return this.ROCK;
        }
        else if(handSign == this.SCISSOR) {
            return this.PAPER;
        }
        return null;


    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        if (handSignOfPlayer1 == getWinningMove(handSignOfPlayer2)){
            return handSignOfPlayer1;


        }else if (handSignOfPlayer1 == getLosingMove(handSignOfPlayer2)){
            return handSignOfPlayer2;
        }
        return null;
    }
}
