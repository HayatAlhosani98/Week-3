import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
public class LinkedList {

	public static void main(String[] args) {
ArrayList<Integer> n1 = new ArrayList<>();
		
		n1.add(15);
		n1.add(12);
		n1.add(34);
		n1.add(45);
		n1.add(65);
		n1.add(54);
		n1.add(78);
		n1.add(55);
		n1.add(56);
		n1.add(34);
		
System.out.println(n1);
		
		n1.add(5, 23);
		
		System.out.println(n1);
		
		ArrayList<Integer> n2 =  (ArrayList<Integer>) n1.clone();
		System.out.println(n2);

		n2.remove(2);
		

		System.out.println("frist list size is "+n1.size());
		System.out.println("Secound list size is "+n2.size());
		
		

		System.out.println("Before sorting list:");
		System.out.println(n1);
		Collections.sort(n1);
		System.out.println("after sorting list:");
		System.out.println(n1);
		


		System.out.println("\nSquares of numbers:");
		for (int numberq:n2) {
			int square = numberq * numberq;
			 System.out.println("Square of " + numberq + " is: " + square);
		}
		


        System.out.println("Original List: " + n1);


        List<Integer> evenNumbers = n1.stream()
                .filter(number -> number % 2 == 0) 
                .collect(Collectors.toList()); 

        System.out.println("List of Even Numbers: " + evenNumbers);
        


        System.out.println("\nCubes of numbers in list 2:");
        for (int number : n2) {
            int cube = number * number * number;
            System.out.println("Cube of " + number + " is: " + cube);
        }
        
        
	}

}
