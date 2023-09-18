public class ReverseString {
    public static void main(String[] args) {
        var keyboard = new java.util.Scanner(System.in);
        System.out.println("Enter a string:");
        var string = keyboard.nextLine();
        var reversedString = new StringBuilder();
        for (var i = string.length() - 1; i >= 0; i--) {
            reversedString.append(string.charAt(i));
        }
        System.out.println(reversedString);
    }
}
