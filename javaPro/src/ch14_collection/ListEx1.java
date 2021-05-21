package ch14_collection;
//21번 처리한다고 해서 데이터가 바뀌지 않는다. 어떤 걸 하겠다는 거지 아무것도 리턴하지 않았기 때문에 바꾸지 않는다. 가져와서 프린트는 가능하다.
//리스트 자체를 바꾸고 싶으면 24번 처럼
//소트도 할 수 있다

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//
//인티저이기 때문에 바로 소트가 가능하다. ->인티거는 컴페어러블을 가지고 잇다.
public class ListEx1 {

	public static void main(String[] args) {
		//<Integer> : 제너릭 표현
//		List<Integer> : Integer 객체를 리스트에 저장함.
//		ArrayList : 가변배열. 저ㅏㅇ할 갯수를 몰라도 객체를 저장.
//					첨자 사용 가능
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(5);list.add(4);
		list.add(3);list.add(0);list.add(0);
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i + ":" + list.get(i));} //배열의 arr[0] 같은 거
//			list.subList(1, 4);// : list 객체의 1번 인덱스부터 3번인덱스까지 부분리스트로 리턴
//			System.out.println(list.subList(1, 4));
			
			List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
			System.out.println(list2);
			//list2를 정렬
			//Collections : Collection 프레임워크에 관련된 추가 기능을 멤버로 가진 클래스
			Collections.sort(list2); //list2 List 객체를 정렬.
			
			System.out.println(list2);
		}

	}

