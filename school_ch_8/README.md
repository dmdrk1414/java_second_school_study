# ๐ch08๊ณผ์ ๋ฅผ ํ๊ฒ ์ต๋๋ค.



```java
๊ณผ์  ๊ธฐ๊ฐ: 2022/11/15 ~ 2022/11/23  23:59๋ถ์ผ๋ก ๋์ด ์์ต๋๋ค.

๊ณผ์  ์ง๊ฐ : 2022/11/23 24 ์ ~ 2022/11/24 23:59 ๋ถ ์๋๋ค.

----------------------------------------------------------------------
Vocaburary Program(์์ ๋จ์ด์ฅ ํ๋ก๊ทธ๋จ)

1. ํ๋ก๊ทธ๋จ ์ค๋ช
   ์ด๋ฒ ์ค์ต ๊ณผ์ ์ ์์ ๋จ์ด์ฅ ํ๋ก๊ทธ๋จ์  ์์ ๋จ์ด ๋ชฉ๋ก์ ํด์ฌ๋งต์ ์ ์ฅํ๊ณ  ๋จ์ด ๊ฒ์, ์ญ์ , ์ถ๊ฐ ๊ธฐ๋ฅ ๋ฑ์ ์ ๊ณตํ๋ค.

2. ํ๋ก๊ทธ๋จ ๊ธฐ๋ฅ
	1) ํด์ฌ๋งต์ ์ฌ์ฉํ์ฌ ์์ ๋จ์ด์ง ์์ฑํ๊ธฐ
	2) 5๊ฐ ์ ๋ ์์ ๋จ์ด ์ ์ฒด๋ฅผ ์ ๋ ฌํ์ฌ ์ถ๋ ฅํ๊ธฐ
	3) ํน์  ์์ ๋จ์ด ๊ฒ์ํ๊ธฐ
	4) ์์ ๋จ์ด ์ถ๊ฐํ๊ธฐ
	5) ์์ ๋จ์ด ์ญ์ ํ๊ธฐ

3. ์ฝ๋ฉ ๋ถ์
   ์์ด ๋จ์ด์ง ์์ฑ์ ์ํด ์์ด ๋จ์ด ๋ฌธ์์ด ๋ฐฐ์ด๋ก ๋ถํฐ ๋ฐ์ดํฐ๋ฅผ ์ฝ๊ณ  HashMap ๊ฐ์ฒด๋ก ์ ์ฅํ๋ค.
HashMap ์ปฌ๋ ์ ๊ฐ์ฒด๋ฅผ ์ด๋ค ๊ตฌ์กฐ๋ก ์ ์ธํด์ผ ํ๋๊ฐ? ํ์คํธ ํ์ผ์ ์ฝ์ด๋ค์ฌ์ HashMap์ ์ด๋ป
๊ฒ ์ ์ฅํ  ์ ์๋๊ฐ? ๋ฑ ๊ณ ๋ฏผํ์ฌ์ผ ํ๋ค.
์์ด ๋จ์ด์ง ์ ์ฒด๋ฅผ ์ถ๋ ฅํ๋ค. ์ด๋ ์์ด ๋จ์ด๋ฅผ ์ค๋ฆ์ฐจ์์ผ๋ก ์ ๋ ฌํ์ฌ ์ถ๋ ฅํ๋ค. HaspMap ๋ฐ์ดํฐ
๋ฅผ ์ค๋ฆ์ฐจ์์ผ๋ก ์ ๋ ฌํ๋ ๋ฐฉ๋ฒ์?
์์ด ๋จ์ด ๊ฒ์, ์ ๊ท ๋จ์ด ์ถ๊ฐ ๋ฐ ๋จ์ด ์ญ์  ๊ธฐ๋ฅ์ HashMap์ ๋ฉ์๋๋ฅผ ์ ์ ํ ํ์ฉํ์ฌ ๊ตฌํํ
๋ค. containsKey(), get(), put(), remove()

4. ์๋ ์์ด๋จ์ด ๋ชฉ๋ก์ ๋ค์๊ณผ ๊ฐ๋ค..

 private static final String[] voca = {"amazing,amaze, surprising, wonderful",
    				"chat,chatter, pratter",
    		"minimal,min, very small in quantity, value, or degree",
    		"supermarket,mart, a large shop.",
 		"wellbeing,happyiness, health and happiness"
    };


5. main ๋ฉ์๋
    public static void main(String[] args) {
        try {
            if(note.LoadData(voca)) {
                System.out.println("Vocabulary is loaded. (Total words : " + note.word.size() + ")");
            }
            else {
                System.out.println("Error : Vocabulary isn't loaded.");
                return;
            }
        } catch (IOException e) {
            System.out.println("Error : Can't load vocadata.");
            return;
        }
        note.operate();
        System.out.println("Good bye.");
    }
	
6. ์คํ๊ฒฐ๊ณผ

Vocabulary is loaded. (Total words : 5)

========= Vocabulary Menu =========
 1. Print Vocabulary
 2. Search a word
 3. Add a new word
 4. Delete a word
 0. Exit
===================================
 ==>> 1
=================== Vocabulary ===================
amazing : amaze, surprising, wonderful
chat : chatter, pratter
minimal : min, very small in quantity, value, or degree
supermarket : mart, a large shop.
wellbeing : happyiness, health and happiness
==================================================

========= Vocabulary Menu =========
 1. Print Vocabulary
 2. Search a word
 3. Add a new word
 4. Delete a word
 0. Exit
===================================
 ==>> 2
Enter a word to search : chat
chat : chatter, pratter

========= Vocabulary Menu =========
 1. Print Vocabulary
 2. Search a word
 3. Add a new word
 4. Delete a word
 0. Exit
===================================
 ==>> 3
Enter a word to append : candy
Meaning : sweet candy
Word is appended successfully.

========= Vocabulary Menu =========
 1. Print Vocabulary
 2. Search a word
 3. Add a new word
 4. Delete a word
 0. Exit
===================================
 ==>> 2
Enter a word to search : candy
candy : sweet candy

========= Vocabulary Menu =========
 1. Print Vocabulary
 2. Search a word
 3. Add a new word
 4. Delete a word
 0. Exit
===================================
 ==>> 4
Enter a word to remove : amazing
The word is removed successfully.

========= Vocabulary Menu =========
 1. Print Vocabulary
 2. Search a word
 3. Add a new word
 4. Delete a word
 0. Exit
===================================
 ==>> 2
Enter a word to search : amazing
Your entered word does not exist.

========= Vocabulary Menu =========
 1. Print Vocabulary
 2. Search a word
 3. Add a new word
 4. Delete a word
 0. Exit
===================================
 ==>> 0
Good bye.
```

