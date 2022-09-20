# Collections, 👋

- [Các interface chính của Collection](#các-interface-chính-của-collection)
  - [List](#list)
  - [Queue](#queue-hàng-đợi)
  - [Deque](#deque)
  - [Set](#set)
  - [SortedSet](#sortedset)
  - [Map](#map)
  - [SortedMap](#sortedmap)
- [Các class chính của Collection](#các-class-chính-của-collection)
  - [ArrayList](#arraylist)
  - [LinkedList](#linkedlist)
  - [Vector](#vector)
  - [Stack](#stack)
  - [PriorityQueue](#priorityqueue)
  - [ArrayDeque](#arraydeque)
  - [HashSet](#hashset)
  - [LinkedHashSet](#linkedhashset)
  - [TreeSet](#treeset)
  - [HashMap](#hashmap)
  - [LinkedHashMap](#linkedhashmap)
  - [TreeMap](#treemap)

<img src="https://static.javatpoint.com/images/java-collection-hierarchy.png" alt="collections" width="520"/>

<img src="https://static.javatpoint.com/images/core/java-map-hierarchy.png" alt="map" width="320" />

# Các interface chính của Collection

## List

là một collection có thứ tự (đôi khi còn được gọi là một chuỗi). List có thể chứa các phần tử trùng lặp. Thường có quyền kiểm soát chính xác vị trí các phần tử được chèn vào và có thể truy cập chúng bằng chỉ số (vị trí của chúng).

## Queue (hàng đợi)

là một collection được sử dụng để chứa nhiều phần tử trước khi xử lý. Bên cạnh các thao tác cơ bản của collection, Queue cung cấp các thao tác bổ sung như chèn, lấy ra và kiểm tra. Queue có thể được sử dụng như là FIFO (first-in, first-out - vào trước, ra trước)

## Deque

là một collection được sử dụng để chứa nhiều phần tử trước khi xử lý. Ngoài các thao tác cơ bản của collection, một Deque cung cấp các thao tác bổ sung như chèn, lấy ra và kiểm tra. Deques có thể được sử dụng như là FIFO (first-in, first-out - vào trước, ra trước) và LIFO (last-in, first-out - vào sau, ra trước). Trong một Deque, tất cả các phần tử mới có thể được chèn vào, lấy ra và lấy ra ở cả hai đầu.

## Set

là một collection không thể chứa 2 giá trị trùng lặp. Set được sử dụng để biểu diễn các bộ, chẳng hạn như bộ tú lu khơ, thời khóa biểu của học sinh, các tiến trình đang chạy trên máy tính...

## SortedSet

là một Set chứa các phần tử theo thứ tự tăng dần.

## Map

là một đối tượng ánh xạ mỗi key tương úng với một giá trị. Map không thể chứa giá trị trùng lặp. Mỗi key có thể ánh xạ đến nhiều nhất một giá trị.

## SortedMap

là một Map chứa các phần tử được sắp xếp theo thứ tự tăng dần của key của chúng. Các SortedMap được sử dụng cho các collection theo thứ tự tự nhiên của cặp key/value, chẳng hạn như từ điển và danh bạ điện thoại.

# Các class chính của Collection

## ArrayList

Lớp **ArrayList** trong java là một lớp kế thừa lớp AbstractList và triển khai của List Interface trong Collections Framework nên nó sẽ có một vài đặc điểm và phương thức tương đồng với List. ArrayList được sử dụng như một mảng động để lưu trữ các phần tử.

Những điểm cần ghi nhớ về ArrayList:

- Lớp ArrayList trong java có thể chứa các phần tử trùng lặp.
- Lớp ArrayList duy trì thứ tự của phần tử được thêm vào.
- Lớp ArrayList là không đồng bộ (non-synchronized).
- Lớp ArrayList cho phép truy cập ngẫu nhiên vì nó lưu dữ liệu theo chỉ mục.
- Lớp ArrayList trong java, thao tác chậm vì cần nhiều sự dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách.

## LinkedList

Lớp **LinkedList** trong java là một lớp kế thừa lớp AbstractSequentialList và triển khai của List, Queue Interface trong Collections Framework nên nó sẽ có một vài đặc điểm và phương thức tương đồng với List, Queue. Lớp LinkedList trong java sử dụng cấu trúc danh sách liên kết kép Doubly để lưu trữ các phần tử.

Những điểm cần ghi nhớ về lớp LinkedList:

- Lớp LinkedList trong java có thể chứa các phần tử trùng lặp.
- Lớp LinkedList duy trì thứ tự của phần tử được thêm vào.
- Lớp LinkedList là không đồng bộ (non-synchronized).
- Trong java lớp LinkList, thao tác nhanh vì không cần phải dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách.
- Lớp LinkedList trong java có thể được sử dụng như list (danh sách), stack (ngăn xếp) hoặc queue (hàng đợi).

## Vector

Vector giống như mảng động có thể tăng hoặc thu nhỏ kích thước của nó. Không giống như mảng, chúng ta có thể lưu trữ n-số phần tử trong đó vì không có giới hạn kích thước. Nó là một phần của khung công tác Bộ sưu tập Java kể từ Java 1.2. Nó được tìm thấy trong gói java.util và thực hiện giao diện Danh sách , vì vậy chúng ta có thể sử dụng tất cả các phương pháp của giao diện Danh sách ở đây.

Bạn chỉ nên sử dụng lớp Vector trong quá trình triển khai an toàn theo luồng. Nếu bạn không cần sử dụng triển khai an toàn luồng, bạn nên sử dụng ArrayList, ArrayList sẽ hoạt động tốt hơn trong trường hợp đó.

Các trình lặp được trả về bởi lớp Vector không nhanh . Trong trường hợp sửa đổi đồng thời, nó không thành công và ném ConcurrentModificationException.

Nó tương tự như ArrayList, nhưng có hai điểm khác biệt-

- Vector được đồng bộ hóa.
- Java Vector chứa nhiều phương thức kế thừa không phải là một phần của khung tập hợp.

## Stack

Trong Java, Stack là một lớp nằm trong khuôn khổ Bộ sưu tập mở rộng lớp Vector . Nó cũng implements các interfaces List, Collection, Iterable, Cloneable, Serializable. Nó đại diện cho chồng đối tượng LIFO. Trước khi sử dụng lớp Stack, chúng ta phải nhập gói java.util . Lớp ngăn xếp được sắp xếp trong phân cấp khung Bộ sưu tập, như được hiển thị bên dưới.

## PriorityQueue

PriorityQueue cũng là lớp được định nghĩa trong khung thu thập cung cấp cho chúng ta một cách để xử lý các đối tượng trên cơ sở mức độ ưu tiên. Người ta đã mô tả rằng việc chèn và xóa các đối tượng tuân theo mẫu FIFO trong hàng đợi Java. Tuy nhiên, đôi khi các phần tử của hàng đợi cần được xử lý theo mức độ ưu tiên, đó là lúc Hàng đợi ưu tiên hoạt động.

## ArrayDeque

Chúng tôi biết rằng không thể tạo một đối tượng của một giao diện trong Java. Do đó, để khởi tạo, chúng ta cần một lớp thực thi giao diện Deque và lớp đó là ArrayDeque. Nó phát triển và thu nhỏ theo cách sử dụng. Nó cũng kế thừa lớp AbstractCollection.

Những điểm quan trọng về lớp ArrayDeque là:

- Không giống như Queue, chúng ta có thể thêm hoặc bớt các phần tử từ cả hai phía.
- Các phần tử rỗng không được phép trong ArrayDeque.
- ArrayDeque không an toàn cho luồng, trong trường hợp không có đồng bộ hóa bên ngoài.
- ArrayDeque không có giới hạn dung lượng.
- ArrayDeque nhanh hơn LinkedList và Stack.

## HashSet

Lớp HashSet trong java là một lớp kế thừa lớp AbstractSet và triển khai của Set Interface trong Collections Framework nên nó sẽ có một vài đặc điểm và phương thức tương đồng với Set. HashSet được sử dụng để tạo một bộ sưu tập sử dụng bảng băm để lưu trữ. Nó kế thừa lớp AbstractSet và triển khai Set interface.

Một hash table lưu giữ thông tin bởi sử dụng một kỹ thuật được gọi là hashing (băm). Trong hashing, nội dung mang tính thông tin của một key được sử dụng để quyết định một value duy nhất, được gọi là hash code của nó.

Hash code sau đó được sử dụng như là index, tại đó dữ liệu mà liên kết với key được lưu giữ. Phép biến đổi của key vào trong hash code của nó được thực hiện tự động.

Các điểm quan trọng về lớp HashSet trong java là:

- HashSet chỉ chứa các phần tử duy nhất.
- HashSet lưu trữ các phần tử bằng cách sử dụng một cơ chế được gọi là băm (hash table).

## LinkedHashSet

Lớp **LinkedHashSet** trong java là một bản cài đặt bảng băm và danh sách liên kết của giao diện Set. Nó kế thừa lớp HashSet và implements giao diện Set.

Những điểm quan trọng về lớp LinkedHashSet trong java là:

- Chỉ chứa các phần tử duy nhất giống như HashSet.
- Cho phép các phần tử null.
- Duy trì thứ tự chèn.

## TreeSet

Lớp **TreeSet** trong java implements giao diện Set sử dụng cấu trúc cây để lưu trữ các phần tử. Nó kế thừa lớp AbstractSet và implements giao diện NavigableSet. Các đối tượng của lớp TreeSet được lưu trữ theo thứ tự tăng dần.

Các điểm quan trọng về lớp TreeSet trong java là:

- Chỉ chứa các phần tử duy nhất giống như HashSet.
- Thời gian truy xuất nhanh.
- Duy trì thứ tự tăng dần.

## HashMap

Lớp **HashMap** trong java là một lớp kế thừa lớp AbstractMap và triển khai của Map Interface trong Collections Framework nên nó sẽ có một vài đặc điểm và phương thức tương đồng với Map. HashMap được sử dụng để lưu trữ các phần tử dưới dạng "key/value". Key và value là kiểu dữ liệu bất kỳ, và bạn có thể try cập các giá trị của HasMap bằng một key cụ thể.

Những điểm quan trọng về lớp HashMap trong java là:

- HashMap lưu trữ dữ liệu dưới dạng cặp key và value.
- Nó chứa các key duy nhất.
- Nó có thể có 1 key là null và nhiều giá trị null.
- Nó duy trì các phần tử KHÔNG theo thứ tự.

## LinkedHashMap

Những điểm quan trọng về lớp **LinkedHashMap** trong java là:

- LinkedHashMaplưu trữ dữ liệu dưới dạng cặp key và value.
- Nó chứa các key duy nhất.
- Nó có thể có 1 key là null và nhiều giá trị null.
- Nó duy trì các phần tử theo thứ tự chèn.

## TreeMap

Lớp **TreeMap** trong java là một lớp kế thừa lớp AbstractMap và triển khai của NavigableMap Interface (NavigableMap kế thừa SortedMap, SortedMap kế thừa Map interface). trong Collections Framework nên nó sẽ có một vài đặc điểm và phương thức tương đồng với Map và SortedMap và NavigableMap. TreeMap được sử dụng để lưu trữ các phần tử dưới dạng "key/value". Key và value là kiểu dữ liệu bất kỳ, và bạn có thể try cập các giá trị của HasMap bằng một key cụ thể.

Các điểm quan trọng về lớp TreeMap trong java là:

- TreeMap lưu trữ dữ liệu dưới dạng cặp key và value.
- Nó chứa các key duy nhất.
- Nó KHÔNG cho phép bất kỳ key nào là null và nhưng có thể có nhiều giá trị null.
- Nó duy trì các phần tử được thêm vào theo thứ tự key tăng dần.
