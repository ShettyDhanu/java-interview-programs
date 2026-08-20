class Palindrome {

    public static void main(String[] args) {

        String text = "madam";
        String Rev = "";

        for (int i = 0; i < text.length(); i++) {
            Rev = text.charAt(i) + Rev;
        }

        if (text.equals(Rev)) {
            System.out.println("Text is Palindrome");
        } else {
            System.out.println("Text is not a Palindrome");
        }
    }
}
