Multithreading, 👋

- [Đa luồng (Multithreading)](#đa-luồng-multithreading)
- [Ưu điểm của đa luồng trong java](#ưu-điểm-của-đa-luồng-trong-java)
- [Đa nhiệm (multitasking)](#đa-nhiệm-multitasking)
- [Đa nhiệm dựa trên tiến trình (Process) - Đa tiến trình (Multiprocessing)](#đa-nhiệm-dựa-trên-tiến-trình-process---đa-tiến-trình-multiprocessing)
- [Đa nhiệm dựa trên luồng (Thread) - Đa luồng (MultiThreading)](#đa-nhiệm-dựa-trên-luồng-thread---đa-luồng-multithreading)
- [Vòng đời của thred (các trạng thái) trong java](#vòng-đời-của-thred-các-trạng-thái-trong-java)
- [Runnable interface](#runnable-interface)
- [Start một thread](#start-một-thread)

# Đa luồng (Multithreading)

Đa luồng (multithreading) trong java là một tiến trình thực hiện nhiều luồng đồng thời.

Luồng (thread) về cơ bản là một tiến trình con (sub-process). Nó là đơn vị nhỏ nhất của tiến trình. Đa tiến trình (multiprocessing) và đa luồng (multithreading) cả hai được sử dụng để tạo ra hệ thống đa nhiệm (multitasking).

# Ưu điểm của đa luồng trong java

1. Nó không chặn người sử dụng vì các luồng là độc lập và bạn có thể thực hiện nhiều công việc cùng một lúc.

2. Bạn có thể thực hiện nhiều hoạt động với nhau để tiết kiệm thời gian.

3. Luồng là độc lập vì vậy nó không ảnh hưởng đến luồng khác nếu ngoại lệ xảy ra trong một luồng duy nhất.

# Đa nhiệm (multitasking)

Đa nhiệm là một quá trình thực hiện nhiều nhiệm vụ cùng một lúc. Chúng ta sử dụng đa nhiệm để tận dụng tính năng của CPU. Đa nhiệm có thể đạt được bằng hai cách:

- Đa nhiệm dựa trên tiến trình (Process) - Đa tiến trình (Multiprocessing)
- Đa nhiệm dựa trên luồng (Thread) - Đa luồng (MultiThreading)

## Đa nhiệm dựa trên tiến trình (Process) - Đa tiến trình (Multiprocessing)

- Mỗi tiến trình có địa chỉ riêng trong bộ nhớ, tức là mỗi tiến trình phân bổ vùng nhớ riêng biệt.
- Tiến trình là nặng.
- Sự giao tiếp giữa các tiến trình có tri phí cao.
- Chuyển đổi từ tiến trình này sang tiến trình khác đòi hỏi thời gian để đăng ký việc lưu và tải, các bản đồ bộ nhớ, các danh sách cập nhật, vv.

## Đa nhiệm dựa trên luồng (Thread) - Đa luồng (MultiThreading)

- Các luồng chia sẻ không gian địa chỉ ô nhớ giống nhau.
- Luồng là nhẹ.
- Sự giao tiếp giữa các luồng có chi phí thấp

# Vòng đời của thred (các trạng thái) trong java

Một thead có thể nằm trong một trong năm trạng thái. Theo Sun, chỉ có 4 trạng thái trong vòng đời của thread trong java đó là new, runnable, non-runnable và terminated. Không có trạng thái run.

Nhưng để hiểu rõ hơn các thread, chúng ta sẽ tìm hiểu thread ở trong 5 trạng thái.

Vòng đời của thread trong java được kiểm soát bởi JVM. Các trạng thái của thread java như sau:

    1. New
    2. Runnable
    3. Running
    4 Non-Runnable (Blocked)
    5 Terminated

![](https://viettuts.vn/images/java/java-thread/vong-doi-cua-thread-trong-java.jpg)

## 1. New

Thread ở trạng thái new nếu bạn tạo một thể hiện của lớp Thread nhưng trước khi gọi phương thức start().

## 2. Runnable

Thread ở trạng thái runnable sau khi gọi phương thức start(), nhưng trình lên lịch (scheduler) của thread đã không chọn nó là thread đang chạy.

## 3. Running

Thread ở trạng thái running nếu trình lên lịch của thread đã chọn nó.

## 4. Non-Runnable (Blocked)

Đây là trạng thái khi thread vẫn còn sống, nhưng hiện tại không được chọn để chạy.

## 5. Terminated

Một thread ở trong trạng thái terminated hoặc dead khi phương thức run() của nó bị thoát.

# Tạo thread trong java

1. Bởi extends lớp Thread
2. Bởi implements Runnable interface.

## Lớp Thread

Các constructor thường được sử dụng của lớp Thread

    Thread()
    Thread(String name)
    Thread(Runnable r)
    Thread(Runnable r,String name)

Các phương thức thường được sử dụng của lớp Thread

**public void run()**: Được sử dụng để thực hiện hành động cho một thread.

**public void start()**: Bắt đầu thực hiện thread. JVM gọi phương thức run() trên thread.

**public void sleep(long miliseconds)**: Làm cho thread hiện tại tạm ngừng thực thi cho số mili giây quy định.

**public void join()**: Đợi cho một thread chết.

**public void join(long miliseconds)**: Đợi cho một thread chết với các mili giây quy định.

**public int getPriority()**: Trả về mức độ ưu tiên của thread.

**public int setPriority(int priority)**: Thay đổi mức độ ưu tiên của thread.

**public String getName()**: Trả về tên của thread.

**public void setName(String name)**: Thay đổi tên của thread.

**public Thread currentThread()**: Trả về tham chiếu của thread đang được thi hành.

**public int getId()**: Trả về id của thread.

**public Thread.State getState()**: Trả về trạng thái của thread.

**public boolean isAlive()**: Kiểm tra nếu thread còn sống.

**public void yield()**: Làm cho các đối tượng thread đang thực thi để tạm thời tạm dừng và cho phép các thread khác để thực thi.

**public void suspend()**: Được sử dụng để hoãn lại các thread (không dùng nữa).

**public void resume()**: Được sử dụng để tiếp tục các thread đang bị hoãn (không dùng nữa).

**public void stop()**: Được sử dụng để dừng thread (không dùng nữa).

**public boolean isDaemon()**: Kiểm tra nếu thread là một luồng hiểm.

**public void setDaemon(boolean b)**: Đánh dấu thread là luồng hiểm hoặc luồng người dùng.

**public void interrupt()**: Ngắt thread.

**public boolean isInterrupted()**: Kiểm tra nếu thread đã bị ngắt.

**public static boolean interrupted()**: Kiểm tra nếu thread hiện tại đã bị ngắt.

# Runnable interface

Giao tiếp Runnable nên được cài đặt bởi bất kỳ lớp nào mà thể hiển của lớp đó dự định sẽ được thực thi bởi thread. Giao tiếp Runnable chỉ có một phương thức run().

**public void run()**: Được sử dụng để thực hiện hành động cho một thread.

# Start một thread

Phương thức start() của lớp Thread được sử dụng để bắt đầu một thread mới được tạo. Nó thực hiện các nhiệm vụ sau:

- Start một new thread(với new callstack).
- Thread chuyển từ trạng thái New sang trạng thái Runnable.
- Khi thread được một cơ hội để thực thi, phương thức run() của nó sẽ chạy.
