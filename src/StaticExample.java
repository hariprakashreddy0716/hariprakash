

public class StaticExample {
    static int a;
     int a2;
    static void show(){
        StaticExample obj = new StaticExample();
        obj.a2 = 6;
        a= 9;
//       a2 =7;
        System.out.println("from static function");
    }

    public static void main(String[] args) {
        StaticExample obj= new StaticExample();
        obj.show();
        show();
        StaticExample.show();

        obj.a = 3;
        obj.a2 = 8;
        StaticExample obj2 = new StaticExample();
        obj2.a =7;
        obj2.a2=5;

        System.out.println(obj.a); 
        System.out.println(obj.a2); 

        System.out.println(obj2.a); 
        System.out.println(obj2.a2);

        System.out.println(StaticExample.a);

    }

}
