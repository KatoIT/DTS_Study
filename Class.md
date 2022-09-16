# Class Java, 👋

# Đối tượng

Một thực thể có trạng thái và hành vi được gọi là đối tượng. Ví dụ như máy pha cà phê, xe đạp, cái quạt...

Một đối tượng có ba đặc điểm:

- Trạng thái: Đại diện cho dữ liệu (giá trị) của một đối tượng.
- Hành vi: Đại diện cho hành vi (chức năng) của một đối tượng như gửi tiền, rút tiền, ...
- Danh tính: Danh tính của một đối tượng thường được cài đặt thông qua một ID duy nhất. ID này được ẩn đối với user bên ngoài. Tuy nhiên nó được sử dụng trong nội bộ máy ảo JVM để định danh từng đối tượng.

        Ví dụ: Bút chì là một đối tượng. Tên của nó là A, màu trắng, ... được gọi là trạng thái. Nó được sử dụng để viết, viết được gọi là hành vi.

Đối tượng(Object) là một thể hiện của một lớp(Class). Lớp là một mẫu hoặc thiết kế từ đó các đối tượng được tạo ra. Vì vậy, đối tượng là các thể hiện (kết quả) của một lớp.

# Lớp (Class)

Một lớp(class) là một nhóm đối tượng có các thuộc tính chung. Nó là một mẫu hoặc thiết kế từ đó các đối tượng được tạo ra.

Một lớp trong java có thể chứa:

    - Thành viên dữ liệu
    - Constructor
    - Phương thức
    - Khối lệnh
    - Lớp và Interface

# Những cách để tạo đối tượng trong java
Có vài cách để tạo đối tượng trong java, đó là:

    - Sử dụng từ khóa new
    - Sử dụng phương thức newInstance()
    - Sử dụng phương thức clone()
    - Sử dụng phương thức factory,...

# Đối tượng Annonymous trong java

Annonymous nghĩa là vô danh. Một đối tượng không có tham chiếu gọi là đối tượng Annonymous.

Nếu bạn sử dụng đối tượng 1 lần duy nhất, thì lựa chọn tạo đối tượng Annonymous là tốt nhất trong trường hợp này.

# Sự khác nhau giữa lớp và đối tượng trong java

Sự khác nhau giữa lớp và đối tượng trong java được thống kê trong bảng sau:

| No  | Đối tượng                                                                                                                                                 | Lớp                                                                          |
| --- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| 1.  | Đối tượng là thể hiện của 1 lớp.                                                                                                                          | Lớp là một khuân mẫu hay thiết kế để tạo ra các đối tượng.                   |
| 2.  | Đối tượng là 1 thực thể trong thế giới thực như Bút chì, Xe đạp, ...                                                                                      | Lớp là một nhóm các đối tượng tương tự nhau.                                 |
| 3.  | Đối tượng là 1 thực thể vật lý                                                                                                                            | Lớp là 1 thực thể logic                                                      |
| 4.  | Đối tượng được tạo ra chủ yếu từ từ khóa new. **Ví dụ**: Student s1=new Student();                                                                        | Lớp được khai báo bằng việc sử dụng từ khóa class.**Ví dụ**: class Student{} |
| 5.  | Đối tượng có thể được tạo nhiều lần.                                                                                                                      | Lớp được khai báo 1 lần duy nhất.                                            |
| 6.  | Đối tượng được cấp bộ nhớ khi nó được tạo ra.                                                                                                             | Lớp không được cấp bộ nhớ khi nó được tạo ra.                                |
| 7.  | Có rất nhiều cách để tạo ra đối tượng trong java như từ khóa new, phương thức newInstance(), phương thức clone(), phương thức factory và deserialization. | Chỉ có một cách để định nghĩa lớp trong java sử dụng từ khoá class.          |
