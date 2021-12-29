class Names{
	static String[] items = {"pooja","manjula","muskan","shweta","nisargha","rani","raji","soumya","deepa","radikha"};
	 static void printAll(){
              	 for(int index = 0;index<items.length;index++) {
                  System.out.println(items[index]);
               }
}
 	public static void main( String [] ar){
  	printAll();
  	items[4]="nisargha";
 	 printAll();
             }
}












   