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

	public void putInVendingMachineCoin() { // menu 1.동전넣기
		System.out.print("투입할 돈: ");
		int coinGiveUser = UI.getInt();
		if (user.subtractCoinCnt(coinGiveUser)) {
			machineAction.inputCoin(this.machine, coinGiveUser);
			System.out.println(coinGiveUser + "원 자판기에 투입!!");
		}
	}

	public void returnCoin2VendingMachine() { // menu 2.동전반환
		int CoinsReturn = machineAction.returnCoin(this.machine);
		if (user.addCoinCnt(CoinsReturn)) {
			System.out.println("자판기의 모든 돈을 반환합니다.!!!");
		}
	}

	public void registerNewDrink() { // menu 3.제품등록
		System.out.println("제품을 추가합니다. (이름 가격 재고)을 적어주세요.");
		System.out.print("음료수 이름: ");
		String nameNewDrink = UI.getStrWord();
		System.out.print("음료수 가격: ");
		int priceNewDrink = UI.getInt();
		System.out.print("음료수 재고: ");
		int stockNewDrink = UI.getInt();

		machineAction.registerProduct(this.machine, nameNewDrink, priceNewDrink, stockNewDrink);
	}

	public void deleteExistDrink2VendingMachine() { // menu 4.제품삭제
		System.out.print("제거하고싶은 음료수를 고르세요: ");
		String pickNameDrink = UI.getStrWord();
		this.machineAction.deleteProduct(machine, pickNameDrink);
	}

	public void updateDrinkInfo2VendingMachine() { // menu 5.제품업데이트
		System.out.print("선택할 음료수 이름: ");
		String nameDrinkPick = UI.getStrWord();
		System.out.print("수정할 음료수 이름: ");
		String nameDrink2Change = UI.getStrWord();
		System.out.print("수정할 음료수 가격: ");
		int priceDrink2Change = UI.getInt();
		this.machineAction.reviseProduct(machine, nameDrinkPick, nameDrink2Change, priceDrink2Change);
	}

	public void showDrinks2user() { // menu 6.제품보기
		this.machineAction.showProducts(this.machine);
	}

	public void chooseDrink2VendingMachine() { // menu 7.제품선택
		System.out.print("선택할 음료수 이름: ");
		String nameDrinkPick = UI.getStrWord();
		this.machineAction.pickProduct(this.machine, nameDrinkPick);
	}

//	public static void main(String[] args) {
//		VendingActionView view = new VendingActionView();
//		view.putInVendingMachineCoin(); // 돈넣기
//		view.returnCoin2VendingMachine(); // 돈반환

//		view.showDrinks2user(); // 음료수 보여주기.
//		view.returnCoin2VendingMachine(); // 돈반환

//		view.registerNewDrink();
//		view.showDrinks2user();

//		view.deleteExistDrink2VendingMachine();
//		view.showDrinks2user(); // 음료수 보여주기.

//		view.showDrinks2user(); // 음료수 보여주기.
//		view.updateDrinkInfo2VendingMachine();
//		view.showDrinks2user(); // 음료수 보여주기.

//		view.showDrinks2user(); // 음료수 보여주기.
//		view.chooseDrink2VendingMachine();
//	}
}
