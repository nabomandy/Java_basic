package ch09_interface;
//인터페이스 오버라이딩 소스
interface RemoteControl1 {}
interface RemoteControl {
	void turnOn();
	void turnOff();
	void setVolume(int volumn);
	default void setMute(boolean state) {
		if(state) System.out.println("무음 처리합니다.");
		else System.out.println("무음을 해제합니다."); }
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");	}}

// class Television implements RemoteControl, RemoteControl1
// class Audio implements RemotsControl

//class Television {

class Television implements RemoteControl, RemoteControl1 {
	int num=0;
	@Override
	public void turnOn() {System.out.println("TV를 켭니다.");}
	@Override
	public void turnOff() {System.out.println("TV를 끕니다.");}
	@Override
	public void setVolume(int volumn) {
		System.out.println("TV의 볼륨을" + volumn + "으로 설정합니다");	}}

class Audio implements RemoteControl {
	@Override
	public void turnOn() {System.out.println("Audio를 켭니다.");}
	@Override
	public void turnOff() {System.out.println("Audio를 끕니다.");	}
	@Override
	public void setVolume(int volumn) {
	System.out.println("Audio의 볼륨을" + volumn + "으로 설정합니다");	}}
	
public class Exam3 {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		Television r1 = new Television();
		r1.num=8;
		r1.turnOff();
		r1.turnOn(); // TV를 켭니다. // TV의 볼륨을 10으로 설정합니다. //TV를 끕니다.
		rc.setVolume(10); 		rc.turnOff();; rc.setMute(true);// AUDIO를 무음처리합니다.
		rc = new Audio();
		rc.turnOn(); // Audio를 켭니다.
		rc.setVolume(20); // Audio의 볼륨을 20으로 설정합니다.
		rc.turnOff(); // Audio를 끕니다.
		rc.setMute(false); // 무음을 해제합니다.
		RemoteControl.changeBattery(); // 건전지를 교환합니다.
	}

}
