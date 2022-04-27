public class Person1 {
    private float weight;
    private float height;
    private int age;
    private String name;
    Person1(){
        this.height = 5.5f;
    }
    public void setweight(float weight){
        this.weight = weight;
    }
    public float getweight(){
        return weight;
    }
    public float getheight(){
        return height;
    }
    public void setheight(float height){
        this.height = height;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public static void main(String[] args){
        Person1 p1 = new Person1();
        p1.setweight(50.0f);
        p1.setAge(21);
        p1.setname("Hari");

        Person1 p2 = new Person1();
        p2.setweight(55.0f);
        p2.setAge(22);
        p2.setname("chandu");

        System.out.println(p1.getAge());
        System.out.println(p1.getname());
        System.out.println(p1.getweight());
        System.out.println(p1.getheight());

        System.out.println(p2.getAge());
        System.out.println(p2.getname());
        System.out.println(p2.getweight());
        System.out.println(p2.getheight());
    }

}
