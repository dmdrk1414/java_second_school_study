package vendingmachine.controllor;

import vendingmachine.model.VendingMachine;

public class VendingMachineActableImpl implements VendingMachineActable {
	public static void main(String[] args) {
		VendingMachineActableImpl test = new VendingMachineActableImpl();
		VendingMachine e = new VendingMachine();

	}

	@Override
	public void inputCoin(VendingMachine vendingMachine, int CoinCnt) {
		if (isPositiveNum(CoinCnt)) {
			vendingMachine.addCoin2VendingMachine(CoinCnt);
		}
	}

	private boolean isPositiveNum(int num) {
		if (num >= 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int returnCoin(VendingMachine vendingMachine) {
		if (!vendingMachine.isCoinEmpty()) {
			// TODO: 기계에 돈이 있으면 반환
			int returnCoin = vendingMachine.returnAllAmountCoin();
			return returnCoin;
		} else {
			return 0;
		}
	}

	@Override
	public void registerProduct(VendingMachine vendingMachine, String nameDrink, int priceDrink, int stockDrink) {
		// TODO: 제품등록

	}

	@Override
	public void deleteProduct(VendingMachine vendingMachine, String nameDrink) {
		// TODO: 제품삭제

	}

	@Override
	public void reviseProduct(VendingMachine vendingMachine, String nameDrink, String name2Change, int price2Change) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showProducts(VendingMachine vendingMachine) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pickProduct(VendingMachine vendingMachine, String name2Pick) {
		// TODO Auto-generated method stub

	}

}
