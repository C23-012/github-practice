public class sample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        if (b == 0) {//例外処理
            System.out.println("エラー: 0で割ることはできません。");
        } else {
            System.out.println(a / b);
        }
    }
}