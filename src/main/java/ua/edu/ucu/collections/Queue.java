package main.java.ua.edu.ucu.collections;

//import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

import main.java.ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList LinkedStructure;
    public Queue(ImmutableLinkedList LinkedStructure) {
        this.LinkedStructure = LinkedStructure;
    }
    public Queue(){
        this.LinkedStructure = new ImmutableLinkedList(null);
    }

    public Object peek(){
        return LinkedStructure.get(0);
    }
    public Object dequeue(){
        Object outObject = this.LinkedStructure.get(0);
        this.LinkedStructure = LinkedStructure.remove(0);
        return outObject;

    }
    public void enqueue(Object e){
        this.LinkedStructure = LinkedStructure.add(e);
    }
    public String toString(){
        return LinkedStructure.toString();
    }
}