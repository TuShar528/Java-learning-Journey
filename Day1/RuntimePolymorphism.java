class A{
    void show(){
        System.out.print("A show");
    }
}
class B extends A{
    void show(){
        System.out.print("B show");
    }
    void display(){
        System.out.print("displayed");
    }
}
class RuntimePolymorphism{
    public static void main(String[] args){
        A obj = new B(); 
        obj.show();// B show
        obj.display(); //error because reference type A does not have display function
        // reference type decide karta hai kisko access dena hai
        // obj B ka hai wo batayega ki run kya hoga
    }
}