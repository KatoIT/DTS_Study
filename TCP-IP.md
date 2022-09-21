# TCP/IP, 👋

- [TCP/IP là gì?](#tcpip-là-gì)
- [Lịch sử hình thành và phát triển của mô hình TCP/IP](#lịch-sử-hình-thành-và-phát-triển-của-mô-hình-tcpip)
- [TCP/IP hoạt động như thế nào?](#tcpip-hoạt-động-như-thế-nào)
- [Chức năng của từng tầng trong mô hình TCP/IP](#chức-năng-của-từng-tầng-trong-mô-hình-tcpip)
  - [Tầng 4 Tầng ứng dụng – Application](#tầng-4-tầng-ứng-dụng-–-application)
  - [Tầng 3 Tầng giao vận – Transport](#tầng-3-tầng-giao-vận-–-transport)
  - [Tầng 2 Tầng mạng – Internet](#tầng-2-tầng-mạng-–-internet)
  - [Tầng 1 Tầng vật lý – Physical](#tầng-1-tầng-vật-lý-–-physical)
- [Các giao thức TCP/IP phổ biến hiện nay](#các-giao-thức-tcpip-phổ-biến-hiện-nay)
  - [HTTP – HyperText Transfer Protocol](#http-–-hypertext-transfer-protocol)
  - [HTTPS – Hypertext Transfer Protocol Secure](#https-–-hypertext-transfer-protocol-secure)
  - [FTP – File Transfer Protocol](#ftp-–-file-transfer-protocol)
- [Ứng dụng của giao thức TCP/IP](#ứng-dụng-của-giao-thức-tcpip)
- [Đánh giá ưu nhược điểm của mô hình TCP/IP](#đánh-giá-ưu-nhược-điểm-của-mô-hình-tcpip)
  - [Ưu điểm](#ưu-điểm)
  - [Nhược điểm](#nhược-điểm)
- [Những câu hỏi thường gặp về TCP/IP](#những-câu-hỏi-thường-gặp-về-tcpip)
  - [Nên lựa chọn mô hình TCP/IP hay OSI?](#nên-lựa-chọn-mô-hình-tcpip-hay-osi)
  - [So sánh TCP/IP và Ethernet?](#so-sánh-tcpip-và-ethernet)
  - [Dữ liệu truyền vào các lớp của TCP/IP có giống nhau không?](#dữ-liệu-truyền-vào-các-lớp-của-tcpip-có-giống-nhau-không)
  - [Giao thức nào được sử dụng ở mỗi lớp?](#giao-thức-nào-được-sử-dụng-ở-mỗi-lớp)

TCP/IP là gì? Đây là câu hỏi được quan tâm khi Internet đang xuất hiện và được sử dụng ở mọi nơi. Dù rất nhiều người đang sử dụng internet hàng ngày nhưng không phải ai cũng hiểu rõ về cách thức hoạt động của internet. Hiện nay, Internet đang sử dụng phương thức TCP/IP. Đây là phương thức truyền dẫn phổ biến nhất hiện nay. Trong bài viết này, hãy cùng tìm hiểu chi tiết về giao thức TCP/IP.

# TCP/IP là gì?

Vậy TCP/IP hay TCP TP là gì? TCP/IP là viết tắt của Transmission Control Protocol/ Internet Protocol, tức là giao thức điều khiển để truyền nhận liên mạng. Đây là một bộ giao thức có chức năng truyền và kết nối các thông tin giữa các thiết bị trong một mạng lưới internet.

# Lịch sử hình thành và phát triển của mô hình TCP/IP

Sau khi tìm hiểu TCP/IP là gì, có thể thấy, TCP/IP có vai trò quan trọng trong việc sử dụng internet. Vì thế, rất nhiều người thường thắc mắc về lịch sử hình thành và phát triển của giao thức này.

Ban đầu, TCP/IP được bắt nguồn từ bộ giao thức liên mạng vào năm 1970, trong dự án DARPA. Sau đó, các kỹ sư, nổi bật là Robert E.Kahn và Vinton Cerf đã nghiên cứu và phát triển giao thức này, giúp việc truyền nhận ổn định hơn. Đến năm 1978, giao thức tiêu chuẩn TCP/IP Ver.4 đã được ổn định và sử dụng trong internet cho đến tận ngày nay.

# TCP/IP hoạt động như thế nào?

Đúng như tên gọi, sau khi tìm hiểu TCP/IP là gì, chúng ta phần nào đã có thể xác định được, TCP/IP gồm có 2 giao thức chính, đó là:

- TCP: Có chức năng xác định các ứng dụng và tạo ra các kênh giao tiếp. TCP cũng có chức năng quản lý các thông tin khi được chia nhỏ để truyền tải qua internet. Giao thức này sẽ tập hợp các thông tin này theo đúng thứ tự, đảm bảo truyền tải thông tin chính xác tới địa chỉ đến.
- IP: Đảm bảo thông tin được truyền đến đúng địa chỉ. IP sẽ gán các địa chỉ và định tuyến từng gọi thông tin. Mỗi mạng sẽ có 1 địa chỉ IP để xác định được chính xác nơi chuyển/nhận thông tin, dữ liệu.
  Trong quá trình truyền nhận thông tin, nếu giao thức TCP phát hiện ra thông tin bị lỗi, giao thức này sẽ yêu cầu hệ thống gửi thêm các gói tin khác. Để hiểu rõ hơn về cách thức hoạt động và chức năng của TCP/IP, hãy cùng tìm hiểu chức năng của từng tầng trong mô hình này.

<img src="https://fptcloud.com/wp-content/uploads/2022/01/TCP-co-chuc-nang-xac-dinh-cac-ung-dung-va-tao-ra-cac-kenh-giao-tiep.png" width="500">

# Chức năng của từng tầng trong mô hình TCP/IP

Mô hình TCP/IP hiện nay gồm có 4 lớp. Đây là mô hình tiêu chuẩn. 4 lớp này sẽ được trồng lên nhau theo thứ tự lần lượt là:

- Tầng vật lý
- Tầng mạng
- Tầng giao vận
- Tầng ứng dụng.

Cụ thể, chức năng của từng tầng như sau:

## Tầng 4: Tầng ứng dụng – Application

Tầng ứng dụng hay còn được gọi là Application. Đây là tầng trên cùng, có chức năng giao tiếp của mô hình. Cụ thể, tầng ứng dụng sẽ giao tiếp dữ liệu giữa 2 máy khác nhau. Việc giao tiếp có thể thông qua trình duyệt web, email hay một số giao thức khác như SMTP, SSH, FTP…

Tầng ứng dụng giao thức dữ liệu bằng hình thức Byte by Byte. Các thông tin sẽ được định tuyến với nhau, giúp gói tin đi theo một hướng đi đúng và thông tin được truyền tải thành công.

## Tầng 3: Tầng giao vận – Transport

Tầng giao vận là tầng thứ 3, có chức năng xử lý các vấn đề trong quá trình giao tiếp của các máy chủ. Các máy chủ này có thể trong cùng một mạng hoặc khác mạng. Trong trường hợp khác mạng, các máy chủ sẽ được kết nối thông qua một bộ định tuyến.

<img src="https://fptcloud.com/wp-content/uploads/2022/01/Tang-giao-van-la-tang-thu-3-co-chuc-nang-xu-ly-cac-van-de-trong-qua-trinh-giao-tiep-cua-cac-may-chu.png" width=500>

Dữ liệu ở tầng giao vận sẽ được phân thành các đoạn có kích thước không bằng nhau. Tuy nhiên, kích thước của các đoạn cần nhỏ hơn 64KB. Một đoạn sẽ gồm Header chứa thông tin, sau header là các đoạn dữ liệu.

Tầng Transport gồm 2 giao thức:

- **Giao thức TCP**: giúp đảm bảo chất lượng thông tin trong quá trình truyền nhận. Tuy nhiên, việc truyền nhận thông tin thường mất nhiều thời gian do việc kiểm tra thứ tự thông tin khá lâu. Đồng thời, giao thức TCP cũng giúp hạn chế tình trạng tắc nghẽn đối với lưu lượng dữ liệu.
- **Giao thức UDP**: Có thời gian truyền tải dữ liệu nhanh hơn. Tuy nhiên, giao thức UDP sẽ không thể đảm bảo chất lượng dữ liệu như đối với giao thức TCP.

## Tầng 2: Tầng mạng – Internet

Khi tìm hiểu TCP/IP là gì, chắc chắc không thể bỏ qua việc tìm hiểu tầng 2 – tầng mạng internet của giao thức này. Tầng internet của TCP/IP có giao thức gần giống như mô hình OSI. Tầng 2 có chức năng chính trong việc truyền tải dữ liệu, đảm bảo các dữ liệu được truyền tải một cách logic.

Các dữ liệu sẽ được chia thành các phân đoạn sau đó được đóng gói. Mỗi gói sẽ có các kích thước phù hợp để việc vận chuyển dễ dàng hơn. Đồng thời, các gói thông tin khi truyền tải sẽ được thêm phần Header. Header này sẽ chứa các thông tin của tầng mạng để có thể xác định và chuyển tới tầng tiếp theo. Tầng internet thường sử dụng 3 giao thức chính, đó là: IP, ICMP và tầng ARP.

<img src="https://fptcloud.com/wp-content/uploads/2022/01/Tang-internet-cua-TCP-IP-co-giao-thuc-gan-giong-nhu-mo-hinh-OSI-1.png" width="700">

## Tầng 1: Tầng vật lý – Physical

Đúng như tên gọi, tầng vật lý của giao thức TCP/IP có sự kết hợp giữa vật lý và dữ liệu mô hình OSI. Đây là tầng có trách nhiệm truyền tải các dữ liệu giữa các thiết bị khác nhau trong cùng 1 mạng internet. Khác với các tầng trên, tại tầng vật lý, các dữ liệu sẽ được đóng gói vào khung (Frame) trước khi được định tuyến và gửi tới địa chỉ đích đã được chỉ định.

# Các giao thức TCP/IP phổ biến hiện nay

TCP/IP là gì, như chúng ta đã biết, TCP/IP là một giao thức truyền/ nhận dữ liệu trên môi trường internet. Vậy hiện nay, TCP/IP đang sử dụng các giao thức nào?

## HTTP – HyperText Transfer Protocol

HTTP là một trong những phương thức phổ biến hiện nay. Giao thức này giúp truyền các thông tin dữ liệu giữa các website, thường là web client và web server. Việc truyền dữ liệu sẽ không được bảo mật. HTTP sẽ truyền các dữ liệu thường file ảnh hoặc tệp HTML….

## HTTPS – Hypertext Transfer Protocol Secure

Đây là giao thức cực kỳ phổ biến. Giống với Http, Https cũng được sử dụng để truyền thông tin dữ liệu giữa 1 web client và 1 web server. Tuy nhiên, việc truyền thông tin dữ liệu sẽ được bảo mật. Đây là ưu điểm nổi bật của giao thức Http so với https.
HTTPS hiện đang sử dụng mô hình TCP/IP kết hợp với giao thức SSL và TLS. Vì thế, giao thức này cũng thường được sử dụng để truyền dữ liệu giữa thẻ tín dụng với dữ liệu cá nhân.

## FTP – File Transfer Protocol

FTP là giao thức có phần ít phổ biến hơn. Tuy nhiên, bạn cũng không thể bỏ qua khi tìm hiểu TCP/IP là gì. Đây là giao thức giúp kết nối 2 hoặc nhiều máy tính trên môi trường internet. Giao thức này hoạt động trên cổng số 20 và 21. Thông qua FTP, các máy con có thể truy cập internet để gửi dữ liệu tới máy chủ, đồng thời, lấy các dữ liệu đó. Dù ở khoảng cách xa, FTP vẫn giúp người dũng có thể dễ dàng truy cập vào máy chủ để nhận dữ liệu.

# Ứng dụng của giao thức TCP/IP

TCP/IP là gì? Ứng dụng thế nào? Đó là những câu hỏi luôn được quan tâm. Như đã giới thiệu ở trên, TCP/IP có chức năng kết nối thông tin trong internet. Bạn có thể sử dụng giao thức này để cung cấp các thông tin từ xa, ở bất cứ khoảng cách nào. TCP/IP được sử dụng để truyền file, gửi mail, ảnh hay phân phối web trên internet. Đồng thời, TCP/IP cũng được sử dụng để truy cập máy chủ từ xa.

<img src="https://fptcloud.com/wp-content/uploads/2022/01/TCP-IP-co-chuc-nang-ket-noi-thong-tin-trong-internet.jpg" width="500">

TCP/IP sẽ giúp thay đổi trạng thái thông tin để có thể truyền trong môi trường internet. Giao thức này sẽ thay đổi cách biểu thị thông tin thông qua các giao thức cơ bản hoặc giao thức ở mỗi lớp khi thông tin đi qua. Qua đó giúp việc truyền thông tin chính xác, hiệu quả và đến đúng nơi cần đến.

# Đánh giá ưu nhược điểm của mô hình TCP/IP

TCP/IP là phương thức được sử dụng rộng rãi. Tuy nhiên, bên cạnh các ưu điểm, TCP/IP cũng có một số nhược điểm mà bạn cần lưu ý.

## Ưu điểm

TCP/IP là giao thức có tính thực tế và tính ứng dụng cao. Đây là giao thức có rất nhiều ưu điểm nổi bật. Chẳng hạn như:

- Có khả năng tạo lập kết nối giữa các máy tính khác nhau
- TCP/IP hoạt động độc lập với hệ điều hành. Do đó ít bị ảnh hưởng khi lỗi win.
- TCP/IP hỗ trợ tương tác với nhiều giao thức trực tuyến khác nhau.
- Có khả năng mở rộng cao nhờ việc kết nối giữa máy client và máy server.
- Giao thức có thể hoạt động hoàn toàn độc lập.
- Hỗ trợ nhiều giao thức khác nhau
- Không ảnh hưởng tới internet hay gây áp lực trên máy tính nhờ có dung lượng nhẹ.

## Nhược điểm

Trong quá trình tìm hiểu TCP/IP là gì, chúng ta cũng không thể bỏ qua các nhược điểm của giao thức này. Tất nhiên, không có một chương trình nào là hoàn hảo 100%. TCP/IP cũng còn một số nhược điểm như:

- Khó quản lý, cài đặt khá cầu kỳ, phức tạp.
- Tầng giao vận đôi khi không đảm bảo được việc phân phối các gói tin, dữ liệu.
- TCP/IP gồm các giao thức cố định, rất khó để thay thế.
- Bên cạnh đó, TCP/IP cũng không có sự tách biệt giữa khái niệm với giao diện. Với những trang web mới trong mạng mới, TCP/IP là giao thức chưa thực sự hiệu quả.
- TCP/IP dễ bị tấn công và từ chối dịch vụ.

# Những câu hỏi thường gặp về TCP/IP

Sau khi đã tìm hiểu TCP/IP là gì, ứng dụng và ưu nhược điểm của giao thức này, chúng ta đã thấy, đây là giao thức rất phổ biến. Chính vì thế, đây là giao thức được nhiều người sử dụng. Chính vì thế, trong quá trình tìm hiểu, rất nhiều câu hỏi về TCP/IP đã được đưa ra.

## Nên lựa chọn mô hình TCP/IP hay OSI?

Nếu đang băn khoăn về việc nên lựa chọn TCP/IP hay OSI, bạn cần cân nhắc dựa trên nhu cầu sử dụng của mình.

- Nếu cần mô hình để tham khảo và có tính bảo mật vừa phải, bạn nên lựa chọn TCP/IP.
- Nếu cần mô hình có quy tắc, hoạt động độc lập và có tính bảo mật cao, bạn nên chọn mô hình OSI.

## So sánh TCP/IP và Ethernet?

TCP/IP và Ethernet giống và khác nhau thế nào? Như chúng ta đã biết khi tìm hiểu TCP/IP là gì, đây là giao thức truyền thông tin bằng cách chia thông tin thành các phần nhỏ hơn. TCP/IP cũng có thể phát hiện, kiểm tra lỗi khi truyền nhận thông tin, kiểm soát để thông tin được truyền đến đích.

Khác với TCP/IP, Ethernet là một tiêu chuẩn mạng. Quy định này quy định không có máy tính/thiết bị nào kiểm soát thời điểm truyền nhận dữ liệu. THay vào đó, thiết bị trung tâm mạng sẽ chủ động truyền dữ liệu bất cứ khi nào có thể. Đây là một mạng cục bộ, khác với giao thức TCP/IP.

## Dữ liệu truyền vào các lớp của TCP/IP có giống nhau không?

TCP/IP có cách thức truyền dữ liệu khác nhau ở các lớp khác nhau. Trong đó:

- Ở lớp kết nối, dữ liệu được truyền gọi là Frame
- Ở lớp internet, dữ liệu được gửi xuống tầng dưới là IP Datagram
- Lớp truyền tải: dữ liệu được gọi là TCP Segment.
- Lớp ứng dụng: dữ liệu các luồng có tên gọi là Stream.

## Giao thức nào được sử dụng ở mỗi lớp?

TCP/IP chia thành các lớp. TRong đó, lớp cao hơn sẽ có giao thức ở lớp thấp hơn:

- Lớp kết nối: Dùng giao thức Ethernet, Wifi, Token Ring…
- Lớp internet: IP gán địa chỉ cho dữ liệu trước khi truyền nhận tới các đích đến. Giao thức ICMP báo lỗi khi dữ liệu truyền nhận bị hỏng.
- Lớp truyền tải: TCP đảm bảo dữ liệu truyền ổn định, đảm bảo bảo mật. UDP giúp tốc độ truyền tải tăng nhanh hơn.
- Lớp ứng dụng: FTP truyền file, SMTP phân phối Email, HTTP truyền nội dung giữa 2 máy…
