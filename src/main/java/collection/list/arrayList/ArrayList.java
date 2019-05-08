package collection.list.arrayList;

public class ArrayList<E> {
    private int size = 0;
    private Object[] elementData = new Object[10];

    // 첫번째_위치에_값_추가
    public boolean addFirst(E element) {
        add(0, element);
        return true;
    }

    // 마지막_위치에_값추가
    public boolean add(E element) {
        elementData[size] = element;
        size++;
        return true;
    }

    // 원하는_위치에_값_추가
    public boolean add(int index, E element) {
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }

    // 선택한_위치의_값_삭제
    public Object remove(int index) {
        Object removed = elementData[index];
        for (int i = index + 1; i <= size - 1; i++) {
            elementData[i - 1] = elementData[i];
        }
        elementData[size] = null;
        size--;
        return removed;
    }

    // 첫번째_위치의_값_삭제
    public Object removeFirst() {
        return remove(0);
    }

    // 마지막_위치의_값_삭제
    public Object removeLast() {
        return remove(size - 1);
    }

    // 선택한_위치의_값_가져오기
    public Object get(int index) {
        return elementData[index];
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
    public int size() {return size;}
    public Object getelementData(int size) {return elementData[size];}
}
