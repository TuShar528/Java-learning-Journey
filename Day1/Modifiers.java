class Modifiers{
    public int a = 5;
    static void Present(int n){
         Modifiers obj = new Modifiers();
         System.out.print(obj.a + n);
    }
    public static void main(String[] args){
        Present(5);
    }
}

// Modifiers -- Access and Non Access Modifirs
//Access -- Public, Private ,Protected , default
//non -Access - Final,Static