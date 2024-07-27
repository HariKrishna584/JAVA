class Bike {
public static void mirror(){
System.out.println(" method n is call");
horn();

}
public static void horn(){
System.out.println("make noise");
mirror();
}
public static void main(String[] args){
	mirror();
}
}