import java.util.*;

//Write a program which will take an input from keyboard and find the codeword for that character using 1-D parity
class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x_s = sc.nextLine();
        char x = x_s.charAt(0);
        int n = x;
        String s = Integer.toBinaryString(n);
        System.out.println("Before parity check:");
        System.out.println(s);
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                c++;
        }
        int p;
        if (c % 2 == 0)
            p = 0;
        else
            p = 1;
        s = new StringBuffer(s).insert(0, p).toString();
        System.out.println("After parity check:");
        System.out.println(s);
    }
}