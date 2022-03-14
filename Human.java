public class Human extends LivingThing{
    public void walk(){
        System.out.println("Human walks...");
    }
    public static void main(String[] args){
        Human manusia = new Human();
 
        manusia.breath();
        manusia.eat();
        manusia.walk();
    }
}