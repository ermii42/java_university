package practiki.prac_8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList<E> implements IWaitList {
    protected ConcurrentLinkedDeque<E> content;
    public WaitList(){
        content = new ConcurrentLinkedDeque<>();
    }

    public WaitList(Collection<E> c){
        content = (ConcurrentLinkedDeque<E>) c;
    }

    @Override
    public String toString() {
        return content.toString();
    }

    @Override
    public void add(Object element) {
        content.add((E)element);
    }

    @Override
    public Object remove() {
        return content.pop();
    }

    @Override
    public boolean contains(Object element) {
        for(Object elem: content){
            if(elem.equals(element)) return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        for(Object elem: c){
            if(!this.contains(c)) return false;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
