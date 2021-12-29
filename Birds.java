class Birds{
	static String[] items = {"hen","duck","parrot","pigeon","peacock","gull","dove","bat","swan","crow"};
	 static void printAll(){
              	 for(int index = 0;index<items.length;index++) {
                  System.out.println(items[index]);
               }
}
 	public static void main( String [] ar){
  	printAll();
  	items[4]="peacock";
 	 printAll();
             }
}












   