package collection.list.arrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
// JUnit은 순서대로 테스트를 동작하지 않는다. NAME_ASCENDING은 메서드 이름순으로 테스트 된다.
// 기본값은 순서 보장하지 않고, JVM은 JVM이 리턴한 순서대로 나온다(실행 때마다 다를 수 있음)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayListTest {

    @Test
    public void 첫번째_위치에_값_추가() {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        String oldValue = list.toString();
        list.addFirst(5);
        System.out.println(oldValue + " -> " + list);
        assertEquals(5, list.size());
        assertEquals(5, list.getelementData(0));
    }

    @Test
    public void 마지막_위치에_값추가() {
        ArrayList list = new ArrayList();
        String oldValue = list.toString();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(oldValue + " -> " + list);
        // 크기 확인
        assertEquals(3, list.size() - 1);
        // 마지막 값 확인
        assertEquals(40, list.getelementData(3));
    }

    @Test
    public void 원하는_위치에_값_추가() {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        String oldValue = list.toString();
        list.add(1, 15);
        System.out.println(oldValue + " -> " + list);
        assertEquals(5, list.size());
        assertEquals(15, list.getelementData(1));
    }

    @Test
    public void 선택한_위치의_값_삭제() {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        String oldValue = list.toString();
        Object removed = list.remove(1);
        System.out.println(oldValue + " -> " + list);
        assertEquals(4, list.size());
        assertEquals(30, list.getelementData(1));
        assertEquals(20, removed);
    }

    @Test
    public void 첫번째_위치의_값_삭제() {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        String oldValue = list.toString();
        Object removed = list.removeFirst();
        System.out.println(oldValue + " -> " + list);
        assertEquals(4, list.size());
        assertEquals(30, list.getelementData(1));
        assertEquals(10, removed);
    }

    @Test
    public void 마지막_위치의_값_삭제() {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        String oldValue = list.toString();
        Object removed = list.removeLast();
        System.out.println(oldValue + " -> " + list);
        assertEquals(4, list.size());
        assertEquals(20, list.getelementData(1));
        assertEquals(50, removed);
    }

    @Test
    public void 선택한_위치의_값_가져오기() {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        assertEquals(5, list.size());
        assertEquals(30, list.get(2));
        System.out.println(list.get(2));
    }

    @Test
    public void 동일한_값을_가진_인덱스_가져오기() {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        assertEquals(1, list.indexOf(20));
        assertEquals(3, list.indexOf(40));
        assertEquals(-1, list.indexOf(50));
    }

    @Test
    public void Iterator패턴_순차적으로_다음_노드_값_리턴() {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ArrayList.ListIterator li = list.listIterator();
        int checkIndex = 0;
        while (li.hasNext()) {
            Object nextValue = li.next();
            assertEquals(nextValue, list.get(checkIndex));
            checkIndex++;
            System.out.println(nextValue);
        }
        assertEquals(li.next(), null);
    }

    @Test
    public void Iterator패턴_순차적으로_이전_노드_값_리턴() {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ArrayList.ListIterator li = list.listIterator();
        int checkIndex = 0;
        while (li.hasNext()) {
            li.next();
            checkIndex++;
        }

        while (li.hasPrevious()) {
            checkIndex--;
            Object previousValue = li.previous();
            assertEquals(previousValue, list.get(checkIndex));
            System.out.println(previousValue);
        }
    }

}