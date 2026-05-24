import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
            (Or)
        for(int i=s.length();i>=0;i--){
       Sb.append(s.charAt(i));
         }
        System.out.println(sb);

    }
}
