package salaryslip;
import java.util.*;
import java.io.*;
import java.text.NumberFormat;

public class SalarySlipbackup {
    public static ResourceBundle us = ResourceBundle.getBundle("messages_en_US");
    public static ResourceBundle fr = ResourceBundle.getBundle("messages_fr_FR");
    public static ResourceBundle sp = ResourceBundle.getBundle("messages_es_ES");
    public static final String SEPARATOR = "====================================";

    public static void earningsAndDeduction(double baseSalary, int region) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("in", "US"));

        // Earnings
        double HRA = 0.5 * baseSalary;
        double DA = 0.2 * baseSalary;
        double TA = 0.4 * baseSalary;
        double MA = 0.25 * baseSalary;
        double PF = 0.05 * baseSalary;
        double tax;
        double grossSalary = baseSalary + HRA + DA + TA + MA;
        if (grossSalary <= 250000) {
            tax = 0;
        } else if (grossSalary * 12 > 250000 && grossSalary * 12 <= 500000) {
            tax = 0.1 * baseSalary;
        } else if (grossSalary * 12 > 500000 && grossSalary * 12 <= 1000000) {
            tax = 0.2 * baseSalary;
        } else {
            tax = 0.3 * baseSalary;
        }
        switch (region) {
            case 1:
                System.out.println(us.getString("empEarning"));
                break;
            case 2:
                System.out.println(fr.getString("empEarning"));
                break;
            case 3:
                System.out.println(sp.getString("empEarning"));
                break;
        }

        System.out.println(SEPARATOR);
        switch (region) {
            case 1:
                System.out.println(us.getString("bSalary") + baseSalary);
                break;
            case 2:
                System.out.println(fr.getString("bSalary") + baseSalary);
                break;
            case 3:
                System.out.println(sp.getString("bSalary") + baseSalary);
                break;
        }
        System.out.println("HRA : " + HRA);
        System.out.println("DA : " + DA);
        System.out.println("TA : " + TA);
        System.out.println("MA : " + MA);
        switch (region) {
            case 1:
                System.out.println(us.getString("gSalary") + grossSalary);
                break;
            case 2:
                System.out.println(fr.getString("gSalary") + grossSalary);
                break;
            case 3:
                System.out.println(sp.getString("gSalary") + grossSalary);
                break;
            default:
                break;
        }
        System.out.println(SEPARATOR);
        switch (region) {
            case 1:
                System.out.println(us.getString("empDeduction"));
                break;
            case 2:
                System.out.println(fr.getString("empDeduction"));
                break;
            case 3:
                System.out.println(sp.getString("empDeduction"));
                break;
            default:
                break;
        }
        System.out.println(SEPARATOR);
        System.out.println("PF : " + PF);
        System.out.println("Tax : " + tax);
        System.out.println(SEPARATOR);
        switch (region) {
            case 1:
                System.out.println(us.getString("empNetSalary") + (grossSalary - PF - tax));
                break;
            case 2:
                System.out.println(fr.getString("empNetSalary") + (grossSalary - PF - tax));
                break;
            case 3:
                System.out.println(sp.getString("empNetSalary") + (grossSalary - PF - tax));
                break;
            default:
                break;
        }
        System.out.println(SEPARATOR);
    }

    public static void companyInfo(int region) {
        final String compName = "Brain Mentors";
        final String compAddress = "Noida";
        final long compPhone = 18006464646l;
        final String email = "brainmentors@gmail.com";
        switch (region) {
            case 1:
                System.out.println(us.getString("companyName") + compName);
                System.out.println(us.getString("companyAddress") + compAddress);
                System.out.println(us.getString("companyPhone") + compPhone);
                System.out.println(us.getString("companyemail") + email);
                break;

            case 2:
                System.out.println(fr.getString("companyName") + compName);
                System.out.println(fr.getString("companyAddress") + compAddress);
                System.out.println(fr.getString("companyPhone") + compPhone);
                System.out.println(fr.getString("companyemail") + email);
                break;

            case 3:
                System.out.println(sp.getString("companyName") + compName);
                System.out.println(sp.getString("companyAddress") + compAddress);
                System.out.println(sp.getString("companyPhone") + compPhone);
                System.out.println(sp.getString("companyemail") + email);
                break;

            default:
                break;
        }
    }

    public static void employeeInfo(String empName, String empAddress, long empPhone, String empEmail, int region) {
        switch (region) {
            case 1:
                System.out.println(us.getString("empName") + empName);
                System.out.println(us.getString("empAddress") + empAddress);
                System.out.println(us.getString("empPhone") + empPhone);
                System.out.println(us.getString("empEmail") + empEmail);
                break;

            case 2:
                System.out.println(fr.getString("empName") + empName);
                System.out.println(fr.getString("empAddress") + empAddress);
                System.out.println(fr.getString("empPhone") + empPhone);
                System.out.println(fr.getString("empEmail") + empEmail);
                break;

            case 3:
                System.out.println(sp.getString("empName") + empName);
                System.out.println(sp.getString("empAddress") + empAddress);
                System.out.println(sp.getString("empPhone") + empPhone);
                System.out.println(sp.getString("empEmail") + empEmail);
                break;

            default:
                break;
        }

    }

    public static void print(int region) {
        Scanner sc = new Scanner(System.in);
        switch (region) {
            case 1:
                System.out.print(us.getString("firstname"));
                String fname = sc.next();
                System.out.print(us.getString("lastname"));
                String lname = sc.next();
                String empName = fname.substring(0, 1).toUpperCase() + fname.substring(1).toLowerCase() + " "
                        + lname.substring(0, 1).toUpperCase() + lname.substring(1).toLowerCase();
                sc.nextLine();
                System.out.print(us.getString("inputaddress"));
                String empAddress = sc.nextLine();
                System.out.print(us.getString("inputphone"));
                long empPhone = sc.nextLong();
                System.out.print(us.getString("inputemail"));
                String empEmail = sc.next();
                System.out.print(us.getString("inputbaseSalary"));
                double baseSalary = sc.nextDouble();
                System.out.println(SEPARATOR);
                switch (region) {
                    case 1:
                        System.out.println(us.getString("welocome"));
                        break;

                    case 2:
                        System.out.println(fr.getString("welocome"));
                        break;

                    case 3:
                        System.out.println(sp.getString("welocome"));
                        break;
                    default:
                        break;
                }
                System.out.println(SEPARATOR);
                System.out.println(us.getString("headsalarySlip"));
                System.out.println(SEPARATOR);
                System.out.println(us.getString("headcompanyInfo"));
                System.out.println(SEPARATOR);
                companyInfo(region);
                System.out.println(SEPARATOR);
                System.out.println(us.getString("headempinfo"));
                System.out.println(SEPARATOR);
                employeeInfo(empName, empAddress, empPhone, empEmail, region);
                System.out.println(SEPARATOR);
                earningsAndDeduction(baseSalary, region);
                System.out.println(us.getString("footpreparedby"));
                System.out.println(us.getString("footrecived") + empName);
                System.out.println(SEPARATOR);
                System.out.println(us.getString("footgoodbye"));
                System.out.println(SEPARATOR);
                break;
            case 2:
                System.out.print(fr.getString("firstname"));
                fname = sc.next();
                sc.nextLine();
                System.out.print(fr.getString("lastname"));
                lname = sc.next();
                empName = fname.substring(0, 1).toUpperCase() + fname.substring(1).toLowerCase() + " "
                        + lname.substring(0, 1).toUpperCase() + lname.substring(1).toLowerCase();
                sc.nextLine();
                System.out.print(fr.getString("inputaddress"));
                empAddress = sc.nextLine();
                System.out.print(fr.getString("inputphone"));
                empPhone = sc.nextLong();
                System.out.print(fr.getString("inputemail"));
                empEmail = sc.next();
                System.out.print(fr.getString("inputbaseSalary"));
                baseSalary = sc.nextDouble();
                System.out.println(SEPARATOR);
                System.out.println(fr.getString("headsalarySlip"));
                System.out.println(SEPARATOR);
                System.out.println(fr.getString("headcompanyInfo"));
                System.out.println(SEPARATOR);
                companyInfo(region);
                System.out.println(SEPARATOR);
                System.out.println(fr.getString("headempinfo"));
                System.out.println(SEPARATOR);
                employeeInfo(empName, empAddress, empPhone, empEmail, region);
                System.out.println(SEPARATOR);
                earningsAndDeduction(baseSalary, region);
                System.out.println(fr.getString("footpreparedby"));
                System.out.println(fr.getString("footrecived") + empName);
                System.out.println(SEPARATOR);
                System.out.println(fr.getString("footgoodbye"));
                System.out.println(SEPARATOR);
                break;
            case 3:
                System.out.print(sp.getString("firstname"));
                fname = sc.next();
                sc.nextLine();
                System.out.print(sp.getString("lastname"));
                lname = sc.next();
                empName = fname.substring(0, 1).toUpperCase() + fname.substring(1).toLowerCase() + " "
                        + lname.substring(0, 1).toUpperCase() + lname.substring(1).toLowerCase();
                sc.nextLine();
                System.out.print(sp.getString("inputaddress"));
                empAddress = sc.nextLine();
                empAddress = empAddress.substring(0, 1).toUpperCase() + empAddress.substring(1).toLowerCase();
                System.out.print(sp.getString("inputphone"));
                empPhone = sc.nextLong();
                System.out.print(sp.getString("inputemail"));
                empEmail = sc.next();
                System.out.print(sp.getString("inputbaseSalary"));
                baseSalary = sc.nextDouble();
                System.out.println(SEPARATOR);
                System.out.println(sp.getString("headsalarySlip"));
                System.out.println(SEPARATOR);
                System.out.println(sp.getString("headcompanyInfo"));
                System.out.println(SEPARATOR);
                companyInfo(region);
                System.out.println(SEPARATOR);
                System.out.println(sp.getString("headempinfo"));
                System.out.println(SEPARATOR);
                employeeInfo(empName, empAddress, empPhone, empEmail, region);
                System.out.println(SEPARATOR);
                earningsAndDeduction(baseSalary, region);
                System.out.println(sp.getString("footpreparedby"));
                System.out.println(sp.getString("footrecived") + empName);
                System.out.println(SEPARATOR);
                System.out.println(sp.getString("footgoodbye"));
                System.out.println(SEPARATOR);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(us.getString("welcome"));
        System.out.println("Choose your Region: \n " + "Press 1 For USA, Press 2 for Spain, Press 3 for France. ");
        int region = sc.nextInt();
        print(region);
        sc.close();
    }
}