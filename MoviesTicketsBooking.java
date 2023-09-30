package Core_Java_Projects;
import java.util.Scanner;
public class MoviesTicketsBooking {
    String[] array = {"1. FRIENDSHIP ZONE  (Movies Time : 9:00AM TO 12:00PM)", "2. THE NUN  (Movies Time : 12:15PM TO 3:30PM)", "3. GAME OF THRONE  (Movies Time : 4:00PM TO 9:00PM)", "4. THE HORROR  (Movies Time : 9:00PM TO 12AM)", "5. HAPPY ENDING  (Movies Time : 12:00AM TO 3:00AM)"};


    void name() {
        System.out.println("Welcome To Rubaab Theater");
        System.out.println("................");
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter your name : ");
        name = input.nextLine();
        System.out.println("Welcome "+name);
        movie();
    }
    void movie(){
        Scanner input = new Scanner(System.in);
        System.out.println("Today Show");
        System.out.println("Select the movie from the List : ");
        System.out.println("------------------------");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("Enter the :");
        int choice = input.nextInt();
        System.out.println("Please select the ticket booking : ");
        System.out.println(array[choice - 1]);
        seat();
    }
    void seat(){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("How many seat your want have Please select : ");
        n = input.nextInt();
        int [] arr = new int[n];
        System.out.println("Which seat number you want to have chose it :");
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int amount = n*150; // 1 tickets cost 150
        System.out.println("Total amount to pay : "+amount);
        System.out.println("Please select your bank to pay ");
        int bank=1;
        while(bank == 1){
            System.out.println("1) AXIS Bank");
            System.out.println("2) HDFC Bank");
            System.out.println("3) UNION Bank OF INDIA");
            System.out.println("4) SBI Bank");
            int bak = input.nextInt();
            switch(bak){
                case 1:
                    System.out.println("Welcome to AXIS Bank");
                    break;
                case 2:
                    System.out.println("Welcome to HDFC Bank");
                    break;
                case 3:
                    System.out.println("Welcome to UNION BANK OF INDIA");
                    break;
                case 4:
                    System.out.println("Welcome to SBI Bank");
                    break;
            }
            break;
        }
        System.out.println("Enter the amount :");
        int amountpay = input.nextInt();
        if(amountpay == amount){
            System.out.println("Your payment is successfully ");
            System.out.println("Your seat has been successfully booked");
            menu_exit();
        }else{
            System.out.println("Enter valid amount ");
            System.out.println("your payment is failure please try again ");
        }
    }

    void exits(){
        System.out.println("-------------* * *-------------");
        System.out.println("        Thank you       ");
    }
    void menu_exit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Continues Using [Y/N]");
        char ch = sc.next().charAt(0);
        if(ch == 'Y' || ch == 'y'){
            name();
        }else if(ch == 'N' || ch == 'n'){
            exits();
        }
    }

    public static void main(String[] args) {
        MoviesTicketsBooking MTB = new MoviesTicketsBooking();
        MTB.name();
    }
}