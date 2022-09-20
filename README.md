# MySql, 👋

- [SQL](#)
  - [Ưu điểm](#ưu-điểm)
  - [Các câu lệnh SQL](#các-câu-lệnh-sql)
    - [DDL – Ngôn ngữ định nghĩa dữ liệu (Data Definition Language)](#ddl-–-ngôn-ngữ-định-nghĩa-dữ-liệu-data-definition-language)
    - [DML – Ngôn ngữ thao tác dữ liệu(Data Manipulation Language)](#dml-–-ngôn-ngữ-thao-tác-dữ-liệudata-manipulation-language)
    - [DCL – Ngôn ngữ điều khiển dữ liệu (Data Control Language)](#dcl-–-ngôn-ngữ-điều-khiển-dữ-liệu-data-control-language)
- [MySQL](#)

# SQL - Structured Query Language

SQL là ngôn ngữ truy vấn có cấu trúc. Nó là một ngôn ngữ, là tập hợp các lệnh để tương tác với cơ sở dữ liệu. Dùng để lưu trữ, thao tác và truy xuất dữ liệu được lưu trữ trong một cơ sở dữ liệu quan hệ. Trong thực tế, SQL là ngôn ngữ chuẩn được sử dụng hầu hết cho hệ cơ sở dữ liệu quan hệ. Tất cả các hệ thống quản lý cơ sở dữ liệu quan hệ (RDMS) như MySQL, MS Access, Oracle, Postgres và SQL Server… đều sử dụng SQL làm ngôn ngữ cơ sở dữ liệu chuẩn.

## Ưu điểm

SQL được sử dụng phổ biến vì nó có các ưu điểm sau:

- Cho phép truy cập dữ liệu trong các hệ thống quản lý cơ sở dữ liệu quan hệ.
- Cho phép mô tả dữ liệu.
- Cho phép xác định dữ liệu trong cơ sở dữ liệu và thao tác dữ liệu đó.
- Cho phép nhúng trong các ngôn ngữ khác sử dụng mô-đun SQL, thư viện và trình biên dịch trước.
- Cho phép tạo và thả các cơ sở dữ liệu và bảng.
- Cho phép tạo chế độ view, thủ tục lưu trữ, chức năng trong cơ sở dữ liệu.
- Cho phép thiết lập quyền trên các bảng, thủ tục và view.

SQL sẽ giúp quản lý hiệu quả và truy vấn thông tin nhanh hơn, giúp bảo trì, bảo mật thông tin dễ dàng hơn.

## Các câu lệnh SQL

Các lệnh SQL tiêu chuẩn để tương tác với cơ sở dữ liệu quan hệ là CREATE, SELECT, INSERT, UPDATE, DELETE và DROP. Các lệnh này có thể được phân thành các nhóm sau dựa trên bản chất của chúng

### DDL – Ngôn ngữ định nghĩa dữ liệu (Data Definition Language)

| Lệnh   | Mô tả                                                                |
| ------ | -------------------------------------------------------------------- |
| CREATE | Tạo ra một bảng mới hoặc các đối tượng khác trong cơ sở dữ liệu.     |
| ALTER  | Sửa đổi một đối tượng cơ sở dữ liệu hiện có, chẳng hạn như một bảng. |
| DROP   | Xoá toàn bộ một bảng hoặc các đối tượng khác trong cơ sở dữ liệu.    |

### DML – Ngôn ngữ thao tác dữ liệu(Data Manipulation Language)

| Lệnh   | Mô tả                                                 |
| ------ | ----------------------------------------------------- |
| SELECT | Lấy ra các bảng ghi nhất định từ một hoặc nhiều bảng. |
| INSERT | Tạo một bảng ghi..                                    |
| UPDATE | Chỉnh sửa bảng ghi.                                   |
| DELETE | Xóa bảng ghi.                                         |

### DCL – Ngôn ngữ điều khiển dữ liệu (Data Control Language)

| Lệnh   | Mô tả                                     |
| ------ | ----------------------------------------- |
| GRANT  | Cung cấp một quyền cho người dùng.        |
| REVOKE | Lấy lại các quyền được cấp từ người dùng. |
