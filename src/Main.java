public class Main {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;
    private static final int DEUCE_THRESHOLD = 4;

    private static boolean isAdvantageOrWin(int player1Score, int player2Score) {
        return player1Score >= DEUCE_THRESHOLD || player2Score >= DEUCE_THRESHOLD;
    }

    private static String getScoreName(int score) {
        switch(score) {
            case LOVE: return "Love";
            case FIFTEEN: return "Fifteen";
            case THIRTY: return "Thirty";
            case FORTY: return "Forty";
            default: return "";
        }
    }

    public static String getScore(int player1Score, int player2Score) {
        StringBuilder scoreBuilder = new StringBuilder();

        if (player1Score == player2Score) {
            switch (player1Score) {
                case LOVE: scoreBuilder.append("Love-All"); break;
                case FIFTEEN: scoreBuilder.append("Fifteen-All"); break;
                case THIRTY: scoreBuilder.append("Thirty-All"); break;
                case FORTY: scoreBuilder.append("Forty-All"); break;
                default: scoreBuilder.append("Deuce"); break;
            }
        }
        else if (isAdvantageOrWin(player1Score, player2Score)) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) scoreBuilder.append("Advantage player1");
            else if (minusResult == -1) scoreBuilder.append("Advantage player2");
            else if (minusResult >= 2) scoreBuilder.append("Win for player1");
            else scoreBuilder.append("Win for player2");
        }
        else {
            scoreBuilder.append(getScoreName(player1Score))
                    .append("-")
                    .append(getScoreName(player2Score));
        }
        return scoreBuilder.toString();
    }
}