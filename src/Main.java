public class Main {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;
    private static final int DEUCE_THRESHOLD = 4;

    public static String getScore(int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;

        if (player1Score == player2Score) {
            switch (player1Score) {
                case LOVE: score = "Love-All"; break;
                case FIFTEEN: score = "Fifteen-All"; break;
                case THIRTY: score = "Thirty-All"; break;
                case FORTY: score = "Forty-All"; break;
                default: score = "Deuce"; break;
            }
        }
        else if (player1Score >= DEUCE_THRESHOLD || player2Score >= DEUCE_THRESHOLD) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        }
        else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else { score += "-"; tempScore = player2Score; }
                switch(tempScore) {
                    case LOVE: score += "Love"; break;
                    case FIFTEEN: score += "Fifteen"; break;
                    case THIRTY: score += "Thirty"; break;
                    case FORTY: score += "Forty"; break;
                }
            }
        }
        return score;
    }
}