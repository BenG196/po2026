public class Choinka{
    public static void main(String[] args) {
        String gwiazdka = "*";
        for(int i =1; i <Integer.parseInt(args[0]); i++){
            System.out.println(gwiazdka);
            gwiazdka = gwiazdka + "*";
            }
    }
}