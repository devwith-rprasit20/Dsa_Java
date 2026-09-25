public class Typecasting {
    public static void main(String[] args) {
        char ch = 'a';
        int x = ch;// implicit typecasting
        System.out.println(x);

        char Prasit = 'A';
        int y = (int) Prasit; // explicit typecasting
        System.out.println(y);

        char Rim = '3';
        System.out.println((int) Rim);

        char ph = 'b';
        System.out.println(ph + 0);
        char sh = 'b';
        System.out.println(sh + sh);

        char ah = 'b';
        System.out.println(ah * ah);

        // integer to charecter
        int o = 43;
        char oh = (char) o;
        System.out.println(oh);

        char kh = 'c';
        System.out.println((int) kh);
    }
}
