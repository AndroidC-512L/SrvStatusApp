package vmg.androidc512l.minestats.ServerStatus;

public class McSrvStatStatus {
    //Is Online
    private boolean online;
    //IP Address
    private String ip;
    //Port Number
    private int port;
    //Debug Info
    private McSrvStatDebug debug;
    //MotD
    private McSrvStatMotD motd;
    //Players info
    private McSrvStatPlayers players;
    //The Minecraft Versions supported
    private String version;
    //Protocol Version
    private int protocol;
    //Host Name
    private String hostname;
    //Server Icon
    private String icon;
    //Server Hosting Software
    private String software;
    //Map Name
    private String map;
    //Plugins
    private McSrvStatPlugins plugins;
    //Mods
    private McSrvStatMods mods;
    //Info
    private McSrvStatInfo info;

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public McSrvStatDebug getDebug() {
        return debug;
    }

    public void setDebug(McSrvStatDebug debug) {
        this.debug = debug;
    }

    public McSrvStatMotD getMotd() {
        return motd;
    }

    public void setMotd(McSrvStatMotD motd) {
        this.motd = motd;
    }

    public McSrvStatPlayers getPlayers() {
        return players;
    }

    public void setPlayers(McSrvStatPlayers players) {
        this.players = players;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getProtocol() {
        return protocol;
    }

    public void setProtocol(int protocol) {
        this.protocol = protocol;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public McSrvStatPlugins getPlugins() {
        return plugins;
    }

    public void setPlugins(McSrvStatPlugins plugins) {
        this.plugins = plugins;
    }

    public McSrvStatMods getMods() {
        return mods;
    }

    public void setMods(McSrvStatMods mods) {
        this.mods = mods;
    }

    public McSrvStatInfo getInfo() {
        return info;
    }

    public void setInfo(McSrvStatInfo info) {
        this.info = info;
    }
}