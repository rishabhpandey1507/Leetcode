class Solution {
    public boolean validDigit(int n, int x) {
       int rem = 0;
       int count = 0;
       while(n != 0){
        rem = n % 10;
        n = n / 10;
        if(rem == x){
            count++;
        }
       } 
       if(rem == x || count == 0) return false;
       else return true;
    }
}