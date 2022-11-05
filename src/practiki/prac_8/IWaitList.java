package practiki.prac_8;
import java.util.Collection;
/**
 * Интерфейс IWaitList
 * @author Ермишова СМ
 * @version 1.0
 */

public interface IWaitList<E> {
    /** Поле добавления
     * @param element элемент*/
    public void add(E element);
    /** Поле удаления*/
    public E remove();
    /** Проверка наличия элемента в коллекции
     * @param element элемент*/
    public boolean contains(E element);
    /** Проверка наличия всех элементов в коллекции
     * @param c коллекция*/
    public boolean containsAll(Collection<E> c);
    /** Проверка на пустоту*/
    public boolean isEmpty();
}
