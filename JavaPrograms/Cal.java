import java.util.Scanner;

class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("Choose: 1.Add \n2.Sub\n3.Mul\n4.Div");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
        }
    }
}