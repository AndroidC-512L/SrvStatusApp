package vmg.androidc512l.minestats.ServerStatus;

public class McSrvStatMotD {
    private String[] raw,clean,html;

    public String[] getClean() {
        return clean;
    }

    public String[] getRaw() {
        return raw;
    }

    public void setRaw(String[] raw) {
        this.raw = raw;
    }

    public void setClean(String[] clean) {
        this.clean = clean;
    }

    public String[] getHtml() {
        return html;
    }

    public void setHtml(String[] html) {
        this.html = html;
    }
}
