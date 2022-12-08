//The time complexity is O2n because it will constantly run.

public class charactercount {
    public static void main(String[] args) {
        char[] test = {'a', 'b', 'a', 'c', 'd', 'a', 'e', 'a', 'f', 'g', 'h', 'a', 'i', 'e'};
        System.out.println("The character 'a' appears" + charCount(test,0,'a')+ "times.");
    }

    public static int charCount(char[] array, int start, char ch) {
        int numChars= 0;
        if(start == (array.length)){
            return 0;
        }
        else{
            if(array[start] == ch)
                numChars = 1;
                return numChars + charCount(array, start +1, ch);

        }
    }
}
