package main.java.ua.edu.ucu.collections.immutable;

public class ImmutableArrayList implements ImmutableList {
    private final Object[] elements;

    public ImmutableArrayList(Object[] elements) {
        this.elements = elements;
    }

    public ImmutableArrayList add(Object e){
        Object[] new_list = new Object[size() + 1];
        for (int i = 0; i < size(); i++){
            ;
            new_list[i] = elements[i];
        }
        new_list[size()] = e;
        ImmutableArrayList out_list = new ImmutableArrayList(new_list);
        return out_list;
    }

    public ImmutableArrayList add(int index, Object e) throws IndexOutOfBoundsException{
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }
        else {
            Object[] new_list = new Object[size() + 1];
            for (int i = 0; i < index; i++) {
                new_list[i] = elements[i];
            }
            new_list[index] = e;
            for (int i = index; i < size(); i++) {
                new_list[1 + index] = elements[i];
            }

            ImmutableArrayList out_list = new ImmutableArrayList(new_list);
            return out_list;
        }

    }

    public ImmutableArrayList addAll(Object[] c) {
        Object[] new_list = new Object[size() + c.length];
        for(int i = 0; i < size(); i ++){
            new_list[i] = elements[i];}
        for (int i = 0; i < c.length; i ++){
            new_list[i + size()] = c[i].toString();
        }
        ImmutableArrayList out_list = new ImmutableArrayList(new_list);
        return out_list;
    }

    public ImmutableArrayList addAll(int index, Object[] c) {
        if((index<0) || index >= size()){
            throw new IndexOutOfBoundsException();}
        else{
            Object[] new_list = new Object[size() + c.length];
            for (int i = 0; i < index; i ++){
                new_list[i] = elements[i];
            }

            for (int i = 0; i < c.length; i++){
                new_list[i +index] = c[i];
            }
            for (int i = index; i < size(); i ++){
                new_list[i + index + c.length] = elements[i];
            }
            ImmutableArrayList out_list = new ImmutableArrayList(new_list);
            return out_list;}
    }

    public Object get(int index) {
        if((index<0) || index >= size()){
            throw new IndexOutOfBoundsException();}
        else{return elements[index];}
    }

    public ImmutableList remove(int index) throws IndexOutOfBoundsException{
        if((index<0) || index >= size()){
            throw new IndexOutOfBoundsException();
        }else{
            Object[] new_list = new Object[size() - 1];
            for (int i = 0; i < index; i ++){
                new_list[i] = elements[i];
            }
            for (int i = index + 1; i < size(); i ++){
                new_list[i] = elements[i];
            }
            ImmutableArrayList out_list = new ImmutableArrayList(new_list);
            return out_list;
        }
    }

    public ImmutableList set(int index, Object e) throws IndexOutOfBoundsException{
        if((index<0) || index >= size()){
            throw new  IndexOutOfBoundsException();
        }else{
            Object[] list = this.toArray();
            list[index] = e;
            ImmutableArrayList out_list = new ImmutableArrayList(list);
            return out_list;
        }
    }

    public int indexOf(Object e){
        for (int i = 0; i < size(); i++){
            if(e == elements[i]){
                return i;
            }
        }return -1;
    }

    public int size(){
        if (elements != null){
        return elements.length;}
        else{
            return 0;
        }

    }

    public ImmutableList clear(){
        ImmutableArrayList cleared = new ImmutableArrayList(null);
        return this;

    }

    public boolean isEmpty(){
        if (this.size()>0){
            return false;
        }else{
            return true;
        }
    }

    public Object[] toArray(){
        Object[] new_list = new Object[this.size() + 1];
        for (int i =0; i <this.size(); i++){
            new_list[i] = this.get(i);

        }
        return new_list;
    }

    public String toString(){
        String new_list  = "";
        for (int i = 0; i < size(); i ++){
            new_list += elements[i].toString();
            new_list += ",";
        }
        return new_list;
    }
}
