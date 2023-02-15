public class Homework_01 {
    public static void main(String[] args) {

        String proProcess = "«Виробничий процес WPT»";
        System.out.println(proProcess);

        int engineer1 = 8;
        int engineer2 = 12;
        int engineer3 = 4;

        int totalDays = engineer1 + engineer2 + engineer3; //Загальна кількість днів
        System.out.println("Загальна кількість днів: " + totalDays + ".");

        // Середня продуктивність праці = загальна кількість регресійних тестів / загальна кількість робочих днів.

        int totalTests = 1; // загальна кількість регресійних тестів
        System.out.println("Загальна кількість тестів: " + totalTests + ".");

        double averageProductivity = (double) totalTests / totalDays;
        System.out.println("Середня продуктивність праці: " + averageProductivity + " тестів на день.");

        double avePro1 = (double) engineer1 / totalDays * 100;   // Середня продуктивність праці 1 інженера
        System.out.println("Середня продуктивність праці 1 інженера: " + avePro1 + "% відсртків від загальної кількості днів.");

        double avePro2 = (double) engineer2 / totalDays * 100;   // Середня продуктивність праці 2 інженера
        System.out.println("Середня продуктивність праці 2 інженера: " + avePro2 + "% відсртків від загальної кількості днів.");

        double avePro3 = (double) engineer3 / totalDays * 100;   // Середня продуктивність праці 3 інженера
        System.out.println("Середня продуктивність праці 3 інженера: " + avePro3 + "% відсртків від загальної кількості днів.");

        System.out.println("Всім дякую! Гароного дня ;)");
        System.out.println("Дякую! :-)");
    }
}
