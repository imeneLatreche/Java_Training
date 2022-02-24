
public class ClassTwo {
	ClassTwo (){
		this (5);
		System.out.println("This is the default constructor");
	}
	ClassTwo(int x){
		this ("Hello");
		System.out.println("This the constructor that takes an integer, and your integer is:"+ x);
	}
	ClassTwo(String s){
		System.out.println(s);
	}
}
