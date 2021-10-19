import java.util.Scanner;

public class xndir5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        switch (name){
            case "10":
                System.out.println("erkushabti");
                break;
            case "11":
                System.out.println("ereqshabti");
                break;
            case "12":
                System.out.println("choreqshabti");
                break;
            case "13":
                System.out.println("hingshabti");
                break;
            case "14":
            System.out.println("urbat");
                break;
            case "15":
                System.out.println("shabat");
                break;
            case "16":
                System.out.println("kiraki");
            default:
                System.out.println("goyutyun chuni");
        }
    }
}
