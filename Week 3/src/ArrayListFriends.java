
import java.util.ArrayList;

public class ArrayListFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        ArrayList<String> a1 = new ArrayList<>(); 
        
        a1.add("Hayat");
        a1.add("Halima");
        a1.add("Eiman");
        a1.add("Meera");
        a1.add("Rafia");
        
        a1.add(2,"Sara");
        
        ArrayList<String> a2 =  (ArrayList<String>) a1.clone(); 
       
        a2.remove(4);
        
      
        
        System.out.println("FriendsList " + a1);
        System.out.println("CopyFriendsList"+a2);
        System.out.println("The size of a second array list is "+a2.size());



	}
}
