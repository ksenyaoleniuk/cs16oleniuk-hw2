package main.java.ua.edu.ucu.collections.immutable;
public class ImmutableLinkedList implements ImmutableList{
    public final LinkedNode head;
    public final int size;

    public ImmutableLinkedList(LinkedNode head) {
        this.head = head;
        this.size = 0;}

    public ImmutableLinkedList add(Object e) {
        LinkedNode newCurrent = new LinkedNode(e);
        newCurrent.setNext(this.head);
        ImmutableLinkedList newList = new ImmutableLinkedList(newCurrent);
        return newList;}

    public ImmutableLinkedList addFirst(Object e){
        return this.add(0, e);
    }

    public ImmutableLinkedList addLast(Object e){
        return this.add(e);}

    public ImmutableLinkedList add(int index, Object e) throws IndexOutOfBoundsException{
        if (index < 0|| index > size()){
            throw new IndexOutOfBoundsException();}
        if (index == size()){
            return this.add(e);}
        else{
            LinkedNode newLinkedN = new LinkedNode(this.head.getData());
            LinkedNode newCurrent = this.head;
            LinkedNode newHead = newLinkedN;
            LinkedNode preLinkedN = newHead;
            int n = size() - index - 1;
            while (n != 0){
                newCurrent = newCurrent.getNext();
                newLinkedN = new LinkedNode(newCurrent.getData());
                preLinkedN.setNext(newLinkedN);
                preLinkedN = preLinkedN.getNext();
                n = n - 1;
            }
            LinkedNode inputNode = new LinkedNode(e);
            preLinkedN.setNext(inputNode);
            preLinkedN = preLinkedN.getNext();
            while (newCurrent.getNext() != null){
                newCurrent = newCurrent.getNext();
                newLinkedN = new LinkedNode(newCurrent.getData());
                preLinkedN.setNext(newLinkedN);
                preLinkedN = preLinkedN.getNext();
            }
            ImmutableLinkedList newList = new ImmutableLinkedList(newHead);
            return newList;
        }}

    public ImmutableLinkedList addAll(Object[] c) {
        ImmutableLinkedList newLinkedN = new ImmutableLinkedList(this.head);
       for(int i  = 0; i < c.length; i ++){
           newLinkedN = newLinkedN.add(c[i]);}
       return newLinkedN;}

    public ImmutableLinkedList addAll(int index, Object[] c) {
        LinkedNode newLinkedN = new LinkedNode(this.head.getData());
        LinkedNode newCurrent = this.head;
        LinkedNode newHead = newLinkedN;
        LinkedNode preLinkedN = newHead;
        int n = size() - index - 1;
        while (n != 0){
            newCurrent = newCurrent.getNext();
            newLinkedN = new LinkedNode(newCurrent.getData());
            preLinkedN.setNext(newLinkedN);
            preLinkedN = preLinkedN.getNext();
            n = n - 1;}
        for (int i = c.length - 1; i >= 0; i--){
            newLinkedN = new LinkedNode(c[i]);
            preLinkedN.setNext(newLinkedN);
            preLinkedN = preLinkedN.getNext();}
        while (newCurrent.getNext() != null){
            newCurrent = newCurrent.getNext();
            newLinkedN = new LinkedNode(newCurrent.getData());
            preLinkedN.setNext(newLinkedN);
            preLinkedN = preLinkedN.getNext();}
        ImmutableLinkedList newList = new ImmutableLinkedList(newHead);
        return newList;}

    public Object get(int index) {
        if (index < 0 || index >=  size()) {
            throw new IndexOutOfBoundsException();}
        else{
            LinkedNode currentNode = this.head;
            int counter = size() - 1 - index;
            while (counter > 0){
                currentNode = currentNode.getNext();
                counter--;}
            return currentNode.getData();}}

    public Object getFirst(){
        return this.get(0);
    }

    public Object getLast(){
        return this.get(size() - 1);
    }

    public ImmutableLinkedList remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();}
        else if (size()-1 == index){
            LinkedNode newLinkedN = this.head.getNext();
            return new ImmutableLinkedList(newLinkedN);}
        else{
        LinkedNode newLinkedN = new LinkedNode(this.head.getData());
        LinkedNode newCurrent = this.head;
        LinkedNode newHead = newLinkedN;
        LinkedNode preLinkedN = newHead;
        int n = size() - index -2;
        while (n != 0){
            newCurrent = newCurrent.getNext();
            newLinkedN = new LinkedNode(newCurrent.getData());
            preLinkedN.setNext(newLinkedN);
            preLinkedN = preLinkedN.getNext();
            n = n - 1;}
        newCurrent = newCurrent.getNext();
        while (newCurrent.getNext() != null){
            newCurrent = newCurrent.getNext();
            newLinkedN = new LinkedNode(newCurrent.getData());
            preLinkedN.setNext(newLinkedN);
            preLinkedN = preLinkedN.getNext();
        }
        ImmutableLinkedList newList = new ImmutableLinkedList(newHead);
        return newList;}}

    public ImmutableLinkedList set(int index, Object e) {
        if (index < 0|| index > size()){
            throw new IndexOutOfBoundsException();}
        if (index == size()){
            return this.add(e);}
        else{
            LinkedNode newLinkedN = new LinkedNode(this.head.getData());
            LinkedNode newCurrent = this.head;
            LinkedNode newHead = newLinkedN;
            LinkedNode preLinkedN = newHead;
            int n = size() - index -1 ;
            while (n != 0){
                newCurrent = newCurrent.getNext();
                newLinkedN = new LinkedNode(newCurrent.getData());
                preLinkedN.setNext(newLinkedN);
                preLinkedN = preLinkedN.getNext();
                n = n - 1;}
            LinkedNode inputNode = new LinkedNode(e);
            preLinkedN.setNext(inputNode);
            preLinkedN = preLinkedN.getNext();
            while (newCurrent.getNext() != null){
                newCurrent = newCurrent.getNext();
                newLinkedN = new LinkedNode(newCurrent.getData());
                preLinkedN.setNext(newLinkedN);
                preLinkedN = preLinkedN.getNext();}
            ImmutableLinkedList newList = new ImmutableLinkedList(newHead);
            return newList;
        }}



    public int indexOf(Object e) {
        int index = size()-1;
        LinkedNode curNode = this.head;
        while (curNode != null){
            if (curNode.getData() == e){
                return index;}
            curNode = curNode.getNext();
            index--;}
        return index;}

    public int size() {
        int mySize = 0;
        if (head != null) {
            LinkedNode currentNode = this.head;
            mySize++;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
                mySize++;}}
        return mySize;}

    @Override
    public String toString() {
        String outString = "";
        LinkedNode curNode = this.head;
        if (head != null){
            while (curNode != null){
                outString = "-" + outString ;
                outString = curNode.getData() + outString ;
                curNode = curNode.getNext();}}
        return outString;}

    public ImmutableLinkedList clear() {
        ImmutableLinkedList cleared = new ImmutableLinkedList(null);
        return cleared;}

    public boolean isEmpty() {
        if (this.size()>0){
            return false;
        }else{
            return true;}}

    public Object[] toArray() {
        LinkedNode curNode = this.head;
        Object[] new_list = new Object[this.size() + 1];
        for (int i = 0; i < this.size(); i ++){
            new_list[i] = curNode.getData();
            curNode = curNode.getNext();}
        return new_list;}

    public ImmutableLinkedList removeLast(){return this.remove(size() - 1);}

    public ImmutableLinkedList removeFirst(){
        return this.remove(0);
    }


}
