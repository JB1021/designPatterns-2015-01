package caffeineBeverage;

public class Coffee extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("커피를 우려내는 중...");
	}

	@Override
	void addCondiments() {
		System.out.println("설탕을 추가하는 중...");
	}

}
