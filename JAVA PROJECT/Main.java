import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.println("Enter 1 for Maruti_Suzuki");
            System.out.println("Enter 2 for Hyundai");
            System.out.println("Enter 3 for Tata_Motors");
            System.out.println("Enter 4 for Mahindra");
            System.out.println("Enter 5 for Honda");
            System.out.println("Enter 6 for Toyota");
            System.out.println("Enter 7 for Teslas");
            System.out.println("Enter -1 exit from app");

            i = sc.nextInt();

            if(i ==  1){
                Maruti_Suzuki obj = new Maruti_Suzuki();
                System.out.println(obj.name);
                System.out.println("The price per hour is "+obj.price+" Rs");
                System.out.println("The price per day is "+(obj.price*24)+" Rs");
                System.out.println("The car health is "+obj.carHealth);
                System.out.println("The car color is "+obj.color);
                System.out.println("The car mileage "+obj.mileage);
                System.out.println("You want to book then press 8 \nIf you want to quit then press -1 \nYou want to try other cars then press 9");
                i = sc.nextInt();
                if(i == 8){
                    System.out.println("Enter how many hours");
                    i = sc.nextInt();
                    System.out.println("Total Price "+(i * obj.price));
                    System.out.println("Your car is booked");
                    System.out.println(obj.name);
                    break;
                }
                else if (i == -1){
                    break;
                }
            }
            else if(i ==  2){
                Hyundai obj = new Hyundai();
                System.out.println(obj.name);
                System.out.println("The price per hour is "+obj.price+" Rs");
                System.out.println("The price per day is "+(obj.price*24)+" Rs");
                System.out.println("The car health is "+obj.carHealth);
                System.out.println("The car color is "+obj.color);
                System.out.println("The car mileage "+obj.mileage);
                System.out.println("You want to book then press 8 \nIf you want to quit then press -1 \nYou want to try other cars then press 9");
                i = sc.nextInt();
                if(i == 8){
                    System.out.println("Enter how many hours");
                    i = sc.nextInt();
                    System.out.println("Total Price "+(i * obj.price));
                    System.out.println("Your car is booked");
                    System.out.println(obj.name);
                    break;
                }
                else if (i == -1){
                    break;
                }
            }
            else if(i ==  3){
                Tata_Motors obj = new Tata_Motors();
                System.out.println(obj.name);
                System.out.println("The price per hour is "+obj.price+" Rs");
                System.out.println("The price per day is "+(obj.price*24)+" Rs");
                System.out.println("The car health is "+obj.carHealth);
                System.out.println("The car color is "+obj.color);
                System.out.println("The car mileage "+obj.mileage);
                System.out.println("You want to book then press 8 \nIf you want to quit then press -1 \nYou want to try other cars then press 9");
                i = sc.nextInt();
                if(i == 8){
                    System.out.println("Enter how many hours");
                    i = sc.nextInt();
                    System.out.println("Total Price "+(i * obj.price));
                    System.out.println("Your car is booked");
                    System.out.println(obj.name);
                    break;
                }
                else if (i == -1){
                    break;
                }
            }
            else if(i ==  4){
                Mahindra obj = new Mahindra();
                System.out.println(obj.name);
                System.out.println("The price per hour is "+obj.price+" Rs");
                System.out.println("The price per day is "+(obj.price*24)+" Rs");
                System.out.println("The car health is "+obj.carHealth);
                System.out.println("The car color is "+obj.color);
                System.out.println("The car mileage "+obj.mileage);
                System.out.println("You want to book then press 8 \nIf you want to quit then press -1 \nYou want to try other cars then press 9");
                i = sc.nextInt();
                if(i == 8){
                    System.out.println("Enter how many hours");
                    i = sc.nextInt();
                    System.out.println("Total Price "+(i * obj.price));
                    System.out.println("Your car is booked");
                    System.out.println(obj.name);
                    break;
                }
                else if (i == -1){
                    break;
                }
            }
            else if(i ==  5){
                Honda obj = new Honda();
                System.out.println(obj.name);
                System.out.println("The price per hour is "+obj.price+" Rs");
                System.out.println("The price per day is "+(obj.price*24)+" Rs");
                System.out.println("The car health is "+obj.carHealth);
                System.out.println("The car color is "+obj.color);
                System.out.println("The car mileage "+obj.mileage);
                System.out.println("You want to book then press 8 \nIf you want to quit then press -1 \nYou want to try other cars then press 9");
                i = sc.nextInt();
                if(i == 8){
                    System.out.println("Enter how many hours");
                    i = sc.nextInt();
                    System.out.println("Total Price "+(i * obj.price));
                    System.out.println("Your car is booked");
                    System.out.println(obj.name);
                    break;
                }
                else if (i == -1){
                    break;
                }
            }
            else if(i ==  6){
                Toyota obj = new Toyota();
                System.out.println(obj.name);
                System.out.println("The price per hour is "+obj.price+" Rs");
                System.out.println("The price per day is "+(obj.price*24)+" Rs");
                System.out.println("The car health is "+obj.carHealth);
                System.out.println("The car color is "+obj.color);
                System.out.println("The car mileage "+obj.mileage);
                System.out.println("You want to book then press 8 \nIf you want to quit then press -1 \nYou want to try other cars then press 9");
                i = sc.nextInt();
                if(i == 8){
                    System.out.println("Enter how many hours");
                    i = sc.nextInt();
                    System.out.println("Total Price "+(i * obj.price));
                    System.out.println("Your car is booked");
                    System.out.println(obj.name);
                    break;
                }
                else if (i == -1){
                    break;
                }
            }
            else{
                if(i != -1){
                    System.out.println("Your Enter inncorrect input");
                }
            }
            
        } while (i != -1);

    }
}