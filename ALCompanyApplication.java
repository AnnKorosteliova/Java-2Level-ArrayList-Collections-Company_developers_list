import java.util.ArrayList;

public class ALCompanyApplication {

	public static void main(String[] args) {

		//<String> is generic, which shows the type of elements in the ArrayList  	
		ArrayList<String> devs = new ArrayList<>();
		
		devs.add("Johny");
		devs.add("Valeryana");
		devs.add("Tatyana");
		devs.add("Peter");
		devs.add("Marry");		
			
		System.out.println("Developers: ");
		for (String name : devs) {
			System.out.println(name.charAt(0) + ".");
		}
		
		int maxLenght = 0;
		for (String names : devs) {
			if(names.length() > maxLenght ) { 
				maxLenght = names.length();
			}
			if(names.length() == maxLenght && names.length() > names.length()-1) {
				System.out.println("\n" + names + " - the longest name\n\n");
			}
		}		
		
		//swap first & last element
		String temp;
		temp = devs.get(0);
		devs.set(0, devs.get(devs.size()-1));
		devs.set(devs.size()-1, temp);
		
		System.out.println("Developers: ");
		for (String name : devs) {
			System.out.println(name.charAt(0) + ".");
		}
	}
}
