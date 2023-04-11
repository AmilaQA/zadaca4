public class Task3 {
    public boolean IsPalindrom(String word)
    {
        char[] wordArray = word.toCharArray();
        boolean isPalindrom = true;

        for (int i = 0, j = (wordArray.length - 1); i < (wordArray.length); i++, j--) {
            if (wordArray[i] != wordArray[j]) {
                isPalindrom = false;
                break;
            }
        }
        return isPalindrom;
    }

    public boolean IsDivisibleByNumber(int number, int divByNumber)
    {
        if (number%divByNumber == 0)
            return  true;
        else
            return false;
    }
}
