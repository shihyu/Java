package cc.openhome;

public class Game {
    public static void play(int action) {
        switch(action) {
            case Action.STOP:
                System.out.println("播放停止動畫");
                break;
            case Action.RIGHT:
                System.out.println("播放向右動畫");
                break;
            case Action.LEFT:
                System.out.println("播放向左動畫");
                break;
            case Action.UP:
                System.out.println("播放向上動畫");
                break;
            case Action.DOWN:
                System.out.println("播放向下動畫");
                break;
            default:
                System.out.println("不支援此動作");
        }
    }
    public static void main(String[] args) {
        play(Action.RIGHT);
        play(Action.UP);
    }    
}
