import java.util.Scanner;

public class SampleProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        final double RATE = 4100;
        enum DAY{
            MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        do{
            System.out.println("1. Wage Calculator");
            System.out.println("2. Money Exchange Program");
            System.out.println("3. Exit");
            System.out.println("Enter your option: ");
            option = input.nextInt();
            switch(option){
                case 1:{
                    double wage;
                    double hour;
                    double result;
                    DAY day;

                    System.out.println("Enter hour(hrs): ");
                    hour = input.nextDouble();
                    System.out.println("Enter wage($): ");
                    wage = input.nextDouble();
                    System.out.println("Enter day: ");
                    day = DAY.valueOf(input.next().toUpperCase());
                    result = wage * hour;
                    if(day == DAY.SATURDAY || day == DAY.SUNDAY){
                        result *= 2;
                    }
                    System.out.println("-----------------------");
                    System.out.println("Hour is: " + hour + "hr"+ (hour>1?"s":""));
                    System.out.println("Wage is: $" + wage + "/1h");
                    System.out.println("Day of work: " + day);
                    System.out.println("Result is: " + result);
                    break;
                }
                case 2:{
                    double cast;
                    int op;
                    do {
                        System.out.println("1. USD Exchange Program");
                        System.out.println("2. KHR Exchange Program");
                        System.out.println("3. Exit");
                        System.out.println("Enter your option: ");
                        op = input.nextInt();
                        switch (op) {
                            case 1:{
                                System.out.println("USD Exchange Program");
                                System.out.println("Enter your cast(KHR): ");
                                cast = input.nextDouble();
                                cast /= RATE;
                                System.out.println("USD Exchange Program after cast: $" + cast);
                                break;
                            }
                            case 2:{
                                System.out.println("KHR Exchange Program");
                                System.out.println("Enter your cast(USD): ");
                                cast = input.nextDouble();
                                cast *= RATE;
                                System.out.println("KHR Exchange Program after cast: riel" + cast);
                                break;
                            }
                            case 3:{
                                System.out.println("Exit");
                                System.out.println("___________________");
                                break;
                            }
                            default:
                                System.out.println("Invalid option Try Again");

                        }
                    }while(op != 3);
                    break;
                }
                case 3:{
                    System.out.println("Exit");
                    break;
                }
                default:
                    System.out.println("Invalid option Try Again");
                    break;
            }
        }while (option != 3);
    }
}
