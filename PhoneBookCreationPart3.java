/**
 * Assignment01
 * COMP 1020 SECTION A01
 * INSTRUCTOR    Amirhossein
 * ASSIGNMENT    Assignment01
 * @author       Danhang Liu, 7716234
 * @version      2015-06-04
 * Purpose:      PhoneBookCreationPart3 sort out some Contact object and create 
 *               a new array while deleting some elements
 */
import javax.swing.JOptionPane;
public class PhoneBookCreationPart3{
  
 private Contact[] array;//craete an array for Contact
 private int size;
 private static int totalNumbers = 0;//which will keep track of the number of Contact objects

 /** default constructor
   */
 public PhoneBookCreationPart3(){
   size = 3;
   array = new Contact[size];
 }
 /** constructor accept a Contact variable
   * @param object Contact variable
   */
 public void addObjectToList(Contact object){
   array[totalNumbers] = object;
   totalNumbers++;
   if(indexNum() == -1)
   makeItBigger();
 }
 /**method indexNum() will look for the first null number
   * @return index the first null number count
   */ 
 public int indexNum(){
   int index = 0;
   for(int i = 0; i<array.length;i++){
     if(array[i] != null)
       index = -1;
     else
       index = i;
   }
   return index;
 }
 /**method makeItBigger() will expand the size to the double siz
   */
 public void makeItBigger(){
   Contact[] arrayNew = new Contact[2*array.length];//double the size
   for(int i =0; i<array.length;i++){
     arrayNew[i] = array[i];
   }
   array = arrayNew;
   System.out.println("Array is now bigger! "+array.length);     
 }
 /** method sortAToZ will sort all array 
   */
 public void sortAToZ(){
   int startScan, index, minIndex; 
   Contact minValue;
   
   for (startScan = 0; startScan < (totalNumbers-1); startScan++)//using for loop to keep track of the index
   {
     minIndex = startScan;//set the min index
     minValue = array[startScan];//set the min avriable
     for(index = startScan + 1; index < totalNumbers; index++)
     {
       if (array[index].getFirstName().compareTo(minValue.getFirstName())<0)//if the previous one less than the second one 
       {
         minIndex = index;//if found update the min index
         minValue = array[index];//upadate the min value
       }
     }
     array[minIndex] = array[startScan];    
     array[startScan] = minValue;//switch two variable
   }
 }
 /** method deleteObjectFromList will search the value if it exist and delet it then create a new array
   * @param nameF first name the user wnat to search
   * @param nameL last name search
   */
 public void deleteObjectFromList(String nameF,String nameL){ 
   int index = 0;        // Loop control variable
   int number = -1;      // Element the value is found at
   boolean found = true;    // Flag indicating search results 
   String input = JOptionPane.showInputDialog(null,"You are requesting to delete a record from your Contact! \nPlease " 
                                                +"enter yes to continue or no to not deleting your record.");
   if(input.equalsIgnoreCase("yes")){
     while (found && index < totalNumbers)//true and less than the length, exectue the following
     {
       String firstName = array[index].getFirstName();//represent to new variable and convert to the lower case
       String lastName = array[index].getLastName();
       if (firstName.equalsIgnoreCase(nameF)&&lastName.equalsIgnoreCase(nameL))//ingore case and if match, execute the following
       {
         found = false;//loop will quit if false
       number = index;//the order of the array
       }        
       index++;//update
     }
     if(number != -1){
       Contact temp = array[number];
       array[number] = array[totalNumbers-1];
       array[totalNumbers-1] = temp;
       totalNumbers--;
       Contact[] arrayNew = new Contact[array.length];
       System.arraycopy(array,0,arrayNew,0,totalNumbers);//copy array by using System.arraycopy()
       array = arrayNew;
       JOptionPane.showMessageDialog(null,"Search in the database for deleting a record");
       System.out.println("Search in the database for deleting a record");
       JOptionPane.showMessageDialog(null,nameF+" "+nameL+" was found and deleted successfully");
       System.out.println(nameF+" "+nameL+" was found and deleted successfully");//display message when object is found
     }
     else{
       JOptionPane.showMessageDialog(null,"Search in the database for deleting a record");
       System.out.println("Search in the database for deleting a record");
       JOptionPane.showMessageDialog(null,"No record was found in the database related to: "+nameF+" "+nameL);
       System.out.println("No record was found in the database related to: "+nameF+" "+nameL);//display message when object is not found
     }
   }
   else{
     JOptionPane.showMessageDialog(null,"You have decided to not to delete any record! No" 
                                     +"record has been touched.");
     System.out.println("You have decided to not to delete any record! No" 
                          +"record has been touched.");
   }
 }
 
 /** method toString will return String value to dispaly the message
   * @param str to print a message
   */
 public String toString(){
   String str = "Total avilable records: "+totalNumbers;
   for(int i =0 ; i<totalNumbers; i++){
     str = str + "\n\t"+array[i].toString()+"\n";
   }
   return str;   
 }
 
}