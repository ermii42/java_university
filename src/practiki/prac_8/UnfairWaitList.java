package practiki.prac_8;

public class UnfairWaitList<E> extends WaitList{
    public UnfairWaitList(){
    }

    public void remove(E element){
        content.remove(element);
    }

    public void moveToBack(E element){
        E elem = (E) content.pop();
        content.addLast(elem);
    }

}
