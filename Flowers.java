class Flowers
{
static String[] items = {"Rose","Jasmeen","Lilly","Sunflower","Hibiscus","Tulip","Lotus","Lavender","Daisy","Aster"};
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
               items[2] = "Lilly";
                nextline();
                printAll();
    }
}












   