public class PolicyHolder
   {
      
      private String policyHolderFirstName;
      private String policyHolderLastName;
      private int policyHolderAge;
      private String policyHolderSmokingStatus;
      private double policyHolderHeight;
      private double policyHolderWeight;
      
      /**
      This constructor method sets the value of numeric fields to 0 and String fields to an empty string
      */
      public PolicyHolder()
         {
            policyHolderFirstName = "";
            policyHolderLastName = "";
            policyHolderAge = 0;
            policyHolderSmokingStatus = "";
            policyHolderHeight = 0;
            policyHolderWeight = 0;
         }
      
      /**
      This constructor method sets the value of the fields to those of the object parameter
      @param object1 PolicyHolder object
      */
      public PolicyHolder(PolicyHolder object1)
         {
            policyHolderFirstName = object1.policyHolderFirstName;
            policyHolderLastName = object1.policyHolderLastName;
            policyHolderAge = object1.policyHolderAge;
            policyHolderSmokingStatus = object1.policyHolderSmokingStatus;
            policyHolderHeight = object1.policyHolderHeight;
            policyHolderWeight = object1.policyHolderWeight;
         }
      
      /**
      This constructor method sets the value fields to the value of the parameters
      @param fName Customer first name
      @param LName Customer last name
      @param age Customer age
      @param smoke Customer smoking status
      @param height Customer height
      @param weight Customer weight
      */
      public PolicyHolder(String fName, String LName, int age, String smoke, double height, double weight)
         {
            policyHolderFirstName = fName;
            policyHolderLastName = LName;
            policyHolderAge = age;
            policyHolderSmokingStatus = smoke;
            policyHolderHeight = height;
            policyHolderWeight = weight;
         }
      
      //Mutator methods
      /**
      This method sets the policyHolderFirstName field to the value of the parameter
      @param name New first name
      */
      public void setPolicyHolderFirstName(String name)
         {
            policyHolderFirstName = name;
         }
      
      /**
      This method sets the policyHolderLastName field to the value of the parameter
      @param name New last name
      */
      public void setPolicyHolderLastName(String name)
         {
            policyHolderLastName = name;
         }
      
      /**
      This method sets the policyHolderAge field to the value of the parameter
      @param age New policy holder age
      */
      public void setPolicyHolderAge(int age)
         {
            policyHolderAge = age;
         }
      
      /**
      This method sets the policyHolderSmokingStatus field to the value of the parameter
      @param smoke New smoking status
      */
      public void setPolicyHolderSmokingStatus(String smoke)
         {
            policyHolderSmokingStatus = smoke;
         }
      
      /**
      This method sets the policyHolderHeight field to the value of the parameter
      @param height New policy holder height
      */
      public void setPolicyHolderHeight(double height)
         {
            policyHolderHeight = height;
         }
      
      /**
      This method sets the policyHolderWeight field to the value of the parameter
      @param weight New policy holder weight
      */
      public void setPolicyHolderWeight(double weight)
         {
            policyHolderWeight = weight;
         }
      
      //Accessor methods
      /**
      This method returns the policyHolderFirstName field
      @return policyHolderFirstName Customer First Name
      */
      public String getPolicyHolderFirstName()
         {
            return policyHolderFirstName;
         }
      
      /**
      This method returns the policyHolderLastName field
      @return policyHolderLastName Customer Last Name
      */
      public String getPolicyHolderLastName()
         {
            return policyHolderLastName;
         }
      
      /**
      This method returns the policyHolderAge field
      @return policyHolderAge Customer Age
      */
      public int getPolicyHolderAge()
         {
            return policyHolderAge;
         }
      
      /**
      This method returns the policyHolderSmokingStatus field
      @return policyHolderSmokingStatus Customer Smoking Status
      */
      public String getPolicyHolderSmokingStatus()
         {
            return policyHolderSmokingStatus;
         }
      
      /**
      This method returns the policyHolderHeight field
      @return policyHolderHeight Customer Height
      */
      public double getPolicyHolderHeight()
         {
            return policyHolderHeight;
         }
      
      /**
      This method returns the policyHolderWeight field
      @return policyHolderWeight Customer Height
      */
      public double getPolicyHolderWeight()
         {
            return policyHolderWeight;
         }
      
      /**
      This method calculates and returns the BMI of the customer using the policyHolderWeight and policyHolderHeight fields
      @return bmi Body Mass Index of Customer
      */
      public double getBMI()
         {
            return ((policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight));
         }
      
      //toString method
      public String toString()
         {
            return "Policyholder's First Name: " + policyHolderFirstName + 
                   "\nPolicyholder's Last Name: " + policyHolderLastName + 
                   "\nPolicyholder's Age: " + policyHolderAge +
                   "\nPolicyholder's Smoking Status: " + policyHolderSmokingStatus +
                   "\nPolicyholder's Height: " + policyHolderHeight + " inches" +
                   "\nPolicyholder's Weight: " + policyHolderWeight + " pounds" +
                   "\nPolicyholder's BMI: " + getBMI();
         }
   }