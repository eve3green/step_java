public class OutterQuestion {
    private int id = 5;

    private class InnerClass {
        private void output() {
            System.out.println("Inner class access to a outer class variable" + id);
        }
        private void change()
        {
            id = 6;
            System.out.println(id);
        }
    }

    public void execute(int id)
    {
        InnerClass inn = new InnerClass();
        inn.output();
        inn.change();
    }
}
