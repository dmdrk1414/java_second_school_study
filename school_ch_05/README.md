# ๐ch05๊ณผ์ ๋ฅผ ํ๊ฒ ์ต๋๋ค.

### ๊ตฌํํ  ๋ด์ฉ

1. Rect ํด๋์ค ์์ฑ
2. Circle ํด๋์ค ์์ฑ
3. UI ํด๋์ค ์์ฑ
4. ShapeList ํด๋์ค ์์ฑ
   1. isEmpty ๊ตฌํ
   2. get_rearValue๊ตฌํ
   3. add_front๊ตฌํ
   4. add_rear ๊ตฌํ
   5. remove_front ๊ตฌํ
   6. remove_rear ๊ตฌํ
5. runํด๋์ค ์์ฑ

```java
/******************************************************************************
 ์ด๋ฒ ํ๋ก์ ํธ๋ ๊ต์ฌ 321ํ์ด์ง ์ค์ต๋ฌธ์  12์ 
 ๊ต์ฌ 293ํ์ด์ง ๊ต์ฌ 284 ํ์ด์ง๋ฅผ ์ฐธ๊ณ ํ์ฌ ์๋ก์ด ์์ฉ ํ๋ก๊ทธ๋จ์ ์์ฑํ๋ ๊ฒ์ด๋ค.

 Shape์ linked list๋ก ๊ด๋ฆฌํ๊ธฐ ์ํด์ double linked list๋ฅผ ์ด์ฉํ๋ค.
 double lined list์ ์ธํฐํ์ด์ค๊ฐ interface LinkedList๋ก ์ ์ธ๋์๋ค.

 Shape์ linked list๋ก ๊ด๋ฆฌํ๊ธฐ ์ํด์  ShapeList๋ผ๋ ํด๋์ค๋ฅผ ์์ฑํ๋ผ.
 ShapeList๋ ์ธํฐํ์ด์ค LinkedList๋ฅผ ๊ตฌํํ๋ฉฐ, Linked list์ ๋ฐ์ดํฐ๋  Node ํด๋์ค๋ฅผ ์ด์ฉํ์ฌ ๊ด๋ฆฌํ๋ค. 
 Node ํด๋์ค๋ ๋ฆฌ์คํธ ๊ตฌํ์ ์ํด์ ์ (prev), ํ(next)๋ฅผ ์ฐ๊ฒฐํ  ์ ์๋ ๋ ํผ๋ฐ์ค๊ฐ ๋ฉค๋ฒ ๋ณ์๊ฐ ์์ผ๋ฉฐ,
 Shape ๋ฐ์ดํฐ๋ฅผ ์ ์ฅํ  value๋ผ๋ ๋ฉ๋ฒ ๋ณ์๊ฐ ์๋ค.

 Shape์ ์ข๋ฅ์๋ Rect, Line, Circle์ด ์์ผ๋ฉฐ, ๊ฐ๊ฐ์ Shape ํด๋์ค๋ฅผ ์์ ๋ฐ๋๋ค.

 ShapeList์๋ ์ธํฐํ์ด์ค LinkedList์ ๋ฉ์๋์ ์ถ๊ฐ์ ์ผ๋ก  get_frontValue(), get_rearValue()๊ฐ ์๋ค.

 ์๋ฐ์ ๋ชจ๋  ํด๋์ค๋ ์ต์์ ํด๋์ค๋ก Object ํด๋์ค๋ฅผ ์์ ๋ฐ์ผ๋ฉฐ,
 Object ํด๋์ค์๋ ๊ฐ์ฒด๊ฐ ์์ ์ ์ ๋ณด๋ฅผ ์ถ๋ ฅํ๊ธฐ ์ํ  public String toString() ๋ฉ์๋๊ฐ ์๋ค.
 
 ShapeList, Line, Rect, Circle ๋ฑ์ ํด๋์ค์ ์์ ์ ์ ๋ณด๋ฅผ ์ถ๋ ฅํ๊ธฐ ์ํด์
 Object ํด๋์ค์  public String toString() ๋ฉ์๋ ์ค๋ฒ๋ผ์ด๋ฉ ํด์ ์์ฑํ๋ค.


****************************************************************************/
import java.util.*;

/**************************************************************************/
   ๋ฉ๋ด ์ ํ์์ ์ฌ์ฉํ  ๋ฉ๋ด ์ด๋ฆ์ ๋ํ ์ด๊ฑฐํ ์ ์ธ
     MAIN_MENU : ์ฐ์ฐ ์ ์ : ์ฐ์ฐ์ ๋ฆฌ์คํธ์ ๋ํ ์ฐ์ฐ์ ์ ์  
         ์ฝ์(์), ์ฝ์(๋ค), ์ญ์ (์), ์ญ์ (๋ค), ์ด๋(๋งจ ์ ๋ฐ์ดํฐ), ์ด๋(๋งจ ๋ค ๋ฐ์ดํฐ), ๋ฆฌ์คํธ ์ถ๋ ฅ, ์ข๋ฃ
     SHAPE_TYPE  : ์์ฑํ  Shape
         Rect, Circel, Line  
/*************************************************************************/
enum MAIN_MENU {
	Insert_front(0), Insert_rear(1), Remove_front(2), Remove_rear(3),
	Move_front(4), Move_rear(5), list_all(6), Exit(7);

	MAIN_MENU(int value) { this.value = value; }

    private final int value;
    public int value() { return value; }
}

enum SHAPE_TYPE {
	Shape_Rect(0), Shape_Circle(1), Shape_Line(2);

	SHAPE_TYPE(int value) { this.value = value; }

    private final int value;
    public int value() { return value; }
}



//*****************************************************************************

/******************************************************************************
 UI ํด๋์ค ์ ์ธ ๋ฐ ๊ตฌํ
    ๋ชจ๋  ๋ฉค๋ฒ ํจ์๋ค์ด ๋ชจ๋ ์ ์ (static) ํจ์์
    ์๋ ฅ๊ณผ ์ถ๋ ฅ์ ๋ด๋นํ๋ ์ ์ญ ํจ์๋ค์ ๋ชจ์
    static ํจ์ ํธ์ถ์ ์์  4-11 ์ฐธ์กฐ
*******************************************************************************/
class UI {
	// msg๋ฅผ ์ถ๋ ฅํ ํ ์ ์ ๊ฐ ํ๋๋ฅผ ์๋ ฅ ๋ฐ์ ๋ฆฌํด
            // MAIN_MENU ์ ํ์ ์ํ ๋ฉ์๋
	static int getMainMenu(Scanner scanner) {
		System.out.println("Select one operation  ");   // ์๋ด ๋ฌธ์ ์ถ๋ ฅ
		System.out.print("Insert(Front):" + MAIN_MENU.Insert_front.value() + ", "
				+ "Insert(Rear):" + MAIN_MENU.Insert_rear.value() + ", "
				+ "Remove(Front):" + MAIN_MENU.Remove_front.value() + ", "
				+ "Remove(Rear):" + MAIN_MENU.Remove_rear.value() + ", "
				+ "Move(Front):" + MAIN_MENU.Move_front.value() + ", "
				+ "Move(Rear):" + MAIN_MENU.Move_rear.value() + ", "
				+ "Print List:" + MAIN_MENU.list_all.value() + ", "
				+ "Exit:" + MAIN_MENU.Exit.value() + " >> ");  // ์ฐ์ฐ ์ข๋ฅ ์ถ๋ ฅ
		
		int nMenu = scanner.nextInt();                                // ์ฌ์ฉ์๊ฐ ์ ํํ ์ฐ์ฐ ์๋ ฅ 
		
		return nMenu;                                                 // ์ฌ์ฉ์๊ฐ ์ ํํ ์ฐ์ฐ ๋ฆฌํด  
	}
	
	// msg๋ฅผ ์ถ๋ ฅํ ํ ์ ์ ๊ฐ ํ๋๋ฅผ ์๋ ฅ ๋ฐ์ ๋ฆฌํด
            // SHAPE_TYPE ์ ํ์ ์ํ ๋ฉ์๋
	static int getShape(Scanner scanner) {
		// ์๋ด ๋ฌธ์ ์ถ๋ ฅ
		// Shape ์ข๋ฅ ์ถ๋ ฅ
		
		 // ์ฌ์ฉ์๊ฐ ์ ํํ Shape ์๋ ฅ 
		 // ์ฌ์ฉ์๊ฐ ์ ํํ Shape ๋ฆฌํด 
	}
	
	// ์๋ด msg๋ฅผ ๋งค๊ฐ ๋ณ์๋ก ๋ฐ์ ์ถ๋ ฅํ๊ณ 
	// ์ฝ์ํ  ๋ํ์ Point ์ ๋ณด ํ๋๋ฅผ ์๋ ฅ ๋ฐ์ ๋ฆฌํด
	static public Point getWidthHeight(Scanner scanner, String msg) {
		 // msg ์ถ๋ ฅ
		 // width, height ๋ณ์ ์ ์ธ
		
		 // width ์๋ ฅ
		// height ์๋ ฅ 
		
		// ํฌ์ธํธ ๊ฐ์ฒด ์์ฑ
						 
		 //ํฌ์ธํธ ๊ฐ์ฒด ๋ฆฌํด
	}
	
	// ์๋ด msg๋ฅผ ๋งค๊ฐ ๋ณ์๋ก ๋ฐ์ ์ถ๋ ฅํ๊ณ 
	// Circle ๊ฐ์ฒด์ ๋ฐ์ง๋ฆ ํ๋๋ฅผ ์๋ ฅ ๋ฐ์ ๋ฆฌํด
	static public int getRadius(Scanner scanner, String msg) {
		// msg ์ถ๋ ฅ
		// radius ๋ณ์ ์ ์ธ
		// radius ์๋ ฅ 
		 // radius ๋ฆฌํด
	}
}

//*****************************************************************************
   Circle ๊ฐ์ฒด์  ์ค์ฌ์ 
   Line   ๊ฐ์ฒด์ ๋ ์ 
   Rectangle ๊ฐ์ฒด์ ๋ ๊ผญ์ง์ ์ ์ ๋ณด๋ฅผ ์ ์ฅํ  ์๋ฃํ 
//*****************************************************************************

class Point {
	int x; // ์ ์ x ์ขํ ๊ฐ
	int y; // ์ ์ y ์ขํ ๊ฐ

	// ๊ฐ์ฒด ์ด๊ธฐํ: x, y ์ขํ ์ด๊ธฐํ
	 public Point(int x, int y) {
		this.x = x;	this.y = y;
	}

	// x, y ์ขํ๋ฅผ ๊ฐ๊ฐ width, height๋งํผ ์ด๋์ํจ๋ค.
	 public void move(int width, int height) {
		this.x += width;
		this.y += height;
	}

	// (x,y) ์ขํ ๋ฌธ์์ด์ ๋ฆฌํด, ์) "(10, 15)"
	// ๋ฉ์๋ ์ค๋ฒ๋ผ์ด๋ฉ, Object ํด๋์ค์ public String toString()์ ์ค๋ฒ๋ผ์ด๋ฉ 
	 @Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}



//*****************************************************************************
// Shape์ ์ถ์ ํด๋์ค ์ ์ธ 
abstract class Shape {
	public abstract String draw();                       // ์ ๋ณด ์ถ๋ ฅ
	public abstract void move(int width, int height);    // ์ขํ ์ด๋
};


//*****************************************************************************
Line ํด๋์ค ์ ์ธ ๋ฐ ๊ตฌํ
*****************************************************************************/

class Line extends Shape {
	private Point p1;	// ์ฌ๊ฐํ์ ์ผ์ชฝ ์์ชฝ ์ขํ
	private Point p2;	// ์ฌ๊ฐํ์ ์ค๋ฅธ์ชฝ ์๋์ชฝ ์ขํ
	
	// ์์ฑ์ ์์ฑ
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	// Shape ์ draw ๋ฉ์๋ ์ค๋ฒ๋ผ์ด๋ฉ
	// ์ค์ง์ ์ธ ์๋ฃ๋ฅผ ๋ฆฌํดํ๋ ํจ์๋ toString
            // ํจ์ ๋ด๋ถ์์ toString() ๋ฉ์๋ ํธ์ถ
	@Override
	public String draw() { return toString(); }
	
	// ํ๋ฉด์ ๋ผ์ธ์ ์ขํ ๊ฐ์ ์ถ๋ ฅ, ์) "Line (10,15) (20,30)"
	// ๋ฉ์๋ ์ค๋ฒ๋ผ์ด๋ฉ, Object ํด๋์ค์ public String toString()์ ์ค๋ฒ๋ผ์ด๋ฉ 
	 @Override
	public String toString() {
		return ( "Line " + p1 + " " + p2 );
	}

	//๊ธฐ์กด ๊ฐ์ฒด์ ์์น๋ฅผ width, height๋งํผ ์ฎ๊ธด๋ค.
	public void move(int width, int height) {
		//๊ธฐ์กด p1์ ์์น๋ฅผ width, height๋งํผ ์ฎ๊ธด๋ค.
		p1.move(width, height);
		//๊ธฐ์กด p2์ ์์น๋ฅผ width, height๋งํผ ์ฎ๊ธด๋ค.
		p2.move(width, height);
	}
}


//*****************************************************************************
	Rect ํด๋์ค ์ ์ธ ๋ฐ ๊ตฌํ
            Line ํด๋์ค๋ฅผ ์ฐธ๊ณ ํ์ฌ ์์ฑ
*****************************************************************************/
class Rect extends Shape {
	private Point p1;	// ์ฌ๊ฐํ์ ์ผ์ชฝ ์์ชฝ ์ขํ
	private Point p2;	// ์ฌ๊ฐํ์ ์ค๋ฅธ์ชฝ ์๋์ชฝ ์ขํ

	//์์ฑ์: ๋ฉค๋ฒ ์ด๊ธฐํ
	

	// Shape ์ draw ๋ฉ์๋ ์ค๋ฒ๋ผ์ด๋ฉ
	@Override
	public String draw() {
		// ์ค์ง์ ์ธ ์๋ฃ๋ฅผ ๋ฆฌํดํ๋ ํจ์๋ toString
            	// ํจ์ ๋ด๋ถ์์ toString() ๋ฉ์๋ ํธ์ถ
             }
	

	// ๋ฉ์๋ ์ค๋ฒ๋ผ์ด๋ฉ, Object ํด๋์ค์ public String toString()์ ์ค๋ฒ๋ผ์ด๋ฉ 
	 @Override
	public String toString() {
                   //ํ๋ฉด์ ์ฌ๊ฐํ์ ์ขํ ๊ฐ์ ์ถ๋ ฅ, ์) "Rectangle (10,15) (20,30)"
	}
	
	public void move(int width, int height) {
		//๊ธฐ์กด ๊ฐ์ฒด์ ์์น๋ฅผ width, height๋งํผ ์ฎ๊ธด๋ค.
	}
}


//*****************************************************************************
	Rect ํด๋์ค ์ ์ธ ๋ฐ ๊ตฌํ
            Line ํด๋์ค๋ฅผ ์ฐธ๊ณ ํ์ฌ ์์ฑ
*****************************************************************************/
class Circle extends Shape {
	private Point center;	// ์์ ์ค์ฌ ์ขํ
	private int   radius;       	// ๋ฐ์ง๋ฆ์ ๊ธธ์ด

	//์์ฑ์: ๋ฉค๋ฒ ์ด๊ธฐํ

	// Shape ์ draw ๋ฉ์๋ ์ค๋ฒ๋ผ์ด๋ฉ
	@Override
	public String draw() {
		// ์ค์ง์ ์ธ ์๋ฃ๋ฅผ ๋ฆฌํดํ๋ ํจ์๋ toString
            	// ํจ์ ๋ด๋ถ์์ toString() ๋ฉ์๋ ํธ์ถ
             }
	
	// ๋ฉ์๋ ์ค๋ฒ๋ผ์ด๋ฉ, Object ํด๋์ค์ public String toString()์ ์ค๋ฒ๋ผ์ด๋ฉ 
	 @Override
	public String toString() {
                   //ํ๋ฉด์ ๋ฐ์ง๋ฆ๊ณผ ์ค์ฌ ์ขํ ๊ฐ์ ์ถ๋ ฅ, ์) "Circle 5 (20,30)"
	}
	
	public void move(int width, int height) {
		//๊ธฐ์กด ๊ฐ์ฒด์ ์์น๋ฅผ width, height๋งํผ ์ฎ๊ธด๋ค.
	}
}


//*****************************************************************************
// linked list์์ ์๋ฃ ๋ฐ ๋งํฌ๋ฅผ ๊ด๋ฆฌํ  node ์ ์ธ
class Node  {
	public Node next;
	public Node prev;
	
	private Object value;   // ๋ฐ์ดํฐ (์์บ์คํ์ ํตํด์ ๊ด๋ฆฌ ํจ, ๋ชจ๋  ํด๋์ค์ ์ต์์ ํด๋์ค์ธ Object ํด๋์ค๋ก ์์บ์คํ)  
	
	public Node(Object value) {  next = null; prev = null; this.value = value; }  // ์์ฑ์
	public Object  getValue() { return value; }     // ํ์ฌ Node์ ๋ฐ์ดํฐ ๋ฆฌํด
};


//*****************************************************************************
//double linked list๋ฅผ ์ํ ์ธํฐํ์ด์ค ์ ์ธ
interface LinkedList{
	public abstract void add_front(Object value);   // ๋ฆฌ์คํธ ๋งจ ์์ ์ฝ์
	public abstract void add_rear(Object value);    // ๋ฆฌ์คํธ ๋งจ ๋ค์ ์ฝ์
	public abstract boolean isEmpty(); ;            // ๋ฆฌ์คํธ๊ฐ empty์ธ์ง ํ์ธ        
	public abstract Object remove_front();          // ๋ฆฌ์คํธ ๋งจ ์์์ ์ญ์ 
	public abstract Object remove_rear();           // ๋ฆฌ์คํธ ๋งจ ๋ค์์ ์ญ์ 
}


//*****************************************************************************
// Shape์ ์ด์ฉํ double linked list ์์ฑ
class ShapeList implements LinkedList{

	private Node head;	// double linked ๋ฆฌ์คํธ์ ๋งจ ์ฒ์ ๋ธ๋๋ฅผ ๊ฐ๋ฆฌํค๋ ํฌ์ธํฐ
	private Node tail;		// double linked ๋ฆฌ์คํธ์ ๋งจ ๋ง์ง๋ง ๋ธ๋๋ฅผ ๊ฐ๋ฆฌํค๋ ํฌ์ธํฐ
	
	ShapeList() { head= null; tail = null;} // ์์ฑ์: ๋ฉค๋ฒ ์ด๊ธฐํ

	// ๋ฆฌ์คํธ์ ๋งจ ์์ ๋ธ๋๋ฅผ ๋ฆฌํด
	public Object get_frontValue() {
		// ๋ฆฌ์คํธ๊ฐ empty ์ด๋ฉด 
		// null ๋ฆฌํด
		// ๋ฆฌ์คํธ๊ฐ empty๊ฐ ์๋๋ฉด
		// ๋งจ ์์ ๋ฐ์ดํฐ ๋ฆฌํด,  head๋ฅผ ์ด์ฉํ์ฌ getValue ๋ฉ์๋ ํธ์ถ
	}
	
	// ๋ฆฌ์คํธ์ ๋งจ ๋ค์ ๋ธ๋๋ฅผ ๋ฆฌํด
	public Object get_rearValue() { 
		// ๋ฆฌ์คํธ๊ฐ empty ์ด๋ฉด 
		// null ๋ฆฌํด; 
		 // ๋ฆฌ์คํธ๊ฐ empty๊ฐ ์์ด๋ฉด
		 // ๋งจ ๋ค์ ๋ฐ์ดํฐ ๋ฆฌํด, tail์ ์ด์ฉํ์ฌ getValue ๋ฉ์๋ ํธ์ถ
	}
	
	// ๋ฆฌ์คํธ ๋งจ ์์ ๋ธ๋ ์ฝ์
	//  ์ธํฐํ์ด์ค ๋ฉ์๋ ๊ตฌํ
	public void add_front(Object value) {

	    // ๋ธ๋๋ฅผ ์์ฑํฉ๋๋ค.
	    // ์๋ก์ด ๋ธ๋์ ๋ค์ ๋ธ๋๋ก ํค๋๋ฅผ ์ง์ ํฉ๋๋ค.

	     // ๊ธฐ์กด์ ๋ธ๋๊ฐ ์์๋ค๋ฉด 
	    //  ํ์ฌ ํค๋์ ์ด์  ๋ธ๋๋ก ์๋ก์ด ๋ธ๋๋ฅผ ์ง์ 

	   // ํค๋๋ก ์๋ก์ด ๋ธ๋๋ฅผ ์ง์ 

	    // ๋ธ๋๊ฐ ํ๋์ธ์ง ํ์ธ
	    // tail ์ head ๋์ 
	  
	}
	
	// ๋ฆฌ์คํธ ๋งจ ๋ค์ ๋ธ๋ ์ฝ์
	//  ์ธํฐํ์ด์ค ๋ฉ์๋ ๊ตฌํ
	public void add_rear(Object value) {
	    if (isEmpty()) {   // ๋ฆฌ์คํธ์ ๋ธ๋๊ฐ ์๋ค๋ฉด ์ฒซ๋ฒ์งธ ๋ธ๋๋ฅผ ์ถ๊ฐํ๋ ๋ฉ์๋๋ฅผ ์ฌ์ฉํฉ๋๋ค.
	        add_front(value);
	    } else {
	       Node newNode = new Node(value); 			// ๋ธ๋๋ฅผ ์์ฑํฉ๋๋ค.
	        tail.next = newNode; 	    	// tail์ ๋ค์ ๋ธ๋๋ก ์์ฑํ ๋ธ๋๋ฅผ ์ง์ ํฉ๋๋ค.
	        newNode.prev = tail;  	        // ์๋ก์ด ๋ธ๋์ ์ด์  ๋ธ๋๋ก tail์ ์ง์ ํฉ๋๋ค.
	        tail = newNode;  	        // ๋ง์ง๋ง ๋ธ๋๋ฅผ ๊ฐฑ์ ํฉ๋๋ค.
	    }
	}
	
	
	// list ๊ฐ empty์ธ์ง ํ์ธ
	//  ์ธํฐํ์ด์ค ๋ฉ์๋ ๊ตฌํ
	public boolean isEmpty() {
		 // head ์  tail ์ด ๋ชจ๋ null ์ด๋ฉด 
		// true ๋ฆฌํด
		// ๊ทธ๋ ์ง ์์ผ๋ฉด
		// false ๋ฆฌํด
	}
	
	// ๋ฆฌ์คํธ ๋งจ ์์์ ์ญ์ 
	//  ์ธํฐํ์ด์ค ๋ฉ์๋ ๊ตฌํ
	//  remove_rear ์ฐธ๊ณ 
	public Object remove_front() {
		// list๊ฐ empty์ธ์ง ํ์ธ
		//  empty ์ด๋ฉด  null ๋ฆฌํด
		
	    // ์ฒซ๋ฒ์งธ ๋ธ๋๋ฅผ temp๋ก ์ง์ ํ๊ณ 
	   // head ๊ฐ ์ง์ฐ๊ธฐ  ์๋ฐ์์๋ ์์ด๋ ๋๋ ๋ถ๋ถ
	    //  head์ ๊ฐ์ ๋๋ฒ์งธ ๋ธ๋๋ก ๋ณ๊ฒฝ

	    // temp๋ก๋ถํฐ ๋ฆฌํดํ  ๊ฐ์ ์์ ๋ณ์(Object ํ์)์ ๋ฃ๊ธฐ
	    // temp ์ง์ฐ๊ธฐ  (temp=null)
	    
	    // head๊ฐ ๋์ด ์๋๋ฉด	
	   // head์ ์ด์  ๋ธ๋๋ฅผ null๋ก ์ง์ 
        
	     // ์ญ์ ๋ ๋ฐ์ดํฐ ๋ฆฌํด (Object ํ์)
	}

	// ๋ฆฌ์คํธ ๋งจ ๋ค์์ ์ญ์ 
	//  ์ธํฐํ์ด์ค ๋ฉ์๋ ๊ตฌํ
	public Object remove_rear() {
		if (isEmpty())       // list๊ฐ empty์ธ์ง ํ์ธ
			return null;     //  empty ์ด๋ฉด  null ๋ฆฌํด
		
		Node temp = tail;         // tail์ ๊ฐ์ ์์๋ณ์(temp)์ ์ ์ฅ
		tail = null;              // tail ์ง์ฐ๊ธฐ (tail = null) ์๋ฐ์์๋ ์์ด๋ ๋๋ ๋ถ๋ถ
		tail = temp.prev;         // tail์ ์์๋ณ์์ prev ๋ฃ๊ธฐ
		if (tail!= null)
			tail.next = null;      // tail์ next์ null ๋ฃ๊ธฐ
		else
			head=null;
		
		Object returnData = temp.getValue();  	 // temp๋ก๋ถํฐ ๋ฆฌํดํ  ๊ฐ์ ์์ ๋ณ์(Object ํ์)์ ๋ฃ๊ธฐ
		return returnData;              // ๋ฐ์ดํฐ ๋ฆฌํด (Object ํ์)
	}
	
	// ๋ฉ์๋ ์ค๋ฒ๋ผ์ด๋ฉ, Object ํด๋์ค์ public String toString()์ ์ค๋ฒ๋ผ์ด๋ฉ 
	 @Override
	public String toString() {
		StringBuffer result = new StringBuffer("");          // ๊ฐ๋ณํ String ๋ณ์ result ์ ์ธ
		if (!isEmpty()) {                                            // ๋ฆฌ์ค๊ฐ empty๊ฐ ์๋๋ฉด
			Node node = head;                          // head๋ฅผ ์๋ก์ด ๋ณ์ node์ ๋ฃ๊ธฐ 

			while (node != null) {                          // node๊ฐ null ์ด ์๋ ๋์
				result.append("[");                     //  result์ "[" ๋ถ์ด๊ธฐ
				result.append(node.getValue());         //  result์  node.getValue() ํธ์ถํด์ ๊ฒฐ๊ณผ ๋ถ์ด๊ธฐ
				result.append("]");                     //  result์ "]" ๋ถ์ด๊ธฐ
				if (node.next==null)                    //  node.next ๊ฐ null ์ด๋ฉด 
					result.append("\r\n");              //  result์ "\r\n" ๋ถ์ด๊ธฐ
				else
					result.append(", ");                 //  result์ ", " ๋ถ์ด๊ธฐ
				node = node.next;                         //  node = node.next ๋ก ๋ค์ ๋ธ๋๋ก ์ด๋
			} 
		} 
		
		return result.toString(); 
	}
}



class GraphicEditor {
	private Shape createShape(Scanner scanner) {
		
		SHAPE_TYPE shapeType;
		Point p1, p2; 
		int radius;
		
		int type = UI.getShape(scanner);
		
		shapeType = SHAPE_TYPE.values()[type] ;
		Shape shape = null;
		
		String msgpoint = "Enter point coordinates (enter two integers) >> ";
		String msgradius = "Enter the radius (enter one integer) >> ";
	
		switch (shapeType) {
			case Shape_Rect : // ์ฌ๊ฐํ
				p1 = UI.getWidthHeight(scanner, msgpoint);
				p2 = UI.getWidthHeight(scanner, msgpoint);
				shape = new Rect(p1, p2);
				break;
			case Shape_Circle : // ์
				p1 = UI.getWidthHeight(scanner, msgpoint);
				radius = UI.getRadius(scanner, msgradius);
				shape = new Circle(radius, p1);
				break;
			case Shape_Line : // ๋ผ์ธ
				p1 = UI.getWidthHeight(scanner, msgpoint);
				p2 = UI.getWidthHeight(scanner, msgpoint);
				shape = new Line(p1, p2);
				break;
				
		}
		return shape;
	}
	

	public void run() {
		ShapeList list = new ShapeList();             // shape ๋ฆฌ์คํธ๋ฅผ ๊ด๋ฆฌํ  ๊ฐ์ฒด ์์ฑ
		
		Scanner scanner = new Scanner(System.in);     // ์ฌ์ฉ์ ์๋ ฅ์ ์ํ ์ค์บ๋ ๊ฐ์ฒด ์์ฑ
		
		Shape shape = null;			  // ์์๋ก ์ฌ์ฉํ  Shape ๋ ํผ๋ฐ์ค ๋ณ์ ์ ์ธ  
		boolean  bLoop = true;                         // ๋ฐ๋ณต๋ฌธ ๊ด๋ฆฌ์ฉ ๋ถ์ธ๋ฆฐ ๋ณ์ 
		Point p1;
		String msgpoint = "Enter two integers to move along the X and Y axes (enter two integers) >> ";
		
		while (bLoop) {
			int n = UI.getMainMenu(scanner);           // ๋ฉ๋ด ์ ๋ณด ์ฝ์ด ์ค๊ธฐ
			MAIN_MENU menu = MAIN_MENU.values()[n] ;   // ์ด๊ฒจํ์ ์ ๋ณด๋ก ๋ณํ  
			
			switch (menu)
			{
				case Insert_front:	 // ๋ฆฌ์คํธ ์์ ์ฝ์
					 // ์ฝ์์ ์ํ ๊ฐ์ฒด ์์ฑ
 					//   ๋ฆฌ์คํธ ์์ ์ฝ์
					break;
				case Insert_rear:  // ๋ฆฌ์คํธ ๋ค์ ์ฝ์
					// ์ฝ์์ ์ํ ๊ฐ์ฒด ์์ฑ
					 // ๋ฆฌ์คํธ ๋ค์ ์ฝ์	
					break;
				case Remove_front:	// ๋ฆฌ์คํธ ์์์ ์ญ์ 
					// ๋ฆฌ์คํธ ์์์ ์ญ์  (๋ฆฌํด ๊ฐ์ shape์ ์ ์ฅ)		
					break;
				case Remove_rear: // ๋ฆฌ์คํธ ๋ค์์ ์ญ์ 
					// ๋ฆฌ์คํธ ๋ค์์ ์ญ์  (๋ฆฌํด ๊ฐ์ shape์ ์ ์ฅ)	
					break;
				case Move_front: // ๋ฆฌ์คํธ ์ฒซ๋ฒ์งธ ๊ฐ์ฒด ์ด๋
					
					//  get_frontValue ๋ฉ์๋๋ฅผ ์ด์ฉํด์ ์ฒซ๋ฒ์งธ shape ์ ๋ณด ๊ฐ์ง๊ณ  ์ค๊ธฐ
					//  shape ์ด ๋์ด ์๋๋ฉด
					//     ์ด๋์ ์ํ ์ ๋ณด ๋ฐ๊ธฐ, UI.getWidthHeight ์ด์ฉ	
					//     ์ขํ์ด๋
					break;
				case Move_rear:	// ๋ฆฌ์คํธ ๋ง์ง๋ง ๊ฐ์ฒด ์ด๋
					//  get_rearValue๋ฉ์๋๋ฅผ ์ด์ฉํด์ ๋ง์ง๋ง shape ์ ๋ณด ๊ฐ์ง๊ณ  ์ค๊ธฐ
					//  shape ์ด ๋์ด ์๋๋ฉด
					//     ์ด๋์ ์ํ ์ ๋ณด ๋ฐ๊ธฐ, UI.getWidthHeight ์ด์ฉ	
					//      ์ขํ์ด๋
					
				case list_all:	// ๋ฆฌ์คํธ ์ ๋ณด ์ถ๋ ฅ
					System.out.print(list.toString());	
					break;
				case Exit:
					bLoop= false;  // ๋๋ด๊ธฐ
			}
		}
		scanner.close();
	}
}

public class Main {

	public static void main(String[] args) {

		GraphicEditor g = new GraphicEditor();  		// GraphicEditor  ์์ฑ 
		g.run();                                                                // ์คํ ํจ์ ํธ์ถ
		
		System.out.println("Good Bye");   		        
	}
}




// ํ๋ก๊ทธ๋จ์ ์ ์ฒด ๊ตฌ์ฑ๋์ ์คํ๊ฒฐ๊ณผ๋ ์๋์ ๊ฐ๋ค.
/*************************************************************************************
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 1
Select one Shape  
Rectangle:0, Circle:1, Line:2 >> 1
Enter point coordinates (enter two integers) >> 10 20
Enter the radius (enter one integer) >> 
5
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 6
[Circle 5 (10, 20)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 0
Select one Shape  
Rectangle:0, Circle:1, Line:2 >> 0
Enter point coordinates (enter two integers) >> 10 20
Enter point coordinates (enter two integers) >> 30 40
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 6
[Rectangle  (10, 20) (30, 40)], [Circle 5 (10, 20)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 1
Select one Shape  
Rectangle:0, Circle:1, Line:2 >> 2
Enter point coordinates (enter two integers) >> 40 50 
Enter point coordinates (enter two integers) >> 40 70
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 6
[Rectangle  (10, 20) (30, 40)], [Circle 5 (10, 20)], [Line (40, 50) (40, 70)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 4
The two integers to move along the X and Y axes (enter two integers) >> 5 10
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 6
[Rectangle  (15, 30) (35, 50)], [Circle 5 (10, 20)], [Line (40, 50) (40, 70)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 5
The two integers to move along the X and Y axes (enter two integers) >> 3 7
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 6
[Rectangle  (15, 30) (35, 50)], [Circle 5 (10, 20)], [Line (43, 57) (43, 77)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 3
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 6
[Rectangle  (15, 30) (35, 50)], [Circle 5 (10, 20)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 4
The two integers to move along the X and Y axes (enter two integers) >> 6 5
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 6
[Rectangle  (21, 35) (41, 55)], [Circle 5 (10, 20)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 2
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 6
[Circle 5 (10, 20)]
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 2
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 6
Select one operation  
Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3, Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> 7
Good Bye

*************************************************************************************/


```

