# Oriented Object Programming(OOP), 👋

# Lập trình hướng đối tượng

- Lập trình hướng đối tượng là một mô hình lập trình máy tính dựa trên khái niệm lớp và đối tượng.
- Lấy đối tượng làm nền tảng để xây dựng giải thuật, xây dựng chương trình và thực hiện xử lý dữ liệu với đối tượng đã định nghĩa đó.
- Nhằm tối ưu hóa việc quản lý mã nguồn (source code), tái sử dụng mã nguồn, tóm gọn các thủ tục đã biết trước tính chất thông qua việc sử dụng đối tượng.
- Một đối tượng có thể được định nghĩa là một trường dữ liệu có các thuộc tính và các hành động của riêng nó.

# Thành phần của OOP

- Lớp (Class)
- Đối tượng (Object)

# Các tính chất trong OOP Java

OOP Java có 4 tính chất, gồm: tính trừu tượng (abstract), tính kế thừa (inheritance), tính đóng gói (encapsulation), tính đa hình (polymorphism).

- **_Tính trừu tượng (abstract)_**: abstract có nghĩa là chúng ta đi tổng quát hóa một cái gì đó mà không cần đi vào chi tiết quá vào nó, nhưng người nghe vẫn hiểu được nó là cái gì. Trong OOP thì tính trừu tượng tức là ta đi lựa chọn các thuộc tính và các phương thức cần thiết của đối tượng để giải quyết bài toán. Bởi trong thực tế, một đối tượng có thể có rất nhiều thuộc tính và phương thức, nhưng không liên quan và không cần sử dụng trong bài toán đề ra.

- **_Tính kế thừa (inheritance)_**: Chỉ đơn giản là chúng ta tái sử dụng lại các thuộc tính, phương thức ở class khác mà không cần phải xây dựng lại từ đầu.

- **_Tính đóng gói (encapsulation)_**: đóng gói ở đây có nghĩa là đóng gói attributes, methods thành class, đóng gói các class thành package, ... Nhằm che giấu thông tin và đảm bảo sự toàn vẹn của dữ liệu.

- **_Tính đa hình (polymorphism)_**: chỉ sự đa hình thái, chẳng hạn cùng có một phương thức giống nhau nhưng tùy vào tham số truyền vào hay sự cài đặt của lớp con mà nó thực hiện các công việc khác nhau. Tính đa hình liên quan tới 2 khái niệm là: overriding (ghi đè) và overloading (nạp chồng).

  - **_overriding (ghi đè)_** là đi viết lại, định nghĩa lại phương thức mà nó kế thừa từ lớp cha.

  - **_overloading (nạp chồng)_** sử dụng các phương thức có cùng tên nhưng tham số đầu vào lại khác nhau.

# Ưu điểm, nhược điểm

## Ưu điểm

- Nâng cao hiệu năng phát triển phần mềm, liên quan tới 3 yếu tố trong OOP:
  - **Tính Mô - đun**: Tách biệt các nhiệm vụ trong quá trình phát triển phần mềm dựa trên các đối tượng cụ thể, hay mỗi đối tượng có một nhiệm vụ riêng.
  - **Tính mở rộng**: Các đối tượng có thể mở rộng thêm các thuộc tính mới, các hành vi mới trong tương lai.
  - **Tính tái sử dụng**: Các đối tượng có thể tái sử dụng một ứng dụng hoặc nhiều ứng dụng khác nhau. Nhờ vào các yếu tố trên mà OOP giúp tăng hiệu năng phát triển phần mềm so với lập trình hướng thủ tục truyền thống.
- Nâng cao khả năng bảo trì phần mềm: Chính nhờ các yếu tố kể trên mà việc bảo trì cũng trở nên dễ dàng hơn, vì thiết kế theo mô-đun nên việc thay đổi một phần của chương trình có thể không làm ảnh hưởng đến những phần còn lại, rất phù hợp với những dự án lớn, đòi việc phải bảo trì và thay đổi nhiều.
- Phát triển phần mềm nhanh hơn: Nhờ vào tính tái sử dụng mà các phần mềm được phát triển nhanh hơn, OOP thường có thư viện đối tượng phong phú, hay những đối tượng do chính bạn tự định nghĩa, các đoạn code được tối ưu hóa đều có thể được tái sử dụng trong tương lai. => giảm thiểu chi phí phát triển.

## Nhược điểm

- Khá phức tạp, có thể khó nhằn cho beginner, bởi nó đòi hỏi sự tư duy dựa trên sự tương tác giữa các đối tượng, do đó chúng ta cần nắm được bản chất: lớp, đối tượng, thuộc tính, phương thức; nắm được 4 tính chất của hướng đối tượng gồm: tính trừu tượng (abstract), tính kế thừa (inheritance), tính đóng gói (encapsulation), tính đa hình (polymorphism).
- Chương trình có thể chậm và kích thước lớn hơn so với các chương trình lập trình hướng thủ tục. Do các phần mềm này thường yêu cầu nhiều câu lệnh hơn để thực thi, người lập trình cần viết ra nhiều dòng mã hơn để đảm bảo các thuộc tính, phương thức của đối tượng => kích thước chương trình lớn theo.
- Lập trình hướng đối tượng không phải là chìa khóa vạn năng cho nhiều vấn đề. Theo em, mỗi một phương pháp lập trình đều có sự phù hợp với mỗi bài toán thực tế nhất định. Chẳng hạn giải phương trình bậc 2, thay vì phải ngồi viết ra đối tượng phương trình bậc 2 (theo OOP), cài đặt các thuộc tính và các phương thức cho nó, trong lập trình hướng chức năng trong 1 file duy nhất, ta chỉ cần viết mỗi một hàm con có chức năng tìm nghiệm nhờ vào việc truyền vào 3 tham số giá trị và cho in nghiệm là xong.
