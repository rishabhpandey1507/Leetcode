class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        StringBuilder result = new StringBuilder();

while (!st.isEmpty()) {
    result.append(st.pop());
}

result.reverse();

String ans = result.toString();
return ans;
    }
}