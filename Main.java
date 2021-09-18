public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(80, 176);
        System.out.printf("%.1f", index);
// мне показалось, что если выводить индекс в целых числах,
// то результат будет не совсем точным, однако простыню знаков
// после запятой мне тоже не особо хотелось выводить
// по этому погуглил как это можно исправить =)
    }
}
