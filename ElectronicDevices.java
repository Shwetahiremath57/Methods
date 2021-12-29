class Electronicdevices{
	static String[] items = {"TV","laptop","fridge","oven","grinder","mobile","iron box","washing machine","digital clock","radio"};
	 static void printAll(){
              	 for(int index = 0;index<items.length;index++) {
                  System.out.println(items[index]);
               }
}
 	public static void main( String [] ar){
  	printAll();
  	items[6]="iron box";
 	 printAll();
             }
}












   