import javax.swing.JOptionPane;

/**
 * The UtilitySearch class performs the Binary Search algorithm on an array of
 * integers, Strings, and Objects of type pirate
 * 
 * @author Sam Mendimasa
 * @version 1 June 1, 2016
 *
 */
public class UtilitySearch {

	/**
	 * Performs the Binary search algorithm on an array of integers
	 * 
	 * @param array
	 *            the array to be sorted
	 * @param key
	 *            the value to search within the array
	 * @return the index of the value if it's found. -1 is return if value is
	 *         not found
	 */
	private static int binarySearch(int[] array, int key) {
		//more comments and such

		int firstIndex = 0; // first index of the array
		int lastIndex = array.length - 1; // last index of array
		boolean found = false; // true when key is found in array
		int currentIndex = -1;// current index of the loop

		// search for the key
		while (!found && firstIndex <= lastIndex) {
			// middle of the array
			int middleIndex = (firstIndex + lastIndex) / 2;

			// when key is found
			if (array[middleIndex] == key) {
				found = true;
				currentIndex = middleIndex;
			}

			// key is in left half of array
			else if (array[middleIndex] > key)
				lastIndex = (middleIndex - 1);

			// key is in right half of array
			else
				firstIndex = (middleIndex + 1);
		}
		// the index at which key is found or -1 if key is not found
		return currentIndex;
	}

	/**
	 * Performs the Binary search algorithm on an array of Strings. This method
	 * ignores the case of the String
	 * 
	 * @param array
	 *            the array to be sorted
	 * @param key
	 *            the value to search within the array
	 * @return the index of the value if it's found. -1 is return if value is
	 *         not found
	 */
	private static int binarySearch(String[] array, String key) {

		int firstIndex = 0; // first index of the array
		int lastIndex = array.length - 1; // last index of array
		boolean found = false; // true when key is found in array
		int currentIndex = -1;// current index of the loop

		// search for the key
		while (!found && firstIndex <= lastIndex) {
			// middle of the array
			int middleIndex = (firstIndex + lastIndex) / 2;

			// when key is found
			if (array[middleIndex].equalsIgnoreCase(key)) {
				found = true;
				currentIndex = middleIndex;
			}

			// key is in left half of array
			else if (array[middleIndex].compareToIgnoreCase(key) > 0)
				lastIndex = (middleIndex - 1);

			// key is in right half of array
			else
				firstIndex = (middleIndex + 1);
		}
		// the index at which key is found or -1 if key is not found
		return currentIndex;
	}

	/**
	 * Performs the Binary search algorithm on an array of Objects. The object
	 * must implement the comparable interface.
	 * 
	 * @param array
	 *            the array to be sorted
	 * @param key
	 *            the value to search within the array
	 * @return the index of the value if it's found. -1 is return if value is
	 *         not found
	 */
	private static int binarySearch(Comparable[] array, Comparable key) {

		if (!(array.getClass().equals(String.class))) {
			// converts/match the key to a comparable object if it's send as
			// type
			// String
			if (key.getClass() == String.class) {
				// converts key to it's string representation
				String key1 = (String) key;

				// reformat key1 to a format where the first letter is Upper
				// case
				// and the rest is lower case. This is done because it's
				// difficult
				// to convert String to an object within this project
				String key1half1 = key1.charAt(0) + "";
				key1half1 = key1half1.toUpperCase();
				String key1half2 = key1.substring(1);
				key1half2 = key1half2.toLowerCase();
				key1 = key1half1 + key1half2;

				for (Comparable x : array) {
					if (x.toString().contains(key1)) {
						key = x;
					}
				}
			}

		}
		
		//binary search algorithm
		int firstIndex = 0; // first index of the array
		int lastIndex = array.length - 1; // last index of array
		boolean found = false; // true when key is found in array
		int currentIndex = -1;// current index of the loop

		// search for the key
		while (!found && firstIndex <= lastIndex) {
			// middle of the array
			int middleIndex = (firstIndex + lastIndex) / 2;

			// when key is found
			if (array[middleIndex].equals(key)) {
				found = true;
				currentIndex = middleIndex;
			}

			// key is in left half of array
			else if (array[middleIndex].compareTo(key) > 0)
				lastIndex = (middleIndex - 1);

			// key is in right half of array
			else
				firstIndex = (middleIndex + 1);
		}
		// the index at which key is found or -1 if key is not found
		return currentIndex;
	}

	/**
	 * Return a string representation of the result from the binary search that
	 * searches an array of integers
	 * 
	 * @param array
	 *            the array of integers to be sorted
	 * @param key
	 * @return
	 */
	public static String search(int[] array, int key) {
		int searchIndex = binarySearch(array, key);

		if (searchIndex != -1)
			return key + " was found in the array at index " + searchIndex;
		else
			return key + " was not found in the array";
	}

	/**
	 * Return a string representation of the result from the binary search that
	 * searches an array of Strings
	 * 
	 * @param array
	 *            the array of Strings to be sorted
	 * @param key
	 * @return
	 */
	public static String search(String[] array, String key) {
		int searchIndex = binarySearch(array, key);

		if (searchIndex != -1)
			return key + " was found in the array at index " + searchIndex;
		else
			return key + " was not found in the array";
	}

	/**
	 * Return a string representation of the result from the binary search that
	 * searches an array of objects. The Objects j=must implement the comparable
	 * interface
	 * 
	 * @param array
	 *            the array of objects to be sorted
	 * @param key
	 * @return
	 */
	public static String search(Comparable[] array, Comparable key) {
		int searchIndex = -1;

		try {
		searchIndex = binarySearch(array, key);
		} catch (ClassCastException e) {
			JOptionPane.showMessageDialog(null, "Invalid Input");
		}

		if (searchIndex != -1) {
			
			return key + " was found in the array at index " + searchIndex;
		} else
			return key + " was not found in the array";
	}
}
