package cc.openhome;
class ResourceSome implements AutoCloseable {
    void doSome() {
        System.out.println("作一些事");
    }
    @Override
    public void close() throws Exception {
        System.out.println("資源Some被關閉");
    }
}
class ResourceOther implements AutoCloseable {
    void doOther() {
        System.out.println("作其它事");
    }
    @Override
    public void close() throws Exception {
        System.out.println("資源Other被關閉");
    }
}
public class Main2 {    
    public static void main(String[] args) {
        try(ResourceSome some = new ResourceSome();
            ResourceOther other = new ResourceOther()) {
            some.doSome();
            other.doOther(); 
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

