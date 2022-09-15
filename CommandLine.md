# Command line, 👋

    ls - List
    mkdir - Make Directory
    pwd - Print Working Directory
    cd - Change Directory
    rmdir - Remove Directory
    cp - Copy
    mv - Move (or Rename)
    rm - Remove
    cat – concatenate and print files
    tail – print TAIL
    less – print LESS
    grep
    find
    tar
    gzip
    unzip

Tham khảo chi tiết **[tại đây](https://techmaster.vn/posts/33519/cau-lenh-linux-can-biet-1)**

#

    help
    whatis – What is this command
    who – Who Is logged in
    su – Switch User
    uname
    free – Free memory
    df – Disk space Free
    ps – Processes
    top – Top processes
    shutdown

Tham khảo chi tiết **[tại đây](https://techmaster.vn/posts/33520/cau-lenh-linux-ban-can-biet-2)**

#

## ls

liệt kê nội dung (file và thư mục) trong thư mục hiện hành.

## mkdir

Tạo thư mục mới

    mkdir directory_path
    VD: - mkdir folder
        - mkdir ./folder1 ./folder2

## pwd

in ra đường dẫn đầy đủ đến thư mục hiện hành.

## cd

chuyển một thư mục thành thư mục hiện hành cho phiên làm việc hiện tại.

## rmdir

xóa một thư mục.

## cp

Sao chép

    cp item1 item2

| Tùy biến         | Tác dụng                                                                                                                                           |
| ---------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| -a, -archive     | Sao chép tệp hoặc thư mục cùng toàn bộ thông tin thuộc tính gồm thông tin sở hữu và quyền hạn                                                      |
| -i, -interactive | Thêm bước xác nhận với người dùng trước khi ghi đè tệp hoặc thư mục                                                                                |
| -r, -recursive   | Sao chép thư mục cùng toàn bộ nội dung thư mục. Khi sao chép thư mục nhất thiết cần có tùy chọn này                                                |
| -u, -update      | Khi sao chép các tệp từ một thư mục sang một thư mục khác, chỉ sao chép các tệp chưa tồn tại hoặc đã tồn tại nhưng phiên bản mới hơn ở thư mục mới |
| -v, -verbose     | Hiển thị các thông tin trạng thái trong quá trình sao chép                                                                                         |

Sao chép itemX vào directory

```
VD: cp item1 item2 ... directory
```

## mv

Di chuyển hoặc đổi tên tệp và thư mục:
mv item1 item2

| Tùy biến         | Tác dụng                                                                                                                                           |
| ---------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| -i, -interactive | Thêm bước xác nhận với người dùng trước khi ghi đè tệp hoặc thư mục                                                                                |
| -u, -update      | Khi sao chép các tệp từ một thư mục sang một thư mục khác, chỉ sao chép các tệp chưa tồn tại hoặc đã tồn tại nhưng phiên bản mới hơn ở thư mục mới |
| -v, -verbose     | Hiển thị các thông tin trạng thái trong quá trình sao chép                                                                                         |

Di chuyển itemX vào directory

```
VD: mv item1 item2 ... directory
```

Đổi tên nếu item2 không tồn tại trong cùng thư mục.
Di chuyển item1 vào trong item2 nếu item2 đã tồn tại

```
VD: mv item1 item2
```

## rm

Xóa tệp hoặc thư mục

| Tùy biến         | Tác dụng                                                                                                             |
| ---------------- | -------------------------------------------------------------------------------------------------------------------- |
| -i, -interactive | Thêm bước xác nhận với người dùng trước khi ghi đè tệp hoặc thư mục                                                  |
| -r, -recursive   | Sao chép thư mục cùng toàn bộ nội dung thư mục. Khi sao chép thư mục nhất thiết cần có tùy chọn này                  |
| -f, -force       | Bỏ qua các tệp không tồn tại và không xác nhận trước khi xóa. Tùy biến này sẽ làm mất tác dùng tùy biến —interactive |
| -v, -verbose     | Hiển thị các thông tin trạng thái trong quá trình sao chép                                                           |

## cat

đọc và in ra nội dung của file ra màn hình.

## tail

đọc và in ra nội dung 10 dòng cuối cùng của file (mặc định).Có thể sử dụng tail **-n N** để chỉ định in **N** dòng ra màn hình.

## less

in ra nội dung của một file theo từng trang trong trường hợp nội dung của file quá lớn và phải đọc theo trang. Bạn có thể dùng **Ctrl+F** để chuyển trang tiếp theo và **Ctrl+B** để chuyển về trang trước.

## grep

tìm kiếm nội dung của file theo chuỗi cung cấp. Có thể dùng grep **-i** để tìm kiếm không phân biệt hoa thường hoặc **grep -r** để tìm kiếm trong toàn thư mục

## find -name

tìm kiếm file trong theo. Có thể dùng **find -iname** để tìm kiếm không phân biệt hoa thường.

## tar

- **tar -cvf** tạo file nén (.tar) từ các file có sẵn.
- **tar -tvf** xem nội dung file nén (.tar).
- **tar -xvf** giải nén (file .tar).

## gzip

tạo file nén (.gz). Sử dụng **gzip -d** để giải nén (file .gz).

## unzip

giải nén một file nén (.zip). Sử dụng **unzip -l** để xem nội dung file zip mà không cần giải nén.

## ping <địa chỉ host>

​ ping một host từ xa (server) bằng cách gửi các gói tin đến host đó. Nó thường dùng để kiểm tra kết nối mạng đến server.

## ps

hiển thị thông tin về các tiến trình đang chạy.

## top

hiển thị thông tin về các tiến trình đang chạy, sắp xếp theo hiệu suất CPU.
Có thể dùng lệnh **top -u** ​ để xem thông tin các tiến trình đang chạy của tài khoản đó.
