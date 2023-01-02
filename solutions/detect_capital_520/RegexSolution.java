package detect_capital_520;

public class RegexSolution {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]*|.[a-z]*");
    }
}
