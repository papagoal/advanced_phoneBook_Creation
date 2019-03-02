class Contact{
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private boolean identifying;
  public Contact(){
    this.firstName = "EMPTY";
    this.lastName = "EMPTY";
    this.phoneNumber = "EMPTY";
    this.identifying = false;  
  }
  public Contact(String firstName,String lastName,String phoneNumber,boolean identifying){
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.identifying = identifying;
  }
  public void setFirstName(String firstName){
   this.firstName = firstName; 
  }
  public void setLastName(String lastName){
   this.lastName = lastName;
  }
  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }
  public void setToWork(boolean identifying){
   this.identifying = identifying;
  }
  public String getFirstName(){
   return this.firstName; 
  }
  public String getLastName(){
   return this.lastName; 
  }
  public String getPhoneNumber(){
    return this.phoneNumber;
  }
  public String getToWork(){
    String result = "";
    if(this.identifying){
      result = "is a work related number";
    }
    else{
      result = "is not a work related number";
    }
    return result;
  }
  public String toString(){
   String str = "";
   str = "****First name:"+firstName+" Last name:"+lastName+"\n\t\tPhone number:"+phoneNumber+"\t"+getToWork();
   return str;
  }
}
