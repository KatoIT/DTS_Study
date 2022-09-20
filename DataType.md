# Data Type

Trong java có 2 kiểu dữ liệu

    - Primitive data types: Kiểu dữ liệu nguyên thủy
    - Non-primitive data types: Kiểu dữ liệu không nguyên thủy

Có 8 kiểu dữ liệu nguyên thủy:

    - Boolead
    - byte
    - char
    - short
    - int
    - long
    - float
    - double

và các kiểu dữ liệu không nguyên thủy bao gồm các:

    - Classes
    - Interfaces
    - Arrays

![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20191105111644/Data-types-in-Java.jpg)

| Data Type | Default Value | Default size |
| --------- | ------------- | ------------ |
| boolean   | false         | 1 bit        |
| char      | '\u0000'      | 2 byte       |
| byte      | 0             | 1 byte       |
| short     | 0             | 2 byte       |
| int       | 0             | 4 byte       |
| long      | 0L            | 8 byte       |
| float     | 0.0f          | 4 byte       |
| double    | 0.0d          | 8 byte       |

# Fomat String

| Format Specifier | Data Type                                                   | Output                                                                                                                   |
| ---------------- | ----------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------ |
| %a               | floating point (except BigDecimal)                          | Returns Hex output of floating point number.                                                                             |
| %b               | Any type                                                    | "true" if non-null, "false" if null                                                                                      |
| %c               | character                                                   | Unicode character                                                                                                        |
| %d               | integer (incl. byte, short, int, long, bigint)              | Decimal Integer                                                                                                          |
| %e               | floating point                                              | decimal number in scientific notation                                                                                    |
| %f               | floating point                                              | decimal number                                                                                                           |
| %g               | floating point                                              | decimal number, possibly in scientific notation depending on the precision and value.                                    |
| %h               | any type                                                    | Hex String of value from hashCode() method.                                                                              |
| %n               | none                                                        | Platform-specific line separator.                                                                                        |
| %o               | integer (incl. byte, short, int, long, bigint)              | Octal number                                                                                                             |
| %s               | any type                                                    | String value                                                                                                             |
| %t               | Date/Time (incl. long, Calendar, Date and TemporalAccessor) | %t is the prefix for Date/Time conversions. More formatting flags are needed after this. See Date/Time conversion below. |
| %x               | integer (incl. byte, short, int, long, bigint)              | Hex string.                                                                                                              |
