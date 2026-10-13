package _11_good_code_etiquette;
import java.util.*;

public class DataManager {
	 public List<User> list = new ArrayList<User>();

	    // Adds a user and their metadata as a single string
	    public void add(String firstName, String lastName, String email, String role) {
	        User user = new User(firstName,lastName,email,role);
	        list.add(user);
	    }

	    public void find(String email) {
	    	list.stream()
	    			.filter(user -> user.getEmail().equals(email))
	    			.forEach(user -> System.out.println("Found: " + user));
	    }
}
