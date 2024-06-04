// import java.util.ArrayList;
// import java.util.Scanner;

// class Animal {
//     String name;
//     int lifeExpect;
//     int age;
//     boolean IsAlive = true;

//     Animal(String name, int lifeExpect){
//         this.name = name;
//         this.lifeExpect = lifeExpect;

//         System.out.printf("%s was born with life expectancy %d year(s)\n", name, lifeExpect - age);
//     }
//     void live(int year){
//         if(this.age == lifeExpect){
//             System.out.printf("%s died earlier\n", this.name);
//             return;
//         }

//         if(this.age + year<lifeExpect){ // ยังมีชีวิตอยู่
//             if(year==1){
//                 System.out.printf("%s lived %d more year\n",this.name, year);
//             }
//             else {
//                 System.out.printf("%s lived %d more years\n",this.name, year);
//             }
//             this.age += year;
//         }
//         else if(this.age + year>=lifeExpect){ // ใช้ชีวิตแล้วตาย
//             if(this.lifeExpect-age==1){
//                 System.out.printf("%s lived %d more year and died\n",this.name, this.lifeExpect - age);
//             }
//             else {
//                 System.out.printf("%s lived %d more years and died\n",this.name, this.lifeExpect - age);
//             }
//             IsAlive = false;
//             this.age = lifeExpect;
//             //this.age = this.lifeExpect - year;
            
//         }
        
//     }
//     boolean isAlive(){
//         if(IsAlive){
//             System.out.printf("%s is alive\n", this.name);
//             return true;
//         }
//         else {
//             System.out.printf("%s is dead\n", this.name);
//             return false;
//         }
//     }
// }

// public class AnimalDomain1 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int N = scan.nextInt();

//         ArrayList<Animal> animal = new ArrayList<Animal>();
//         for (int i = 0; i < N; ++i) {
//             int type = scan.nextInt();
//             if (type == 1) {
//                 String name = scan.next();
//                 int lifeExpect = scan.nextInt();
//                 animal.add(new Animal(name, lifeExpect));
//             }
//             else if (type == 2) {
//                 int id = scan.nextInt()-1;
//                 int year = scan.nextInt();
//                 animal.get(id).live(year);
//             }
//             else if (type == 3) {
//                 int id = scan.nextInt()-1;
//                 animal.get(id).isAlive();
//             }
//         }
//     }
// }