public class Leg {
    double feetl;
    double size;

    public String toString()
    {
        String s ="Длинна ног: " + feetl + '\n' + "Размер обуви: " + size + '\n';
        return s ;
    }

    public double getFeetL(){
        return feetl;
    }
    public double getSize() {
        return size;
    }

    public void setFeetl(double feetl){
        this.feetl = feetl;
    }

    public void setSize(double size) {this.size = size;}
}