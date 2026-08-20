class StringMethods {

    public static void main(String[] args) {

        String text = "Automation Testing";

        System.out.println("Length: " + text.length());
        System.out.println("Character at index 2: " + text.charAt(2));
        System.out.println("First 10 characters: " + text.substring(0, 10));
        System.out.println("Contains Testing: " + text.contains("Testing"));
        System.out.println("Starts with Auto: " + text.startsWith("Auto"));
        System.out.println("Ends with Testing: " + text.endsWith("Testing"));
    }
}
