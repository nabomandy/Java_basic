package ch12_API;

public class ClassEx1 {
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.num=99;
		System.out.println(s);
		String classname = "ch12_API.Sample";
		try {	Class<?> c = Class.forName(classname);
		Sample e = (Sample) c.newInstance();
		e.num=10;
		System.out.println(e);
		Sample e2 = (Sample) c.newInstance();
		e2.num=6666;
		System.out.println(e2);
		}	catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 	catch (InstantiationException e1) {
			e1.printStackTrace();
		}	catch (IllegalAccessException e1) {
			e1.printStackTrace();}
		}
	}
	
class Sample {
	int num;
	@Override
	public String toString() {
		return num+"";
	}}
