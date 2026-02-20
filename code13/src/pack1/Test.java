package pack1;

public class Test {

    public int pub;
    protected int prot;
    private int prv;
    //default - package protected
    int def;

    public void print() {
        System.out.println("pub: " + pub);
        System.out.println("prot: " + prot);
        System.out.println("prv: " + prv);
        System.out.println("def: " + def);
    }
}
