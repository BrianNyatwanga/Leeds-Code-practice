/**You are given a large integer represented as an integer array digits, 
where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. 
The large integer does not contain any leading 0's. Increment the large integer by one and return the resulting array of digits.*/
class PlusOne {  
    public int[] plusOne(int[] digits) {  
        int num = 0;  
        for (int a : digits) {  
            num = 10*num + a;  
        }  
        int n=num+1;  
        String str=String.valueOf(n);  
        int arr[]=new int[str.length()];  
        for(int i=0;i<str.length();i++){  
            arr[i]=str.charAt(i)-'0';  
        }  
        return arr;  
    }
}