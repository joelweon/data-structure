package collection.list.arrayList;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
public class ArrayListTest {

    @Test
    public void 마지막위치에_값추가() {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // 크기 확인
        assertEquals(3, list.getSize() - 1);
        // 마지막 값 확인
        assertEquals(40, list.getelementData(3));
        System.out.println(list);
    }
}