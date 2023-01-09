public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LinkedList list = new LinkedList();
        list.addFirst(90, 2.5);
        list.addFirst(40, 2.5);
        list.addFirst(90, 2.5);
        list.addFirst(20, 2.5);
        list.addFirst(40, 13.5);
        // list.deleteFirst();
        list.displayList();
        list.delete(40);
        list.delete(20);
        list.delete(90);
        list.delete(90);
        System.out.println("");
        list.displayList();

        // list.addFirst(90, 13);
        // System.out.println(list.find(90).dData);
        // list.displayList();
        // System.out.println(list.delete(90).dData);
        // list.displayList();
        // System.out.println(list.find(90).dData);
    }

    public static class Link {
        int iData;
        double dData;
        Link next;

        public Link(int iData, double dData) {
            this.iData = iData;
            this.dData = dData;
        }

        public void displayLink() {
            System.out.println("(iData: " + iData + ", dData: " + dData + ")");

        }

    }

    public static class LinkedList {
        Link first;

        void addFirst(int iData, double dData) {
            Link newL = new Link(iData, dData);
            if (first == null) {
                first = newL;
                return;
            }
            newL.next = first;
            first = newL;
        }

        Link deleteFirst() {

            Link temp = first;
            first = first.next;
            return temp;

        }

        void displayList() {
            Link current = first;

            while (current != null) {
                current.displayLink();
                current = current.next;
            }
        }

        Link find(int key) {
            Link current = first;
            while (current != null) {
                if (current.iData == key) {
                    return current;
                }
                current = current.next;
            }
            return null;
        }

        Link delete(int key) {
            Link current = first;
            Link previous = first;
            while (current != null) {
                if (current.iData == key) {
                    if (current == previous) {
                        first = current.next;
                    }
                    previous.next = current.next;
                    return current;
                }
                previous = current;
                current = current.next;
            }
            return null;
        }
    }
}
