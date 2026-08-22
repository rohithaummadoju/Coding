class BrowserHistory {

    String[] history;
    int current;
    int last;

    public BrowserHistory(String homepage) {
        history = new String[5001];
        history[0] = homepage;
        current = 0;
        last = 0;
    }

    public void visit(String url) {
        current++;
        history[current] = url;
        last = current; // remove forward history
    }

    public String back(int steps) {
        current = Math.max(0, current - steps);
        return history[current];
    }

    public String forward(int steps) {
        current = Math.min(last, current + steps);
        return history[current];
    }
}


/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */