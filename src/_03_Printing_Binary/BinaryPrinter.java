package _03_Printing_Binary;

public class BinaryPrinter {
	// Complete the methods below so they print the passed in parameter in binary.
	// Use bit shifting and bit masking to print the binary numbers.
	// Do not use the Integer.toBinaryString method!
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.

	public static void printByteBinary(byte b) {
		String binaryStr = "";
		int ogNum = b;

		do {
			// 1. Logical right shift by 1
			int quotient = b >>> 1;

			// 2. Check remainder and add '1' or '0'
			if (b % 2 != 0) {
				binaryStr = '1' + binaryStr;
			} else {
				binaryStr = '0' + binaryStr;
			}

			b = (byte) quotient;

		// 3. Repeat until number is 0
		} while (b != 0);

		System.out.println(ogNum + " in binary is " + binaryStr);
	}

	public static void printShortBinary(short s) {
		String binaryStr = "";
		short ogNum = s;
	    
        do {
            // 1. Logical right shift by 1
            int quotient = s >>> 1;
        
            // 2. Check remainder and add '1' or '0'
            if( s % 2 != 0 ){
                binaryStr = '1' + binaryStr;
            } else {
                binaryStr = '0' + binaryStr;
            }
            
            s = (short) quotient;
            
        // 3. Repeat until number is 0
        } while( s != 0 );
        
        System.out.println(ogNum + " in binary is " + binaryStr);
	}

	public static void printIntBinary(int i) {
		String binaryStr = "";
		int ogNum = i;

		do {
			// 1. Logical right shift by 1
			int quotient = i >>> 1;

			// 2. Check remainder and add '1' or '0'
			if (i % 2 != 0) {
				binaryStr = '1' + binaryStr;
			} else {
				binaryStr = '0' + binaryStr;
			}

			i = quotient;

			// 3. Repeat until number is 0
		} while (i != 0);

		System.out.println(ogNum + " in binary is " + binaryStr);

	}

	public static void printLongBinary(long l) {
		String binaryStr = "";
		long ogNum = l;

		do {
			// 1. Logical right shift by 1
			long quotient = l >>> 1;

			// 2. Check remainder and add '1' or '0'
			if (l % 2 != 0) {
				binaryStr = '1' + binaryStr;
			} else {
				binaryStr = '0' + binaryStr;
			}

			l = quotient;

			// 3. Repeat until number is 0
		} while (l != 0);

		System.out.println(ogNum + " in binary is " + binaryStr);
	}

	public static void main(String[] args) {
		printIntBinary(7);
		printByteBinary((byte)7);
		printShortBinary((short)7);
		printLongBinary((long)7);
	}
}
