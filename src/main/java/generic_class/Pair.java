package generic_class;

/**
 * Created by louis.yu on 2016/4/27.
 */
public class Pair<T> {
    private T first;
    private T second;


    public Pair() {
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }


    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }



}
