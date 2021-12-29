class Animals{
	static String[] items = {"cow","lion","panda","cat","dog","deer","elephant","tiger","rabbit","camel"};
	 static void printAll(){
              	 for(int index = 0;index<items.length;index++) {
                  System.out.println(items[index]);
               }
}
 	public static void main( String [] ar){
  	printAll();
  	items[4]="dog";
 	 printAll();
             }
}












   