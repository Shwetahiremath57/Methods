class Fruits{
	static String[] items = {"mango","apple","gava","orange","blue berry","strawberry","custard apple","cherry","jack fruit","bananna"};
	 static void printAll(){
              	 for(int index = 0;index<items.length;index++) {
                  System.out.println(items[index]);
               }
}
 	public static void main( String [] ar){
  	printAll();
  	items[4]="strawberry";
 	 printAll();
             }
}



