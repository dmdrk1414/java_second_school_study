# ๐ch07_1๊ณผ์ ๋ฅผ ํ๊ฒ ์ต๋๋ค.



```java
๊ณผ์  ๊ธฐ๊ฐ: 2022/11/07 ~ 2022/11/22 23:59๋ถ์ผ๋ก ๋์ด ์์ต๋๋ค.
๊ณผ์  ์ง๊ฐ : 2022/11/22 24 ์ ~ 2022/11/24 23:59 ๋ถ ์๋๋ค.

์ง๊ฐ ์ ์ถ ํ์ฉํ๋ ์ ์์์ 50% ๊ฐ์ ํ๊ณ  ๋ถ์ฌ๋ฉ๋๋ค. 


[7์ฅ ๊ณผ์ -1]

/******************************************************************************
 * ๊ธฐ์กด ์ฝ๋ ๋ณต์ฌ
 ******************************************************************************/
// ์๋ก์ด ํ๋ก์ ํธ๋ฅผ ๋ง๋ค์ด๋ผ.
// ์๋ก์ด ํด๋์ค Main๋ฅผ ๋ง๋ค์ด Main.java ์์คํ์ผ์ ๋ง๋  ํ [5์ฅ ๊ณผ์ ]์์ ๋ง๋ 
// Main.java ์์คํ์ผ์ ๋ชจ๋  ๋ด์ฉ๋ฅผ ๋ณต์ฌํด์ ์ฝ์ํ๋ผ. 
// ๊ทธ๋ฆฌ๊ณ  Main ํด๋์ค๋ ์๋์ ๊ฐ์ด ์์ ํ๋ผ.
//
// ๊ธฐ์กด 5์ฅ ๊ณผ์ ์์๋ ๋ค์ํ ๊ทธ๋ํฝ ๊ฐ์ฒด๋ค์ Linked List๋ก ๊ด๋ฆฌํ์๋ค.
// ์ด๋ฒ ๊ณผ์ ์์๋ ์ด๋ค ๊ฐ์ฒด๋ฅผ Vector๋ก ๊ด๋ฆฌํด ๋ณด์.

/******************************************************************************
 * ๋ฌธ์  1-1
 ******************************************************************************/
// 1) ๊ธฐ์กด class Node ์ ์ฒด๋ฅผ ์ฃผ์์ฒ๋ฆฌ ํ๋ผ.
// 2) ๊ธฐ์กด class ShapeList ๋ด์ head, tail ๋ฉค๋ฒ๋ค์ ์ฃผ์์ฒ๋ฆฌ ํ๊ณ ,
//    ๋์  ์๋์ ์๋ก์ด ๋ฉค๋ฒ๋ฅผ ์ถ๊ฐํ๋ผ. 
//    ํฅํ ๋ชจ๋  ๊ทธ๋ํฝ ๊ฐ์ฒด๋ค์ ์๋ vector์ ์ ์ฅํ๊ณ  ๊ด๋ฆฌํ  ๊ฒ์ด๋ค.

      private Vector vector;

// 3) interface LinkedList์ class ShapeList์ ๋ฉ์๋๋ค์ ๋งค๊ฐ๋ณ์ ์ ์ธ์์
//    ๊ธฐ์กด Objectํ ํ์์ Shape๋ก ๋ณ๊ฒฝํ๋ผ.
//    ๊ธฐ์กด์๋ ๋ชจ๋  ๊ทธ๋ํฝ ๊ฐ์ฒด๋ฅผ Object ๊ฐ์ฒด๋ก ์์บ์คํํด์ ์ฌ์ฉํ์์ผ๋
//    ์ง๊ธ๋ถํฐ๋ ๋ชจ๋  ๊ทธ๋ํฝ ๊ฐ์ฒด๋ฅผ Shape ๊ฐ์ฒด๋ก ์์บ์คํํด์ ์ฌ์ฉํ  ๊ฒ์ด๋ค.

/******************************************************************************
 * ๋ฌธ์  1-2
 ******************************************************************************/
// ShapeList() ์์ฑ์์์ Vector ๊ฐ์ฒด๋ฅผ ์์ฑํด์ ์ด๊ธฐํํ๋ผ.
//-----------------------------------------------------------------------------

/******************************************************************************
 * ๋ฌธ์  1-3
 ******************************************************************************/
// ShapeList::get_frontValue()
// empty๊ฐ ์๋ ๊ฒฝ์ฐ Vector์ ์ ์ ํ ๋ฉ์๋ ํ์ฉํ์ฌ vector์ ์ฒซ๋ฒ์งธ ์์๋ฅผ ๋ฐํ

/******************************************************************************
 * ๋ฌธ์  1-4
 ******************************************************************************/
// ShapeList::get_rearValue()
// empty๊ฐ ์๋ ๊ฒฝ์ฐ Vector์ ์ ์ ํ ๋ฉ์๋ ํ์ฉํ์ฌ vector์ ๋ง์ง๋ง ์์๋ฅผ ๋ฐํ
//-----------------------------------------------------------------------------

/******************************************************************************
 * ๋ฌธ์  1-5
 ******************************************************************************/
// ShapeList::add_front()
// Vector์ ์ ์ ํ add() ๋ฉ์๋ ํ์ฉ

/******************************************************************************
 * ๋ฌธ์  1-6
 ******************************************************************************/
// ShapeList::add_rear()
// Vector์ ์ ์ ํ add() ๋ฉ์๋ ํ์ฉ

/******************************************************************************
 * ๋ฌธ์  1-7
 ******************************************************************************/
// ShapeList::isEmpty()
// Vector์ ์ ์ ํ ๋ฉ์๋ ํ์ฉํ์ฌ ๋น์๋์ง์ ์ฌ๋ถ๋ฅผ ๋ฐํ
//-----------------------------------------------------------------------------

/******************************************************************************
 * ๋ฌธ์  1-8
 ******************************************************************************/
// ShapeList::remove_front()
// empty๊ฐ ์๋ ๊ฒฝ์ฐ Vector์ ์ ์ ํ ๋ฉ์๋ ํ์ฉํ์ฌ 
// vector์ ์ฒซ๋ฒ์งธ ์์๋ฅผ ์ญ์ ํ๊ณ  ์ญ์ ๋ ๊ทธ ์์๋ฅผ ๋ฐํ

/******************************************************************************
 * ๋ฌธ์  1-9
 ******************************************************************************/
// ShapeList::remove_rear()
// empty๊ฐ ์๋ ๊ฒฝ์ฐ Vector์ ์ ์ ํ ๋ฉ์๋ ํ์ฉํ์ฌ 
// vector์ ๋ง์ง๋ง ์์๋ฅผ ์ญ์ ํ๊ณ  ์ญ์ ๋ ๊ทธ ์์๋ฅผ ๋ฐํ
//-----------------------------------------------------------------------------

/******************************************************************************
 * ๋ฌธ์  1-10
 ******************************************************************************/
// ShapeList::toString()
// ๊ธฐ์กด์ result ๊ฐ์ฒด๋ฅผ ํ์ฉํ์ฌ ๋ค์๊ณผ ๊ฐ์ด ๋ฌธ์์ด์ result์ ์ถ๊ฐํ๋ค.
// empty ์กฐ๊ฑด์ ํ์์์
// ๊ธฐ์กด while ๋์  for ๋ฌธ์ ์ด์ฉํ์ฌ ๋ฒกํฐ์ ๊ฐ i ์ธ๋ฑ์ค์ ์์์ ๋ํด
//    ๊ธฐ์กด node.getValue() ๋์  vector์ i ์ธ๋ฑ์ค๋ฅผ ๊ฐ์ง ์์๋ฅผ ๊ตฌํด์ ๋์ฒดํ๋ค.
//    ํด๋น ์์๊ฐ vector์ ๋ง์ง๋ง ์์์ธ ๊ฒฝ์ฐ์ ์๋ ๊ฒฝ์ฐ์ ๊ธฐ์กด์ฒ๋ผ "\r\n"์ ", " ์ถ๊ฐ

/******************************************************************************
 * ๋ฌธ์  1-11
 ******************************************************************************/
// ์ด์  ํธ์๋ฅผ ์ํด ๊ธฐ์กด์ ์ถ๋ ฅ๋ฌธ์ ์กฐ๊ธ ์์ ํ์.
//
// 1) ๋ฉ์ธ ๋ฉ๋ด๊ฐ ์๋์ฒ๋ผ ๋ฉ๋ดํญ๋ชฉ์ด ๋ ํ์ ๊ฑธ์ณ ์ถ๋ ฅ๋๋๋ก 
//    ๊ธฐ์กด UI ํด๋์ค์ getMainMenu(Scanner scanner)๋ฅผ ์์ ํ๋ผ.

Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 

// 2) ๊ธฐ์กด UI ํด๋์ค์ getRadius()์์ System.out.println(msg) ๋์  
//    System.out.print(msg)์ผ๋ก ์์ ํ๋ผ.
//
// 3) 6๋ฒ ๋ฉ๋ดํญ๋ชฉ์ ์ ํํ์ ๋ ์๋์ ๊ฐ์ด ๊ทธ๋ํฝ ๊ฐ์ฒด๋ค์ด ์ถ๋ ฅ๋๋๋ก ํ๋ก๊ทธ๋จ์ ์์ ํ๋ผ. 
//    ์ฆ, ํ ํ์ ํ๋์ ๊ทธ๋ํฝ ๊ฐ์ฒด๊ฐ ์ถ๋ ฅ๋๊ฒ ํ๋ผ.  
 
...
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 6
[Rectangle  (1, 1) (2, 2)]
[Circle 1 (2, 2)]
[Circle 3 (4, 4)]
Line (5, 5) (6, 6)]

// 4) ๊ธฐ์กด์ GraphicEditor ํด๋์ run() ๋ฉ์๋ ๋ด์ case list_all: ์ ์๋ 
//    print ๋ฌธ์ฅ์ ์๋์ฒ๋ผ ์ฃผ์์ผ๋ก ์ฒ๋ฆฌํ๋ผ. 

                case list_all:    // ๋ฆฌ์คํธ ์ ๋ณด ์ถ๋ ฅ
                    //System.out.print(list.toString());    

//    ๊ทธ๋ฆฌ๊ณ  while ๋ฃจํ ๋งจ์ฒ์์ ์๋์ฒ๋ผ ๋ฆฌ์คํธ ์ ๋ณด๋ฅผ ์ถ๋ ฅํ๋ผ. ๊ทธ๋ฌ๋ฉด ๋ฉ๋ดํญ๋ชฉ์ ํ๋ ์คํํ  ๋๋ง๋ค
//    ํ์ฌ ShapeList list์ ์ ์ฅ๋์ด ์๋ ๋ชจ๋  ๊ทธ๋ํฝ ๊ฐ์ฒด๋ค์ ๋งค๋ฒ ๋ณด์ฌ ์ค ๊ฒ์ด๋ค.
//
        while (bLoop) {
            System.out.print(list);    

===============================================================================
== ํ๋ก๊ทธ๋จ ์คํ ๊ฒฐ๊ณผ
=============================================================================== 
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 1  // ์ฌ์ฉ์ ์๋ ฅ
Select one Shape  
Rectangle:0, Circle:1, Line:2 >> 1  // ์ฌ์ฉ์ ์๋ ฅ
Enter point coordinates (enter two integers) >> 10 20  // ์ฌ์ฉ์ ์๋ ฅ
Enter the radius (enter one integer) >> 5  // ์ฌ์ฉ์ ์๋ ฅ
[Circle 5 (10, 20)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 0  // ์ฌ์ฉ์ ์๋ ฅ
Select one Shape  
Rectangle:0, Circle:1, Line:2 >> 0  // ์ฌ์ฉ์ ์๋ ฅ
Enter point coordinates (enter two integers) >> 10 20  // ์ฌ์ฉ์ ์๋ ฅ
Enter point coordinates (enter two integers) >> 30 40  // ์ฌ์ฉ์ ์๋ ฅ
[Rectangle  (10, 20) (30, 40)]
[Circle 5 (10, 20)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 1  // ์ฌ์ฉ์ ์๋ ฅ
Select one Shape  
Rectangle:0, Circle:1, Line:2 >> 2  // ์ฌ์ฉ์ ์๋ ฅ
Enter point coordinates (enter two integers) >> 40 50  // ์ฌ์ฉ์ ์๋ ฅ
Enter point coordinates (enter two integers) >> 40 70  // ์ฌ์ฉ์ ์๋ ฅ
[Rectangle  (10, 20) (30, 40)]
[Circle 5 (10, 20)]
[Line (40, 50) (40, 70)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 4  // ์ฌ์ฉ์ ์๋ ฅ
The two integers to move along the X and Y axes (enter two integers) >> 5 10  // ์ฌ์ฉ์ ์๋ ฅ
[Rectangle  (15, 30) (35, 50)]
[Circle 5 (10, 20)]
[Line (40, 50) (40, 70)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 5  // ์ฌ์ฉ์ ์๋ ฅ
The two integers to move along the X and Y axes (enter two integers) >> 3 7  // ์ฌ์ฉ์ ์๋ ฅ
[Rectangle  (15, 30) (35, 50)]
[Circle 5 (10, 20)]
[Line (43, 57) (43, 77)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 3  // ์ฌ์ฉ์ ์๋ ฅ
[Rectangle  (15, 30) (35, 50)]
[Circle 5 (10, 20)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 4  // ์ฌ์ฉ์ ์๋ ฅ
The two integers to move along the X and Y axes (enter two integers) >> 6 5  // ์ฌ์ฉ์ ์๋ ฅ
[Rectangle  (21, 35) (41, 55)]
[Circle 5 (10, 20)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 2  // ์ฌ์ฉ์ ์๋ ฅ
[Circle 5 (10, 20)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 2  // ์ฌ์ฉ์ ์๋ ฅ
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 7  // ์ฌ์ฉ์ ์๋ ฅ
Good Bye
===============================================================================
== ํ๋ก๊ทธ๋จ์ ํ์คํธํ  ๋ ๋งค๋ฒ ์๋ก์ด ๊ทธ๋ํฝ ๊ฐ์ฒด๋ฅผ ์๋ ฅํ๋ ๊ฒ์ด ๋ฒ๊ฑฐ๋ก์ธ ์ ์๋ค.
== ํ๋ก๊ทธ๋จ์ ์๋ก ์คํํ ํ ์๋ ์ซ์๋ค์ Ctrl+C ํด์ Ctrl+V๋ก Console ์ฐฝ์ ํ๋ฒ์ ์๋ ฅํ๋ผ.
== ๋ง์ง๋ง 12 12 ๋ค์ [์ํฐ]๊น์ง๋ ๋ณต์ฌํด์ผ ํ๋ค.
== 6๊ฐ์ ๊ทธ๋ํฝ ๊ฐ์ฒด๋ฅผ ์์์ ์ผ๋ก ์๋ ฅํ๋ ๋ฐ์ดํ์ด๋ค.
=============================================================================== 
1
0
1 1
2 2

1
1
3 3
4

1
2
5 5
6 6

1
0
7 7
8 8

1
1
9 9
10

1
2
11 11
12 12
===============================================================================
== ํ๋ก๊ทธ๋จ ์คํ ๊ฒฐ๊ณผ
== ์ ๋ฐ์ดํฐ๋ฅผ ํ๋ฒ์ ๋ณต์ฌํด์ ์๋ ฅํ ํ์ ์คํ๊ฒฐ๊ณผ์ด๋ค.
=============================================================================== 
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 1   // ์ฌ์ฉ์ ์๋ ฅ
0
1 1
2 2

1
1
3 3
4

1
2
5 5
6 6

1
0
7 7
8 8

1
1
9 9
10

1
2
11 11
12 12   // ์ฌ๊ธฐ๊น์ง ์ฌ์ฉ์๊ฐ ํ๊บผ๋ฒ์ ์๋ ฅํ ๋ฐ์ดํ
Select one Shape  
Rectangle:0, Circle:1, Line:2 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Rectangle  (1, 1) (2, 2)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Select one Shape  
Rectangle:0, Circle:1, Line:2 >> Enter point coordinates (enter two integers) >> Enter the radius (enter one integer) >> [Rectangle  (1, 1) (2, 2)]
[Circle 4 (3, 3)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Select one Shape  
Rectangle:0, Circle:1, Line:2 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Rectangle  (1, 1) (2, 2)]
[Circle 4 (3, 3)]
[Line (5, 5) (6, 6)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Select one Shape  
Rectangle:0, Circle:1, Line:2 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Rectangle  (1, 1) (2, 2)]
[Circle 4 (3, 3)]
[Line (5, 5) (6, 6)]
[Rectangle  (7, 7) (8, 8)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Select one Shape  
Rectangle:0, Circle:1, Line:2 >> Enter point coordinates (enter two integers) >> Enter the radius (enter one integer) >> [Rectangle  (1, 1) (2, 2)]
[Circle 4 (3, 3)]
[Line (5, 5) (6, 6)]
[Rectangle  (7, 7) (8, 8)]
[Circle 10 (9, 9)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Select one Shape  
Rectangle:0, Circle:1, Line:2 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Rectangle  (1, 1) (2, 2)]
[Circle 4 (3, 3)]
[Line (5, 5) (6, 6)]
[Rectangle  (7, 7) (8, 8)]
[Circle 10 (9, 9)]
[Line (11, 11) (12, 12)]     // 6๊ฐ์ ๊ทธ๋ํฝ ๊ฐ์ฒด๊ฐ ํ๋ฒ์ ์์ฑ๋์๋ค. ๊ทธ๋ฐ ํ ๋ค๋ฅธ ๋ฉ๋ดํญ๋ชฉ์ ํ์คํธํ๋ผ.
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 
```

