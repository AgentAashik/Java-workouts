public class MutableStringWorkout {
    public static void main(String[] args) {
        System.out.println("=== StringBuffer Example ===");
        StringBuffer bf = new StringBuffer("Java");
        bf.append(" Assistant");
        System.out.println(bf);
        bf.insert(6, "Super ");
        System.out.println(bf);
        bf.delete(6, 12);
        System.out.println(bf);
        bf.deleteCharAt(7);
        System.out.println(bf);
        bf.replace(5, 9, "Helper");
        System.out.println(bf);

        System.out.println("\n=== StringBuilder Example ===");
        StringBuilder sb = new StringBuilder("Java Coding");
        int capacity = sb.capacity();
        sb.setCharAt(2, 'X');
        System.out.println(sb);
        System.out.println(capacity);

        System.out.println("\n=== Vowel and Consonant Counting ===");
        String s = "IntelliJ";
        int vowelsCount = 0, consonant = 0;
        String vowels = "aeiouAEIOU";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) vowelsCount++;
                else consonant++;
            }
        }
        System.out.println(vowelsCount);
        System.out.println(consonant);

        System.out.println("\n=== Palindrome Check ===");
        StringBuilder text = new StringBuilder("Racecar");
        String copyText = new String(text);
        String reversedString = new String(text.reverse());
        String result = (copyText.equalsIgnoreCase(reversedString)) ? "Palindrome" : "Non-Palindrome";
        System.out.println("'" + copyText + "' is " + result);
    }
}
