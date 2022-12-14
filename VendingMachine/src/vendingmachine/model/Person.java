package vendingmachine.model;

import develoferFuc.UI;

public class Person {
	private int coin;

	public Person() {
		this.coin = 2000;
	}

	public boolean addCoinCnt(int coin2Add) {
		if (UI.isPositiveNum(coin2Add)) {
			this.coin = this.coin + coin2Add;
			return true;
		} else {
			return false;
		}
	}

	public boolean subtractCoinCnt(int coin2Add) {
		if (UI.isPositiveNum(coin2Add) && this.coin > coin2Add) {
			this.coin = this.coin - coin2Add;
			return true;
		} else {
			return false;
		}
	}
}
