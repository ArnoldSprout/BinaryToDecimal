package com.company;

public class BinaryToDecimal {
    public int convertToDecimal(String binary){
    // int convertion = 1;
        int result = 0;
        for(int i=1; i <= binary.length(); i++){
            if(binary.charAt(binary.length() - i) == '1')
                result += Math.pow(2, i-1);
                // OR
                //result += conversion;
              //conversion *= 2;
        }
        return result;
    }
}
