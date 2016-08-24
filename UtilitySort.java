/**
 * The Utility Sort class creates three static methods which performs the bubble
 * sort on an array of integers, an array of Strings, and an array of objects
 * 
 * @author Sam Mendimasa
 * @version 1 December 28, 2015
 *
 */
public class UtilitySort {

	/**
	 * Performs the bubble sort to sort an array of integers in ascending order
	 * 
	 * @param integerArray
	 *            holds an array of integers
	 * @return the array of integers sorted
	 */
	public static int[] bubbleSort(int[] array) {

		// loop through the array. This loop decreases by 1 with every pass
		for (int lastIndex = array.length - 1; lastIndex > 0; lastIndex--) {

			// loop from the start of the array to the current lastIndex.
			// lastIndex decreases by one with every pass of the outer loop
			for (int currentIndex = 0; currentIndex < lastIndex; currentIndex++) {

				// ensures that data is being sorted in ascending order
				if (array[currentIndex] > array[currentIndex + 1]) {

					// swap the value at the currentIndex with the value in its
					// neighbor
					int tempVar = array[currentIndex];
					array[currentIndex] = array[currentIndex + 1];
					array[currentIndex + 1] = tempVar;
				}// ends if
			}// ends inner for loop
		}// ends outer for loop

		// return array
		return array;
	}

	/**
	 * Performs the bubble sort to sort an array of Strings in ascending order.
	 * This methods ignores the case of the Strings.
	 * 
	 * @param stringArray
	 *            holds an array of Strings
	 * @return the array of Strings sorted
	 */
	public static String[] bubbleSort(String[] array) {

		// loop through the array. This loop decreases by 1 with every pass
		for (int lastIndex = array.length - 1; lastIndex > 0; lastIndex--) {

			// loop from the start of the array to the current lastIndex.
			// lastIndex decreases by one with every pass of the outer loop
			for (int currentIndex = 0; currentIndex < lastIndex; currentIndex++) {

				// ensures that data is being sorted in ascending order
				if (array[currentIndex]
						.compareToIgnoreCase(array[currentIndex + 1]) > 0) {

					// swap the value at the currentIndex with the value in its
					// neighbor
					String tempVar = array[currentIndex];
					array[currentIndex] = array[currentIndex + 1];
					array[currentIndex + 1] = tempVar;
				}// ends if
			}// ends inner for loop
		}// ends outer for loop

		// return the array
		for(String x: array){
			x+="haha\n";
			System.out.println(x);
		}
		return array;
		
	}

	/**
	 * Performs the bubble sort to sort an array of objects in ascending order.
	 * The objects to be sorted must implement the Comparable interface
	 * 
	 * @param objectsArray
	 *            holds an array of Strings
	 * @return the array of Objects sorted
	 */
	public static Object[] bubbleSort(Comparable[] array) {

		// loop through the array. This loop decreases by 1 with every pass
		for (int lastIndex = array.length - 1; lastIndex > 0; lastIndex--) {

			// loop from the start of the array to the current lastIndex.
			// lastIndex decreases by one with every pass of the outer loop
			for (int currentIndex = 0; currentIndex < lastIndex; currentIndex++) {

				// ensures that data is being sorted in ascending order
				if (array[currentIndex].compareTo(array[currentIndex + 1]) > 0) {

					// swap the value at the currentIndex with the value in its
					// neighbor
					Comparable tempVar = array[currentIndex];
					array[currentIndex] = array[currentIndex + 1];
					array[currentIndex + 1] = tempVar;
				}// ends if
			}// ends inner for loop
		}// ends outer for loop

		// return the array
		return array;
	}

	/**
	 * Creates and returns a String representation of an array
	 * 
	 * @param array
	 *            an array of objects
	 * @return a String representation of the array
	 */
	public static String printArray(Object[] array) {

		String returnString = "";

		// for each loop to traverse object array
		for (Object x : array) {
			returnString += (x + " ");
		}

		return returnString;
	}

	/**
	 * Creates and returns a String representation of an array
	 * 
	 * @param array
	 *            an array of type integers
	 * @return a String representation of the array
	 */

	public static String printArray(int[] array) {

		String returnString = "";

		// for each loop to traverse array
		for (int x : array) {
			returnString += (x + " ");
		}

		return returnString;
	}

}
