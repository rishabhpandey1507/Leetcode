class Solution {
    public String removeDuplicates(String s) {
       char []ch = s.toCharArray();
Stack<Character> st = new Stack<>();

    for(int i = 0; i < ch.length; i++){
        if(st.isEmpty()){
            st.push(ch[i]);
        }
        else if(st.peek() == ch[i]){
            st.pop();
        }
        else{
            st.push(ch[i]);
        }
    } 
StringBuilder result = new StringBuilder();

while (!st.isEmpty()) {
    result.append(st.pop());
}

return result.reverse().toString();
    }
}