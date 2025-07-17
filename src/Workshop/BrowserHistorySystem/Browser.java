package Workshop.BrowserHistorySystem;

class Node {
    String url;
    Node prev, next;

    public Node(String url) {
        this.url = url;
    }
}

class BrowserHistory {
    private Node current;

    public void visit(String url) {
        Node newNode = new Node(url);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
        System.out.println("Visited: " + current.url);
    }

   
    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Moved Back to: " + current.url);
        } else {
            System.out.println("No previous page.");
        }
    }

    // Go forward
    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Moved Forward to: " + current.url);
        } else {
            System.out.println("No next page.");
        }
    }

    public void currentPage() {
        if (current != null)
            System.out.println("Current Page: " + current.url);
        else
            System.out.println("No pages visited yet.");
    }
}

public class Browser {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visit("google.com");
        browser.visit("zipnfile.netlify.app");
        
        browser.back();              
        browser.forward();      
        browser.visit("youtube.com"); 
        browser.currentPage();  
    }
}
