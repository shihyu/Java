package cc.openhome;

public enum Action3 implements Command {
    STOP {
        public void execute() {
            System.out.println("播放停止動畫");
        }
    }, 
    RIGHT {
        public void execute() {
            System.out.println("播放右轉動畫");
        }
    }, 
    LEFT {
        public void execute() {
            System.out.println("播放左轉動畫");
        }        
    }, 
    UP {
        public void execute() {
            System.out.println("播放向上動畫");
        }        
    }, 
    DOWN {
        public void execute() {
            System.out.println("播放向下動畫");
        }        
    };
}
