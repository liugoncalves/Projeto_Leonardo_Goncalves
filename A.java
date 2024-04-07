public class A {

    private int a1;
    private float a2;

    public A(int a1, float a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public float getA2() {
        return a2;
    }

    public void setA2(float a2) {
        this.a2 = a2;
    }

    public void mA1() {
        System.out.println("Método mA1 da classe A");
    }

    public void mA2() {
        System.out.println("Método mA2 da classe A");
    }

}
