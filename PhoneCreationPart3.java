import javax.swing.JOptionPane;
public class PhoneCreationPart3{
  
 private Contact[] array;
 private int size;
 private static int count = 0;
 private static int totalNumbers = 0;
 
 public PhoneCreationPart3(){
   size = 3;
   array = new Contact[size];
 }
 public void addObjectToList(Contact object){
   array[count] = object;
   count++;
   totalNumbers++;
   if(indexNum() == -1)
   makeItBigger();
 }
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
 public void makeItBigger(){
   Contact[] arrayNew = new Contact[2*array.length];
   for(int i =0; i<array.length;i++){
    arrayNew[i] = array[i];
   }
   array = arrayNew;
   System.out.println("Array is now bigger! "+getSize());     
 }
 
 public int getCount(){
   return this.count; 
 }
 
 public int getSize(){
   return this.array.length;
 }
 
 public void deleteObjectFromList(String nameF,String nameL){ 
   int index = 0;        // Loop control variable
   int number = -1;      // Element the value is found at
   boolean found = true;    // Flag indicating search results       
   while (found && index < array.length)//true and less than the length, exectue the following
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
     for(int i = 0; i<array.length; i++){
     Contact temp = array[number];
    array[number] = array[count-1];
    array[count-1] = temp;
   }
   int newSize = count-1;
      Contact[] resized = new Contact[newSize];//create the new array of the object
      for (int i = 0; i < newSize; i++)//loop for copying
      {
        resized[i] = array[i];//match the order
      }
      array = resized;
   }
 }
 
 
 
 public String toString(){
   String str = "";
   for(int i =0 ; i<count; i++){
     str = str + "\n\t"+array[i].toString();
   }
   return str;   
 }

 
}