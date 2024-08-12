package com.Nikhil.access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num; // type casting of the object is done here
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
//        ObjectDemo obj = new ObjectDemo(34);
//        ObjectDemo obj2 = new ObjectDemo(34);
//        ObjectDemo obj3 = obj;
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
//        System.out.println(obj3.hashCode());

        ObjectDemo obj1 = new ObjectDemo(12, 78.9f);
        ObjectDemo obj2 = new ObjectDemo(12, 45.4f);

        if(obj1 == obj2){
            System.out.println("obj1 is equal to obj2");
        }

        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }

        System.out.println(obj1.getClass());
    }
}
