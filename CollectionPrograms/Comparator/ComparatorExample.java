import java.util.Set;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		Set set = new TreeSet(); 
		
		Employee e1=new Employee(1, "S", "Sangli");
		Employee e2=new Employee(2, "P", "Kolhpur");
		Employee e3=new Employee(3, "R", "Satara");
		Employee e4=new Employee(4, "N", "Pune");
		Employee e5=new Employee(5, "B", "bangalore");

		set.add(e3);
		set.add(e1);
		set.add(e5);
		set.add(e2);
		set.add(e4);
		
		for (Object o : set) {
            System.out.println(o);
        }
	}

}
