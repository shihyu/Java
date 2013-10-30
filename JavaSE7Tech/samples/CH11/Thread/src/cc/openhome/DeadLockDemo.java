package cc.openhome;

class Resource {
    private String name;
    private int resource;

    Resource(String name, int resource) {
        this.name = name;
        this.resource = resource;
    }

    String getName() {
        return name;
    }
    
    synchronized int doSome() {
        return ++resource;
    }
    
    synchronized void cooperate(Resource resource) {
        resource.doSome();
        System.out.printf("%s 整合 %s 的資源%n", this.name, resource.getName());
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
        final Resource resource1 = new Resource("resource1", 10);
        final Resource resource2 = new Resource("resource2", 20);
        Thread t1 = new Thread() {
            public void run() {
                for(int i = 0; i < 10; i++) {
                    resource1.cooperate(resource2);
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for(int i = 0; i < 10; i++) {
                    resource2.cooperate(resource1);
                }
            }
        };
        t1.start();
        t2.start();
    }
}
