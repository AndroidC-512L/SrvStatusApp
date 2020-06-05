package vmg.androidc512l.minestats.ServerStatus;

public class McSrvStatDebug {
    private boolean ping;
    private boolean query;
    private boolean srv;
    private boolean querymismatch;
    private boolean ipinsrv;
    private boolean cnameinsrv;
    private boolean animatedmotd;
    private boolean proxy;
    private int cachetime;

    public boolean isPing() {
        return ping;
    }

    public void setPing(boolean ping) {
        this.ping = ping;
    }

    public boolean isQuery() {
        return query;
    }

    public void setQuery(boolean query) {
        this.query = query;
    }

    public boolean isSrv() {
        return srv;
    }

    public void setSrv(boolean srv) {
        this.srv = srv;
    }

    public boolean isQuerymismatch() {
        return querymismatch;
    }

    public void setQuerymismatch(boolean querymismatch) {
        this.querymismatch = querymismatch;
    }

    public boolean isIpinsrv() {
        return ipinsrv;
    }

    public void setIpinsrv(boolean ipinsrv) {
        this.ipinsrv = ipinsrv;
    }

    public boolean isCnameinsrv() {
        return cnameinsrv;
    }

    public void setCnameinsrv(boolean cnameinsrv) {
        this.cnameinsrv = cnameinsrv;
    }

    public boolean isAnimatedmotd() {
        return animatedmotd;
    }

    public void setAnimatedmotd(boolean animatedmotd) {
        this.animatedmotd = animatedmotd;
    }

    public boolean isProxy() {
        return proxy;
    }

    public void setProxy(boolean proxy) {
        this.proxy = proxy;
    }

    public int getCachetime() {
        return cachetime;
    }

    public void setCachetime(int cachetime) {
        this.cachetime = cachetime;
    }
}
