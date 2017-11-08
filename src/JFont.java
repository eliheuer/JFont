
public class JFont {

    public static void main(String[] args) {

        print("Welcome to JFont Alpha!");
        int n = 512;
        int t = 256;
        int bez = bezier(n,t);
        print("bez = "+bez);
    }

    /** Basic bezier method */
    public static int bezier(int n, int t) {
    int sum = 0;
    int k = 12;
    for(int i=0; i<n; i++) {
        sum +=
        (k*(n-k))*(1-t);
        print(" "+sum);
    }
    return sum;
    }

    public static void print(String m) {
        System.out.println(m);
    }
}
