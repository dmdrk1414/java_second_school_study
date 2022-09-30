package vendingmachine.view;

import vendingmachine.controllor.VendingMachineActableImpl;
import vendingmachine.model.Person;
import vendingmachine.model.VendingMachine;

public class VendingActionView {
	Person user;
	VendingMachine machine;
	VendingMachineActableImpl machineAction;

	public VendingActionView() {
		this.user = new Person();
		this.machine = new VendingMachine();
		this.machineAction = new VendingMachineActableImpl();
	}

	public void putInVendingMachineCoin() { // menu 1.
		System.out.print("투입할 돈: ");
		int coinGiveUser = UI.getInt();
		if (user.subtractCoinCnt(coinGiveUser)) {
			machineAction.inputCoin(this.machine, coinGiveUser);
			System.out.println(coinGiveUser + "원 자판기에 투입!!");
		}
	}

	public void returnCoin2VendingMachine() { // menu 2.
		int CoinsReturn = machineAction.returnCoin(this.machine);
		if (user.addCoinCnt(CoinsReturn)) {
			System.out.println("자판기의 모든 돈을 반환합니다.!!!");
		}
	}

	public void registerNewDrink() { // menu 3.
		System.out.println("제품을 추가합니다. (이름 가격 재고)을 적어주세요.");
		System.out.print("음료수 이름: ");
		String nameNewDrink = UI.getStrWord();
		System.out.print("음료수 가격: ");
		int priceNewDrink = UI.getInt();
		System.out.print("음료수 재고: ");
		int stockNewDrink = UI.getInt();

		machineAction.registerProduct(this.machine, nameNewDrink, priceNewDrink, stockNewDrink);
	}

	public void deleteExistDrink2VendingMachine() {
		System.out.print("제거하고싶은 음료수를 고르세요: ");
		String pickNameDrink = UI.getStrWord();
		this.machine.deletePickDrink(pickNameDrink);
	}

	public void showDrinks2user() { // menu 6.
		machineAction.showProducts(this.machine);
	}

	public static void main(String[] args) {
		VendingActionView view = new VendingActionView();
//		view.putInVendingMachineCoin(); // 돈넣기
//		view.returnCoin2VendingMachine(); // 돈반환
//		view.putInVendingMachineCoin(); // 돈넣기
//		view.showDrinks2user(); // 음료수 보여주기.
//		view.returnCoin2VendingMachine(); // 돈반환
		view.showDrinks2user();
		view.registerNewDrink();
//		view.showDrinks2user();
//		view.deleteExistDrink2VendingMachine();
		view.showDrinks2user(); // 음료수 보여주기.
//		view.deleteExistDrink2VendingMachine();
//		view.showDrinks2user(); // 음료수 보여주기
	}
}
