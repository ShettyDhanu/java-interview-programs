class ReverseString {

    public static void main(String[] args) {

        String text = "Automation";
        String Rev = "";

        for (int i = 0; i < text.length(); i++) {
            Rev = text.charAt(i) + Rev;
        }

        System.out.println("Reversed String: " + Rev);
    }
}
