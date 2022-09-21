# Network, 👋

- [Mô hình OSI là gì?](#mô-hình-osi-là-gì)
- [Mô hình TCP/IP là gì?](#mô-hình-tcpip-là-gì)
- [So sánh mô hình OSI và TCP/IP](#so-sánh-mô-hình-osi-và-tcpip)


# Mô hình OSI là gì?

OSI là mô hình tham chiếu kết nối hệ thống mở. Mô hình này được tạo nên nhờ vào nguyên lý phân tầng, giải thích về kỹ thuật kết nối giữa các máy tính và thiết lập giao thức mạng giữa các máy tính đó. Mô hình OSI còn được gọi là mô hình bảy tầng.

Mô hình OSI chia giao tiếp mạng thành 7 tầng. Từ tầng 1 đến tầng 4 là là những lớp thuộc cấp thấp, nó thực hiện nhiệm vụ di chuyển dữ liệu. Từ tầng 5 đến tầng 7 là lớp thuộc cấp cao, thực hiện nhiệm vụ đặc thù và chuyển tiếp dữ liệu.

<img src="https://www.bkns.vn/wp-content/uploads/2022/09/osi-la-mo-hinh-tham-chieu-ket-noi-he-thong-mo.png" width="450">

Những ưu điểm của OSI đó là:

- OSI phân thành nhiều tầng nhỏ và đơn giản hơn.
- OSI chuẩn hóa các thành phần mạng để phát triển dễ dàng hơn.
- OSI chuẩn hóa giao diện giữa các tầng.
- Dữ liệu được truyền nhanh chóng và dễ dàng hơn.

OSI chia giao tiếp mạng thành 7 tầng

<img src="https://www.bkns.vn/wp-content/uploads/2022/09/osi-chia-giao-tiep-mang-thanh-7-tang.jpg" width="500" alt="">

# Mô hình TCP/IP là gì?

Mô hình TCP/IP có sự kết hợp giữa các giao thức riêng biệt. Nhiệm vụ của mỗi giao thức là giúp máy tính có thể kết nối, truyền thông tin qua lại với nhau. TCP là giao thức điều khiển truyền nhận còn Internet Protoco (IP) là giao thức liên mạng. TCP/IP gồm 4 tầng đó là tầng ứng dụng, tầng mạng, tầng giao vận và tầng vật lý.

FTP, HTTP, HTTPS ba giao thức được dùng nhiều nhất của TCP/IP. FTP là giao thức giúp cho máy tính có thể gửi dữ liệu không giới hạn đến một hay nhiều máy tính khác. HTTP có chức năng truyền dữ liệu không an toàn giữa người dùng web và máy chủ web. HTTPS là giao thức được dùng để truyền dữ liệu an toàn giữa người dùng web và máy chủ web.

Ưu điểm của TCP/IP là:

- Mô hình TCP/IP không chịu sự kiểm soát của tổ chức nào. Do đó, người dùng có thể tự do sử dụng.
- TCP/IP có khả năng tương thích với các mạng, hệ điều hành và phần cứng máy tính.
- TCP/IP có khả năng khả năng định tuyến, mở rộng và nhận định được đường dẫn tốt nhất thông qua mạng.

# So sánh mô hình OSI và TCP/IP

## Giống nhau

Mô hình OSI và TCP/IP có một số điểm chung như sau:

- OSI và TCP/IP đều có kiến trúc phân lớp.
- OSI và TCP/IP đều có lớp Network và lớp Transport.
- OSI và TCP/IP cùng sử dụng kỹ thuật chuyển Packet.

## Khác nhau

Bảng so sánh tcp/ip vs osi dưới đây sẽ giúp bạn hiểu được sự khác nhau cơ bản giữa hai giao thức mạng này.

| Nội dung                 | Mô hình OSI                                                                                          | Mô hình TCP/IP                                                             |
| ------------------------ | ---------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| Độ tin cậy và phổ biến   | Nhiều người cho rằng đây là mô hình cũ, chỉ để tham khảo, số người sử dụng hạn chế hơn so với TCP/IP | Được chuẩn hóa, nhiều người tin cậy và sử dụng phổ biến trên toàn cầu      |
| Phương pháp tiếp cận     | Tiếp cận theo chiều dọc                                                                              | Tiếp cận theo chiều ngang                                                  |
| Sự kết hợp giữa các tầng | Mỗi tầng khác nhau sẽ thực hiện một nhiệm vụ khác nhau, không có sự kết hợp giữa bất cứ tầng nào     | Trong tầng ứng dụng có tầng trình diễn và tầng phiên được kết hợp với nhau |
| Thiết kế                 | Phát triển mô hình trước sau đó sẽ phát triển giao thức                                              | Các giao thức được thiết kế trước sau đó phát triển mô hình                |
| Số lớp (tầng)            | 7                                                                                                    | 4                                                                          |
| Truyền thông             | Hỗ trợ cả kết nối định tuyến và không dây                                                            | Hỗ trợ truyền thông không kết nối từ tầng mạng                             |
| Tính phụ thuộc           | Giao thức độc lập                                                                                    | Phụ thuộc vào giao thức                                                    |
