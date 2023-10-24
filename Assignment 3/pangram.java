import java.util.Scanner;

class PanagramProgram {
    public static boolean isPangram(String s) {
        if (s.length() < 26) {
            return false;
        } else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (s.indexOf(ch) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        boolean result = isPangram(s.toLowerCase());
        if (result) {
            System.out.println("It is a pangram.");
        } else {
            System.out.println("It is not a pangram.");
        }
    }
}
