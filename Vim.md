# Vim, 👋

## Cài đặt Vim cho Linux dựa trên Debian

    $ sudo apt-get update
    $ sudo apt-get install vim

Kiểm tra đã cài đặt thành công hay chưa

    $ which vim

Nếu cài đặt thành công nó nên in vị trí của VIM nhị phân.

    VD: /usr/bin/vim

---

# **Thao tác lệnh với Vim**

# Tạo tệp mới

**C1:**
Mở vim

    $ vim

Tạo tệp mới với lệnh:

    :edit newfile.txt

Nó sẽ tải lại tệp nếu tệp đã tồn tại

**C2**

    $ vim newfile.txt

# Mở tệp ở chế độ chỉ đọc

    $ vim -R filename.txt

or

    $ view filename.txt

# Chỉnh sửa tệp hiện có

    $ vim filename.txt
    i       -> chuyển sang chế độ insert
    :q!     -> Thoát không lưu thay đổi
    :wq     -> Lưu và thoát

# Truy cập sách hướng dẫn trợ giúp

    :help

# Trợ giúp về chủ đề cụ thể

    :help <topic-name>

# Tìm kiếm cụm từ trợ giúp trong thủ công

    ::helpgrep <phrase>

# Truy cập trợ giúp trực tuyến

Vim cũng cung cấp trợ giúp trực tuyến. Để truy cập trợ giúp trực tuyến

