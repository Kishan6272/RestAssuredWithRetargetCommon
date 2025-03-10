package DataShare;

public class ThreadLocalExample {
    public static void main(String[] args) {

        ThreadLocal counter1=new ThreadLocal();

        counter1.set("kishan");

        String name=(String) counter1.get();
        System.out.println(name);
        counter1.remove();

        System.out.println( counter1.get());


        ThreadLocal counter2=ThreadLocal.withInitial(()-> "mukesh");


        System.out.println((String) counter2.get());


        ThreadLocal<String> counter3=new ThreadLocal<>();

        counter3.set("Animesh");

        System.out.println(counter3.get());
    }
}
