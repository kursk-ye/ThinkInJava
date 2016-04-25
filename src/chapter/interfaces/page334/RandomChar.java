package chapter.interfaces.page334;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;
import static kursk.Kutils.*;

/**
 * Created by kursk on 2016/4/25.
 */
public class RandomChar {
    private static final char[] capitals = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static Random rand = new Random(capitals.length);
    public char next() {
        return capitals[rand.nextInt()];
    }

    public static void main(String[] args) {
        Scanner s =  new Scanner(new AdaptedRandomChar(7));
        while(s.hasNextByte()) {
            print(s.next());
        }
    }
}


class AdaptedRandomChar extends RandomChar implements Readable {
    private int count;
    public AdaptedRandomChar(int count) {
        this.count = count;
    }
    public int read(CharBuffer cb) {
        if (count-- == 0) return -1;
        char result = next();
        cb.append(result);
        return 1;
    }

}