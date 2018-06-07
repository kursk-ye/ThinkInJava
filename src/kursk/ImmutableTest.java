package kursk;

public class ImmutableTest {

    public static void main(String[] args) {
        String str1 = "Mississippi";
        System.out.println(str1); // prints Mississippi

        String str2 = str1;
        str1 = str1.replace("i", "!");
        System.out.println(str1);
        System.out.println(str2);
    }
}
