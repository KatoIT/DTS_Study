# Command line, 👋

    ls - List
    mkdir - Make Directory
    pwd - Print Working Directory
    cd - Change Directory
    rmdir - Remove Directory
    rm - Remove
    cp - Copy
    mv - Move (or Rename)
    cat – concatenate and print files
    tail – print TAIL
    less – print LESS
    grep
    find
    tar
    gzip
    unzip 
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

**[Tham khảo 1](https://techmaster.vn/posts/33519/cau-lenh-linux-can-biet-1)** |
**[Tham khảo 2](https://techmaster.vn/posts/33520/cau-lenh-linux-ban-can-biet-2)**
# 
## Tạo thư mục: **mkdir**
    mkdir directory_path
    VD: - mkdir folder
        - mkdir ./folder1 ./folder2

## Sao chép: **cp**
    cp item1 item2
| Tùy biến	| Tác dụng | 
|-----------|----------|
|-a, -archive	    | Sao chép tệp hoặc thư mục cùng toàn bộ thông tin thuộc tính gồm thông tin sở hữu và quyền hạn |
| -i, -interactive	| Thêm bước xác nhận với người dùng trước khi ghi đè tệp hoặc thư mục |
| -r, -recursive    |	Sao chép thư mục cùng toàn bộ nội dung thư mục. Khi sao chép thư mục nhất thiết cần có tùy chọn này |
| -u, -update       | Khi sao chép các tệp từ một thư mục sang một thư mục khác, chỉ sao chép các tệp chưa tồn tại hoặc đã tồn tại nhưng phiên bản mới hơn ở thư mục mới |
| -v, -verbose	    | Hiển thị các thông tin trạng thái trong quá trình sao chép |

Sao chép itemX vào directory
~~~
VD: cp item1 item2 ... directory
~~~

## Di chuyển hoặc đổi tên tệp và thư mục: **mv**

    mv item1 item2

| Tùy biến	| Tác dụng | 
|-----------|----------|
| -i, -interactive	| Thêm bước xác nhận với người dùng trước khi ghi đè tệp hoặc thư mục |
| -u, -update       | Khi sao chép các tệp từ một thư mục sang một thư mục khác, chỉ sao chép các tệp chưa tồn tại hoặc đã tồn tại nhưng phiên bản mới hơn ở thư mục mới |
| -v, -verbose	    | Hiển thị các thông tin trạng thái trong quá trình sao chép |

Di chuyển itemX vào directory
~~~
VD: mv item1 item2 ... directory
~~~

Đổi tên nếu item2 không tồn tại trong cùng thư mục.
Di chuyển item1 vào trong item2 nếu item2 đã tồn tại 
~~~
VD: mv item1 item2
~~~

## Xóa tệp hoặc thư mục: **rm**

| Tùy biến	| Tác dụng | 
|-----------|----------|
| -i, -interactive	| Thêm bước xác nhận với người dùng trước khi ghi đè tệp hoặc thư mục |
| -r, -recursive    |	Sao chép thư mục cùng toàn bộ nội dung thư mục. Khi sao chép thư mục nhất thiết cần có tùy chọn này |
|-f, -force| Bỏ qua các tệp không tồn tại và không xác nhận trước khi xóa. Tùy biến này sẽ làm mất tác dùng tùy biến —interactive |
| -v, -verbose	    | Hiển thị các thông tin trạng thái trong quá trình sao chép |
