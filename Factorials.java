class Factorials{
            
                static int printFactorial (int number, int fact) { 
                    for (int  num=1; num <= number; num = num +1) {
                             fact = fact * num;
                    }
                    return fact;
                }
                 
                public static void main (String []ar) {
                     int numbers[] = {4,8,3,7,2,9,5};

                     for (int index = 0; index < numbers. length; index=index +1) {
                           int resp =printFactorial (numbers[index],1);
                     System.out.println ("Factorial of "+numbers[index]+" is : "+resp);
              }
        }
}

                         