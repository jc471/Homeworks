
public class Dog {
 String breed;
 int age;
 String name;
	
 public Dog(String breed, int age, String name){
 this.breed = breed;
 this.age= age;
 this.name= name;}
 
 public void speak(){
	 System.out.println("woof");}

 public static int dogYear(Dog a){
   return a.age*7;}

 public int myAge(){
	 return this.age*7;}
 
 public static void sitDog(Dog[] dogs){
    for (int i=0;i<dogs.length; i++){
	System.out.println(dogs[i].name+"! sit!");
    }
 }
    public static void main(String[]args){
    	Dog tdog = new Dog("yourkie", 8,"Bob");
    	System.out.println("How old are you in dog years?");
    	for(int i=0; i<tdog.myAge();i++){
    	      tdog.speak();
  	
  }  
    }
}



