# Command line, 👋

- [Quyền cho file và thư mục](#quyền-cho-file-và-thư-mục)
- [Thay đổi phân quyền cho file và thư mục](#thay-đổi-phân-quyền-cho-file-và-thư-mục)
- [Thay đổi chủ sở hữu cho tập tin thư mục](#thay-đổi-chủ-sở-hữu-cho-tập-tin-thư-mục)

# Quyền cho file và thư mục

## Trong Linux có 3 quyền cơ bản của 1 user và group đó là:

- **r (read)** – quyền đọc file/folder
- **w (write)** – quyền ghi/sửa nội dung file/folder
- **x (execute)** – quyền thực thi (truy cập) thư mục. Đối với thư mục thì bạn cần phải có quyền execute thì mới dùng lệnh cd để truy cập vào được
- **– (Deny)** – Không có quyền

Các quyền này cũng có thể xác định bằng các con số tương ứng:

- **r (read)** – được biểu diễn bằng số **4**.
- **w (write)** – được biểu diễn bằng số **2**.
- **x (execute)** – được biểu diễn bằng số **1**.
- **– (Deny)** – được biểu diễn bằng số **0**

## Cấu trúc chỉ số phân quyền

- **u (owner)**: Quyền của user mà chủ sở hữu của file này.
- **g (group)**: Quyền của những users thuộc group mà chủ sở hữu của file này.
- **o (other)**: Quyền của tất cả các user khác trên máy.
- **a (all)**: tất cả user

### _Example 1_:

File file.txt có thông số như sau

- **owner** có quyền **r+w+x** = 4+2+1 = 7
- **group** có quyền **r+-+x** = 4+0+1 = 5
- **other** có quyền **r+-+x** = 4+0+1 = 5

  <img src="https://kienthucvps.com/wp-content/uploads/2021/07/understanding_linux_files_permissions_7551-1.jpg" width="400">

Chỉ số phân quyền của file file.txt sẽ là file.txt=755,

# Thay đổi phân quyền cho file và thư mục

## _C1_

    chmod <tùy chọn> <chỉ số phân quyền> <tên tập tin/thư mục>

### Các tùy chọn

| Options | Detail                                                                                          |
| ------- | ----------------------------------------------------------------------------------------------- |
| -v      | Hiển thị báo cáo sau khi chạy lệnh, mỗi lần đổi quyền là hiển thị một lần                       |
| -c      | Giống như trên, nhưng chỉ hiện khi nó đã làm xong tất cả.                                       |
| -R      | Áp dụng luôn vào các file/folder nằm bên trong folder được phân quyền (chỉ áp dụng cho thư mục) |

### _Example 2_:

```
chmod 777 file.txt
<Cấp quyền truy cập đầy đủ cho mọi đối tượng người dùng.>

chmod 775 file.txt
<Cấp quyền truy cập đầy đủ cho chủ hệ thống và nhóm quản trị, đối tượng người dùng chỉ có quyền đọc (read) và chạy (execute) file.>

chmod 755 file.txt
<Cấp quyền truy cập đầy đủ cho chủ hệ thống, chỉ cho phép nhóm quản trị và đối tượng người dùng đọc và chạy các file trong thư mục.>

chmod 700 file.txt
<Chỉ cấp quyền truy cập đầy đủ cho chủ hệ thống và chặn truy cập với mọi đối tượng khác.>

chmod 500 file.txt
<Không cho phép nhóm quản trị và người dùng truy cập vào file trong thư mục, đồng thời giới hạn quyền chủ hệ thống chỉ đọc và chạy để tránh xóa và thay đổi các file trong thư mục này.>

chmod 660 file.txt
<Cho phép chủ hệ thống và nhóm quản trị đọc, sửa, xóa và ghi dữ liệu vào file, nhưng không phân quyền truy cập cho những người dùng khác.>
```

## _C2_

    chmod <đối tượng> <+,-,=> <quyền>,... <tên tập tin/thư mục>

### _Example 3_:

```
    chmod u=rwx,g=rw,o=rw file.txt
    chmod u=rwx,go=rw file.txt

    chmod u+x file.txt
    chmod o-wx file.txt
    chmod -R a+rws dir1
```

# Thay đổi chủ sở hữu cho tập tin thư mục

    chown  <tùy chọn> <tên user>:<tên group>  <tên tập tin/thư mục>

Các tùy chọn xem **[tại đây](#các-tùy-chọn)**

### _Example 4_:

```
Thay đổi chủ sở hữu cho file file.txt

    # chown user1:group1 file.txt   <Thay đổi cả user và group cho file.txt>
    # chown user1 file.txt         <Thay đổi user cho file.txt>
    # chown :group1 file.txt        <Thay đổi group cho file.txt>

Thay đổi chủ sở hữu cho một thư mục dir1

    #chown -R user1:group1 dir1
```