- Truy cập URL **[vim-help](https://www.vim.org/htmldoc.php/usr_01.html)**
- Ngoài ra, cũng có thể tham khảo tài liệu **[vim-docs](https://vim8.org/)**

# Chuyển sang chế độ lệnh Nomal

    Esc

# Chuyển sang chế độ Insert

    i   -> giữ nguyên vị trí con trỏ
    I   -> di chuyển con trỏ đến đầu dòng hiện tại
    a   -> di chuyển con trỏ tiếp theo theo một vị trí
    A   -> di chuyển con trỏ đến cuối dòng hiện tại
    o   -> chèn dòng trống phía dưới dòng hiện tại và di chuyển con trỏ đến đầu dòng mới
    O   -> chèn dòng trống phía trên dòng hiện tại di chuyển con trỏ đến đầu dòng mới
    s   -> xóa ký tự dưới con trỏ
    S   -> xóa dòng chứa con trỏ
    cc  -> Xóa dòng chứa con trỏ
    C   -> xóa văn bản sau vị trí con trỏ hiện tại và chuyển Vim ở chế độ chèn.

# Chuyển sang chế độ Replace

    r   -> Thay thế ký tự dưới con trỏ
    R   -> Chuyển sang chế độ REPLACE

# Nối văn bản

    J   -> nối dòng hiện tại với dòng kế tiếp

# Điều hướng cơ bản

    h   -> Di chuyển con trỏ sang trái theo một vị trí
    l   -> Di chuyển con trỏ sang phải theo một vị trí
    k   -> Di chuyển con trỏ theo hướng lên trên một dòng
    j   -> Di chuyển con trỏ theo hướng xuống dưới một dòng

    *Lưu ý*: Để thực hiện điều hướng nhiều vị trí, hãy sử dụng số với các lệnh này. VD: 10j

    0           -> Di chuyển con trỏ đến đầu dòng hiện tại
    $           -> Di chuyển con trỏ đến cuối dòng hiện tại
    Ctrl + f    -> Cuộn xuống toàn bộ trang
    Ctrl + b    -> Cuộn lên toàn bộ trang

# Điều hướng đến các dòng

    :N  -> Chuyển đến dòng thứ n
    :0  -> Chuyển đến đầu tệp
    :$  -> Chuyển đến cuối tệp

# Điều hướng từ

    w   -> Di chuyển con trỏ đến đầu từ tiếp theo
    e   -> Di chuyển con trỏ đến cuối từ hiện tại
    b   -> Di chuyển con trỏ đến đầu từ trước đó

# Sử dụng bước nhảy

Vim theo dõi điều hướng của bạn bằng cách sử dụng danh sách nhảy. Bạn có thể đi lùi và chuyển tiếp qua danh sách đó.
Danh sách nhảy theo dõi tất cả những nơi bạn đã đến bằng cách theo dõi tên tệp, số dòng và số cột.

    :jumps      -> xem danh sách nhảy
    Ctrl + o    -> Quay lại vị trí cũ
    Ctrl + i    -> Chuyển đến vị trí tiếp theo

# Cắt, sao chép và dán các hành động

    x   -> Xóa ký tự khỏi vị trí con trỏ
    X   -> Xóa ký tự trước đó khỏi vị trí con trỏ
    y   -> Sao chép một ký tự từ vị trí con trỏ
    P   -> Dán ký tự sau vị trí con trỏ
    P   -> Dán ký tự trước vị trí con trỏ

# Lệnh đa vị trí

    dw  -> Xóa từ khỏi vị trí con trỏ
    D   -> Xóa toàn bộ dòng khỏi vị trí con trỏ
    dd  -> Xóa toàn bộ dòng
    Y   -> Sao chép toàn bộ dòng
    yy  -> Sao chép toàn bộ dòng

# Hoàn tác

    u   -> hoàn tác một lần
    Nu  -> hoàn tác N lần
    U   -> hoàn tác tất cả

# Làm lại (Ngược lại với Hoàn tác)

    Ctrl + r
    OR
    : red

# Tìm kiếm cài đặt liên quan

Để thực hiện tìm kiếm gia tăng, hãy thực hiện lệnh sau:

    :set incsearch

Để đánh dấu tìm kiếm, hãy thực hiện lệnh sau:

    :set hlsearch

Lệnh này sẽ tự động đánh dấu các kết quả phù hợp hiện tại. Ví dụ trong hình ảnh dưới đây, từ cáo được tô sáng -

Có liên quan
Để tắt tìm kiếm gia tăng và được đánh dấu, hãy thực hiện các lệnh sau:

    :set noincsearch
    :set nohlsearch

# Tìm kiếm trong tệp hiện tại

## Tìm kiếm theo hướng phía trước

    / <biểu thức>   -> Tìm kiếm biểu thức theo hướng chuyển tiếp
    n               -> Tìm lần xuất hiện tiếp theo. Điều này giống nhau và tìm tiếp theo
    N               -> Tìm lần xuất hiện trước đó. Điều này giống như tìm thấy trước đó
    //              -> Lặp lại tìm kiếm chuyển tiếp trước đó

## Tìm kiếm theo hướng ngược lại

    ? <biểu thức>   -> Biểu thức tìm kiếm theo hướng ngược lại
    n               -> Tìm lần xuất hiện trước đó. Điều này giống nhau và tìm thấy trước đó
    N               -> Tìm lần xuất hiện tiếp theo. Điều này cũng giống như tìm tiếp theo
    ??              -> Lặp lại tìm kiếm ngược trước đó

## Tìm kiếm từ dưới con trỏ

    *   -> Tìm kiếm lần xuất hiện tiếp theo của từ hiện tại
    #   -> Tìm kiếm lần xuất hiện trước của từ hiện tại

# Tìm kiếm trong nhiều tệp

Sử dụng lệnh vimgrep, chúng ta có thể tìm kiếm <expression> trong nhiều tệp. Ví dụ dưới đây lệnh tìm kiếm chuỗi - Jarvis trong tất cả các tệp văn bản.

    :vimgrep Jarvis *.txt
    :cn    -> Chuyển đến lần xuất hiện tiếp theo của biểu thức
    :cN    -> Chuyển đến lần xuất hiện trước của biểu thức

---

\*Tham khảo chi tiết **[tại đây](https://www.tutorialspoint.com/vim/index.htm)\***
