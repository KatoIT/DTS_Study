# Annotations, 👋

- [Annotations là gì?](#annotations-là-gì)
- [Cấu trúc của một Annotation trong Java](#cấu-trúc-của-một-annotation-trong-java)
- [Chức năng của Annotation trong Java](#chức-năng-của-annotation-trong-java)

## Annotations là gì?

Annotation được hiểu là một dạng chú thích hoặc một dạng siêu dữ liệu (metadata) được dùng để cung cấp thông tin dữ liệu cho mã nguồn Java. Các chú thích không có ảnh hưởng trực tiếp đến hoạt động của mã mà chúng chú thích.

Các Annotation được sử dụng trong mã nguồn sẽ được biên dịch thành bytecode và sử dụng kỹ thuật phản chiếu (Reflection) để truy vấn thông tin siêu dữ liệu và đưa ra hành động thích hợp.Chúng ta có thể chú thích các lớp (class), phương thức (method), các biến (variable), các gói (package) và các tham số (prameter) trong Java.

Java Annotation có hai loại:

- Các Annotation được tích hợp sẵn.
- Annotation do người dùng tự định nghĩa.

# Cấu trúc của một Annotation trong Java

Một chú thích luôn bắt đầu với ký hiệu @ và sau đó là tên của chú thích. Ký hiệu @ chỉ ra cho trình biên dịch rằng đây là một chú thích.

Ví dụ: @Deprecated

- Ký hiệu @ mô tả đây là một chú thích.
- Deprecated là tên của chú thích.

# Chức năng của Annotation trong Java

Annotation được sử dụng trong Java cho 3 mục đích chính:

## Thứ nhất, chỉ dẫn cho trình biên dịch (Compiler)

    Chú thích có thể được trình biên dịch sử dụng để phát hiện lỗi hoặc triệt tiêu các cảnh báo. Java có 3 Annotation có thể được sử dụng nhằm cung cấp chỉ dẫn cho trình biên dịch:

    1. @Deprecated

    2. @Override

    3. @SuppressWarnings

## Thứ hai, chỉ dẫn trong thời điểm biên dịch (Build-time)

    Các công cụ phần mềm có thể thông qua các chỉ dẫn của chú thích để tạo mã nguồn, tệp XML, nén mã biên dịch và các tâp tin vào một tập tin, v…v

## Thứ ba, chỉ dẫn trong thời gian chạy (Runtime)

    Thông thường, các Annotation không có mặt trong mã Java sau khi biên dịch. Tuy nhiên, có thể xác định trong thời gian chạy bằng cách sử dụng kỹ thuật Reflection và có thể sử dụng để đưa ra những hướng dẫn cho chương trình trong thời gian chạy.
