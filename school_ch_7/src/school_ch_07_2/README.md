# ๐ch07_2๊ณผ์ ๋ฅผ ํ๊ฒ ์ต๋๋ค.



```java
๊ณผ์  ๊ธฐ๊ฐ: 2022/11/07 ~ 2022/11/22 23:59๋ถ์ผ๋ก ๋์ด ์์ต๋๋ค.
๊ณผ์  ์ง๊ฐ : 2022/11/22 24 ์ ~ 2022/11/24 23:59 ๋ถ ์๋๋ค.

์ง๊ฐ ์ ์ถ ํ์ฉํ๋ ์ ์์์ 50% ๊ฐ์ ํ๊ณ  ๋ถ์ฌ๋ฉ๋๋ค. 

[7์ฅ ๊ณผ์ -2]

/******************************************************************************
 * ๊ธฐ์กด ์ฝ๋ ๋ณต์ฌ
 ******************************************************************************/
// ์๋ก์ด ํ๋ก์ ํธ๋ฅผ ๋ง๋ค์ด๋ผ.
// ์๋ก์ด ํด๋์ค Main๋ฅผ ๋ง๋ค์ด Main.java ์์คํ์ผ์ ๋ง๋  ํ [7์ฅ ๊ณผ์ -1]์์ ๋ง๋ 
// Main.java ์์คํ์ผ์ ๋ชจ๋  ๋ด์ฉ๋ฅผ ๋ณต์ฌํด์ ์ฝ์ํ๋ผ. 
//
// ์ง๋ ๊ณผ์ ์์๋ ๋งค๋ฒ ํ๋ก๊ทธ๋จ์ ์คํํ  ๋๋ง๋ค ๊ทธ๋ํฝ ๊ฐ์ฒด๋ฅผ ์์ฑํ๋ ๊ฒ์ด ๋ฒ๊ฑฐ๋ก์ ๋๋ฐ
// ์ด๋ฒ ๊ณผ์ ์์๋ ์๋ ์คํ ๊ฒฐ๊ณผ์ฒ๋ผ ํ๋ก๊ทธ๋จ ์์ ์ ์๋์ผ๋ก ๊ทธ๋ํฝ ๊ฐ์ฒด๊ฐ ์์ฑ๋๊ฒ ํด ๋ณด์.

===============================================================================
== ํ๋ก๊ทธ๋จ ์ด๊ธฐ ์คํ ํ๋ฉด
=============================================================================== 
[Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 

/******************************************************************************
 * ๋ฌธ์  1-1
 ******************************************************************************/
// ๋จผ์  ShapeList ํด๋์ค์ ์๋ ์์ฑ์๋ฅผ ์ถ๊ฐํ๋ผ.
// ์ด ์์ฑ์๋ ์ฌ์ ์ ์ด๋ฏธ ์์ฑ๋์ด ๋ฐฐ์ด arr์ ํตํด ๋์ด์จ ๊ทธ๋ํฝ ๊ฐ์ฒด๋ค์ vector์ ์ถ๊ฐํ๋ค.

    public ShapeList(Shape arr[]) {
        ๊ธฐ์กด ShapeList() ์์ฑ์๋ฅผ ํธ์ถํ์ฌ vector๋ฅผ ์์ฑํ๋ค. [์์  4-5 ์ฐธ์กฐ]
        for๋ฌธ์ ์ด์ฉํ์ฌ 
           ๋ฐฐ์ด arr์ ๊ฐ ์์ arr[i]๋ฅผ vector์ ์ถ๊ฐํ๋ค.
    }


/******************************************************************************
 * ๋ฌธ์  1-2
 ******************************************************************************/
// main() ๋ฉ์๋๋ฅผ ์๋์ ๊ฐ์ด ์์ ํ๋ผ.
// scanner๋ฅผ main์์ ์์ฑํ์ฌ GraphicEditor ์์ฑ์ ํธ์ถ ์ ์ธ์๋ก ๋๊ฒจ ์ฃผ์๋ค.
// ๋ํ GraphicEditor ์์ฑ์์ ์ธ์๊ฐ ๋ ๊ฐ ์ถ๊ฐ๋์๋ค.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     // ์ฌ์ฉ์ ์๋ ฅ์ ์ํ ์ค์บ๋ ๊ฐ์ฒด ์์ฑ
        ShapeFactory shapeFactory = new ShapeFactory();
        GraphicEditor g = new GraphicEditor(shapeFactory, scanner);
        g.run();
        System.out.println("Good Bye");
        scanner.close();
    }

// ์ด๋ฅผ ์ํด ๋จผ์  GraphicEditor ํด๋์ค์ ์๋ ์ธ๊ฐ์ ๋ฉค๋ฒ๋ฅผ ์ถ๊ฐํ๊ณ 

	private ShapeList list;
	private Factory factory;
	private Scanner scanner;

// ์ด๋ค ๊ฐ๊ฐ์ ๋ฉค๋ฒ๋ฅผ ์ด๊ธฐํํ๋ GraphicEditor ์์ฑ์๋ฅผ ์ถ๊ฐํ๋ผ.

	public GraphicEditor(Factory factory, Scanner scanner) { }

// ์ด ์์ฑ์์์ ๋งค๊ฐ๋ณ์๋ค์ ์ด์ฉํด ํด๋น ๋ฉค๋ฒ ๋ณ์๋ฅผ ์ด๊ธฐํํ๊ณ 
// list ๋ฉค๋ฒ์ ๊ฒฝ์ฐ ์๋์ ๊ฐ์ด ์ด๊ธฐํํ๋ผ. ์๋ ๋ฌธ์ฅ์ ์ฌ์ฉ์๊ฐ ๋๊ฒจ ์ค factory์ 
// generateShapeList() ๋ฉ์๋๋ฅผ ํธ์ถํ์ฌ list๋ฅผ ์ด๊ธฐํ ํ๋ค. 

	list = factory.generateShapeList();

// ๊ทธ๋ฆฌ๊ณ  GraphicEditor์ run() ๋ฉ์๋์ ์๋ ๋ฌธ์ฅ๋ค์ ๋ชจ๋ ์ฐพ์์ ์ฃผ์ ์ฒ๋ฆฌํ๋ผ. 
// scanner์ ์์ฑ ๋ฐ ๋ซ๊ธฐ๋ main()์์ ์ฒ๋ฆฌํ๊ณ , list ์์ฑ์ ์ ๋ฌธ์ฅ์ผ๋ก ๋์ฒด ๋์๊ธฐ ๋๋ฌธ์
// ๋ ์ด์ ์๋ ๋ฌธ์ฅ๋ค์ ํ์์๋ค.

	//ShapeList list = new ShapeList();             // shape ๋ฆฌ์คํธ๋ฅผ ๊ด๋ฆฌํ  ๊ฐ์ฒด ์์ฑ
	//Scanner scanner = new Scanner(System.in);     // ์ฌ์ฉ์ ์๋ ฅ์ ์ํ ์ค์บ๋ ๊ฐ์ฒด ์์ฑ
	//scanner.close();

/******************************************************************************
 * ๋ฌธ์  1-3
 ******************************************************************************/
// ์ด์  ์๋ ์ธํฐํ์ด์ค Factory๋ฅผ GraphicEditor ํด๋์ค ์์ชฝ์ ๋ฐฐ์นํ๋ผ.

interface Factory
{
    String msgpoint = "Enter point coordinates (enter two integers) >> ";
    ShapeList generateShapeList();         // ShapeList ๊ฐ์ฒด๋ฅผ ์์ฑํ ํ ๋ฐํํ๋ค.
    Shape generateShape(Scanner scanner);  // ์ฌ์ฉ์๋ก๋ถํฐ ๊ทธ๋ํฝ ๊ฐ์ฒด ์ ๋ณด๋ฅผ ์๋ ฅ ๋ฐ์ ํ 
}                                          // ๊ทธ๋ํฝ ๊ฐ์ฒด๋ฅผ ์์ฑํ์ฌ ๋ฐํํจ 

// ๊ทธ๋ฐ ๋ค์ ์ Factory ์ธํฐํ์ด์ค๋ฅผ ๊ตฌํํ๋ ์๋ ํด๋์ค ShapeFactory๋ฅผ Main ํด๋์ค ์์ชฝ์ ๋ฐฐ์นํ๋ผ.
// ๊ทธ๋ฐ ํ ๊ธฐ์กด์ GraphicEditor์ createShape(Scanner scanner) ๋ฉ์๋ ๋ด์ ์๋ ์ฝ๋ ์ ๋ถ๋ฅผ
// ์๋ generateShape(Scanner scanner)๋ก ์ฎ๊ฒจ๋ผ. (๋ณต์ฌ๊ฐ ์๋๊ณ )

class ShapeFactory implements Factory
{
    private Shape shapes[] = { // ํ๋ก๊ทธ๋จ ์ด๊ธฐ์ ์์ฑ๋  ๊ทธ๋ํฝ ๊ฐ์ฒด๋ค
            new Rect(new Point(1,1), new Point(2,2)), 
            new Rect(new Point(3,3), new Point(4,4)), 
            new Rect(new Point(5,5), new Point(6,6)), 
            new Circle(1, new Point(2,2)), 
            new Circle(3, new Point(4,4)), 
            new Circle(5, new Point(6,6)), 
            new Line(new Point(1,1), new Point(2,2)), 
            new Line(new Point(3,3), new Point(4,4)), 
            new Line(new Point(5,5), new Point(6,6)), 
    };

    public ShapeList generateShapeList() { // GraphicEditor์ ์์ฑ์์์ ํธ์ถํจ
        return new ShapeList(shapes); // ๊ทธ๋ํฝ ๊ฐ์ฒด๋ค์ ๊ด๋ฆฌํ๋ ShapeList ๊ฐ์ฒด ์์ฑ
        // ์ด๋ฌธ์ฅ์ GraphicEditor ์์ฑ์์ ์ํด ํธ์ถ๋๋ค.
        // ๋ฆฌํด๋ list๋ ์ shapes[]์ 9๊ฐ์ ๊ฐ์ฒด๋ค์ ํฌํจํ๊ณ  ์๋ค.
    }

    public Shape generateShape(Scanner scanner) {
       GraphicEditor์ createShape(Scanner scanner) ๋ฉ์๋ ๋ด์ ์๋ ์ฝ๋ ์ ๋ถ๋ฅผ
       ์ด์ชฝ์ผ๋ก ์ฎ๊ธธ ๊ฒ
    }
}

/******************************************************************************
 * ๋ฌธ์  1-4
 ******************************************************************************/
// GraphicEditor์ ๊ธฐ์กด createShape(Scanner scanner) ๋ฉ์๋๋ ์๋์ ๊ฐ์ด ์์ ํ๋ผ.
// ์๋์ factory๋ main()์์ ๋๊ฒจ์ค shapeFactory ๊ฐ์ฒด๋ฅผ ์์บ์คํํ ๊ฒ์ด๋ค.
// ์ฆ, ์ด์ ๋ถํฐ๋ ์๋ก์ด ๊ทธ๋ํฝ ๊ฐ์ฒด๋ ์ ShapeFactory์ generateShape()์์ 
// ์ฌ์ฉ์๋ก๋ถํฐ ๊ทธ๋ํฝ ์ ๋ณด๋ฅผ ์๋ ฅ ๋ฐ์ ์ ์ ํ ๊ทธ๋ํฝ ๊ฐ์ฒด๋ฅผ ์์ฑํ์ฌ ๋ฐํํด ์ค๋ค.

    private Shape createShape(Scanner scanner) {
        return factory.generateShape(scanner);
    }

===============================================================================
== ํ๋ก๊ทธ๋จ ์ด๊ธฐ ์คํ ํ๋ฉด
== ์ด์  ํ๋ก๊ทธ๋จ์ ์คํํ๋ฉด ์ด ๊ณผ์  ๋งจ์ฒ์์ ๋ณด์ฌ์ค [ํ๋ก๊ทธ๋จ ์ด๊ธฐ ์คํ ํ๋ฉด]์ด ์ถ๋ ฅ๋์ด์ผ ํ๋ค.
== ๊ทธ๋ฐ ํ ์๋ ์๋ ฅ ๋ฐ์ดํฐ๋ฅผ ํ๋ฒ์ ์๋ ฅํ๋ผ.
=============================================================================== 
/******************************************************************************
 * ์๋ ฅ
 * ์๋ ์ซ์๋ค์ Ctrl+C ํด์ Ctrl+V๋ก Console ์ฐฝ์ ํ๋ฒ์ ์๋ ฅํ๋ผ.
 * 6๊ฐ์ ๊ทธ๋ํฝ ๊ฐ์ฒด๋ฅผ ์์์ ์ผ๋ก ์๋ ฅํ๋ ๋ฐ์ดํ์ด๋ค.
 ******************************************************************************/
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
== ์ ์๋ ฅ ๋ฐ์ดํฐ๋ฅผ ๋ณต์ฌํด์ ํ๋ฒ์ ์๋ ฅํ ํ์ ๊ฒฐ๊ณผ
=============================================================================== 
[Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 1  // ๋ณต์ฌํด์ ํ๋ฒ์ ์๋ ฅ
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
12 12    // ๋ณต์ฌํ ๋ง์ง๋ง ์๋ ฅ ๋ฐ์ดํ
Select one Shape  
Rectangle:0, Circle:1, Line:2 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Rectangle  (1, 1) (2, 2)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Select one Shape  
Rectangle:0, Circle:1, Line:2 >> Enter point coordinates (enter two integers) >> Enter the radius (enter one integer) >> 
[Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Rectangle  (1, 1) (2, 2)]
[Circle 4 (3, 3)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Select one Shape  
Rectangle:0, Circle:1, Line:2 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Rectangle  (1, 1) (2, 2)]
[Circle 4 (3, 3)]
[Line (5, 5) (6, 6)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Select one Shape  
Rectangle:0, Circle:1, Line:2 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Rectangle  (1, 1) (2, 2)]
[Circle 4 (3, 3)]
[Line (5, 5) (6, 6)]
[Rectangle  (7, 7) (8, 8)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Select one Shape  
Rectangle:0, Circle:1, Line:2 >> Enter point coordinates (enter two integers) >> Enter the radius (enter one integer) >> 
[Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Rectangle  (1, 1) (2, 2)]
[Circle 4 (3, 3)]
[Line (5, 5) (6, 6)]
[Rectangle  (7, 7) (8, 8)]
[Circle 10 (9, 9)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> Select one Shape  
Rectangle:0, Circle:1, Line:2 >> Enter point coordinates (enter two integers) >> Enter point coordinates (enter two integers) >> [Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Rectangle  (1, 1) (2, 2)]
[Circle 4 (3, 3)]
[Line (5, 5) (6, 6)]
[Rectangle  (7, 7) (8, 8)]
[Circle 10 (9, 9)]
[Line (11, 11) (12, 12)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 6  // ์ฌ์ฉ์ ์๋ ฅ
[Rectangle  (1, 1) (2, 2)]
[Rectangle  (3, 3) (4, 4)]
[Rectangle  (5, 5) (6, 6)]
[Circle 1 (2, 2)]
[Circle 3 (4, 4)]
[Circle 5 (6, 6)]
[Line (1, 1) (2, 2)]
[Line (3, 3) (4, 4)]
[Line (5, 5) (6, 6)]
[Rectangle  (1, 1) (2, 2)]      // ์ฌ๊ธฐ์๋ถํฐ
[Circle 4 (3, 3)]
[Line (5, 5) (6, 6)]
[Rectangle  (7, 7) (8, 8)]
[Circle 10 (9, 9)]
[Line (11, 11) (12, 12)]        // ์ฌ๊ธฐ๊น์ง๊ฐ ์๋ก ์๋ ฅ๋ ๊ฐ์ฒด๋ค
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3
Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 7  // ์ฌ์ฉ์ ์๋ ฅ
Good Bye
```

