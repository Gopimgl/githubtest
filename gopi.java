public class Threads extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("this is the child thread");
        }
    }
}
class mgh{
    public static void main(String[] args){
       // String a="gopi";
       // System.out.println("gopi"+1);
       Threads r=new Threads();
      //Thread t=new Thread();
       r.start();
        for (int i=0;i<10;i++){
            System.out.println("this is the main thread");
        }
        System.out.println("this is main thread externally");
    }
}
