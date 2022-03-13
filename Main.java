package com.company;
import java.util.*;
import java.util.Random;

class Employee{
    String FirstName, LastName;
    Employee(String firstname,String lastname){
        FirstName = firstname;
        LastName = lastname;
    }
}
class CredentialService{
    String email, password;
    public void generateEmailAddress(String firstname, String lastname, String Department){
        email = firstname.toLowerCase() +"." + lastname.toLowerCase() +"@" + Department+ ".abc.com";

    }
    public void generatePassword(){
        String Capital_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
        int passwordLength = 8;
        String value = Capital_char+Small_chars+numbers+symbols;
        String Password = "";
        Random rndm_method = new Random();
        for(int i=0;i<=8;i++){
            Password = Password+ value.charAt(rndm_method.nextInt(value.length()));
        }
        password = Password;

    }
    public void showCredentials()
    {
        System.out.println("Email - " + email);
        System.out.println("Password - " + password);
    }
}

 class Main {

    public static void main(String[] args) {
        String firstname , lastname ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name");
        firstname = sc.nextLine();
        System.out.println("Enter Your Last Name");
        lastname = sc.nextLine();


        Employee e1 = new Employee(firstname , lastname);

        CredentialService c1 = new CredentialService();


        System.out.println("Employee's Department ");
        System.out.println("1.Technical");
        System.out.println("2.Admin");
        System.out.println("3.HR");
        System.out.println("4.Legal");
        System.out.println("Please enter the your department no. ");

        int num = sc.nextInt();


        String department = "";
        if(num == 1){
            department = "Tech";
        }
        else if(num == 2){
            department = "Ad";
        }
        else if(num == 3){
            department = "HR";
        }
        else if(num == 4) {
            department = "Lg";
        }else {
            System.out.println("wrong department");;
        }

        c1.generateEmailAddress(e1.FirstName , e1.LastName , department);
        System.out.println( "Dear "  + firstname + "  your credential are");
        c1.generatePassword();
        c1.showCredentials();

    }

}