import ru.netology.sqr.SQRService;

public class main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int box = service.calc(200, 300);
        System.out.println("Результат: " + box);
    }
}
