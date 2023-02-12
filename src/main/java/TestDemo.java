import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		if(a>0 && b>0) {
			return a+b;
		}else if(a<=0 || b<=0) {
			throw new IllegalArgumentException("Both parameters must be positive");
		}
		return b;
	}
	public int randomNumberSquared(){
		
		return getRandomInt()* getRandomInt();
	}
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
	
	
}

