package ch14_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class HashMapEx3 {
	static HashMap<String, HashMap<String, String>> phoneBook = new HashMap();
	
	public static void main(String[] args) {
		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "김자바", "010-222-2222");
		addPhoneNo("친구", "김자바", "010-333-3333");
		addPhoneNo("회사", "이자바", "010-444-4444");
		addPhoneNo("회사", "이자바", "010-555-5555");
		addPhoneNo("회사", "이자바", "010-666-6666");
		addPhoneNo("회사", "이자바", "010-777-7777");
		addPhoneNo("세탁", "010-888-8888");
//		System.out.println(phoneBook);
		printList();
		
	}
	
//	그룹에 전화번호를 추가하는 메서드
	private static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap<String, String> group = phoneBook.get(groupName);//->키로 벨류	를 가져오는 겟
		group.put(tel, name); //이름은 중복될 수 있으니 전화번호를 key로 저장한다.		
	}
	static void addPhoneNo(String name, String tel) { //오버로딩
		addPhoneNo("기타", name, tel);
		}
//		그룹을 추가하는 메서드<String, HashMap>
		
		static void addGroup(String groupName) {
			if(!phoneBook.containsKey(groupName))
				phoneBook.put(groupName, new HashMap<String, String>());
			}
		
		static void printList() {
//			phoneBook.entrySet()--->set.iterator()--->Iterator(반복자)
//			Set<Map.Entry<String, HashMap<String, String>>> set = phoneBook.entrySet();
			Iterator<Map.Entry<String, HashMap<String, String>>>
			itp = phoneBook.entrySet().iterator();
//			itp = set.iterator();
			while(itp.hasNext()) {
				Map.Entry<String, HashMap<String, String>> e=itp.next();
				System.out.println(" * " + e.getKey() + "["+e.getValue().size()+"]");
			System.out.println(e.getValue());
//				System.out.println(itp.next());
				
			Iterator<Map.Entry<String, String>> subit =
					e.getValue().entrySet().iterator();
			while(subit.hasNext()) {
				Map.Entry<String, String> se = subit.next();
				System.out.println(se.getValue()+ "=" +se.getKey());
			}
		}
	}
}  //class
