public class TestForInner {
    private int id = 4;
    public static void main(String[] args) {
        TestForInner test = new TestForInner();
        OutterQuestion outter = new OutterQuestion();
        outter.execute(/*but no id*/test.id);
    }
    // Внутрішній клас прив'язаний до того блоку, в якому він об'явлений, по суті - до зовнішнього класу,
    // а в сутності - до його екземпляру і до часу роботи цього блоку. І не може змінити цю змінну, хоча має до неї доступ
    // навіть з модифікатором private, бо це попереджує помилку, коли ми намагаємось змінити значення метода, який вже
    // може не виконуватись.
}
