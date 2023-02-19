public class Homework_02 {

    public static void main(String[] args) {

        // Щоб перевести рядок у тип даних double, можна використати метод Double.parseDouble().
        // використовується метод replaceAll("[^0-9.,]+", ""), щоб видалити з рядка всі символи, окрім цифр, коми та крапки.
        // метод replace(',', '.'), щоб замінити кому на крапку для коректної конвертації в double.


        String str1 = "25,287 USDT"; // Перше стрінгове значення
        double num1 = Double.parseDouble(str1.replaceAll("[^0-9.,]+", "").replace(',', '.'));
        System.out.println(num1); // Вивід в консоль

        String str2 = "546,888098761 BTC"; // Друге стрінгове значення
        double num2 = Double.parseDouble(str2.replaceAll("[^0-9.,]+", "").replace(',', '.'));
        System.out.println(num2); // Вивід в консоль

        String str3 = "975,287 XRP"; // Третє стрінгове значення
        double num3 = Double.parseDouble(str3.replaceAll("[^0-9.,]+", "").replace(',', '.'));
        System.out.println(num3); // Вивід в консоль

        String str4 = "5,1 USD"; // Четверте стрінгове значення
        double num4 = Double.parseDouble(str4.replaceAll("[^0-9.,]+", "").replace(',', '.'));
        System.out.println(num4); // Вивід в консоль
        // Щоб визначити середню арифметичну з чотирьох значень double, потрібно додати ці значення разом та розділити їх на кількість чисел
        double avg = (num1 + num2 + num3 + num4) / 4;
        System.out.println("Середня арифметична: " + avg);
        // Щоб перевести значення типу double у стрінгове значення, можна використати метод Double.toString().
        String strAvg = Double.toString(avg);
        System.out.println("Результат у стрінговому форматі: " + strAvg);
        // Використання методу Integer.parseInt()
        int intValue1 = Integer.parseInt(strAvg.substring(0, strAvg.indexOf('.')));
        System.out.println("Значення у типі int: " + intValue1);
        // Використання методу Double.intValue()
        int intValue2 = (int) avg;
        System.out.println("Значення у типі int: " + intValue2);





    }
}
