
/*
CSE 17
Julio Gonzalez
JCG322@lehigh.edu
Program Description:Take in the number of tenants and returns the first and monthly payment
Program #2
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Prog2 {
    public static void main(String agrs[]) {
        // set up scanner
        Scanner myScanner = new Scanner(System.in);

        int tenantNum = 0;
        // ask for the number of tenants
        System.out.println("Enter number of tenants:");
        tenantNum = myScanner.nextInt();
        // craete tenant object
        ArrayList<Tenant> tenant = new ArrayList<Tenant>();
        Tenant newTenant = new Tenant();
        // ask input for every tenant and store in arraylist
        for (int x = 0; x < tenantNum; x++) {
            newTenant = new Tenant();
            System.out.println("Enter first name:");
            newTenant.setFirstName(myScanner.next());

            System.out.println("Enter last name:");
            newTenant.setLastName(myScanner.next());

            System.out.println("Enter apt number:");
            newTenant.setAptNumber(myScanner.next());

            System.out.println("Enter yearly rent:");
            while (!myScanner.hasNextInt()) {
                myScanner.next();
                System.out.println("Error: please enter a numeric value.");
                System.out.println("Enter yearly rent:");
            }
            newTenant.setYearlyRent(myScanner.nextInt());
            newTenant.firstPayment();
            newTenant.monthlyPayment();
            newTenant.fullName();

            tenant.add(newTenant);
        }
        // print out info
        for (int z = 0; z < tenantNum; z++) {
            System.out.println(tenant.get(z).fullName());
            System.out.println("Apt " + tenant.get(z).getAptNumber());
            System.out.println("First Payment: " + tenant.get(z).firstPayment());
            System.out.println("Monthly Payment:" + tenant.get(z).monthlyPayment());
            System.out.println();

        }
    }
}