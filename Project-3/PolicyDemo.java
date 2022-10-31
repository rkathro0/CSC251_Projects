import java.util.*;
import java.io.*;

public class PolicyDemo
   {
      public static void main(String[] args) throws IOException
         {
            int policyNum;
            String providerName;
            
            int smokers = 0;
            
            File policyInfo = new File("PolicyInformation.txt");
            Scanner sc = new Scanner(policyInfo);
            
            PolicyHolder holder = new PolicyHolder();
            
            ArrayList<Policy> policyList = new ArrayList<Policy>();
            
            while(sc.hasNextLine())
               {
                  policyNum = Integer.parseInt(sc.nextLine());
                  providerName = sc.nextLine();
                  holder.setPolicyHolderFirstName(sc.nextLine());
                  holder.setPolicyHolderLastName(sc.nextLine());
                  holder.setPolicyHolderAge(Integer.parseInt(sc.nextLine()));
                  holder.setPolicyHolderSmokingStatus(sc.nextLine());
                  holder.setPolicyHolderHeight(Double.parseDouble(sc.nextLine()));
                  holder.setPolicyHolderWeight(Double.parseDouble(sc.nextLine()));
                  if(sc.hasNextLine())
                     sc.nextLine();
                  policyList.add(new Policy(policyNum, providerName, holder));
               }
            
            for(Policy currentPolicy : policyList)
               {
                  System.out.println(currentPolicy + "\n");
               }
            
            System.out.println("There were " + policyList.get(0).getPolicyCount() + " Policy objects created.\n");
            System.out.println("The number of policies with a smoker is: " + policyList.get(0).getSmokingCount());
            System.out.println("The number of policies with a non-smoker is: " + (policyList.get(0).getPolicyCount() - policyList.get(0).getSmokingCount()));
            
         }
   }