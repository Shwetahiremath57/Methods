class Bikes
{
static String[] items = {"KTM","BMX","BMW Motorrad","Royal Enfield","Yamaha MT 15","Pulsar rs 200","Duke","TVS Apache","Hero honda","Bajaj platina"};
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
               items[2] = "Royal Enfield";
                nextline();
                printAll();
    }
}












   