import java.util.Random;

class RandomArray {

    public static void shuffleArray(int[] a) {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            int randomValue = generateRandomValue(r, a.length);

            int temp = a[i];
            a[i] = a[randomValue];
            a[randomValue] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int generateRandomValue(Random r, int length) {
        int rand = r.nextInt(length);
        while (rand == length) {
            rand = r.nextInt(length);
        }
        return rand;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        shuffleArray(a);
    }
}
