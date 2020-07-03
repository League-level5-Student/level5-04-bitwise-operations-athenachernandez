package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4; 
		int numShifted = num << 1;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted);
		String binary = convertDecimalToBinary(num);
		System.out.println("Binary before shifting: " + binary);
		binary = convertDecimalToBinary(numShifted);
		System.out.println("Binary after shifting: " + binary);
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		// multiplying 2 ^ whatever comes after the << operator by the num
		
		// 4. Try shifting num 3 places.
		numShifted = num << 3;
		
		System.out.println(numShifted);
		binary = convertDecimalToBinary(num);
		System.out.println("Binary before shifting: " + binary);
		binary = convertDecimalToBinary(numShifted);
		System.out.println("Binary after shifting: " + binary);
		
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
	public static String convertDecimalToBinary(int decimalNum) {
        String binaryStr = "";
    
        do {
            // 1. Logical right shift by 1
            int quotient = decimalNum >>> 1;
        
            // 2. Check remainder and add '1' or '0'
            if( decimalNum % 2 != 0 ){
                binaryStr = '1' + binaryStr;
            } else {
                binaryStr = '0' + binaryStr;
            }
            
            decimalNum = quotient;
            
        // 3. Repeat until number is 0
        } while( decimalNum != 0 );
        
        return binaryStr;
    }
}
