public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(12);
        PC pc = new PC("111", processor, 12);
        System.out.println(pc);
    }
}
