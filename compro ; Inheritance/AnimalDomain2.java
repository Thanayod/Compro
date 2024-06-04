import java.util.ArrayList;
import java.util.Scanner;

class Animal1 {
    String name;
    int lifeExpect;
    int age;
    boolean IsAlive = true;

    Animal1(String name, int lifeExpect){
        this.name = name;
        this.lifeExpect = lifeExpect;

        System.out.printf("%s was born with life expectancy %d year(s)\n", name, lifeExpect - age);
    }

    void live(int year){
        if(this.age == lifeExpect){
            System.out.printf("%s died earlier\n", this.name);
            return;
        }

        if(this.age + year<lifeExpect){ // ยังมีชีวิตอยู่
            if(year==1){
                System.out.printf("%s lived %d more year\n",this.name, year);
            }
            else {
                System.out.printf("%s lived %d more years\n",this.name, year);
            }
            this.age += year;
        }
        else if(this.age + year>=lifeExpect){ // ใช้ชีวิตแล้วตาย
            if(this.lifeExpect-age==1){
                System.out.printf("%s lived %d more year and died\n",this.name, this.lifeExpect - age);
            }
            else {
                System.out.printf("%s lived %d more years and died\n",this.name, this.lifeExpect - age);
            }
            IsAlive = false;
            this.age = lifeExpect;
            //this.age = this.lifeExpect - year;
            
        }
        
    }

    boolean isAlive(){
        if(IsAlive){
            System.out.printf("%s is alive\n", this.name);
            return true;
        }
        else {
            System.out.printf("%s is dead\n", this.name);
            return false;
        }
    }

    void vaccine(){
        System.out.printf("%s’s life expectancy is now %d year(s)\n",name, lifeExpect);
    }

}
class Dog extends Animal1{
    Dog(String name){
        super(name, 8);
    }
    
    @Override
    void vaccine(){
        lifeExpect = lifeExpect * 2;
        super.vaccine();
    }
}
class Turtle extends Animal1{
    Turtle(String name){
        super(name, 50);
    }
}
class Salmon extends Animal1{
    Salmon(String name){
        super(name, 4);
    }
}

public class AnimalDomain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        ArrayList<Animal1> animal = new ArrayList<Animal1>();
        // Dog d = new Dog("Dang");
        //animal.add(d);
        for (int i = 0; i < N; ++i) {
            int type = scan.nextInt();
            if (type == 1) {
                int t = scan.nextInt();
                String name = scan.next();
                if(t == 1){
                    Dog d = new Dog(name);
                    animal.add(d);
                }
                else if(t == 2){
                    Turtle tur = new Turtle(name);
                    animal.add(tur);
                }
                else if(t == 3){
                    Salmon s = new Salmon(name);
                    animal.add(s);
                }
            }
            else if (type == 2) {
                int id = scan.nextInt()-1;
                int year = scan.nextInt();
                animal.get(id).live(year);
            }
            else if (type == 3) {
                int id = scan.nextInt()-1;
                animal.get(id).isAlive();
            }
            else if(type == 4){
                int id = scan.nextInt()-1;
                animal.get(id).vaccine();
            }
        }
    }
}
