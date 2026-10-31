class Solution {
    public String removeKdigits(String num, int k) {

      Stack<Character> s = new Stack<>();
      for(char ch : num.toCharArray()){
        while(k > 0 && !s.isEmpty() && s.peek() > ch){
            s.pop();
            k--;
        }
        s.push(ch);
      }
     StringBuilder ans = new StringBuilder();
  
    while(k > 0 && !s.isEmpty()){
        s.pop();
        k--;
    }
    while(!s.isEmpty()){
        ans.append(s.peek());
        s.pop();
        
    }
    ans.reverse();
    int index = 0;
    while(index < ans.length() && ans.charAt(index) == '0'){
        index++;
    }
    String result = ans.substring(index);
    if(result.length() == 0){
        return "0";
    }
    else{
    return result;
    }
    }
}