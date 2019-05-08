## Data-Structure in Java

### Collection

- [List(interface)](#List)
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

## 설명

### List
리스트는 특정 타입 값들이 순차적으로 정렬된 컬렉션이다.
리스트는 자바의 내장 컬렉션인 배열하고는 다르다.
리스트는 크기 지정에 한계가 없으므로 사용하기 전 크기를 정할 필요가 없다.

자바에서는 ArrayList, LinkedList를 주로 사용한다.

#### ArrayList
ArrayList 클래스는 기본 배열크기가 10이고 새로운 원소르 추가 할 때 마다 자동으로
더 큰 배열을 재할당한다. 단, 시간이 소요되며 더 큰 메모리 요양을 소모한다.
그래서 크기가 큰 컬렉션을 이용할 거라면 기본 크기를 크게 잡는 것이 좋다.

ArrayList는 시작 위치나 중간 위치에 새로운 원소를 추가하려고 하면 그 다음에 있는
원소들이 이동을 해야한다. 배열의 크기가 크다면 연산량이 많은 작업이라 이럴 때는
LinkedList를 사용하는 것이 좋다.

ArrayList는 원소를 삭제해도 할당된 배열 크기는 줄어들지 않는다.

#### LinkedList
LinkedList는 리스트 안에 다음 원소를 가리키는 내부 객체를 이용한다.
단방향 참조이기 때문에 앞에 있는 원소는 찾지 못한다.
이를 보완해서 양방향 참조가 가능한 이중 연결리스트(doubly linked list)가 있다.


### 배열과 연결리스트의 차이점
ArrayList로 생성하는 배열은 랜덤접근을 통해 인덱스를 바로 찾을 수 있지만
인덱스를 이용해 원소에 접근할 때 연결리스트는 단방향으로 순회하면서 찾는다.

### 배열과 연결리스트의 공통점
하위 원소들을 재정렬하지 않은 상태로 리스트의 맨 처음이나 중간에 삽입이 가능하다.
단 배열은 중간 삽입 시 그 뒤 원소들은 이동해야한다.(시간과 메모리 소모)

성능 순서 : O(1)<O(logn)<O(n)<O(nlogn)<O(n2)<O(n3)<O(2n)

***

### ArrayList 기능 구현

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

