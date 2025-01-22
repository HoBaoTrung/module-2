package Refactoring;
public class TennisGame {

    private static final String LOVE = "Love";
    private static final String FIFTEEN = "Fifteen";
    private static final String THIRTY = "Thirty";
    private static final String FORTY = "Forty";
    private static final String LOVE_ALL = "Love-All";
    private static final String FIFTEEN_ALL = "Fifteen-All";
    private static final String THIRTY_ALL = "Thirty-All";
    private static final String FORTY_ALL = "Forty-All";
    private static final String DEUCE = "Deuce";
    private static final String ADVANTAGE_PLAYER1 = "Advantage player1";
    private static final String ADVANTAGE_PLAYER2 = "Advantage player2";
    private static final String WIN_FOR_PLAYER1 = "Win for player1";
    private static final String WIN_FOR_PLAYER2 = "Win for player2";

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return getEqualScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            return getAdvantageOrWin(player1Score, player2Score);
        } else {
            return getStandardScore(player1Score, player2Score);
        }
    }

    private static String getEqualScore(int score) {
        switch (score) {
            case 0: return LOVE_ALL;
            case 1: return FIFTEEN_ALL;
            case 2: return THIRTY_ALL;
            case 3: return FORTY_ALL;
            default: return DEUCE;
        }
    }

    private static String getAdvantageOrWin(int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) {
            return ADVANTAGE_PLAYER1;
        } else if (scoreDifference == -1) {
            return ADVANTAGE_PLAYER2;
        } else if (scoreDifference >= 2) {
            return WIN_FOR_PLAYER1;
        } else {
            return WIN_FOR_PLAYER2;
        }
    }

    private static String getStandardScore(int player1Score, int player2Score) {
        return getScoreDescription(player1Score) + "-" + getScoreDescription(player2Score);
    }

    private static String getScoreDescription(int score) {
        switch (score) {
            case 0: return LOVE;
            case 1: return FIFTEEN;
            case 2: return THIRTY;
            case 3: return FORTY;
            default: return "";
        }
    }
}
