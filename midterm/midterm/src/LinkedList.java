public class LinkedList {
    public Link first;

    public LinkedList() {

    }

    public Link delete(int key) {
        Link previous = first;
        Link current = first;
        while (current.iData != key) {
            if (current.next == null) {
                return null;
            }
            previous = current;
            current = current.next;

        }
        previous.next = current.next;
        return current;
    }

    public Link find(int iData, double dData) {
        Link current = first;
        while (true) {
            if (current == null) {
                break;
            }
            if (current.iData == iData && current.dData == dData) {

                return current;

            }
            current = current.next;
        }
        return null;
    };

    public Link deleteFirst() {
        if (first == null) {
            return first;
        }
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void insertFirst(int iData, double dData) {
        Link newLink = new Link(iData, dData);
        newLink.next = first;
        first = newLink;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void displayAll() {
        if (first == null) {
            System.out.println("List is empty");
        } else {
            Link current = first;
            while (current != null) {
                current.display();
                current = current.next;
            }
        }
    }

}
