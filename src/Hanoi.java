/**
 * Created by chen4393 on 4/11/17.
 */
public class Hanoi {

    public static int count;

    public static void hanoi(int n, char source, char dest, char temp) {

        count++;
        System.out.println("n = " + n);

        if (n == 1) {
            System.out.println("Move the disk from " + source + " to " + dest);
        } else {
            hanoi(n - 1, source, temp, dest);
            System.out.println("Move the disk from " + source + " to " + dest);
            //hanoi(1, source, dest, temp);
            hanoi(n - 1, temp, dest, source);
        }
        /* T(n) = T(n - 1) + T(1) + T(n - 1) = 2T(n - 1)
        * T(n) = 2T(n - 1)
        * geometry series
        * O(2 ^ n)*/
    }

    public static void main(String[] args) {
        hanoi(3, 'X', 'Y', 'Z');
        System.out.println(count + " recursive calls");
    }
}
