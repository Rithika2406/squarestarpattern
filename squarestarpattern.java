import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        S.close(); 

        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n; j++) { 
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
}
