package refactoring_tennisgame;

public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final int NUMBER_START = 1;
    public static final int NUMBER_THREE = 3;
    public static final int NUMBER_END = 4;
    public static final String ADVANTAGE_FIRST_PLAYER = "Advantage player1";
    public static final String ADVANTAGE_SECOND_PLAYER = "Advantage player2";
    public static final String WIN_FOR_FIRST_PLAYER = "Win for player1";
    public static final String WIN_FOR_SECOND_PLAYER = "Win for player2";

    public static String getScore(String firstPlayerName, String secondPlayerName, int theFirstPlayerScore, int secondPlayerScore) {
        String score = "";
        int tempScore = 0;
        if (theFirstPlayerScore == secondPlayerScore)
        {
            switch (theFirstPlayerScore)
            {
                case 0:
                    score = LOVE_ALL;
                    break;
                case 1:
                    score = FIFTEEN_ALL;
                    break;
                case 2:
                    score = THIRTY_ALL;
                    break;
                case 3:
                    score = FORTY_ALL;
                    break;
                default:
                    score = DEUCE;
                    break;

            }
        }
        else if (theFirstPlayerScore >= NUMBER_END || secondPlayerScore >= NUMBER_END)
        {
            int minusResult = theFirstPlayerScore - secondPlayerScore;
            if (minusResult == 1)
                score = ADVANTAGE_FIRST_PLAYER;
            else if (minusResult == -1)
                score = ADVANTAGE_SECOND_PLAYER;
            else if (minusResult >= 2)
                score = WIN_FOR_FIRST_PLAYER;
            else
                score = WIN_FOR_SECOND_PLAYER;
        }
        else
        {
            for (int i = NUMBER_START; i < NUMBER_THREE; i++)
            {
                if (i == 1) tempScore = theFirstPlayerScore;
                else
                {
                    score += "-";
                    tempScore = secondPlayerScore;
                }
                switch(tempScore)
                {
                    case 0:
                        score += LOVE;
                        break;
                    case 1:
                        score += FIFTEEN;
                        break;
                    case 2:
                        score += THIRTY;
                        break;
                    case 3:
                        score += FORTY;
                        break;
                }
            }
        }
        return score;
    }
}

