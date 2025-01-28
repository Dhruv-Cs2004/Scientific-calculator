import java.util.Scanner;
public class TestMySkills {
    public static void main(String[] args) {
        System.out.println("Enter The Number To start The Cal And Type (exit) To Terminate calculator");
        System.out.println("""
                Enter 1 For Addition
                Enter 2 For Multiplication
                Enter 3 For Divide
                Enter 4 For subtraction
                Enter 5 For Average
                Enter 6 For Modulus
                Enter 7 For Log""");
        Scanner scanner = new Scanner(System.in);
        int start=0;
        String get="";
        while (start>=0) {
            start++;
            try {
                get = scanner.nextLine();
                int get1 = Integer.parseInt(get);
                switch (get1) {
                    case 1 -> AddNumber();
                    case 2 -> MultiPly();
                    case 3 -> DivisorDiv();
                    case 4 -> Subtraction();
                    case 5 ->Average();
                    case 6 ->Mod();
                    case 7 ->LogFind();
                    default -> System.out.println("plz Chose th Correct Operations");
            }
            } catch (RuntimeException e) {
                if(get.equals("exit")){
                    System.out.println("*****EXIT Form Main CAl*****");
                    break;
                }else {
                    System.out.println("Enter The wrong Value");
                }
            }
        }
    }
    public static void AddNumber(){
        System.out.println("Star Typing to add numbers To stop and Get The Sum type (exit)   ");
        Scanner scanner=new Scanner(System.in);
        int start=0;
        int Sum=0;
        String Number = "";
        while (start>=0){
            start++;
            System.out.print("Enter The first "+start+" Number To add:- ");
            try {
                Number= scanner.next();
                int Number1=Integer.parseInt(Number);
                Sum+=Number1;
            } catch (NumberFormatException e) {
                if(Number.equals("exit")){
                    System.out.println("**EXIT**");
                    break;
                }else {
                    System.out.println("Enter The wrong Value");
                    start=start-1;
                }
            }
        }
        System.out.println("Your Total Sum Is:- "+Sum);
    }
    public static void MultiPly(){
        System.out.println("Strat Typing To MultiPly To stop and Get The Multiple output type (exit)");
        Scanner scanner=new Scanner(System.in);
        int start=0;
        int multi=1;
        String Number="";
        while (start>=0){
            start++;
            System.out.print("Enter The first "+start+" Number To MultiPly:- ");
            try {
                Number= scanner.next();
                int Number1=Integer.parseInt(Number);
                multi=multi*Number1;
            } catch (NumberFormatException e) {
                if(Number.equals("exit")){
                    System.out.println("**EXIT**");
                    break;
                }else {
                    System.out.println("Enter The wrong Value");
                    start=start-1;
                }
            }
        }
        System.out.println("Your Multiplication Output:- "+multi);
    }
    public static void DivisorDiv(){
        System.out.println("Strat Typing To stop and Get The Divide output type (exit)");
        Scanner scanner=new Scanner(System.in);
        int start=0;
        Double Divisor=0.0;
        String get1="";
        String get2="";
        while (start>=0) {
            start++;
            try {
                System.out.print("Enter The Number You Wan To divide:- ");
                get1=scanner.nextLine();
                double Number1=Double.parseDouble(get1);
                System.out.print("Enter the the the Number You Want To Divide with:- ");
                get2=scanner.nextLine();
                double Number2=Double.parseDouble(get2);
                Divisor=Number1/Number2;
                System.out.println(Divisor);
            } catch (RuntimeException e) {
                if (get1.equals("exit")||get2.equals("exit")) {
                    System.out.println("**EXIT**");
                    break;
                }
                else {
                    System.out.println("Enter The wrong Value");
                    start = start - 1;
                }
            }
        }
    }
    public static void Subtraction(){
        System.out.println("Strat Typing To stop and Get The Subtracted output type (exit)");
        Scanner scanner=new Scanner(System.in);
        int start=0;
        int start2=1;
        String get1="";
        String get2="";
        int Sub=0;
        while (start>=0){
            start++;
            start2++;
            try {
                System.out.print("Enter The first "+start+" Number To Subtract:- ");
                get1=scanner.nextLine();
                int Number1=Integer.parseInt(get1);
                System.out.print("Enter The first "+start2+" Number To Subtract:- ");
                get2=scanner.nextLine();
                int Number2=Integer.parseInt(get2);
                Sub=Number1-Number2;
                System.out.println(Sub);
            } catch (RuntimeException e) {
                if (get1.equals("exit")||get2.equals("exit")) {
                    System.out.println("**EXIT**");
                    break;
                }
                else {
                    System.out.println("Enter The wrong Value");
                    start = start - 1;
                    start2= start2 - 1;
                }
            }
        }
    }
    public static void Average(){
        System.out.println("Strat Typing To stop and Get The Average output type (exit)");
        Scanner scanner=new Scanner(System.in);
        int Start=0;
        double sum=0;
        double Avg;
        String Get="";
        while (Start>=0){
            Start++;
            try {
                System.out.print("Enter The first "+Start+" Number To Find Average:- ");
                Get= scanner.nextLine();
                double Number=Double.parseDouble(Get);
                sum+=Number;
            } catch (RuntimeException e) {
                if (Get.equals("exit")) {
                    System.out.println("**EXIT**");
                    break;
                }
                else {
                    System.out.println("Enter The wrong Value");
                    Start = Start - 1;
                }
            }
        }
        Avg=sum/(Start-1);
        System.out.println("Average Of Tou Given Input:- "+Avg+"%");
    }
    public static void Mod(){
        System.out.println("Strat Typing To stop and Get The Mod output type (exit)");
        Scanner scanner=new Scanner(System.in);
        int Start=0;
        int  Start1=1;
        double Modu=0;
        String Get="";
        String Get1="";
        while (Start>=0){
            Start++;
            Start1++;
            try {
                System.out.print("Enter the "+Start+" Number:- ");
                Get=scanner.nextLine();
                double Number1=Double.parseDouble(Get);
                System.out.print("Enter The "+Start1+" Number:- ");
                Get1=scanner.nextLine();
                double Number2=Double.parseDouble(Get1);
                Modu=Number1%Number2;
                System.out.println("The "+Number1+" Mod "+Number2+" Is:- "+Modu);
            } catch (RuntimeException e) {
                if (Get.equals("exit")||Get1.equals("exit")) {
                    System.out.println("**EXIT**");
                    break;
                }
                else {
                    System.out.println("Enter The wrong Value");
                    Start = Start - 1;
                    Start1= Start1 - 1;
                }
            }
        }
    }
    public static void LogFind(){
        System.out.println("Strat Typing To stop and Get The Log output type (exit)");
        Scanner scanner=new Scanner(System.in);
        int Start=0;
        String Get="";
        String Get1="";
        while (Start>=0){
            Start++;
            try {
                System.out.print("Enter the Number:- ");
                Get=scanner.nextLine();
                double Number=Double.parseDouble(Get);
                System.out.print("Enter The Base Value:- ");
                Get1=scanner.nextLine();
                double base=Double.parseDouble(Get1);
                if(base<=0||base==1){
                    System.out.println("the Value of Base is Invalid");
                }else {
                    double LogBase=Math.log(Number)/Math.log(base);
                    System.out.println("The Value of log"+base+"("+Number+")"+"Is:- "+LogBase);
                }
            } catch (RuntimeException e) {
                if (Get.equals("exit")||Get1.equals("exit")) {
                    System.out.println("**EXIT**");
                    break;
                }
                else {
                    System.out.println("Enter The wrong Value");
                    Start = Start - 1;
                }
            }
        }
    }
}