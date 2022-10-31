public class Policy
   {
   
      private int policyNum;
      private String providerName;
      private PolicyHolder policyHolder;
      private static int policyCount = 0;
      private static int smokingCount = 0;
      
      /**
      This constructor method sets the value of numeric fields to 0, String fields to an empty string, and objects to null
      */
      public Policy()
         {
            policyNum = 0;
            providerName = ""; 
            policyHolder = new PolicyHolder();
            policyCount++;
         }
      
      /**
      This constructor method sets the value of numeric variables to 0 and String variables to an empty string
      @param num Policy number
      @param provName Provider name
      @param pHolder PolicyHolder object
      */
      public Policy(int num, String provName, PolicyHolder pHolder)
         {
            policyNum = num;
            providerName = provName;
            policyHolder = new PolicyHolder(pHolder);
            policyCount++;
            if(policyHolder.getPolicyHolderSmokingStatus().equals("smoker"))
               smokingCount++;
         }
      
      //Mutator methods
      /**
      This method sets the policyNum field to the value of the parameter
      @param num New policy number
      */
      public void setPolicyNumber(int num)
         {
            policyNum = num;
         }
      
      /**
      This method sets the providerName field to the value of the parameter
      @param name New providerName
      */
      public void setProviderName(String name)
         {
            providerName = name;
         }
            
      //Accessor methods
      /**
      This method returns the policyNum field
      @return policyNum Customer Policy Number
      */
      public int getPolicyNumber()
         {
            return policyNum;
         }
      
      /**
      This method returns the providerName field
      @return providerName Customer Policy Provider Name
      */
      public String getProviderName()
         {
            return providerName;
         }
      
      /**
      This method returns the policyHolder field
      @return policyHolder PolicyHolder Object
      */
      public PolicyHolder getPolicyHolder()
         {
            return new PolicyHolder(policyHolder);
         }
      
      /**
      This method returns the the number of policies created
      @return policyCount Number of policies created
      */
      public int getPolicyCount()
         {
            return policyCount;
         }
      
      /**
      This method returns the the number of smoking policies created
      @return smokingCount Number of smoking policies created
      */
      public int getSmokingCount()
         {
            return smokingCount;
         }
            
      /**
      This method calculates the policy price using the policyHolderAge and polocyHolderAge fields and the getBMI() method 
      @return price Monthly premium for the customer's policy
      */
      public double getPolicyPrice()
         {
            double price = 600;
            
            if(policyHolder.getPolicyHolderAge() > 50)
               price += 75;
            
            if(policyHolder.getPolicyHolderSmokingStatus().equals("smoker"))
               price += 100;
            
            if(policyHolder.getBMI() > 35)
               price += ((policyHolder.getBMI() - 35) * 20);
            
            return price;
         }
      
      //toString method
      public String toString()
         {
            return "Policy Number: " + policyNum +
                   "\nPolicy Provider: " + providerName + 
                   "\n" + policyHolder.toString() + 
                   "\nPolicy Price: $" + getPolicyPrice();
         }
   }