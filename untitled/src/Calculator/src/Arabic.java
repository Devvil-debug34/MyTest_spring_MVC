 class Arabic {
    public String resultArabic(String[] val, String oper) throws Exception {

         String[] data = val;  //тут храним массив двух значений
         String action = oper;  //тут храним знак разделитель
         int res1;
         String res2;

         if (Integer.parseInt(data[0]) < 1 || Integer.parseInt(data[0]) > 10 || Integer.parseInt(data[1]) < 1 || Integer.parseInt(data[1]) > 10) {
             throw new Exception("На вход принимаются числа от 1 до 10 включительно, не более");
         }

         if (action.equals("+")) {
             res1 = Integer.parseInt(data[0]) + Integer.parseInt(data[1]);
             res2 = String.valueOf(res1);
             return res2;
         } else if (action.equals("-")) {
             res1 = Integer.parseInt(data[0]) - Integer.parseInt(data[1]);
             res2 = String.valueOf(res1);
             return res2;
         } else if (action.equals("*")) {
             res1 = Integer.parseInt(data[0]) * Integer.parseInt(data[1]);
             res2 = String.valueOf(res1);
             return res2;
         } else if (action.equals("/")) {
             res1 = Integer.parseInt(data[0]) / Integer.parseInt(data[1]);
             res2 = String.valueOf(res1);
             return res2;
         }
         return null;
     }

     public int resultRoman_Arabic(int a, int b, String oper) throws Exception {
         if (oper.equals("+")) {
             int res = a + b;
             return res;
         } else if (oper.equals("-")) {
             int res = a - b;
             if(res <= 0){
                 throw new Exception("в римской системе нет отрицательных чисел");
             }
             return res;
         }else if (oper.equals("*")){
             int res = a * b;
             return res;
         }else if (oper.equals("/")){
             int res = a/b;
             if(res <= 0){
                 throw new Exception("в римской системе нет отрицательных чисел");
             }
             return res;
         }

         return 0;

     }
 }





