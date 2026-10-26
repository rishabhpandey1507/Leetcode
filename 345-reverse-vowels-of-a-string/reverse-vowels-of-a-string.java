class Solution {
    public String reverseVowels(String s) {
char [] ch = s.toCharArray();
int n = ch.length;
int low = 0;
int high = n-1;
      while(low <= high){
        while (low < high && 
       Character.toLowerCase(ch[low]) != 'a' && 
       Character.toLowerCase(ch[low]) != 'e' && 
       Character.toLowerCase(ch[low]) != 'i' && 
       Character.toLowerCase(ch[low]) != 'o' && 
       Character.toLowerCase(ch[low]) != 'u') {
    low++;
}
     while (low < high && 
       Character.toLowerCase(ch[high]) != 'a' && 
       Character.toLowerCase(ch[high]) != 'e' && 
       Character.toLowerCase(ch[high]) != 'i' && 
       Character.toLowerCase(ch[high]) != 'o' && 
       Character.toLowerCase(ch[high]) != 'u') {
    high--;
}
char temp = ch[low];
ch[low] = ch[high];
ch[high] = temp;
        low++;
        high--;
      } 
      return new String(ch);
    }
}