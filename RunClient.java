package Client;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RunClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {
    RMIClient rc=new RMIClient();
    rc.StartClient();
        Scanner sc=new Scanner(System.in);
        String read="";
        while (true){
            System.out.print("Please Input: ");
            String s=sc.nextLine();
            if (s.equalsIgnoreCase("exit"))break;
            String result= null;
            try {
                result = rc.toUpperCase(s);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true){

            System.out.println("Enter 1 to Decimal Number to Convert: ");
            System.out.println("Enter 0 Key to Exit System");
            int temp=sc.nextInt();
            if(temp==0)break;
            else {
                try {
                    int num = sc.nextInt();
                    int res= rc.NumberConsversion(num);
                    System.out.println("Binary Number is : "+res);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            System.exit(0);

        }
    }
}
