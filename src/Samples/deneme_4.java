package Samples;

public class deneme_4 {
    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling its name
    private String vowelsOnly(String s1) {
        String word = s1.replaceAll("[aeiouAEOIU]", "");
        return word;
    }

    public static void main(String[] args) {
        deneme_4 obj = new deneme_4();
        String result = obj.vowelsOnly("Pneumonoultramicroscopicsilicovolcanoconiosis");
        System.out.println(result);
    }
}

