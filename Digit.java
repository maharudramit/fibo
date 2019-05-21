package digit;

public class Digit {

public  static  void  main(String agrs[]) {
    int n = 1000;
    int x, y, z, a;
    for (int i = 100; i < n; i++) {
        x = i % 10;
        y = i / 100;
        z = i / 10;
        a = z % 10;
        if ((y + a) == x) {
            System.out.println(i);
        }

    }

}}