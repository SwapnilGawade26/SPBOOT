package lamda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String args[]) {
		List<User> userList = new ArrayList<User>();
		userList.add(new User("swap", "swapg26@gmail.com", 27));
		userList.add(new User("ab", "ab26@gmail.com", 25));
		userList.add(new User("xy", "xy26@gmail.com", 15));

		/*
		 * for (User user : userList) {
		 * 
		 * System.out.println(user); }
		 */
		//normal sorting
		/*
		 * Collections.sort(userList, new Comparator<User>() {
		 * 
		 * @Override public int compare(User o1, User o2) { // TODO Auto-generated
		 * method stub if (o1.getAge() < o2.getAge()) { return -1; } return 1; }
		 * 
		 * });
		 */
		
		//using lamda funcation or arrow function
		Collections.sort(userList, (User o1, User o2) ->{
				// TODO Auto-generated method stub
				if (o1.getAge() < o2.getAge()) {
					return -1;
				}
				return 1;
			}

		);
		
		//without using lamda
		/*
		 * for (User user : userList) {
		 * 
		 * System.out.println(user); }
		 */
		
		
		//using lamda
		userList.forEach((user) -> {System.out.println(user);});
		
		
		userList.forEach(System.out::println);
		
		
		
	}
}
