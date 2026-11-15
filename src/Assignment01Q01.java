public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String word : args) {
            char first = word.charAt(0);
            int value = (int) first; 
            if (value%5 == 0) {
            System.out.println(first); 
            }
        }

    }
}
