public interface IQueue<T> {

  public void add(T data);

  public T remove();

  public boolean isEmpty();

}

