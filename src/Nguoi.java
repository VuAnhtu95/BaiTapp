public class Nguoi {
    private String name = "";
    private long namSinh = 0;
    private long cmnd = 0;
    public Nguoi(){}
    public Nguoi(String name, long namSinh, long cmnd){
        this.name = name;
        this.namSinh = namSinh;
        this.cmnd = cmnd;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(long namSinh) {
        this.namSinh = namSinh;
    }
    public long getCmnd() {
        return cmnd;
    }
    public void setCmnd(long cmnd) {
        this.cmnd = cmnd;
    }
    @Override
    public String toString(){
        return "Khách hàng " + name + " có số chứng minh nhân dân là " + cmnd + " sinh năm " + namSinh;
    }
}
