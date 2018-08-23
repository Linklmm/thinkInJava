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
        Node pNode=head;
        Node pPrev=null;
        while (pNode!=null){
            Node pNext=pNode.next;
            if (pNext==null){
                pReversedHead=pNode;
            }
            pNode.next=pPrev;
            pPrev=pNode;
            pNode=pNext;
        }
        this.head=pReversedHead;
        return this.head;
    }

    public static void main(String[] args) {
        ListNode node=new ListNode();
        node.addHead(2);
        node.addHead(4);
        node.addHead(3);
        node.display();
        node.reverseIteratively(node.head);
        node.display();
    }
}
