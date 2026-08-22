class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int mainCount=0;
        for(int i = low; i<= high; i++){
            String s = String.valueOf(i);

            if(s.length() % 2 != 0){
                continue;
            }      
            int half = s.length()/2;
            String p1 = s.substring(0,half);
            String p2 = s.substring(half);
             int num1Sum = 0;
             int num2Sum = 0;
            for(char c : p1.toCharArray()){ 
                int digit = c - '0';  // Convert char to int
                num1Sum += digit;
                }

            for(char c : p2.toCharArray()){ 
                 int digit = c - '0';  // Convert char to int
                 num2Sum += digit;
                }
            if(num1Sum == num2Sum){
                mainCount++;
            }
            }
            return mainCount;
        }
        
    }
