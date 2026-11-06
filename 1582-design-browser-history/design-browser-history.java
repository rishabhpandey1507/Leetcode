class BrowserHistory {
Stack<String> currHistory;
Stack<String> forwardHistory;
    public BrowserHistory(String homepage) {
        currHistory = new Stack<>();
        forwardHistory = new Stack<>();
        currHistory.push(homepage);
    }
    
    public void visit(String url) {
        currHistory.push(url);
        while(!forwardHistory.isEmpty()){
            forwardHistory.pop();
        }
    }
    
    public String back(int steps) {
        while(steps > 0){
            if(currHistory.size() > 1){
                String backTab = currHistory.pop();
                forwardHistory.push(backTab);
            }
            else{
                break;
            }
            steps--;
        }
        return currHistory.peek();
    }
    
    public String forward(int steps) {
        while(steps > 0){
        if(forwardHistory.size() > 0){
                String forwardTab = forwardHistory.pop();
                currHistory.push(forwardTab);
            }
            else{
                break;
            }
            steps--;
        }
        return currHistory.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */