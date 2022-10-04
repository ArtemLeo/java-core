public class G04_Methods {

    // Создаем метод с именем function, который принимает один строковой аргумент и возвращает строковое значение.
    // В теле метода, строковой локальной переменной sentence, присваиваем конкатенацию строк и аргумента,
    // используя ключевое слово return, возвращаем значение переменной sentence.

    static String function(String name) {
        String sentence = "Hello " + name + "!";
        return sentence;
    }

    public static void main(String[] args) {

        // В теле метода Main, создаем строковую локальную переменную с именем sentence,
        // присваиваем ей возвращаемое значение метода function, которому в качестве аргумента передаем строку - World.

        String sentence = function("World");
        System.out.println(sentence);
    }
}
