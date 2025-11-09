import java.util.*;

class BrowserHistory {
    Stack<String> backStack = new Stack<>();
    Stack<String> forwardStack = new Stack<>();
    String currentPage = "Home";

    void visit(String page) {
        backStack.push(currentPage);
        currentPage = page;
        forwardStack.clear();
        System.out.println("Visited: " + currentPage);
    }

    void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back to: " + currentPage);
        } else {
            System.out.println("No pages in back history!");
        }
    }

    void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to: " + currentPage);
        } else {
            System.out.println("No pages in forward history!");
        }
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.visit("github.com");

        browser.back();
        browser.back();
        browser.forward();
        browser.visit("stackoverflow.com");
    }
}
