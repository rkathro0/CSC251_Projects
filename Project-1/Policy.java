public class Policy
   {
   
      private int policyNum;
      private String providerName;
      private String policyHolderFirstName;
      private String policyHolderLastName;
      private int policyHolderAge;
      private String policyHolderSmokingStatus;
      private double policyHolderHeight;
      private double policyHolderWeight;
      
      public Policy()
         {
            policyNum = 0;
            providerName = "";
            policyHolderFirstName = "";
            policyHolderLastName = "";
            policyHolderAge = 0;
            policyHolderSmokingStatus = "";
            policyHolderHeight = 0;
            policyHolderWeight = 0;
         }
      public Policy(int num, String provName, String fName, String LName, int age, String smoke, double height, double weight)
         {
            policyNum = num;
            providerName = provName;
            policyHolderFirstName = fName;
            policyHolderLastName = LName;
            policyHolderAge = age;
            policyHolderSmokingStatus = smoke;
            policyHolderHeight = height;
            policyHolderWeight = weight;
         }
      public void setPolicyNumber(int num)
         {
            policyNum = num;
         }
      public void setProviderName(String name)
         {
            providerName = name;
         }
      public void setPolicyHolderFirstName(String name)
         {
            policyHolderFirstName = name;
         }
      public void setPolicyHolderLastName(String name)
         {
            policyHolderLastName = name;
         }
      public void setPolicyHolderAge(int age)
         {
            policyHolderAge = age;
         }
      public void setPolicyHolderSmokingStatus(String smoke)
         {
            policyHolderSmokingStatus = smoke;
         }
      public void setPolicyHolderHeight(double height)
         {
            policyHolderHeight = height;
         }
      public void setPolicyHolderWeight(double weight)
         {
            policyHolderWeight = weight;
         }
      
      
      public int getPolicyNumber()
         {
            return policyNum;
         }
      public String getProviderName()
         {
            return providerName;
         }
      public String getPolicyHolderFirstName()
         {
            return policyHolderFirstName;
         }
      public String getPolicyHolderLastName()
         {
            return policyHolderLastName;
         }
      public int getPolicyHolderAge()
         {
            return policyHolderAge;
         }
      public String getPolicyHolderSmokingStatus()
         {
            return policyHolderSmokingStatus;
         }
      public double getPolicyHolderHeight()
         {
            return policyHolderHeight;
         }
      public double getPolicyHolderWeight()
         {
            return policyHolderWeight;
         }
      public double getBMI()
         {
            return ((policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight));
         }
      public double getPolicyPrice()
         {
            double price = 600;
            
            if(policyHolderAge > 50)
               price += 75;
            
            if(policyHolderSmokingStatus.equals("smoker"))
               price += 100;
            
            if(getBMI() > 35)
               price += ((getBMI() - 35) * 20);
            
            return price;
         }
   }