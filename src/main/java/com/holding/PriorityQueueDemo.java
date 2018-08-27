package com.holding;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>();
        Random rand=new Random(47);
        for (int i=0;i<10;i++)
            priorityQueue.offer(rand.nextInt(i+10));
        QueueDemo.printQ(priorityQueue);//按自然排序
        List<Integer> ints=Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,22,23,25);
        priorityQueue=new PriorityQueue<Integer>(ints);
        QueueDemo.printQ(priorityQueue);//自然培训
        priorityQueue=new PriorityQueue<Integer>(ints.size(),Collections.reverseOrder());//反序
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);

        String fact="EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings=Arrays.asList(fact.split(" "));
        PriorityQueue<String> stringPQ=new PriorityQueue<String>(strings);
        QueueDemo.printQ(stringPQ);
        stringPQ=new PriorityQueue<String>(strings.size(),Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ);

        Set<Character> charset=new HashSet<Character>();
        for (char c:fact.toCharArray())
            charset.add(c);
        PriorityQueue<Character> characterPQ=new PriorityQueue<Character>(charset);
        QueueDemo.printQ(characterPQ);
    }
}
