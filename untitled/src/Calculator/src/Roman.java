 class Roman {

     String[] arrayRoman = new String[]{"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI",
             "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII",
             "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII",
             "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV",
             "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII",
             "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI",
             "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

     public boolean isRoman(String val) {//проверяем есть ли римское число в списке
         for (int i = 0; i < arrayRoman.length ; i++) {
             if(val.equals(arrayRoman[i])){
                 return true;   //да -> выполняем методы ниже
             }

         }
         return  false;  //нет -> уходим отсюда и выполняем арабское счисление
     }

     public int convertArabic(String roman){   //передаем римское число и возвращает арабское (индекс римского == арабскому значению)
         for (int i = 0; i < arrayRoman.length; i++) {
             if(roman.equals(arrayRoman[i])){
                 return i;
             }
         }
         return -1;
     }
     public String convertRoman(int arabic){  //передает арабское число и возвращаем римское по индексу (индекс == нужному рискому числу)
         return arrayRoman[arabic];
     }


 }

