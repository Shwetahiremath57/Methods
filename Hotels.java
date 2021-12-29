class Hotels
{
static String[] items = {"coffee","tea","idli","vada","dosa","maggie","vangibath","puri","uppit","masaldosa"};
 static void printAll () {
               for (int index = 0; index<items.length;index++) {
                  System.out.print (items[index]+"\t");
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
               items[2] = "idli vada";
                nextline();
                printAll();
    }
}












   