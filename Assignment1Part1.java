public class PhoneCreationPart2V1{
  
 private Contact[] array;
 private int size;
 private static int count = 0;
 
 public PhoneCreationPart2V1(){
   size = 3;
   array = new Contact[size];
 }
 public void addObjectToList(Contact object){
   array[count] = object;
   count++;
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
 
 public String toString(){
   String str = "";
   for(int i =0 ; i<count; i++){
     str = str + "\n\t"+array[i].toString();
   }
   return str;   
 }
 
}