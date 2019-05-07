package collection.list.arrayList;

public class ArrayList<E> {
    private int size = 0;
    private Object[] elementData = new Object[10];

    public boolean add(E element) {
        elementData[size] = element;
        size++;
        return true;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += elementData[i];
            if (i < size - 1) {
                str += ", ";
            }
        }
        return str + "]";
    }

    /*테스트를 위한 getter*/
    public int getSize() {return size;}
    public Object getelementData(int size) {return elementData[size];}
}
