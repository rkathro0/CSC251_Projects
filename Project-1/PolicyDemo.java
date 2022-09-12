import java.util.Scanner;

public class PolicyDemo
   {
      public static void main(String[] args)
         {
            /** 
               Initialize scanner and create variables needed to create policy
            */
            Scanner sc = new Scanner(System.in);
            int policyNum;
            String providerName;
            String firstName;
            String lastName;
            int age;
            String smoke;
            double height;
            double weight;
            
            /** 
               Ask user for information needed to create policy
            */
            System.out.print("Please enter the Policy Number: ");
            policyNum = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Please enter the Provider Name: ");
            providerName = sc.nextLine();
            
            System.out.print("Please enter the Policyholder's First Name: ");
            firstName = sc.nextLine();
            
            System.out.print("Please enter the Policyholder's Last Name: ");
            lastName = sc.nextLine();
            
            System.out.print("Please enter the Policyholder's Age: ");
            age = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Please enter the Policyholder's Smoking Status: ");
            smoke = sc.nextLine();
            
            System.out.print("Please enter the Policyholder's Height (in inches): ");
            height = sc.nextDouble();
            
            System.out.print("Please enter the Policyholder's Weight (in pounds): ");
            weight = sc.nextDouble();
            
            /** 
               Create instance of Policy class using information from the user
            */
            Policy demoPolicy = new Policy(policyNum, providerName, firstName, lastName, age, smoke, height, weight);
            
            /** 
               Display policy information using appropriate methods in the Policy class
            */
            System.out.println("\n\nPolicy Number: " + demoPolicy.getPolicyNumber());
            System.out.println("Provider Name: " + demoPolicy.getProviderName());
            System.out.println("Policyholder's First Name: " + demoPolicy.getPolicyHolderFirstName());
            System.out.println("Policyholder's Last Name: " + demoPolicy.getPolicyHolderLastName());
            System.out.println("Policyholder's Age: " + demoPolicy.getPolicyHolderAge());
            System.out.println("Policyholder's Smoking Status: " + demoPolicy.getPolicyHolderSmokingStatus());
            System.out.println("Policyholder's Height: " + demoPolicy.getPolicyHolderHeight());
            System.out.println("Policyholder's Weight: " + demoPolicy.getPolicyHolderWeight());
            System.out.printf("Policyholder's BMI: %.2f", demoPolicy.getBMI());
            System.out.printf("\nPolicy Price: $%,.2f", demoPolicy.getPolicyPrice());
         }
   }