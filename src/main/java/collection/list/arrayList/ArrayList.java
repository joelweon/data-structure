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

    // 배열의 사이즈 가져오기
    public int size() {
        return size;
    }

    // 동일한 값을 가진 인덱스 가져오기
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
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
    public Object getelementData(int size) {return elementData[size];}



    public ListIterator listIterator() {
        return new ListIterator();
    }

    // Iterator 패턴 클래스
    class ListIterator {

        private int nextIndex = 0;

        // Iterator패턴_순차적으로_다음_노드_값_리턴
        public Object next() {
            return elementData[nextIndex++];
        }

        // 다음 엘리먼트가 있는 지 검사
        public boolean hasNext() {
            return nextIndex < size();
        }

        // Iterator패턴_순차적으로_이전_노드_값_리턴
        public Object previous() {
            return elementData[--nextIndex];
        }

        // 이전 엘리먼트가 있는 지 검사
        public boolean hasPrevious() {
            return nextIndex > 0;
        }
    }
}
