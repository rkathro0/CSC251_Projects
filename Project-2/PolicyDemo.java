import java.util.*;
import java.io.*;

public class PolicyDemo
   {
      public static void main(String[] args) throws IOException
         {
            int policyNum;
            String providerName;
            String firstName;
            String lastName;
            int age;
            String smoke;
            double height;
            double weight;
            
            int nonSmokers = 0;
            int smokers = 0;
            
            File policyInfo = new File("PolicyInformation.txt");
            Scanner sc = new Scanner(policyInfo);
            
            ArrayList<Policy> policyList = new ArrayList<Policy>();
            
            while(sc.hasNextLine())
               {
                  policyNum = Integer.parseInt(sc.nextLine());
                  providerName = sc.nextLine();
                  firstName = sc.nextLine();
                  lastName = sc.nextLine();
                  age = Integer.parseInt(sc.nextLine());
                  smoke = sc.nextLine();
                  height = Double.parseDouble(sc.nextLine());
                  weight = Double.parseDouble(sc.nextLine());
                  if(sc.hasNextLine())
                     sc.nextLine();
                  policyList.add(new Policy(policyNum, providerName, firstName, lastName, age, smoke, height, weight));
                  if(smoke.equals("smoker"))
                     smokers++;
                  else
                     nonSmokers++;
               }
            
            for(Policy currentPolicy : policyList)
               {
                  System.out.println("Policy Number: " + currentPolicy.getPolicyNumber());
                  System.out.println("Provider Name: " + currentPolicy.getProviderName());
                  System.out.println("Policyholder's First Name: " + currentPolicy.getPolicyHolderFirstName());
                  System.out.println("Policyholder's Last Name: " + currentPolicy.getPolicyHolderLastName());
                  System.out.println("Policyholder's Age: " + currentPolicy.getPolicyHolderAge());
                  System.out.println("Policyholder's Smoking Status: " + currentPolicy.getPolicyHolderSmokingStatus());
                  System.out.println("Policyholder's Height: " + currentPolicy.getPolicyHolderHeight());
                  System.out.println("Policyholder's Weight " + currentPolicy.getPolicyHolderWeight());
                  System.out.printf("Policyholder's BMI: %.2f\n", currentPolicy.getBMI());
                  System.out.printf("Policy Price: $%.2f\n", currentPolicy.getPolicyPrice());
                  System.out.println();
               }
            
            System.out.println("The number of policies with a smoker is: " + smokers);
            System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
         }
   }