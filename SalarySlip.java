package salaryslip;
import java.util.*;
import java.util.Currency;
import java.io.*;
import java.text.NumberFormat;
public class SalarySlip{
    public static final String SEPARATOR = "====================================";
    public static void earningsAndDeduction(double baseSalary){
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("in", "US"));

        //Earnings
        double HRA = 0.5 * baseSalary;
        double DA = 0.2 * baseSalary;
        double TA = 0.3 * baseSalary;
        double MA = 0.25 * baseSalary;
        double PF = 0.05 * baseSalary;
        double tax;
        if(baseSalary <= 250000){
            tax = 0;
        }
        else if(baseSalary > 250000 && baseSalary <= 500000){
            tax = 0.1 * baseSalary;
        }
        else if(baseSalary > 500000 && baseSalary <= 1000000){
            tax = 0.2 * baseSalary;
        }
        else{
            tax = 0.3 * baseSalary;
        }
        
        double grossSalary = baseSalary + HRA + DA + TA + MA ;
        System.out.println("                Earnings                ");
        System.out.println(SEPARATOR);
        System.out.println("Base Salary : " + baseSalary);
        System.out.println("HRA : " + HRA);
        System.out.println("DA : " + DA);
        System.out.println("TA : " + TA);
        System.out.println("MA : " + MA);
        System.out.println("Gross Salary : " + grossSalary);
        System.out.println(SEPARATOR);
        System.out.println("                Deductions              ");
        System.out.println(SEPARATOR);
        System.out.println("PF : " + PF);
        System.out.println("Tax : " + tax);
        System.out.println(SEPARATOR);
        System.out.println("                Net Pay             " + (grossSalary - PF - tax));
        System.out.println(SEPARATOR);
    }
    public static void companyInfo(){
        final String companyName = "Brain Mentors";
        final String companyAddress = "Noida";
        final long companyPhone = 18006464646l;
        final String email = "brainmentors@gmail.com";
        System.out.println("Company Name : " + companyName);
        System.out.println("Company Address : " + companyAddress);
        System.out.println("Company Phone : " + companyPhone);
        System.out.println("Company Email : " + email);
    }
    public static void employeeInfo(String empName, String empAddress, long empPhone, String empEmail){
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee Address : " + empAddress);
        System.out.println("Employee Phone : " + empPhone);
        System.out.println("Employee Email : " + empEmail);
    }
    public static void print(int region){
        Scanner sc = new Scanner(System.in);
        if(region ==1){
        System.out.print("Enter your First Name: ");
        String empName = sc.next();
        sc.nextLine();
        System.out.print("Enter your Last Name: ");
        empName = empName + " " + sc.next();
        sc.nextLine();
        System.out.print("Enter your address: ");
        String empAddress = sc.nextLine();
        System.out.print("Enter your phone: ");
        long empPhone = sc.nextLong();
        System.out.print("Enter your email: ");
        String empEmail = sc.next();
        System.out.print("Enter your base salary: ");
        double baseSalary = sc.nextDouble();
        System.out.println(SEPARATOR);
        System.out.println("            Salary Slip             ");
        System.out.println(SEPARATOR);
        System.out.println("            Company Information            ");
        System.out.println(SEPARATOR);
        companyInfo();
        System.out.println(SEPARATOR);
        System.out.println("            Employee Information            ");
        System.out.println(SEPARATOR);
        employeeInfo(empName, empAddress, empPhone, empEmail);
        System.out.println(SEPARATOR);
        earningsAndDeduction(baseSalary);
        System.out.println("Prepared By: Mohit Kumar ");
        System.out.println("Recived By: " + empName);
        System.out.println(SEPARATOR);
        System.out.println("                Thank You               ");
        System.out.println(SEPARATOR);
        }
        else if(region == 2){
            System.out.print("Introduzca su nombre: ");
            String empName = sc.next();
            sc.nextLine();
            System.out.print("Introduzca su apellido: ");
            empName = empName + " " + sc.next();
            sc.nextLine();
            System.out.print("Introduzca su dirección: ");
            String empAddress = sc.nextLine();
            System.out.print("Introduzca su teléfono: ");
            long empPhone = sc.nextLong();
            System.out.print("Introduzca su correo electrónico: ");
            String empEmail = sc.next();
            System.out.print("Introduzca su salario base: ");
            double baseSalary = sc.nextDouble();
            System.out.println(SEPARATOR);
            System.out.println("            Recibo de sueldo             ");
            System.out.println(SEPARATOR);
            System.out.println("            Información de la empresa            ");
            System.out.println(SEPARATOR);
            companyInfo();
            System.out.println(SEPARATOR);
            System.out.println("            Información del empleado            ");
            System.out.println(SEPARATOR);
            employeeInfo(empName, empAddress, empPhone, empEmail);
            System.out.println(SEPARATOR);
            earningsAndDeduction(baseSalary);
            System.out.println("Preparado por: Mohit Kumar ");
            System.out.println("Recibido por: " + empName);
            System.out.println(SEPARATOR);
            System.out.println("                Gracias               ");
            System.out.println(SEPARATOR);
        } 
        else if(region==3){
            System.out.print("Entrez votre prénom: ");
            String empName = sc.next();
            sc.nextLine();
            System.out.print("Entrez votre nom de famille: ");
            empName = empName + " " + sc.next();
            sc.nextLine();
            System.out.print("Entrez votre adresse: ");
            String empAddress = sc.nextLine();
            System.out.print("Entrez votre téléphone: ");
            long empPhone = sc.nextLong();
            System.out.print("Entrez votre email: ");
            String empEmail = sc.next();
            System.out.print("Entrez votre salaire de base: ");
            double baseSalary = sc.nextDouble();
            System.out.println(SEPARATOR);
            System.out.println("            Fiche de paie             ");
            System.out.println(SEPARATOR);
            System.out.println("            Informations sur la société            ");
            System.out.println(SEPARATOR);
            companyInfo();
            System.out.println(SEPARATOR);
            System.out.println("            Informations sur l'employé            ");
            System.out.println(SEPARATOR);
            employeeInfo(empName, empAddress, empPhone, empEmail);
            System.out.println(SEPARATOR);
            earningsAndDeduction(baseSalary);
            System.out.println("Préparé par: Mohit Kumar ");
            System.out.println("Reçu par: " + empName);
            System.out.println(SEPARATOR);
            System.out.println("                Merci               ");
            System.out.println(SEPARATOR); 
        }
        else{
            System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your Region: \n " + "Press 1 For USA, Press 2 for Spain, Press 3 for France. ");
        int region = sc.nextInt();
        print(region);
        sc.close();   
    }

} 