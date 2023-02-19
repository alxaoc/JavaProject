public class Homework_02 {
    public static void main(String[] args) {

        // метод replaceAll("[^0-9\\.,]+", ""), щоб видалити з рядка всі символи, окрім цифр, коми та крапки,
        // і метод replace(',', '.'), щоб замінити кому на крапку для коректної конвертації в double
        String str1 = "25,287 USDT";
        double num1 = Double.parseDouble(str1.replaceAll("[^0-9.,]+", "").replace(',', '.'));
        System.out.println(num1);

        String str2 = "546,888098761 BTC";
        double num2 = Double.parseDouble(str2.replaceAll("[^0-9.,]+", "").replace(',', '.'));
        System.out.println(num2);

        String str3 = "975,287 XRP";
        double num3 = Double.parseDouble(str3.replaceAll("[^0-9.,]+", "").replace(',', '.'));
        System.out.println(num3);

        String str4 = "5,1 USD";
        double num4 = Double.parseDouble(str4.replaceAll("[^0-9.,]+", "").replace(',', '.'));
        System.out.println(num4);

        // Пизначити середню арифметичну з чотирьох значень double, потрібно додати ці значення разом та розділити їх на кількість чисел
        double avg = (num1 + num2 + num3 + num4) / 4;
        System.out.println("Середня арифметична: " + avg);
        // Перевести значення типу double у стрінгове значенн
        String strAvg = Double.toString(avg);
        System.out.println("Результат у стрінговому форматі: " + strAvg);

        // Використання методу Integer.parseInt(), який перетворює стрінгове значення у тип даних int.
        int intValue1 = Integer.parseInt(strAvg.substring(0, strAvg.indexOf('.')));
        System.out.println("Значення у типі int: " + intValue1);
        // Використання методу Double.intValue(), який повертає цілу частину значення типу double у типі даних int.
        int intValue2 = (int) avg;
        System.out.println("Значення у типі int: " + intValue2);



    }
}
