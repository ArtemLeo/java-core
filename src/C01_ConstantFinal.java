 class C01_ConstantFinal {
    public static void main(String[] args) {
     
        // Создаем константу с именем A, типа double и присваиваем ей значение 3.1415
     
        final double A = 3.1415;

        // Выводим значение константы - A, на экран.

        System.out.println("Pi = " + A + " always");
        System.out.println("Число ПИ = " + A + " всегда");
     
        // Попытка присвоения константе нового значения, приводит к ошибке уровня компиляции!

        // A = 2.71828183;
    }
}

