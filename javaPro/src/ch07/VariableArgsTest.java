package ch07;

public class VariableArgsTest {

	public void add(int... params) {
		int sum = 0;
		for (int i : params) {
			sum += i;
		}
		System.out.printf("파라미터 개수: %d, 총합: %d%n",params.length,sum);
	}
	public static void main(String... args) { //-> 이거를 가변인자라고 표현한데. 뭔지 모르겠지. 공부해봐야지 그니
		VariableArgsTest vt = new VariableArgsTest();
		vt.add(1, 2, 3, 4, 5);
		vt.add(1, 2, 3);
		vt.add();
}
}