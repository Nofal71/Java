class Node {
    constructor(data, next = null) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
        this.size = 0;
    }

    insterFirst(data) {
        this.head = new Node(data, this.head);
        this.size++;
    }

    insertLast(data) {
        let node = new Node(data);
        let current;
        if (!this.head) {
            this.head = node;
        } else {
            current = this.head;
            while (current.next) {
                current = current.next;
            }
            current.next = node;
        }
        this.size++;
    }

    insertAtIndex(index, data) {
        let current;
        const node = new Node(data);

        if (!this.head) {
            console.log("Empty");
        } else {

            let i = 0;
            current = this.head;
            while (i == index) {
                current = current.next;
                i++;
            }
            current.next = node;
            this.size++;
        }
    }

    print() {
        let current = this.head;
        while (current) {
            console.log(current.data);
            current = current.next;
        }
    }


}

const linkedList = new LinkedList();
linkedList.insterFirst(3);
linkedList.insterFirst(2);
linkedList.insterFirst(1);
linkedList.insertLast(5);
linkedList.insertAtIndex(2, 300);

linkedList.print();


