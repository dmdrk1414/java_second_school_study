package develoferFuc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    private UI() {

    }

    public static void ErrPositiveCall(String msg) {
        System.out.println("msg: " + msg + ":: 양수를 입력해주세요.");
    }

    public static void ErrNotIntegerCall(String msg) {
        System.out.println("msg: " + msg + ":: 정수를 입력해주세요.");
    }

    public static void ErrNotPickValue(String msg) {
        System.out.println("msg: " + msg + ":: 찾고자 하는 것이 없습니다.");
    }

    public static void ErrNotPickStock(String msg) {
        System.out.println("msg: " + msg + ":: 재고가 없네요.");
    }

    public static void ErrNotString(String msg) {
        System.out.println("msg: " + msg + ":: 문자만 넣어주세요.");
    }

    public static void ErrNotFormReturn(String msg) {
        System.out.println("msg: " + msg + ":: 올바른 리턴값이 아닙니다.");
    }

    private static void ErrOutOfBoundSize(int menuSize) {
        System.out.println("msg: ::0~" + (menuSize - 1) + " 범위의 값만 넣어주세요.");
    }

    public static void ErrNotStrWord(String msg) {
        System.out.println("msg: " + msg + ":: 단어만 넣어주세요.");
    }

    public static void tryAgainMsg() {
        System.out.print("다시입력하세요.");
    }

    public static void ErrNotRegisterDrink(String msg) {
        System.out.println("msg: " + msg + ":: 제품이름이 겹치는 것같아요 확인해주세요.");

    }

    public static void deleteCompleMsg(String msg) {
        System.out.println("msg: " + msg + ":: 제거 완료했습니다.");
    }

    public static int returnSelectMenuNum(int menuSize, String menuStr) {
        int selectNum = 0;
        System.out.println(menuStr);
        while (true) {
            selectNum = UI.getInt();
            if (UI.isPositiveNum(selectNum) && UI.isMenuSizeBoundary(selectNum, menuSize)) {
                return selectNum;
            } else {
                continue;
            }
        }
    }

    public static boolean isMenuSizeBoundary(int selectNum, int menuSize) {
        if (selectNum < menuSize) {
            return true;
        } else {
            UI.ErrOutOfBoundSize(menuSize);
            return false;
        }
    }

    public static boolean isPositiveNum(int numCheck) {
        if (numCheck >= 0) {
            return true;
        } else {
            UI.ErrPositiveCall("");
            return false;
        }
    }

    public static boolean isStrCheck(String inputString) {
        try {
            double a = Integer.parseInt(inputString);
            UI.ErrNotString("");
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public static int getInt() {
        Scanner sc = new Scanner(System.in);
        int selectNum = 0;

        while (true) {
            try {
                selectNum = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                UI.ErrNotIntegerCall("");
                UI.tryAgainMsg();
                continue;
            }
            if (UI.isPositiveNum(selectNum)) {
                return selectNum;
            } else {
                UI.tryAgainMsg();
            }
        }
    }

    public static String getStrLine() {
        Scanner sc = new Scanner(System.in);
        String returnStr = "";

        while (true) {
            returnStr = sc.nextLine();
            if (UI.isStrCheck(returnStr)) {
                return returnStr;
            } else {
                UI.tryAgainMsg();
            }
        }

    }

    public static String getStrWord() {
        while (true) {
            String returnStr = UI.getStrLine();
            if (!returnStr.contains(" ")) {
                return returnStr;
            } else {
                UI.ErrNotStrWord(returnStr);
                UI.tryAgainMsg();
            }
        }

    }

}
