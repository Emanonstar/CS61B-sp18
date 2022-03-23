/** Performs some basic linked list tests. */
public class LinkedListDequeTest {
	
	/* Utility method for printing out empty checks. */
	public static boolean checkEmpty(boolean expected, boolean actual) {
		if (expected != actual) {
			System.out.println("isEmpty() returned " + actual + ", but expected: " + expected);
			return false;
		}
		return true;
	}

	/* Utility method for printing out empty checks. */
	public static boolean checkSize(int expected, int actual) {
		if (expected != actual) {
			System.out.println("size() returned " + actual + ", but expected: " + expected);
			return false;
		}
		return true;
	}

	/* Prints a nice message based on whether a test passed. 
	 * The \n means newline. */
	public static void printTestStatus(boolean passed) {
		if (passed) {
			System.out.println("Test passed!\n");
		} else {
			System.out.println("Test failed!\n");
		}
	}

	/** Adds a few things to the list, checking isEmpty() and size() are correct, 
	  * finally printing the results. 
	  *
	  * && is the "and" operation. */
	public static void addIsEmptySizeTest() {

		LinkedListDeque<String> lld1 = new LinkedListDeque<String>();

		boolean passed = checkEmpty(true, lld1.isEmpty());

		lld1.addFirst("front");

		// The && operator is the same as "and" in Python.
		// It's a binary operator that returns true if both arguments true, and false otherwise.
		passed = checkSize(1, lld1.size()) && passed;
		passed = checkEmpty(false, lld1.isEmpty()) && passed;

		lld1.addLast("middle");
		passed = checkSize(2, lld1.size()) && passed;

		lld1.addLast("back");
		passed = checkSize(3, lld1.size()) && passed;

		System.out.println("Printing out deque: ");
		lld1.printDeque();

		printTestStatus(passed);

	}

	/** Adds an item, then removes an item, and ensures that dll is empty afterwards. */
	public static void addRemoveTest() {
		LinkedListDeque<Integer> lld1 = new LinkedListDeque<Integer>();
		// should be empty 
		boolean passed = checkEmpty(true, lld1.isEmpty());

		lld1.addFirst(10);
		// should not be empty 
		passed = checkEmpty(false, lld1.isEmpty()) && passed;

		lld1.removeFirst();
		// should be empty 
		passed = checkEmpty(true, lld1.isEmpty()) && passed;

		printTestStatus(passed);

	}

	/** Tests public T get(int index). */
	public static void getTest() {
		LinkedListDeque<Integer> lld1 = new LinkedListDeque<Integer>();
//		if (lld1.get(0) != null) {
//			System.out.println("the 0th item of empty dqueue should be null");
//		}
		boolean passed = lld1.get(0) == null;
		lld1.addFirst(10);
		lld1.addFirst(9);
		lld1.addLast(11);

//		int output = lld1.get(2);
//		if (output != 11) {
//			System.out.println("the first item of dqueue should be 10 but got " + 11);
//		}
		passed = lld1.get(1) == 10 && lld1.get(0) == 9 && lld1.get(2) == 11 && passed;
		printTestStatus(passed);
	}

	/** Tests public T get(int index). */
	public static void getRecursiveTest() {
		LinkedListDeque<Integer> lld1 = new LinkedListDeque<Integer>();
//		if (lld1.get(0) != null) {
//			System.out.println("the 0th item of empty dqueue should be null");
//		}
		boolean passed = lld1.get(0) == null;
		lld1.addFirst(10);
		lld1.addFirst(9);
		lld1.addLast(11);

//		int output = lld1.get(2);
//		if (output != 11) {
//			System.out.println("the first item of dqueue should be 10 but got " + 11);
//		}
		passed = lld1.getRecursive(1) == 10 && lld1.getRecursive(0) == 9 && lld1.getRecursive(2) == 11 && passed;
		printTestStatus(passed);
	}

	public static void main(String[] args) {
		System.out.println("Running tests.\n");
		addIsEmptySizeTest();
		addRemoveTest();
		getTest();
		getRecursiveTest();
	}
} 