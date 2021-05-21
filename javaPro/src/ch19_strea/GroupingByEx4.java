package ch19_strea;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

class Car {
	private int month;
	private int con; // 입고(1), 출고(2), 반품(3)
	private String car; 
	private int qty;
	private String remark;
	
	public  Car(String s) {
		String[] str = s.split(",");
		String temp = "";
		
		try { temp = str[4]; //반품사유
		} catch(ArrayIndexOutOfBoundsException e) {
			temp = "";
		}
		
		this.month = Integer.parseInt(str[0]);
		this.con = Integer.parseInt(str[1]);
		this.car = str[2];
		this.qty = Integer.parseInt(str[3]);
		this.remark = temp;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}

	
	

	

public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

@Override
	public String toString() {
		return "car [month=" + month + ", con=" + con + ", car=" + car + ", qty=" + qty + ", remark=" + remark + "]";
	}


}



public class GroupingByEx4 {
	static int[] mon = new int[12];
	public static void main(String[] args) throws IOException {
		BufferedReader br
		= new BufferedReader(new FileReader("src/ch19_strea/product.txt"));
		
//		1) 필요한 자료를 collection으로 만든다
		Map<String, Map<Integer, Long>> map = br.lines()
				.map(s -> new Car(s))
//				.map(new::car)?
				.filter(s -> s.getCon()==1) // 생산
				.collect(Collectors.groupingBy(s -> s.getCar(),
						Collectors.groupingBy(s -> s.getMonth(),
								Collectors.summingLong(s -> s.getQty()))));
		
//		2) 형식이 만들어진 collection을 다시 스트림을 이용해 리포트를 만든다
		map.entrySet().stream().forEach( s -> { 
			System.out.println();
			System.out.println("자동차 이름:" + s.getKey());
			System.out.println("1월\t 2월\t 3월\t 4월\t 5월\t 6월\t 7얼\t 8월\t" 
			+ "9월\t 10월\t 11월\t 12월");
			System.out.println("====================================================================================================");
			long[] mon = new long[12];
			
			s.getValue().entrySet().stream().forEach(ss -> {
				mon[ss.getKey()-1] = ss.getValue();
			});
			for (long t : mon) {
				System.out.print("  " + t + "\t");
			}
			System.out.println();
			
	});

	}
}
