package reviews3.review29;
public class Main {
    public static void main(String[] args){
        KeyInput ki = new KeyInput(); // 1: KeyInputクラスのインスタンス生成
        System.out.print("宛先を入力>");
        String to = ki.readString(); // 2
        System.out.print("件名を入力>");
        String subject = ki.readString(); // 2
        System.out.print("本文を入力>");
        String body = ki.readString(); // 2
        System.out.println(to + "に以下のメールを送信しました。");
        System.out.println("件名: " + subject);
        System.out.println("本文: " + body);
    }
}
