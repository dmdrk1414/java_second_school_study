# ๐ch07_3๊ณผ์ ๋ฅผ ํ๊ฒ ์ต๋๋ค.



```java
๊ณผ์  ๊ธฐ๊ฐ: 2022/11/07 ~ 2022/11/22 23:59๋ถ์ผ๋ก ๋์ด ์์ต๋๋ค.
๊ณผ์  ์ง๊ฐ : 2022/11/22 24 ์ ~ 2022/11/24 23:59 ๋ถ ์๋๋ค.

์ง๊ฐ ์ ์ถ ํ์ฉํ๋ ์ ์์์ 50% ๊ฐ์ ํ๊ณ  ๋ถ์ฌ๋ฉ๋๋ค. 


[7์ฅ ๊ณผ์ -3]
*์ฃผ์์ฌํญ 
 7์ฅ 7-3 ๊ณผ์ ๋ฌธ์ (ch7-3-problem-description.txt) ์ค 
์ ๋ค๋ฆญ ํด๋์ค ํํ์ ์ํด <>๋ฅผ ๋ง์ด ์ฌ์ฉํ๋๋ฐ(์: LinkedList)
์ด < > ๊ธฐํธ๊ฐ OJ์์คํ์ ์ฌ๋ฆด ๊ฒฝ์ฐ  HTML tag๋ก ์ธ์๋์ด ํ๋ฉด์ ํ์๊ฐ ๋์ง ์์ต๋๋ค.
์ด ๊ธฐํธ๊ฐ ํ๋ ๊ฐ์ด๋ฉด < >์ผ๋ก ๊ณ ์น๊ฒ ๋๋ฐ 
๋๋ฌด ๋ง์ ์ค๊ฐ์ ์์ ํ๋ค๊ฐ ์ค๋ฅ๊ฐ ๋ฐ์ํ ๊น ์ผ๋ ค๋์ด ์ด๊ฒ๋ ๊ณค๋ํ  ๊ฒ ๊ฐ์ต๋๋ค.

์ฌ์ด๋ฒ๊ฐ์์ค์ [๊ณผ์  7์ฅ๋์ ์ฌ๋ ค๋๊ฒ ์ต๋๋ค.
์ด ํ์ผ์ ์ฐธ์กฐํ๋ผ๊ณ  ํ์๋ ๊ฒ์ด ์ข์ ๋ฏ ํฉ๋๋ค.

ํ์๋ค์ ์์ค์ฝ๋ ์ ์ถ์  OJ ์์คํ์ ์๋๋ค. 

/******************************************************************************
 * ๊ธฐ์กด ์ฝ๋ ๋ณต์ฌ
 ******************************************************************************/
// ์๋ก์ด ํ๋ก์ ํธ๋ฅผ ๋ง๋ค์ด๋ผ.
// ์๋ก์ด ํด๋์ค Main๋ฅผ ๋ง๋ค์ด Main.java ์์คํ์ผ์ ๋ง๋  ํ [7์ฅ ๊ณผ์ -2]์์ ๋ง๋ 
// Main.java ์์คํ์ผ์ ๋ชจ๋  ๋ด์ฉ๋ฅผ ๋ณต์ฌํด์ ์ฝ์ํ๋ผ. 

//******************************************************************************
 * ์ ๋ค๋ฆญ ํด๋์ค์ ํ์์ฑ
 ******************************************************************************/

// ์ง๊ธ๊น์ง ์ฐ๋ฆฌ๋ ShapeList์ ์ ์ฅํ๋ ๋ฐ์ดํ ํ์์ ์๋์ฒ๋ผ Shapeํ ๋ฒกํฐ๋ฅผ ์ ์ธํด ๋๊ณ 
// Line, Rect, Circle ๊ฐ์ฒด๋ฅผ ์์ฑํ์ฌ ์์บ์คํํ ํ ShapeList ๋ด์ vector์
// ์ ์ฅํ์๋ค. ๋ฐ๋ผ์ ๋ค์ํ ์ข๋ฅ์ ๊ฐ์ฒด๋ค(Line, Rect, Circle)์ด ์ ์ฅ๋  ์ ์์๋ค.
// ๊ทธ๋ฌ๋ ๋๋ก๋ ํ๊ฐ์ง ์ข๋ฅ์ ๊ฐ์ฒด๋ง ๊ณ ์ ์์ผ ์ ์ฅํ๊ณ  ์ถ์ ๊ฒฝ์ฐ๊ฐ ์์ ์ ์๋ค. 
// ๋ง์ฝ ShapeList๋ฅผ ์๋์ฒ๋ผ Vector์ผ๋ก ์ ์ธํด ๋๊ณ  
// Rect ๊ฐ์ฒด๋ค๋ง ์ ์ฅํ๊ธฐ ์ํด ์ฌ์ฉํ๊ณ ์ ํ  ๊ฒฝ์ฐ Rect ๊ฐ์ฒด๋ค๋ง ์์ฑํด์ ๋ฒกํฐ์ ์ถ๊ฐํด์ผ ํ๋๋ฐ
// ๋ง์ฝ ์ฌ์ฉ์์ ์ค์๋ก Line์ด๋ Circle ๊ฐ์ฒด๋ฅผ ์์บ์คํํด์ ์ฝ์ํด๋ ์ด๋ฅผ ๋ง์ ๋ฐฉ๋ฒ์ด ์๋ค๋ ๊ฒ์ด๋ค.  

class ShapeList implements LinkedList {
	Vector vector; 
    ...
}

// ๊ทธ๋ฌ๋ ์๋์ฒ๋ผ ์ ์ธํ  ๊ฒฝ์ฐ ShapeList์ vector์๋ Rect ๊ฐ์ฒด๋ค๋ง ์ ์ฅํ  ์ ์๋ค.

class ShapeList implements LinkedList { Vector   vector; ... }

// ๋ง์ฐฌ๊ฐ์ง๋ก ์๋์ฒ๋ผ ์ ์ธํ๋ฉด vector์๋ ๊ฐ๊ฐ Line๊ณผ Circle ๊ฐ์ฒด๋ค๋ง ์ ์ฅํ  ์ ์๋ค.

class ShapeList implements LinkedList { Vector   vector; ... }
class ShapeList implements LinkedList { Vector vector; ... }

// ๋ฌธ์ ๋ ์์ฒ๋ผ ์ ์ธํ๊ณ  ๋๋ฉด ShapeList ํด๋์ค๋ฅผ ์ค์ง ํน์  ๊ฐ์ฒด(์, Rect)๋ง์ ์ํด 
// ์ ์ ์ผ๋ก ์ฌ์ฉํด์ผ ํ๊ณ  ๋ง์ฝ Line ๊ฐ์ฒด๋ฅผ ์ํ ๋ณ๋์ ShapeList๊ฐ ๋ ํ์ํ๋ฉด 
// Line์ ์ํ ๋์ผํ ๊ธฐ๋ฅ์ ๊ฐ์ง ShapeList๋ฅผ ๋ณ๋๋ก ๋ฐ๋ก ํ๋ ๋ ๋ง๋ค์ด์ผ ํ๋ค. 
// ๋ฟ๋ง ์๋๋ผ, ๊ทธ ํด๋์ค ๋ด์ ๋ชจ๋  ๋ฉ์๋๋ค ์ญ์ ์ค๋ณต๋์ด ํ๋์ฉ ๋ ๋ง๋ค์ด์ ธ์ผ ํ๋ค๋ ๊ฒ์ด๋ค. 

// ์ด๋ฌํ ์ฝ๋ ์ค๋ณต์ ํผํ๊ธฐ ์ํด ์ ๋ค๋ฆญ ํด๋์ค๋ฅผ ํ์ฉํด ๋ณด๋๋ก ํ์.
// ์ฆ, ์๋์ฒ๋ผ Shape ํด๋์ค๋ฅผ ์์ํ Rect, Line, Circle ๋ฑ๊ณผ ๊ฐ์ ๋ค์ํ ํด๋์ค์ ๋ํด 
// ์ฌ์ฌ์ฉํ  ์ ์๋ ์ ๋ค๋ฆญ ShapeList ํด๋์ค๋ฅผ ๋ง๋ค์ด ๋ณด์.

    new ShapeList(rects);
    new ShapeList(circles);
    new ShapeList(lines);


===============================================================================
== ํ๋ก๊ทธ๋จ ์คํ ํ๋ฉด
-------------------------------------------------------------------------------
// ์๋ ํ๋ก๊ทธ๋จ์ ์ฐ๋ฆฌ๊ฐ ๊ตฌํํ๊ณ ์ํ๋ ์ ํ๋ก๊ทธ๋จ์ ์คํํ๋ฉด์ด๋ค.
// ๋งจ ๋จผ์  ์ฌ์ฉ์๋ก๋ถํฐ ์ด๋ค ๊ทธ๋ํฝ์ ๊ด๋ฆฌํ ์ง ์ ํํ๊ฒ ํ๊ณ (์, ์ฌ๊ฐํ) ์ผ๋จ ํ๋ฒ ์ ํํ๋ฉด
// ์ ํ๋ ๊ทธ ๊ทธ๋ํฝ(์ฌ๊ฐํ)๋ง ์ฝ์, ์ญ์ ๋ฅผ ํ  ์ ์๋ค. (๊ธฐ์กด GraphicEditor์ ShapeList๋ฅผ ํตํด)
// ์ธ๋ถ ๋ฉ๋ด์์ ๋น ์ ธ ๋์ค๋ฉด ๋ค์ ๋ค๋ฅธ ๊ทธ๋ํฝ(์, ์)์ ์ ํํ  ์ ์์ผ๋ฉฐ 
// ์ ํ๋ ์ข๋ฅ์ ๋ค๋ฅธ ๊ทธ๋ํฝ์ ์ฝ์/์ญ์ ํ๋ฉด์ ๊ด๋ฆฌํ  ์ ์๋ค. 
=============================================================================== 
***** Graphic Management Menu ******
* 0.Exit  1.Rect  2.Circle  3.Line *
************************************
Menu item number? 1  // ์ฌ์ฉ์ ์๋ ฅ: ์ฌ๊ฐํ๋ง ์ทจ๊ธ

GraphicEditor
[Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 1  // ์ฌ๊ฐํ๋ง ์ฝ์ํ  ์ ์์
Enter point coordinates (enter two integers) >> 7 7
Enter point coordinates (enter two integers) >> 8 8
[Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Rectangle  (7, 7) (8, 8)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 0  // ์ฌ๊ฐํ ์ฝ์
Enter point coordinates (enter two integers) >> 8 8
Enter point coordinates (enter two integers) >> 9 9
[Rectangle  (8, 8) (9, 9)]
[Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Rectangle  (7, 7) (8, 8)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 2  // ์ฌ๊ฐํ ์ญ์ 
[Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Rectangle  (7, 7) (8, 8)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 3  // ์ฌ๊ฐํ ์ญ์ 
[Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 7

***** Graphic Management Menu ******
* 0.Exit  1.Rect  2.Circle  3.Line *
************************************
Menu item number? 2  // ์ฌ์ฉ์ ์๋ ฅ: ์๋ง ์ทจ๊ธ

GraphicEditor
[Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 7

***** Graphic Management Menu ******
* 0.Exit  1.Rect  2.Circle  3.Line *
************************************
Menu item number? 3  // ์ฌ์ฉ์ ์๋ ฅ: ์ ๋ง ์ทจ๊ธ

GraphicEditor
[Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 

//******************************************************************************
 * ๋ฌธ์  2-1
 ******************************************************************************/
// ๋จผ์  LinkedList ์ธํฐํ์ด์ค๋ฅผ ์๋์ ๊ฐ์ด ์ ์ธํ๋ผ.
// ์ฌ๊ธฐ์ ์ฐ๋ฆฌ๋ T๋ก Rect, Circle, Line ๋ฑ์ ์ง์ ํ  ๊ฒ์ด๋ค.

interface LinkedList {

// ๊ทธ๋ฐ ํ LinkedList์ ๋ชจ๋  ๋ฉค๋ฒ ํจ์๋ค์ ๋งค๊ฐ๋ณ์ ๋๋ ๋ฆฌํด ๋ฐ์ดํ ํ์๋ค ์ค Shape๋ฅผ ๋ชจ๋
// T๋ก ๋ณ๊ฒฝํ๋ผ. ๊ธฐ์กด์๋ Rect, Circle, Line์ ์ํผํด๋์ค์ธ Shape์ ์ฌ์ฉํ์ฌ ์ด๋ฅผ ์์ํ ์ด๋ค
// ๊ฐ์ฒด๋  ํ์ฉ์ด ๋์๋๋ฐ, ์ด์ ๋ T๊ฐ ๋์ค์ Rect, Circle, Line ์ค์ ํ๋์ธ ํน์  ํด๋์ค๋ก ๋ณ๊ฒฝ๋์ด
// ํด๋น ํด๋์ค์ ๊ฐ์ฒด๋ค๋ง LinkedList ๋ฉค๋ฒ ํจ์์ ๋งค๊ฐ๋ณ์ ๋๋ ๋ฆฌํด ํ์์ผ๋ก ์ฌ์ฉํ  ์๊ฐ ์๊ฒ ๋๋ค.

//******************************************************************************
 * ๋ฌธ์  2-2
 ******************************************************************************/
// ๋จผ์  ShapeList ํด๋์ค๋ฅผ ์๋์ ๊ฐ์ด ์ ์ธํ๋ผ.
// ์ฌ๊ธฐ์ ์ฐ๋ฆฌ๋ T๋ก Rect, Circle, Line ๋ฑ์ ์ง์ ํ  ๊ฒ์ด๋ค.

class ShapeList implements LinkedList {

// ๊ทธ๋ฐ ํ ShapeList์ ๋ชจ๋  ๋ฉค๋ฒ ๋ณ์, ๋๋ ๋ฉค๋ฒ ํจ์๋ค์ ๋งค๊ฐ๋ณ์ ๋๋ ๋ฆฌํด ๋ฐ์ดํ ๋๋
// ์ง์ญ๋ณ์๋ค ๋ฐ์ดํ ํ์ ์ค Shape๊ฐ ์์ผ๋ฉด ์ด๋ฅผ ๋ชจ๋ T๋ก ๋ณ๊ฒฝํ๋ผ.

//******************************************************************************
 * ๋ฌธ์  2-3
 ******************************************************************************/
// ๋จผ์  Factory ํด๋์ค๋ฅผ ์๋์ ๊ฐ์ด ์ ์ธํ๋ผ.

interface Factory {

// ๊ทธ๋ฐ ํ Factory์ ๋ชจ๋  ๋ฉค๋ฒ ํจ์๋ค์ ๋งค๊ฐ๋ณ์ ๋๋ ๋ฆฌํด ๋ฐ์ดํ ํ์๋ค ์ค Shape๋ฅผ ๋ชจ๋ T๋ก ๋ณ๊ฒฝํ๋ผ.
// ๋ง์ฐฌ๊ฐ์ง๋ก ๋ฐ์ดํ ํ์์ผ๋ก ์ฌ์ฉ๋ ๊ธฐ์กด ShapeList๋ 
// ์ ๋ค๋ฆญ ํ์ T๋ฅผ ์ฌ์ฉํ๋ ์ ๋ค๋ฆญ ํด๋์ค ์ฆ, ShapeList์ผ๋ก ๋ณ๊ฒฝํ๋ผ.

//******************************************************************************
 * ๋ฌธ์  2-4
 ******************************************************************************/
// ๋จผ์  GraphicEditor ํด๋์ค๋ฅผ ์๋์ ๊ฐ์ด ์ ์ธํ๋ผ.

class GraphicEditor {

// ์์์ ๋ ์๋ฌด ํด๋์ค๋ ํ์ ๋งค๊ฐ๋ณ์ T๋ก ์ง์ ํ๋ ๊ฒ์ด ์๋๋ผ 
// Shape ๋๋ Shape์ ์์ํ ํด๋์ค๋ค๋ง ํ์ ๋งค๊ฐ๋ณ์ T๋ก ์ง์ ํด ์ค ์ ์๋ค๋ ์๋ฏธ์ด๋ค.
// ๋ฐ๋ผ์ ์ฐ๋ฆฌ๋ T๋ก Rect, Circle, Line ๋ฑ์ ์ง์ ํ  ์ ์๋ค.

// ๊ทธ๋ฐ ํ GraphicEditor์ ๋ชจ๋  ๋ฉค๋ฒ ๋ณ์ ๋๋ ํจ์๋ค์ ๋งค๊ฐ๋ณ์ ๋๋ ๋ฆฌํด ๋ฐ์ดํ ํ์๋ค ์ค 
// Shape๋ฅผ ๋ชจ๋ T๋ก ๋ณ๊ฒฝํ๋ผ. ๋ง์ฐฌ๊ฐ์ง๋ก ๋ฐ์ดํ ํ์์ผ๋ก ์ฌ์ฉ๋ ๊ธฐ์กด ShapeList, Factory๋ 
// ์ ๋ค๋ฆญ ํ์ T๋ฅผ ์ฌ์ฉํ๋ ์ ์ ํ ์ ๋ค๋ฆญ ํด๋์ค(์ธํฐํ์ด์ค)๋ก ๋ชจ๋ ๋ณ๊ฒฝํ๋ผ.

// ์ด์ ๋ถํฐ๋ GraphicEditor๋ Rect, Circle, Line ์ค์์ ์ ๋ค๋ฆญ ํ์ T๋ก ์ง์ ๋ ๊ทธ๋ํฝ ๊ฐ์ฒด๋ง์
// ๊ด๋ฆฌํ๊ฒ ํ  ์ ์๋ค.

//******************************************************************************
 * ๋ฌธ์  2-5
 ******************************************************************************/
// ๊ธฐ์กด์ ShapeFactory ํด๋์ค๋ฅผ ๋ชจ๋ ์ฃผ์ ์ฒ๋ฆฌํ๋ผ.
// ๋์  ์๋ ์ธ๊ฐ์ Factory๋ฅผ ShapeFactory ํด๋์ค์ ์๋ ์ชฝ(Main ์์ชฝ)์ ์ฝ์ํ๊ณ 
// CircleFactory์ LineFactory์ ์๋ ๋ ๋ฉค๋ฒ ์ฆ, 
// generateShapeList()์ generateShape()๋ฅผ ๊ฐ๊ฐ ๊ตฌํํ๋ผ.

// ์๋์ ์ธ Factory๋ ํด๋น Factory์ ๊ฐ์ฒด๋ง ์์ฑํ๊ณ  ๋ค๋ฅธ ๊ฐ์ฒด๋ ์์ฑํ  ์ ์๋ค.
// ๋ฐ๋ผ์ "Graphic Management Menu"์์ ํ๋์ ๊ฐ์ฒด๋ฅผ ์ ํํ๋ฉด
// ์ ํ๋ ๊ทธ๋ํฝ์ ์์ฑํ๋ ์๋ Factory์ค ํ๋๋ฅผ ์ฌ์ฉํ๊ฒ ๋๋ค.

class RectFactory implements Factory  // ์ฌ๊ฐํ ๊ฐ์ฒด๋ฅผ ์์ฑํ๋ ํด๋์ค
{
    private Rect rects[] = { // ShapeList ์์ฑ์ ์๋ ์ฝ์๋  ๊ฐ์ฒด๋ค
        new Rect(new Point(1,1), new Point(2,2)), 
        new Rect(new Point(3,3), new Point(4,4)), 
        new Rect(new Point(5,5), new Point(6,6)), 
    };

    public ShapeList generateShapeList() { // ShapeList ์์ฑ
        return new ShapeList<>(rects);
        // ์ด๋ฌธ์ฅ์ GraphicEditor ์์ฑ์์ ์ํด ํธ์ถ๋๋ค.
        // ๋ฆฌํด๋ list๋ ์ rects[]์ 3๊ฐ์ Rect ๊ฐ์ฒด๋ค์ ํฌํจํ๊ณ  ์๋ค.
    }

    // ์ฌ์ฉ์๋ก๋ถํฐ ์ฌ๊ฐํ ์ ๋ณด๋ฅผ ์๋ ฅ ๋ฐ์ ํ ์ฌ๊ฐํ ๊ฐ์ฒด๋ฅผ ์์ํ์ฌ ๋ฐํํจ. ๊ธฐ์กด ShapeFactory์ 
    // generateShape()์ switch ์ฝ๋๋ค ์ค ์ฌ๊ฐํ ๊ฐ์ฒด ์์ฑํ๋ ์ฝ๋๋ง ๋ฐ์ทํด์ ์ฝ์
    public Rect generateShape(Scanner scanner) { 
        Point p1 = UI.getWidthHeight(scanner, msgpoint);
        Point p2 = UI.getWidthHeight(scanner, msgpoint);
        return new Rect(p1, p2);
    }
}

class CircleFactory implements Factory  // ์ ๊ฐ์ฒด๋ฅผ ์์ฑํ๋ ํด๋์ค
{
    private String msgradius = "Enter the radius (enter one integer) >> ";

    private Circle circles[] = { // ShapeList ์์ฑ์ ์๋ ์ฝ์๋  ๊ฐ์ฒด๋ค
        new Circle(1, new Point(2,2)), 
        new Circle(3, new Point(4,4)), 
        new Circle(5, new Point(6,6)), 
    };

    generateShapeList() ๋ฉ์๋ ๊ตฌํ

    generateShape() ๋ฉ์๋ ๊ตฌํํ  ๊ฒ
    // ์ generateShape()์ ๊ธฐ์กด ShapeFactory์ 
    // generateShape()์ switch ์ฝ๋๋ค ์ค ์ ๊ฐ์ฒด ์์ฑํ๋ ์ฝ๋๋ง ๋ฐ์ทํด์ ์ฝ์
}

class LineFactory implements Factory      // ์  ๊ฐ์ฒด๋ฅผ ์์ฑํ๋ ํด๋์ค
{
    private Line lines[] = { // ShapeList ์์ฑ์ ์๋ ์ฝ์๋  ๊ฐ์ฒด๋ค
        new Line(new Point(1,1), new Point(2,2)), 
        new Line(new Point(3,3), new Point(4,4)), 
        new Line(new Point(5,5), new Point(6,6)), 
    };

    generateShapeList() ๋ฉ์๋ ๊ตฌํ

    generateShape() ๋ฉ์๋ ๊ตฌํํ  ๊ฒ
    // ์ generateShape()์ ๊ธฐ์กด ShapeFactory์ 
    // generateShape()์ switch ์ฝ๋๋ค ์ค Line ๊ฐ์ฒด ์์ฑํ๋ ์ฝ๋๋ง ๋ฐ์ทํด์ ์ฝ์
}

// ์์์ ๋ ์๋ฌด ํด๋์ค๋ ํ์ ๋งค๊ฐ๋ณ์ T๋ก ์ง์ ํ๋ ๊ฒ์ด ์๋๋ผ 
// Shape ๋๋ Shape์ ์์ํ ํด๋์ค๋ค๋ง ํ์ ๋งค๊ฐ๋ณ์ T๋ก ์ง์ ํด ์ค ์ ์๋ค๋ ์๋ฏธ์ด๋ค.
// ๋ฐ๋ผ์ ์ฐ๋ฆฌ๋ T๋ก Rect, Circle, Line ๋ฑ์ ์ง์ ํ  ์ ์๋ค.

// ๊ทธ๋ฐ ํ GraphicEditor์ ๋ชจ๋  ๋ฉค๋ฒ ๋ณ์ ๋๋ ํจ์๋ค์ ๋งค๊ฐ๋ณ์ ๋๋ ๋ฆฌํด ๋ฐ์ดํ ํ์๋ค ์ค 
// Shape๋ฅผ ๋ชจ๋ T๋ก ๋ณ๊ฒฝํ๋ผ. ๋ง์ฐฌ๊ฐ์ง๋ก ๋ฐ์ดํ ํ์์ผ๋ก ์ฌ์ฉ๋ ๊ธฐ์กด ShapeList, Factory๋ 
// ์ ๋ค๋ฆญ ํ์ T๋ฅผ ์ฌ์ฉํ๋ ์ ์ ํ ์ ๋ค๋ฆญ ํด๋์ค(์ธํฐํ์ด์ค)๋ก ๋ชจ๋ ๋ณ๊ฒฝํ๋ผ.

//******************************************************************************
 * ๋ฌธ์  2-6
 ******************************************************************************/
// ์ด์  ์๋์ ๊ฐ์ ๋ฉ๋ด๋ฅผ ๋ณด์ฌ์ฃผ๊ณ  ๋ฉ๋ดํญ๋ชฉ์ ์๋ ฅ๋ฐ๋ ์ฝ๋๋ฅผ ์์ฑํ์.

***** Graphic Management Menu ******
* 0.Exit  1.Rect  2.Circle  3.Line *
************************************
Menu item number? 

// ์ด๋ฅผ ์ํด enum SHAPE_TYPE ๋ฐ(์๋)์ ์๋ ์ฝ๋๋ฅผ ์ถ๊ฐํ๋ผ.
// Graphic Management Menu์ ๋ฉ๋ด ํญ๋ชฉ๋ค์ด๋ค.

enum GraphicMenu {
    EXIT(0), RECT(1), CIRCLE(2), LINE(3);

    GraphicMenu(int value) { this.value = value; }

    private final int value;
    public int value() { return value; }
}

// ๊ทธ๋ฐ ํ UI ํด๋์ค์ ์๋ ๋ฉ์๋๋ฅผ ์ถ๊ฐํ๋ผ.
// ์ฌ์ฉ์์๊ฒ ๋ฉ๋ดํญ๋ชฉ๋ค์ ๋ณด์ฌ์ฃผ๊ณ  ์ฌ์ฉ์๊ฐ ์ ํํ ๋ฉ๋ดํญ๋ชฉ์ ์๋ ฅ๋ฐ๋ ์ฝ๋์ด๋ค.

    static GraphicMenu getGraphicMenu(Scanner scanner) {
        System.out.println("***** Graphic Management Menu ******");
        System.out.println("* " + GraphicMenu.EXIT.value()+".Exit  "     + 
                                  GraphicMenu.RECT.value()+".Rect  "     +
                                  GraphicMenu.CIRCLE.value()+".Circle  " + 
                                  GraphicMenu.LINE.value()+".Line *");
        System.out.println("************************************");
        System.out.print("Menu item number? ");
        GraphicMenu menu[] = GraphicMenu.values();
        return menu[scanner.nextInt()];  
    }
	
//******************************************************************************
 * ๋ฌธ์  2-7
 ******************************************************************************/
// main()์ ์๋์ ๊ฐ๋ค.

    public static void main(String[] args) {
        GraphicManager m = new GraphicManager();
        m.run();
        System.out.println("\nGood Bye");
    }

// GraphicManager ํด๋์ค๋ ์๋์ ๊ฐ๋ค.

class GraphicManager 
{
    private Scanner scanner;
    private GraphicEditor   rectEditor;
    private GraphicEditor circleEditor;
    private GraphicEditor   lineEditor;
    
    // ๊ฐ๊ฐ์ Rect, Circle ๋๋ Line์ ์ ์ฉ์ผ๋ก ๊ด๋ฆฌํ๋ GraphicEditor<>๋ฅผ ๋ฏธ๋ฆฌ ์์ฑํด ๋๋๋ค.
    // ๊ฐ GraphicEditor๋ ํด๋น ๊ทธ๋ํฝ ๊ฐ์ฒด๋ฅผ ์์ฑํ๋ Factory ๊ฐ์ฒด๋ฅผ ๊ฐ์ง๋ฉฐ,
    // ์ด Factory ๊ฐ์ฒด๋ฅผ ํตํด ShapList<>์ ํด๋น ๊ทธ๋ํฝ ๊ฐ์ฒด๋ง์ ์ ์ ์ผ๋ก ์์ฑํ๋ค.
    GraphicManager() {
        scanner = new Scanner(System.in);
        rectEditor   = new GraphicEditor  (new RectFactory(),   scanner);
        circleEditor = new GraphicEditor(new CircleFactory(), scanner);
        lineEditor   = new GraphicEditor  (new LineFactory(),   scanner);
    }
    
    // ์ฌ์ฉ์๊ฐ Rect, Circle, Line ์ค ํ๋๋ฅผ ์ ํํ๊ฒ ํ๊ณ 
    // ์ ํ๋ ๊ทธ๋ํฝ ๊ฐ์ฒด๋ค์ ์ ์ฉ์ผ๋ก ๊ด๋ฆฌํ๋ GraphicEditor<>์ run() ๋ฉ์๋๋ฅผ ํธ์ถํ๋ค.
    void run() {
        while (true)  {
            GraphicMenu menu = UI.getGraphicMenu(scanner);  // ๋ฉ๋ด ํญ๋ชฉ ์ฝ์ด ์ค๊ธฐ
            if (menu == GraphicMenu.EXIT)
                break;
            switch (menu) {
            case RECT:   System.out.println("\nGraphicEditor");
                         rectEditor.run();
                         break;
            case CIRCLE: System.out.println("\nGraphicEditor");
                         circleEditor.run();
                         break;
            case LINE:   System.out.println("\nGraphicEditor");
                         lineEditor.run();
                         break;
            default:     System.out.println("WRONG menu item");
                         break;
            }
            System.out.println();
        }
        scanner.close();
    }
}


















===============================================================================
== ํ๋ก๊ทธ๋จ ์คํ ๊ฒฐ๊ณผ
=============================================================================== 
/******************************************************************************
 * ์๋ ฅ
 * ์๋ ์ซ์๋ค์ ์์์ ์ผ๋ก ์๋ ฅํด์ ์ ์์ ์ผ๋ก ํ๋ก๊ทธ๋จ์ด ์๋ํ๋์ง ํ์ธํ๋ผ.
 * ์ฌ๊ฐํ, ์, ์  ๋ฑ์ ๋ํด ๊ฐ๊ฐ 6๊ฐ์ ๊ทธ๋ํฝ์ ์ฝ์ํ ํ (๊ฐ ๊ทธ๋ํฝ๋ณ๋ก ์ด 9๊ฐ์ ๊ฐ์ฒด)
 * ์ด๋ค ๋ชจ๋๋ฅผ ๋ค์ ์ญ์ ํ๋ ๊ณผ์ ์ด๋ค.
 * ์ ์์ ์ผ๋ก ์คํ๋๋ฉด Ctrl+C ํด์ Ctrl+V๋ก Console ์ฐฝ์ ํ๋ฒ์ ์๋ ฅํ๋ผ.
 ******************************************************************************/
1
1 11 11 12 12
1 13 13 14 14
1 15 15 16 16
1 17 17 18 18
1 19 19 20 20
1 21 21 22 22
7

2
1 11 11 12
1 13 13 14
1 15 15 16
1 17 17 18
1 19 19 20
1 21 21 22
7

3
1 11 11 12 12
1 13 13 14 14
1 15 15 16 16
1 17 17 18 18
1 19 19 20 20
1 21 21 22 22
7

1
7
2
7
3
7

1
2 2 2 2 2 2 2 2 2 
7

2
3 3 3 3 3 3 3 3 3
7

3
2 2 2 2 2 2 2 2 2
7

0
===============================================================================
== ํ๋ก๊ทธ๋จ ์คํ ๊ฒฐ๊ณผ
== ์ ์๋ ฅ ๋ฐ์ดํฐ๋ฅผ ๋ณต์ฌํด์ ํ๋ฒ์ ์๋ ฅํ ํ์ ๊ฒฐ๊ณผ
=============================================================================== 
***** Graphic Management Menu ******
* 0.Exit  1.Rect  2.Circle  3.Line *
************************************
Menu item number? 1
1 11 11 12 12
1 13 13 14 14
1 15 15 16 16
1 17 17 18 18
1 19 19 20 20
1 21 21 22 22
7

2
1 11 11 12
1 13 13 14
1 15 15 16
1 17 17 18
1 19 19 20
1 21 21 22
7

3
1 11 11 12 12
1 13 13 14 14
1 15 15 16 16
1 17 17 18 18
1 19 19 20 20
1 21 21 22 22
7

1
7
2
7
3
7

1
2 2 2 2 2 2 2 2 2 
7

2
3 3 3 3 3 3 3 3 3
7

3
2 2 2 2 2 2 2 2 2
7

0

GraphicEditor
[Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Rectangle  (11, 11) (12, 12)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Rectangle  (11, 11) (12, 12)]
[Rectangle  (13, 13) (14, 14)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Rectangle  (11, 11) (12, 12)]
[Rectangle  (13, 13) (14, 14)]
[Rectangle  (15, 15) (16, 16)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Rectangle  (11, 11) (12, 12)]
[Rectangle  (13, 13) (14, 14)]
[Rectangle  (15, 15) (16, 16)]
[Rectangle  (17, 17) (18, 18)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Rectangle  (11, 11) (12, 12)]
[Rectangle  (13, 13) (14, 14)]
[Rectangle  (15, 15) (16, 16)]
[Rectangle  (17, 17) (18, 18)]
[Rectangle  (19, 19) (20, 20)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Rectangle  (11, 11) (12, 12)]
[Rectangle  (13, 13) (14, 14)]
[Rectangle  (15, 15) (16, 16)]
[Rectangle  (17, 17) (18, 18)]
[Rectangle  (19, 19) (20, 20)]
[Rectangle  (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 
***** Graphic Management Menu ******
* 0.Exit  1.Rect  2.Circle  3.Line *
************************************
Menu item number? 
GraphicEditor
[Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter the radius (enter one integer) >> [Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Circle 12 (11, 11)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter the radius (enter one integer) >> [Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Circle 12 (11, 11)]
[Circle 14 (13, 13)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter the radius (enter one integer) >> [Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Circle 12 (11, 11)]
[Circle 14 (13, 13)]
[Circle 16 (15, 15)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter the radius (enter one integer) >> [Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Circle 12 (11, 11)]
[Circle 14 (13, 13)]
[Circle 16 (15, 15)]
[Circle 18 (17, 17)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter the radius (enter one integer) >> [Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Circle 12 (11, 11)]
[Circle 14 (13, 13)]
[Circle 16 (15, 15)]
[Circle 18 (17, 17)]
[Circle 20 (19, 19)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter the radius (enter one integer) >> [Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Circle 12 (11, 11)]
[Circle 14 (13, 13)]
[Circle 16 (15, 15)]
[Circle 18 (17, 17)]
[Circle 20 (19, 19)]
[Circle 22 (21, 21)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 
***** Graphic Management Menu ******
* 0.Exit  1.Rect  2.Circle  3.Line *
************************************
Menu item number? 
GraphicEditor
[Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Line (11, 11) (12, 12)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Line (11, 11) (12, 12)]
[Line (13, 13) (14, 14)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Line (11, 11) (12, 12)]
[Line (13, 13) (14, 14)]
[Line (15, 15) (16, 16)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Line (11, 11) (12, 12)]
[Line (13, 13) (14, 14)]
[Line (15, 15) (16, 16)]
[Line (17, 17) (18, 18)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Line (11, 11) (12, 12)]
[Line (13, 13) (14, 14)]
[Line (15, 15) (16, 16)]
[Line (17, 17) (18, 18)]
[Line (19, 19) (20, 20)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Line (11, 11) (12, 12)]
[Line (13, 13) (14, 14)]
[Line (15, 15) (16, 16)]
[Line (17, 17) (18, 18)]
[Line (19, 19) (20, 20)]
[Line (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 
***** Graphic Management Menu ******
* 0.Exit  1.Rect  2.Circle  3.Line *
************************************
Menu item number? 
GraphicEditor
[Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Rectangle  (11, 11) (12, 12)]
[Rectangle  (13, 13) (14, 14)]
[Rectangle  (15, 15) (16, 16)]
[Rectangle  (17, 17) (18, 18)]
[Rectangle  (19, 19) (20, 20)]
[Rectangle  (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 
***** Graphic Management Menu ******
* 0.Exit  1.Rect  2.Circle  3.Line *
************************************
Menu item number? 
GraphicEditor
[Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Circle 12 (11, 11)]
[Circle 14 (13, 13)]
[Circle 16 (15, 15)]
[Circle 18 (17, 17)]
[Circle 20 (19, 19)]
[Circle 22 (21, 21)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 
***** Graphic Management Menu ******
* 0.Exit  1.Rect  2.Circle  3.Line *
************************************
Menu item number? 
GraphicEditor
[Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Line (11, 11) (12, 12)]
[Line (13, 13) (14, 14)]
[Line (15, 15) (16, 16)]
[Line (17, 17) (18, 18)]
[Line (19, 19) (20, 20)]
[Line (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 
***** Graphic Management Menu ******
* 0.Exit  1.Rect  2.Circle  3.Line *
************************************
Menu item number? 
GraphicEditor
[Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Rectangle  (11, 11) (12, 12)]
[Rectangle  (13, 13) (14, 14)]
[Rectangle  (15, 15) (16, 16)]
[Rectangle  (17, 17) (18, 18)]
[Rectangle  (19, 19) (20, 20)]
[Rectangle  (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Rectangle  (11, 11) (12, 12)]
[Rectangle  (13, 13) (14, 14)]
[Rectangle  (15, 15) (16, 16)]
[Rectangle  (17, 17) (18, 18)]
[Rectangle  (19, 19) (20, 20)]
[Rectangle  (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Rectangle  (5, 5) (6, 6)]
[Rectangle  (11, 11) (12, 12)]
[Rectangle  (13, 13) (14, 14)]
[Rectangle  (15, 15) (16, 16)]
[Rectangle  (17, 17) (18, 18)]
[Rectangle  (19, 19) (20, 20)]
[Rectangle  (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Rectangle  (11, 11) (12, 12)]
[Rectangle  (13, 13) (14, 14)]
[Rectangle  (15, 15) (16, 16)]
[Rectangle  (17, 17) (18, 18)]
[Rectangle  (19, 19) (20, 20)]
[Rectangle  (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Rectangle  (13, 13) (14, 14)]
[Rectangle  (15, 15) (16, 16)]
[Rectangle  (17, 17) (18, 18)]
[Rectangle  (19, 19) (20, 20)]
[Rectangle  (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Rectangle  (15, 15) (16, 16)]
[Rectangle  (17, 17) (18, 18)]
[Rectangle  (19, 19) (20, 20)]
[Rectangle  (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Rectangle  (17, 17) (18, 18)]
[Rectangle  (19, 19) (20, 20)]
[Rectangle  (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Rectangle  (19, 19) (20, 20)]
[Rectangle  (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Rectangle  (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 
***** Graphic Management Menu ******
* 0.Exit  1.Rect  2.Circle  3.Line *
************************************
Menu item number? 
GraphicEditor
[Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Circle 12 (11, 11)]
[Circle 14 (13, 13)]
[Circle 16 (15, 15)]
[Circle 18 (17, 17)]
[Circle 20 (19, 19)]
[Circle 22 (21, 21)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Circle 12 (11, 11)]
[Circle 14 (13, 13)]
[Circle 16 (15, 15)]
[Circle 18 (17, 17)]
[Circle 20 (19, 19)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Circle 12 (11, 11)]
[Circle 14 (13, 13)]
[Circle 16 (15, 15)]
[Circle 18 (17, 17)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Circle 12 (11, 11)]
[Circle 14 (13, 13)]
[Circle 16 (15, 15)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Circle 12 (11, 11)]
[Circle 14 (13, 13)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Circle 12 (11, 11)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Circle 1 (2, 2)]
[Circle 3 (4, 4)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Circle 1 (2, 2)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 
***** Graphic Management Menu ******
* 0.Exit  1.Rect  2.Circle  3.Line *
************************************
Menu item number? 
GraphicEditor
[Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Line (11, 11) (12, 12)]
[Line (13, 13) (14, 14)]
[Line (15, 15) (16, 16)]
[Line (17, 17) (18, 18)]
[Line (19, 19) (20, 20)]
[Line (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Line (11, 11) (12, 12)]
[Line (13, 13) (14, 14)]
[Line (15, 15) (16, 16)]
[Line (17, 17) (18, 18)]
[Line (19, 19) (20, 20)]
[Line (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Line (5, 5) (6, 6)]
[Line (11, 11) (12, 12)]
[Line (13, 13) (14, 14)]
[Line (15, 15) (16, 16)]
[Line (17, 17) (18, 18)]
[Line (19, 19) (20, 20)]
[Line (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Line (11, 11) (12, 12)]
[Line (13, 13) (14, 14)]
[Line (15, 15) (16, 16)]
[Line (17, 17) (18, 18)]
[Line (19, 19) (20, 20)]
[Line (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Line (13, 13) (14, 14)]
[Line (15, 15) (16, 16)]
[Line (17, 17) (18, 18)]
[Line (19, 19) (20, 20)]
[Line (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Line (15, 15) (16, 16)]
[Line (17, 17) (18, 18)]
[Line (19, 19) (20, 20)]
[Line (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Line (17, 17) (18, 18)]
[Line (19, 19) (20, 20)]
[Line (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Line (19, 19) (20, 20)]
[Line (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> [Line (21, 21) (22, 22)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 
***** Graphic Management Menu ******
* 0.Exit  1.Rect  2.Circle  3.Line *
************************************
Menu item number? 
Good Bye
```

