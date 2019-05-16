package lambda;

public class LambdaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operationable operation=(x,y)->(x+y);
		
		int result=operation.calculate(2, 3);
		System.out.println(result);
	}

}
