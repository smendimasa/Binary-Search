import javax.swing.JOptionPane;

/**
 * Test the Binary Search Algorithm with integers and String. Note the list must be sorted
 * @author Sam Mendimasa
 * @version 1 June 1, 2016
 *
 */
public class BinarySearchTest1 {

	public static void main(String[] args) {
		

	
		// create an array with integers
		int[] array = { 55, 1, 5, 9, 61, 1 };

		// display array before it's sorted
		System.out.println("Array Before Sort: \n"
				+ UtilitySort.printArray(array));

		// sorts the array
		UtilitySort.bubbleSort(array);
		// display the sorted array
		System.out.println(UtilitySort.printArray(array));

		// searching
		String value = JOptionPane
				.showInputDialog("Enter an Integer Value to Search: ");
		System.out
				.println("\n------------------------------Searching----------------------\n");

		try {
			System.out.println(UtilitySearch.search(array,
					Integer.parseInt(value)));
		} catch (NumberFormatException e) {
			System.out.println("Not a Valid Input");
		}

		// moving to strings
		System.out
				.println("-------------------------Sorting Strings-------------------------");
		System.out.println();
		// creates an array of Strings
		String[] stringArray = { "John", "Sam", "alla", "ALLA", "Abraham" };

		// display array before it's sorted
		System.out.println("Array Before Sort: \n"
				+ UtilitySort.printArray(stringArray));
		// sorts the array
		UtilitySort.bubbleSort(stringArray);
		// display the sorted array
		System.out.println(UtilitySort.printArray(stringArray));

		
		String value2 = JOptionPane
				.showInputDialog("Enter a string to Search: ");
		System.out
				.println("\n------------------------------Searching----------------------\n");

		System.out.println(UtilitySearch.search(stringArray, value2));

	}

}
