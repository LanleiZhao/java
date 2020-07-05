package day15.InterfaceTest;

/**
 * 代理proxy模式
 */
public class NetworkProxy {
    public static void main(String[] args) {

        ProxyServer proxyServer = new ProxyServer(new Server());
        proxyServer.brower();
    }
}

interface Network{
    public abstract void brower();
}

// 被代理类
class Server implements Network {
    @Override
    public void brower() {
        System.out.println("真实服务器访问");
    }
}

// 代理类
class ProxyServer implements Network {
    private Network network;

    public ProxyServer(Network network) {
        this.network = network;
    }

    public void check() {
        System.out.println("联网前的检查");
    }
    @Override
    public void brower() {
        check();
        this.network.brower();
    }
}