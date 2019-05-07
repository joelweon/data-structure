## Data-Structure in Java

### Collection

- List(interface)
    - **[ArrayList](#ArrayList)**
    - Vector
        - **Stack**
    - **LinkedList**
- **Queue**(interface)
    - **Deque**
        - LinkedList
    - PriorityQueue
- Set(interface)
    - SortedSet(interface) - NavigableSet(interface)
        - TreeSet
    - **HashSet**
        - LinkedHashSet

### Map(Hash)
- Map(interface)
    - SortedMap(interface) - NavigableMap(interface)
        - **TreeMap**
    - **HashMap**
        - **LinkedHashMap**
    - **HashTable**

### Tree
- Binary Tree
    - BST(Binary Search Tree)
    - AVL Tree(Adelson-Velskii and Landis' tree)
    - Binary Heap
    - Full Binary Tree
    - Complete Binary Tree
- Red Black Tree

### Graph 
***

### ArrayList
#### add
- 첫번째 위치에 값 추가하는 기능
- 마지막 위치에 값 추가하는 기능
- 원하는 위치에 값 추가하는 기능
#### remove
- 선택한 위치의 값 삭제하는 기능
- 첫번째 위치의 값 삭제하는 기능
- 마지막 위치의 값 삭제하는 기능
#### get 
- 선택한_위치의_값_가져오기
### etc
- toString 구현
- 테스트 코드 작성

배열크기를 정해주었을 때 그 크기를 넘으면 에러가 난다.  
`java.lang.ArrayIndexOutOfBoundsException`  
**Collection framework**인 `java.util.ArrayList`는 할당된 배열크기를 넘으면
배열크기를 확장하는 기능이 있다.

