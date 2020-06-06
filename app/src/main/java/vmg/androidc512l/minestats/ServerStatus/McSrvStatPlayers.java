package vmg.androidc512l.minestats.ServerStatus;

public class McSrvStatPlayers {
    private int online,max;
    private String[] list;

    public int getMax() {
        return max;
    }

    public int getOnline() {
        return online;
    }

    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setOnline(int online) {
        this.online = online;
    }
}
