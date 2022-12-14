package vendingmachine.model;

import develoferFuc.UI;

public class Drink {
    final String MSG_NOT_POSITIVE_INT = "Drink.updateInfoDrink";
    final String MSG_NOT_STRING = "Drink.updateInfoDrink";

    private String nameDrink;
    private String tempNameDrink;
    private int priceDrink;
    private int stockDrink; // stock은 재고를 말한다.
    private boolean isNewDrink;

    public Drink() {
        System.out.println("Drink에 이름, 가격, 재고현황을 추가해줘");
    }

    public Drink(String nameDrink, int priceDrink, int stockDrink) {
        this.isNewDrink = true;
        this.nameDrink = nameDrink;
        this.tempNameDrink = nameDrink;
        this.priceDrink = priceDrink;
        this.stockDrink = stockDrink;
    }

    public void addStockOfDrink(int stockIncrease) {
        if (UI.isPositiveNum(stockIncrease)) {
            this.stockDrink = this.stockDrink + stockIncrease;
        } else {
            UI.ErrPositiveCall("");
        }
    }

    public void subtractStockOfDrink(int stockDecrease) {
        if (UI.isPositiveNum(stockDecrease)) {
            this.stockDrink = this.stockDrink + stockDecrease;
        } else {
            UI.ErrPositiveCall("");
        }
    }

    public boolean isNameDrink(String suppositionName) {
        if (this.tempNameDrink.equals(suppositionName)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isStockEmpty() {
        if (this.stockDrink == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void showNameDrink() {
        System.out.print(this.nameDrink + " ");
    }

    public void updateInfoDrink(String nameChange, int priceChange) {
        if (UI.isStrCheck(nameChange) && UI.isPositiveNum(priceChange)) {
            this.nameDrink = nameChange;
            this.priceDrink = priceChange;
        }
    }

    public void changeName(String nameDrink) {
        if (this.isNewDrink) {
            this.nameDrink = "(new)" + nameDrink;
        } else {
            this.nameDrink = nameDrink;
        }
    }

    public void changeOldName() {
        this.isNewDrink = false;
        this.nameDrink = this.tempNameDrink;
    }

    public boolean isNewDrink() {
        return this.isNewDrink;
    }

}
