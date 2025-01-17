import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите арабские или римские числа: ");
        String inputStart = scan.nextLine();
        System.out.println("Результат: " + calc(inputStart));  //Выводим (результат (переданного значения))
    }
    public static String calc(String input) throws Exception {
        String value = input;
        value = value.replace(" ", ""); //убираем пробелы в строке
        Arabic arabic = new Arabic();
        Roman roman = new Roman();
        Operator operators = new Operator();

        String[] data = value.split("[+\\-*/]"); //заполняем массив числами ,которые разделены знаками

        if (data.length == 1)
            throw new Exception("строка не является математической операцией");
        if (data.length != 2)
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        if ((roman.isRoman(data[0]) == true && roman.isRoman(data[1]) == false) || (roman.isRoman(data[0]) == false) && (roman.isRoman(data[1]) ==true)){
            throw new Exception("используются одновременно разные системы счисления");
        }

        String oper = operators.oper(value);  //передаем строку для получения оператора

        if ((roman.isRoman(data[0]) || roman.isRoman(data[1])) == false) {
            return arabic.resultArabic(data,oper);
        }
         else if ((roman.isRoman(data[0]) && roman.isRoman(data[1])) == true) {
            int num1 = roman.convertArabic(data[0]);
            int num2 = roman.convertArabic(data[1]);
            if (num1 > 10 || num1 < 1 || num2 > 10 || num2 < 1) {
                throw new Exception("На вход принимаются числа от 1 до 10 включительно, не более");
            }
            return roman.convertRoman(arabic.resultRoman_Arabic(num1, num2, oper));
        }

        return null;
    }


}