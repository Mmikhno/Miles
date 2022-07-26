public class Main {

    public static void main(String[] args) {

        //переменная для стоимости билета (цена может быть с копейками)
        double costOfticket = 1062.23;
        //рубли для одной бонусной мили
        int oneMile = 20;

        //мили
        int miles;

        miles = (int) costOfticket/oneMile;
        System.out.println("Количество начисленных мили " + miles);

    }
}
