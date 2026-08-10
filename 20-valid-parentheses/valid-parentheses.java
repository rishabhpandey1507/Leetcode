class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '(' || arr[i] == '{' || arr[i] == '['){
                stack.push(arr[i]);
            }
            else if (arr[i] == ')') {
    if (stack.isEmpty() || stack.peek() != '(') {
        return false;
    }
    stack.pop();
}
            else if (arr[i] == '}') {
    if (stack.isEmpty() || stack.peek() != '{') {
        return false;
    }
    stack.pop();
}
            else if (arr[i] == ']') {
    if (stack.isEmpty() || stack.peek() != '[') {
        return false;
    }
    stack.pop();
}
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}