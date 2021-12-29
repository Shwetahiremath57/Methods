class Colours{
	static String[] items = {"red","green","blue","orange","gray","pink","purple","black","brown","white"};
	 static void printAll(){
              	 for(int index = 0;index<items.length;index++) {
                  System.out.println(items[index]);
               }
}
 	public static void main( String [] ar){
  	printAll();
  	items[4]="gray";
 	 printAll();
             }
}












   