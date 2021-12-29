class Vegetables
{
static String[] items = {"chilly","potato","tomato","curry leaves","coriender","capsicum","onion","cabbage","raddish","carrot"};
 static void printAll () {
               for (int index = 0; index<items.length;index++) {
                  System.out.print(items[index]+"/t");
               }
}
          static void nextline () {
           int  num = 1;
           for (int index = 0; index<items.length;index++) {
                 if (num == 10) {
         System.out.println("");
         }
          num++;
       }
}

               public static void main(String[] agr) {
                    printAll();
               items[2] = "tomato";
                nextline();
                printAll();
    }
}












   