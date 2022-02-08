import java.util.ArrayList;

public class Digits
{
    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * PRECONDITION: num >= 0
     */
    public Digits(int num)
    {
        digitList = new ArrayList<>();
        String numString = String.valueOf(num);
        for(int i = 0; i < numString.length(); i++){
            int numInt = Integer.valueOf(numString.substring(i, i + 1));
            digitList.add(numInt);
        }
    }

    // GETTER METHOD: added to enable test code (not provided in original FRQ)
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing()
    {
        for(int i = 0; i < digitList.size() - 1; i++){
            if(digitList.get(i) >= digitList.get(i + 1)){
                return false;
            }
        }
        return true;
    }
}
