public class Assignment1Part3
{
  public static void main(String [] args)
  {
    PhoneBookCreationPart3 list = new PhoneBookCreationPart3();
    /*
    list.addObjectToList( new Contact("Amir1","Memar1","111-1111111",true) );
    list.addObjectToList( new Contact("Stew2","Dent2","222-2222222",false) );
    list.addObjectToList( new Contact("Stew3","Dent3","333-3333333",true) );
    list.addObjectToList( new Contact("Stew4","Dent4","444-4444444",false) );
    list.addObjectToList( new Contact("Stew5","Dent5","555-5555555",true) );
    list.addObjectToList( new Contact("Stew6","Dent6","666-6666666",false) );
    list.addObjectToList( new Contact("Stew7","Dent7","777-7777777",true) );
    list.addObjectToList( new Contact("Stew8","Dent8","888-8888888",false) );
    */
    list.addObjectToList( new Contact("Stew5","Dent5","555-5555555",true) );
    list.addObjectToList( new Contact("Stew3","Dent3","333-3333333",true) );
    list.addObjectToList( new Contact("Chaos2","Knight2","222-2222222",false) );
    list.addObjectToList( new Contact("Stew8","Dent8","888-8888888",false) );
    list.addObjectToList( new Contact("Stew7","Dent7","777-7777777",true) );
    list.addObjectToList( new Contact("Amir1","Memar1","111-1111111",true) );
    list.addObjectToList( new Contact("Stew4","Dent4","444-4444444",false) );
    list.addObjectToList( new Contact("Spirit6","breaker6","666-6666666",false) );
    
    System.out.println("Before sorting the array:");
    print(list);
    
    list.sortAToZ();
    System.out.println("After sorting the array:");
    print(list);
    
    //System.out.println(list.deleteObjectFromList("Life","stealer"));
    //System.out.println(list.deleteObjectFromList("Chaos2","Knight2"));
    list.deleteObjectFromList("Life","stealer");
    list.deleteObjectFromList("Chaos2","Knight2");
    list.deleteObjectFromList("Spirit6","breaker6");
    list.deleteObjectFromList("Ashley7","Rogoski3");
    
    print(list);
    System.out.println("\n\nEnd of processing.");
    System.out.println("Programmed by Danhang Liu.");
  }
  
  public static void print( PhoneBookCreationPart3 list)
  {
    
      System.out.println(list.toString());

  }

}