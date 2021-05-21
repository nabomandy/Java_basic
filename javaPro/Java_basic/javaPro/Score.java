import java.util.Scanner;
 
public class Score {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private float avg;
    
    
    public Score() {//초기화
        kor=eng=math=total=0;
        avg=0.f;
    }
    
    public Score(String n,int k, int e, int m) {
        name= n;
        kor= k;
        eng= e;
        math =m;
        total = kor+eng+math;
        avg = total/3.f;
    }
    
    //setter getter 만들어준다
    public void setName(String n) {name = n;}
    public String getName() {return name;}
    
    public void setKor(int k) {kor = k;}
    public int getKor() {return kor;}
    
    public void setEng(int e) {eng = e;}
    public int getEng() {return eng;}
    
    public void setMath(int m) {math = m;}
    public int getMath() {return math;}
    
    public int Total() {return kor + eng + math;}
    
    public float Avg() {return (kor + eng + math)/3.f;}
 
    
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        
        
        System.out.println("몇사람 ?");
        num = sc.nextInt();//몇사람일지 결정
        
        
        Score [] sco = new Score[num];//배열 메모리 할당
        
        
        for(int i =0;i<sco.length;i++) {
            sco[i] = new Score();
            
            System.out.println("이름적으세요");    
            sco[i].setName(sc.next());
            
            System.out.println("국어 적으세요");
            sco[i].setKor(sc.nextInt());
            
            System.out.println("영어 적으세요");
            sco[i].setEng(sc.nextInt());
            
            System.out.println("수학 적으세요");
            sco[i].setMath(sc.nextInt());
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");}
        
        
        for(int i =0;i<sco.length;i++) {
            System.out.println("이름 :"+sco[i].getName());
            System.out.println("국어 :"+sco[i].getKor());
            System.out.println("영어 :"+sco[i].getEng());
            System.out.println("수학 :"+sco[i].getMath());
            System.out.println("총점 :"+sco[i].Total());
            System.out.println("평균 :"+sco[i].Avg());
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");}
        
        
        
 
    }
 
}