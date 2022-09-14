# Basic Syntax

  - **Case Sensitivity** − Java có phân biệt chứ Hoa và chữ thường

  - **Class Names** − Đối với tất cả các tên lớp, mỗi chữ cái đầu tiên của từ phải ở dạng chữ hoa

        VD: class Student, OrderProduct,...

  - **Method Names** − Tất cả tên phương thức phải bắt đầu bằng chữ thường. Nếu một số từ được sử dụng để tạo thành tên của phương thức, thì chữ cái đầu tiên của mỗi từ bên trong phải ở dạng Chữ hoa.

        VD: public void methodName()

  - **Program File Name** − Tên của tệp chương trình phải khớp chính xác với tên lớp.

        *Lưu ý: Trong trường hợp bạn không có lớp công khai trong tệp thì tên tệp có thể khác với tên lớp. Nó cũng không bắt buộc phải có một lớp công khai trong tệp.

        VD: Giả sử 'MyFirstJavaProgram' là tên lớp. Sau đó, tệp sẽ được lưu dưới dạng 'MyFirstJavaProgram.java'

  - **public static void main(String args[])** − Quá trình xử lý chương trình Java bắt đầu từ phương thức main () là một phần bắt buộc của mọi chương trình Java.

# Các cú pháp trong java

## Điều kiện

    - if - else: dùng khi muốn rẽ nhánh chương trình theo điều kiện
    - switch - case: cũng dùng để rẽ nhánh chương trình nhưng chỉ áp dụng được cho các Hằng (ngoại trừ Hằng double và float)

## Vòng lặp

    - fori: thực hiện lặp cho đến khi điều kiện đề ra sai
    - foreach: truy xuất hoặc lặp thông qua tập hợp như array, list, set,... (khi truy xuất là tham trị đến phần tử trong tập hợp)
    - while: xét điều kiện trước rồi thực hiện tập lệnh
    - do - while: Thực hiện tập lệnh trong 'do' trước rồi xét điều kiện trong 'while'

## Break & Continue

    - break: thoát khỏi vòng lặp hiện tại
    - continue: bỏ qua các lệnh phía sau và nhảy đến lần lặp tiếp

## Mảng

    - Mảng 1 chiều 
    - Mảng nhiều chiều (thường 2,3 chiều)

## Phương thức

    - Là một khối lệnh chỉ chạy khi được gọi đến.
    - Có thể truyền dữ liệu, được gọi là tham số, vào một phương thức.
    - Các phương thức được sử dụng để thực hiện các hành động nhất định và chúng còn được gọi là các hàm .
    - Sử dụng các phương thức để sử dụng lại mã: xác định mã một lần và sử dụng nó nhiều lần