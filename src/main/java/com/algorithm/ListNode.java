package com.algorithm;

/**
 * 链表的数据结构
 * @author yourflowermygrass
 * */
public class ListNode {
    private int size;//链表节点的个数
    Node head=null;
    /**
     * 链表中的节点，data代表节点的值，next是指向下一个节点的引用
     *
     *
     * */
    private class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
        }
    }
    /**
     * 在链表的头添加元素
     * */
    public void addHead(int data){
        Node newHead=new Node(data);
        if (size==0){
            head=newHead;
        }else {
            newHead.next=head;
            head=newHead;
        }
        size++;
    }
    /**
     * 从链表尾添加数据
     * */
    public void addNode(int data){
        Node end=new Node(data);
        if (head==null){
            head=end;
            size++;
            return;
        }
        Node tmp=head;
        while (tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=end;
        size++;
    }
    /**
    * 返回链表长度
     * */
    public int length(){
    int length=0;
    Node temp=head;
    while (temp!=null){
        length++;
        temp=temp.next;
    }
    return length;
    }
    /**
     * 显示链表的数据
     * */
    public void display() {
        if (size > 0) {
            Node tmp = head;
            int tempsize = size;
            if (tempsize == 1) {
                System.out.println("[" + tmp.data + "]");
                return;
            }
            while (tempsize > 0) {
                if (tmp.equals(head)) {
                    System.out.print("[" + tmp.data + "->");
                } else if (tmp.next == null) {
                    System.out.print(tmp.data + "]");
                } else {
                    System.out.print(tmp.data + "->");
                }
                tmp = tmp.next;
                tempsize--;
            }
            System.out.println();
        }else{
            System.out.println("[]");
        }
    }

    /**
     * 链表反转
     *
     * */
    public Node reverseIteratively(Node head){

        Node pReversedHead=head;
        //当前结点指针
        Node pNode=head;
        Node pPrev=null;//链表前驱
        while (pNode!=null){
            Node pNext=pNode.next;//当前结点的下一个结点
            if (pNext==null){
                pReversedHead=pNode;
            }
            pNode.next=pPrev;//进行链表的反转，当前结点的下一个结点指向前一个节点
            pPrev=pNode;//使用pprev指针保存状态
            pNode=pNext;//pnode后移一个结点
        }
        this.head=pReversedHead;
        return this.head;
    }
/**
 * 两个链表相加
 * @param l1,l2 其中l1>l2
 * @return ListNode
 * */
    public static ListNode addTwoNumbers(Node l1, Node l2) {
        ListNode newListNode=new ListNode();
        int var=0;
        while (l2.next!=null){
            var=l2.data+l1.data;
            if (var>=10){
                l2.next.data++;
                var=var-10;
                newListNode.addNode(var);
            }else {
                newListNode.addNode(var);
            }
            l2=l2.next;
            l1=l1.next;
        }
        var=l2.data+l1.data;
        //System.out.println(var);
        if (var>10){
            var=var-10;
            if (l1.next!=null){
            l1.next.data++;
            newListNode.addNode(var);
            }else {
                newListNode.addNode(1);
            }
        }else {
            newListNode.addNode(var);
        }
        return newListNode;
    }
    /**
     * 递归
     * */
    public  Node add(Node l1,Node l2,int carry){
        if (l1==null&&l2==null)
            return carry==0?null:new Node(carry);
            if (l1!=null&&l2==null)
                l2=new Node(0);
            if (l1==null&&l2!=null)
                l1=new Node(0);
            int sum=l1.data+l2.data+carry;
            Node curr=new Node(sum%10);
            curr.next=add(l1.next,l2.next,sum/10);
            return curr;
    }

    public Node addTwoNumbers2(Node l1,Node l2){
        return add(l1,l2,0);
    }
    /**
     * @param index
     * 得到链表下标节点数据
     * */

    public int getByIndex(int index,Node node){
        int data=0;
        if (size==0){
            System.out.println("链表为空！");
        }
        if (index>size){
            System.out.println("超出链表范围！");
        }else {
            for (int i=0;i<index;i++)
                node=node.next;
            if (node!=null){//判断node循环后是否为空
            data=node.data;
            }else {
                data=0;
            }
        }
        return data;
    }

    public static void main(String[] args) {
        ListNode node=new ListNode();
        node.addHead(2);
        node.addHead(4);
        node.addHead(3);
        //node.display();
        ListNode node2=new ListNode();
        node2.addHead(5);
        node2.addHead(6);
        node2.addHead(4);
        //node2.display();

        ListNode node3=new ListNode();
        node3.addNode(2);
        node3.addNode(4);
        node3.addNode(3);
        node3.addNode(5);
        //node3.display();
        ListNode node4=new ListNode();
        node4.addNode(5);
        node4.addNode(6);
        node4.addNode(4);
        node4.addNode(6);
        node4.addNode(7);
        //node4.display();
        //System.out.println(node4.getByIndex(2,node4.head));

        node3.reverseIteratively(node3.head);
        node4.reverseIteratively(node4.head);
//        //当node3大于等于node4时
//        if (node3.length()>=node4.length()){
//            node5=addTwoNumbers(node3.head,node4.head);
//            for (int i=node4.length();i<node3.length();i++){
//                node5.addNode(node3.getByIndex(i,node3.head));
//            }
//        }else {
//            node5=addTwoNumbers(node4.head,node3.head);
//            for (int i=node3.length();i<node4.length();i++){
//                node5.addNode(node4.getByIndex(i,node4.head));
//            }
//        }
//        node5.display();
        //node3.display();
//        node.reverseIteratively(node.head);
//        node.display();
        ListNode listNode=new ListNode();
        Node node5=listNode.addTwoNumbers2(node3.head,node4.head);
        while (node5.next!=null){
        System.out.println(node5.data);
        node5=node5.next;
        }
        System.out.println(node5.data);
    }
}
