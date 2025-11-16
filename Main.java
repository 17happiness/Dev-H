import java.util.Scanner;
public class Main {   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        operation opp = new operation();
        System.out.println("*****Calculator*****");
        System.out.printf("1.Addition\n2.Subtractiom\n3.Multiplication\n4.Division\n5.Exit\n");
        int x,y;
        System.out.println("Enter x");
        x = sc.nextInt();
        System.out.println("Enter y");
        y = sc.nextInt();
    int choice;
    do{
        System.out.println("Enter choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
            int A;
            A = opp.add(x,y);
            System.out.println(A);
                break;
            case 2:
            int B;
            B = opp.sub(x,y);
            System.out.println(B);
                break;
             case 3:
            int C;
            C = opp.mul(x,y);
            System.out.println(C);
                break;
            case 4:
            int D;
            D = opp.div(x,y);
            System.out.println(D);
                break;
            case 5:
            int F;
            F = opp.mod(x,y);
            System.out.println(F);
                break;
             case 6:
            System.out.println("Thanks");
                break;
            
            default:
            System.out.println("Enter a Number");
                break;
        }
    }while(choice != 5);
    sc.close();
    }
}
