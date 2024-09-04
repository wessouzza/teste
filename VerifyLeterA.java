public class VerifyLetterA{
    public static void main(String[] args) {
      
        String stringExemplo = "O rato roeu a roupa do rei de Roma.";
        verifyLetter(stringExemplo);
    }

    public static void verifyLetter(String string) {
        String stringLower = string.toLowerCase();

        if (stringLower.contains("a")) {
            int quantity = 0;
            for (char c : stringLower.toCharArray()) {
                if (c == 'a') {
                    quantity++;
                }
            }
            System.out.println("A letra 'a' aparece " + quantity + " vezes.");
        } else {
            System.out.println("A letra 'a' não existe na string.");
        }
    }
}
