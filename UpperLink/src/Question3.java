
public class Question3 extends Thread {
public void run(){
for(int i=1;i<=15;i++){
try {
Thread.sleep(5000);
}
catch(InterruptedException e){
System.out.println(e);
}

System.out.println(i);

}
}
public static void main(String[]args){
Question3 q3 = new Question3();
Question3 q3b = new Question3();
q3.start();
q3b.start();
}
}

    

