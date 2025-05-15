public class Main extends  Thread{
    public static void main(String[] args) {
        int core = Runtime.getRuntime().availableProcessors();
        System.out.println(core);
    }
}
