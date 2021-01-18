class Node2 {
    public int data;
    public Node2 prev;
    public Node2 next;
    public Node2 tail;

    public Node2(int data) {
        this.data = data;
    }
}

public class day12双向链表及包 {
    public Node2 head;
    public Node2 tail;

    // 头插法
    public void addFirst(int data) {
        Node2 node = new Node2(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    // 尾插法
    public void addLast(int data) {
        Node2 node = new Node2(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }

    // 任意位置插入
    public void addIndex(int index, int data) {
        if (index < 0 || index > size()) {
            throw new RuntimeException("index不合法");
        } else if (index == 0) {
            addFirst(data);
            return;
        } else if (index == size()) {
            addLast(data);
            return;
        } else {
            Node2 node = new Node2(data);
            Node2 cur = this.head;
            while ((index) != 0) {
                cur = cur.next;
                --index;
            }
            node.next = cur;
            node.prev = cur.prev;
            cur.prev.next = node;
            cur.prev = node;
        }
    }

    // 查找是否包含关键字key
    public boolean contains(int key) {
        Node2 cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    // 删除第一次出现关键字key的结点
    public void remove(int key) {
        Node2 cur = this.head;//游标
        while (cur != null) {//防止尾结点的cur.next指向空结点异常
            if (cur.data == key) {//找到了指定的key值结点
                if (cur == this.head) {//头结点：如何删除
                    this.head = this.head.next;//把之前的头结点的移动到头结点下一个结点
                    this.head.prev = null;//再把新的头结点的prev赋值为null
                } else {//中间结点：正常删除
                    cur.prev.next = cur.next;//先把被删除节点前驱绑定被删除节点的后驱
                    if (cur.next != null) {//在判断被删除的是不是尾结点[当cur.next==null则说明此cur是倒数第二个结点]
                        cur.next.prev = cur.prev;
                    }else {
                        //删除尾巴结点只需要移动tail
                        this.tail = cur.prev;
                    }
                }
                // 删除第一个后就结束[删除全部只需把return注释掉即可]
                return;
            }
            cur = cur.next;
        }
    }

    // 删除所有值为key的结点
    public void removeAllKey(int key) {
        Node2 cur = this.head;//游标
        while (cur != null) {//防止尾结点的cur.next指向空结点异常
            if (cur.data == key) {//找到了指定的key值结点
                if (cur == this.head) {//头结点：如何删除
                    this.head = this.head.next;//把之前的头结点的移动到头结点下一个结点
                    this.head.prev = null;//再把新的头结点的prev赋值为null
                } else {//中间结点：正常删除
                    cur.prev.next = cur.next;//先把被删除节点前驱绑定被删除节点的后驱
                    if (cur.next != null) {//在判断被删除的是不是尾结点[当cur.next==null则说明此cur是倒数第二个结点]
                        cur.next.prev = cur.prev;
                    }else {
                        //删除尾巴结点只需要移动tail
                        this.tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    // 长度
    public int size() {
        Node2 cur = this.head;
        int count = 0;
        while (cur != null) {
            ++count;
            cur = cur.next;
        }
        return count;
    }

    // 打印
    public void display() {
        Node2 cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    // 清空: 需要一个结点一个结点释放
    public void clear() {
//        Node2 cur = this.head;
//        while (this.head != null) {
//            cur = cur.next;
//            this.head.next = null;
//            this.head.prev = null;
//            this.head = cur;
//        }
//        this.tail = null;
        this.head = null;
        this.tail.prev = null;
    }

    public static void main(String[] args) {
        day12双向链表及包 d = new day12双向链表及包();
        d.addLast(1);
        d.addLast(2);
        d.addLast(2);
        d.addLast(3);
        d.addLast(3);
        d.addLast(4);
        d.addLast(4);
        d.clear();
        d.display();
    }
}
