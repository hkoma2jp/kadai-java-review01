
public class Review01 {

    public static void main(String[] args) {
        // 商品価格を入力
        int price = 777;
        // 税込価格の算出
        int amount = price + tax(price);
        // 出力
        System.out.println(price + "円の商品の税込価格は" + amount + "円（消費税は" + (int)tax(price) + "円）です。");
    }

    public static int tax(int price) {
        // 税率を設定
        double rate = 0.1;
        // 消費税額（小数点以下切り捨て）
        int tax = (int)(price * rate);
        return tax;
    }

}
