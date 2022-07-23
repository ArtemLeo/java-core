public class E02_Port {
    // Побитовые логические операции. (&, |)

    // Например:
    // Мы имеем порт ввода/вывода или регистр с определенным значением в нем.
    // Нам необходимо включить устройство управляемое первым битом, установив первый бит в 1.
    // После нам потребуется выключить устройство, сбросив первый бит в 0.
    //  0 1 1 1   0 0 0 0  -  начальное значение порта ввода/вывода.
    //  7 6 5 4   3 2 1 0  -  нумерация битов управления устройствами.

    public static void main(String[] args) {
        byte port = 0b1110000;     // 0 1 1 1   0 0 0 0  -  начальное значение порта ввода/вывода.
        byte mask = 0b0000010;     // 0 0 0 0   0 0 1 0  -  маска включения устройства управляемого первым битом.
        System.out.println("port = " + port); // ситуация с лампочкой в комнате

        port = (byte)(port | mask);  // Включить устройство управляемое первым битом.
        System.out.println("port = " + port);

        mask = 0b1111101;          // 0 1 1 1   1 1 0 1  -  Создаем маску выключения устройства управляемого первым битом.

        port = (byte)(port & mask);  // Выключить устройство управляемое первым битом.
        System.out.println("port = " + port);
    }
}
