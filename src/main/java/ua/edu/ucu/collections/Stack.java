package main.java.ua.edu.ucu.collections;

import sun.awt.image.ImageWatched;
import main.java.ua.edu.ucu.collections.immutable.ImmutableLinkedList;

import java.util.LinkedHashSet;


public class Stack {
    private ImmutableLinkedList LinkedStructure;
    public Stack(ImmutableLinkedList LinkedStructure){
        this.LinkedStructure = LinkedStructure;
    }
    public Stack(){
        this.LinkedStructure = new ImmutableLinkedList(null);
    }
    public Object peek(){
        return LinkedStructure.getLast();
    }
    public Object pop(){
        Object outObject = LinkedStructure.get(LinkedStructure.size() - 1);
        this.LinkedStructure = LinkedStructure.removeLast();
        return outObject;

    }
    public void pop(Object e){
        this.LinkedStructure = LinkedStructure.add(e);
    }

    @Override
    public String toString() {
        return this.LinkedStructure.toString();
    }
}
