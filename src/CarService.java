import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class CarService {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ServiceStation station = new ServiceStation();
        System.out.println("Enter Car Type: ");
        String car=sc.nextLine();
        System.out.println("Enter codes : BS01 ,EF01 ,CF01 ,BF01 ,GF01: \n  To Print Bill After Code Enter : 0  ");
        ArrayList<String> serviceCodes = new ArrayList<String>();
        while(true) {
            String serviceCode=sc.nextLine();
            if(serviceCode.equals("0")) {
                break;
            }
            else if(serviceCode.equals("BS01")  || serviceCode.equals("EF01") || serviceCode.equals("CF01") || serviceCode.equals("BF01") || serviceCode.equals("GF01")) {
                serviceCodes.add(serviceCode);
            }
            else {
                System.out.println("Invalid Code  !");
            }
        }


        if(car.equals("Hatchback")) {
            station.printBill(CarType.Hatchback, serviceCodes);
        }
        else if(car.equals("Sedan")) {
            station.printBill(CarType.Sedan, serviceCodes);
        }
        else if(car.equals("SUV")) {
            station.printBill(CarType.SUV, serviceCodes);
        }
        else {
            System.out.println("Invalid Car Type");
        }
    }
}