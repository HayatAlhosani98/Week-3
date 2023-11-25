import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list1.add(i);
        }

        list1.add(5, 11);

        List<Integer> list2 = new ArrayList<>(list1);

        list2.remove(2);

        System.out.println("Size of List1: " + list1.size());
        System.out.println("Size of List2: " + list2.size());

        list1.sort(Integer::compareTo);

        list2.forEach(num -> System.out.print(num * num + " "));

        List<Integer> evenList = list1.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        int sumOfCubes = list2.stream()
                .mapToInt(num -> num * num * num)
                .sum();
        System.out.println("\nTotal of Cube of Numbers in List2: " + sumOfCubes);
        
        
    }
}