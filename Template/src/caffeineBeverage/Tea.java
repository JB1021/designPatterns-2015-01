package caffeineBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("차를 우려내는 중...");
	}

	@Override
	void addCondiments() {
		System.out.println("레몬을 추가하는 중...");
	}

	@Override
	public boolean customerWantsCondiments(){
	
		String answer = null;
		System.out.println("레몬을 추가할까요?(y/n)");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(answer.toLowerCase().startsWith("y")){
			return true;
		}
		return false;	
	}
}
