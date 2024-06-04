public class Main {
    public static void main(String[] args) {
   testMax();
   testToCharArray();
    }
    static void testToCharArray(){
        int[] array = {65, 66, 67};
        char[]  expected = {'A', 'B', 'C'};

        char[] actual = toCharArray(array);
        assertArrayEquals("#2", expected, actual);
    }
    static void assertArrayEquals(String testId, char [] actual, char[] expected){
        boolean isEqual = false;
        if (expected.length  == actual.length){
            isEqual = true;
            for (int i = 0; i < expected.length; i++) {
                if(expected[i] != actual[i]){
                    isEqual = false;
                    break;
                }

            }

        }
        if(isEqual){
            System.out.println("Test " + testId +  " passed");
        }else{
            System.out.println("Test " + testId + " Failed");
            System.out.println("Expected: "+ toString(expected));
            System.out.println(" actual: " + toString(actual));
        }
    }
    static String toString( char[] array){
        return new String(array);

    }
    static void testMax (){
        int expected = 7;
        int actual = max (5,7);
        assertEquals ("#1", expected, actual);
    }
    static void assertEquals (String testId, int expected, int actual){
        if (expected == actual){
            System.out.println("Test " + testId +  " passed");
        }else{
            System.out.println("Test " + testId + " Failed Expected: "
                    + expected + " Actual: " + actual);
        }
    }

    static char[] toCharArray (int[] array){
        char[] charArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            charArray[i] = (char) array[i];

        }
        return charArray;
    }
    static int max (int a, int b){
        return a > b ? a : b;
    }
}