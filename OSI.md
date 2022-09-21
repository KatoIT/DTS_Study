# Mô hình OSI là gì? Chức năng của các tầng giao thức trong mô hình OSI, 👋

- [Nguyên tắc định nghĩa các tầng hệ thống mở](#nguyên-tắc-định-nghĩa-các-tầng-hệ-thống-mở)
- [Các giao thức trong mô hình OSI](#các-giao-thức-trong-mô-hình-osi)
- [Tóm tắt chức năng các tầng giao thức trong OSI](#tóm-tắt-chức-năng-các-tầng-giao-thức-trong-osi)
- [Vai trò và chức năng chủ yếu các tầng.](#vai-trò-và-chức-năng-chủ-yếu-các-tầng)
  - [1. Tầng ứng dụng (Application Layer)](#1-tầng-ứng-dụng-application-layer)
  - [2. Tầng trình bày (Presentation Layer)](#2-tầng-trình-bày-presentation-layer)
  - [3. Tầng phiên (Session Layer)](#3-tầng-phiên-session-layer)
  - [4. Tầng vận chuyển (Transport Layer)](#4-tầng-vận-chuyển-transport-layer)
  - [5. Tầng mạng (Network Layer)](#5-tầng-mạng-network-layer)
  - [6. Tầng liên kết dữ liệu (Data Link Layer)](#6-tầng-liên-kết-dữ-liệu-data-link-layer)
  - [7. Tầng vật lý (Physical Layer)](#7-tầng-vật-lý-physical-layer)

<img src="https://www.totolink.vn/public/uploads/img_post/mo-hinh-osi-la-gi-chuc-nang-cua-cac-tang-giao-thuc-trong-mo-hinh-osi-1.png" width="500">

Mô hình kết nối các hệ thống mở OSI là mô hình căn bản về các tiến trình truyền thông, thiết lập các tiêu chuẩn kiến trúc mạng ở mức Quốc tế, là cơ sở chung để các hệ thống khác nhau có thể liên kết và truyền thông được với nhau. Mô hình OSI tổ chức các giao thức truyền thông thành 7 tầng, mỗi một tầng giải quyết một phần hẹp của tiến trình truyền thông, chia tiến trình truyền thông thành nhiều tầng và trong mỗi tầng có thể có nhiều giao thức khác nhau thực hiện các nhu cầu truyền thông cụ thể.

# Nguyên tắc định nghĩa các tầng hệ thống mở

<img src="https://www.totolink.vn/public/uploads/img_article/mohinhosilagichucnangcuacactanggiaothuctrongmohinhosi.png" width="700">

Mô hình OSI tuân theo các nguyên tắc phân tầng như sau:

- Mô hình gồm N = 7 tầng. OSI là hệ thống mở, phải có khả năng kết nối với các hệ thống khác nhau, tương thích với các chuẩn OSI.
- Quá trình xử lý các ứng dụng được thực hiện trong các hệ thống mở, trong khi vẫn duy trì được các hoạt động kết nối giữa các hệ thống.
- Thiết lập kênh logic nhằm mục đích thực hiện việc trao đổi thông tin giữa các thực thể.

# Các giao thức trong mô hình OSI

Trong mô hình OSI có hai loại giao thức được sử dụng: giao thức hướng liên kết (Connection – Oriented) và giao thức không liên kết (Connectionless).

### Giao thức hướng liên kết

Trước khi truyền dữ liệu, các thực thể đồng tầng trong hai hệ thống cần phải thiết lập một liên kết logic. Chúng thương lượng với nhau về tập các tham số sẽ sử dụng trong giai đoạn truyền dữ liệu, cắt/hợp dữ liệu, liên kết sẽ được hủy bỏ. Thiết lập liên kết logic sẽ nâng cao độ tin cậy và an toàn trong quá trình trao đổi dữ liệu.

### Giao thức không liên kết

Dữ liệu được truyền độc lập trên các tuyến khác nhau. Với các giao thức không liên kết chỉ có giai đoạn duy nhất truyền dữ liệu.

# Tóm tắt chức năng các tầng giao thức trong OSI

| Tầng           | Chức năng chủ yếu                                                                                                                        | Giao thức             |
| -------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | --------------------- |
| 7 Application  | Giao tiếp người và môi trường mạng                                                                                                       | Ứng dụng              |
| 6 Presentation | Chuyển đổi cú pháp dữ liệu để đáp ứng yêu cầu truyền thông của các ứng dụng                                                              | Giao thức Biến đổi mã |
| 5 Session      | Quản lý các cuộc liên lạc giữa các thực thể bằng cách thiết lập, duy trì, đồng bộ hóa và hủy bỏ các phiên truyền thông giữa các ứng dụng | Giao thức phiên       |
| 4 Transpost    | Vận chuyển thông tin giữa các máy chủ (End to End). Kiểm soát lỗi và luồng dữ liệu                                                       | Giao thức Giao vận    |
| 3 Network      | Thực hiện chọn đường và đảm bảo trao đổi thông tin trong liên mạng với công nghệ chuyển mạch thích hợp.                                  | Giao thức mạng        |
| 2 Data Link    | Tạo/gỡ bỏ khung thông tin (Frames), kiểm soát luồng và kiểm soát lỗi.                                                                    | Thủ tục kiểm soát     |
| 1 Physical     | Đảm bảo các yêu cầu truyền/nhận các chuỗi bit qua các phương tiện vật lý.                                                                | Giao diện DTE - DCE   |

# Vai trò và chức năng chủ yếu các tầng.

## 1. Tầng ứng dụng (Application Layer)

Nhiệm vụ của tầng này là xác định giao diện giữa người sử dụng và môi trường OSI. Bao gồm nhiều giao thức ứng dụng cung cấp các phương diện cho người sử dụng truy cập vào môi trường mạng và cung cấp các dịch vụ phân tán. Khi các thực thể ứng dụng AE (Application Entity) được thiết lập, nó sẽ gọi đến các phần tử dịch vụ ứng dụng ASE (Application Service Element). Mỗi thực thể ứng dụng có thể gồm một hoặc nhiều các phần tử dịch vụ ứng dụng. Các phần tử dịch vụ ứng dụng được phối hợp trong môi trường của thực thể ứng dụng thông qua các liên kết gọi là đối tượng liên kết đơn SAO (Single Association Object). SAO điều khiển việc truyền thông và cho phép tuần tự hóa các sự kiện truyền thông.

## 2. Tầng trình bày (Presentation Layer)

Tầng trình bày giải quyết các vấn đề liên quan đến các cú pháp và ngữ nghĩa của thông tin được truyền. Biểu diễn thông tin người sử dụng phù hợp với thông tin làm việc của mạng và ngược lại. Thông thường biểu diễn thông tin các ứng dụng nguồn và ứng dụng đích có thể khác nhau bởi các ứng dụng được chạy trên các hệ thống có thể khác nhau. Tầng trình bày phải chịu trách nhiệm chuyển đổi dữ liệu gửi đi trên mạng từ một loại biểu diễn này sang một loại biểu diễn khác. Để đạt được điều đó nó cung cấp một dạng biểu diễn truyền thông chung cho phép chuyển đổi từ dạng biểu diễn cục bộ sang biểu diễn chung và ngược lại

## 3. Tầng phiên (Session Layer)

Tầng phiên cho phép người sử dụng trên các máy khác nhau thiết lập, duy trì và đồng bộ phiên truyền thông giữa họ với nhau. Nói cách khác tầng phiên thiết lập “các giao dịch” giữa các thực thể đầu cuối.

Dịch vụ phiên cung cấp một liên kết giữa 2 đầu cuối sử dụng dịch vụ phiên sao cho trao đổi dữ liệu một cách đồng bộ và khi kết thúc thì giải phóng liên kết. Sử dụng thẻ bài (Token) để thực hiện truyền dữ liệu, đồng bộ hóa và hủy bỏ liên kết trong các phương thức truyền đồng thời hay luân phiên. Thiết lập các điểm đồng bộ hóa trong hội thoại. Khi xảy ra sự cố có thể khôi phục hội thoại bắt đầu từ một điểm đồng bộ hóa đã thỏa thuận.

## 4. Tầng vận chuyển (Transport Layer)

Là tầng cao nhất liên có liên quan đến các giao thức trao đổi dữ liệu giữa các hệ thống mở, kiểm soát việc truyền dữ liệu từ nút tới nút (End-to-End). Thủ tục trong 3 tầng dưới (vật lý, liên kết dữ liệu và mạng) chỉ phục vụ việc truyền dữ liệu giữa các tầng kề nhau trong từng hệ thống. Các thực thể đồng tầng hội thoại, thương lượng với nhau trong quá trình truyền dữ liệu.

Tầng vận chuyển thực hiện việc chia các gói tin lớn thành các gói tin nhỏ hơn trước khi gửi đi và đánh số các gói tin và đảm bảo chúng chuyển theo đúng thứ tự. Là tầng cuối cùng chịu trách nhiệm về mức độ an toàn trong truyền dữ liệu nên giao thức tầng vận chuyển phụ thuộc nhiều vào bản chất của tầng mạng. Tầng vận chuyển có thể thực hiện việc ghép kênh (multiplex) một vài liên kết vào cùng một liên kết nối để giảm giá thành.

## 5. Tầng mạng (Network Layer)

Tầng mạng thực hiện các chức năng chọn đường đi (routing) cho các gói tin nguồn tới đích có thể trong cùng một mạng hoặc khác mạng nhau. Đường có thể được cố định, cũng có thể được định nghĩa khi bắt đầu hội thoại và có thể đường đi là động (Dynamic) có thể thay đổi với từng gói tin tùy theo trạng thái tải tức thời của mạng. Trong mạng kiểu quảng bá (Broadcast) routing rất đơn giản.

Một chức năng quan trọng khác của tầng mạng là chức năng điều khiển tắc nghẽn (Congestion Control). Nếu có quá nhiều gói tin cùng lưu chuyển trên cùng một đường thì có thể xảy ra tình trạng tắc nghẽn. Thực hiện chức năng giao tiếp giữa các mạng khi các gói tin đi từ mạng này sang mạng khác để tới đích.

## 6. Tầng liên kết dữ liệu (Data Link Layer)

Chức năng chủ yếu của tầng liên kết dữ liệu là thực hiện thiết lập các liên kết, duy trì và hủy bỏ các liên kết dữ liệu. Kiểm soát lỗi và kiểm soát lưu lượng.

Chia thông tin thành các khung thông tin (Frame), truyền các khung tuần tự và xử lý các thông điệp xác nhận (Acknowledgement Frame) từ bên máy thu gửi về. Tháo gỡ các khung thành chuỗi bit không cấu trúc chuyển xuống tầng vật lý. Tầng 2 bên thu, tái tạo chuỗi bit thành các khung thông tin. Đường truyền vật lý có thể gây ra lỗi, nên tầng liên kết dữ liệu phải giải quyết vấn đề kiểm soát lỗi, kiểm soát luồng, kiểm soát lưu lượng, ngăn không để nút nguồn gây “ngập lụt” dữ liệu cho ben thu có tốc độ thấp hơn. Trong các mạng quảng bá, tầng con MAC (Medium Access Sublayer) điều khiển việc duy trì nhập đường truyền.

## 7. Tầng vật lý (Physical Layer)

Tầng vật lý là tầng thấp nhất trong mô hình 7 lớp OSI. Các thực thể tầng giao tiếp với nhau qua một đường truyền vật lý. Tầng vật lý xác định các chức năng, thủ tục về điện, cơ, quang để kích hoạt, duy trì và giải phóng các kết nối vật lý giữa các hệ thống mạng. Cung cấp các cơ chế về điện, hàm, thủ tục, … nhằm thực hiện việc kết nối các phần tử của mạng thành một hệ thống bằng các phương pháp vật lý. Đảm bảo cho các yêu cầu về chuyển mạch hoạt động nhằm tạo ra các đường truyền thực cho các chuỗi bit thông tin. Các chuẩn trong tầng vật lý là các chuẩn xác định giao diện người sử dụng và môi trường mạng. Các giao thức tầng vật lý có hai loại: truyền dị bộ (Asynchronous) và truyền đồng bộ (Synchronous).
