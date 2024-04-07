public class B {

    private int b1;
    private float b2;

    public B(int b1, float b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public float getB2() {
        return b2;
    }

    public void setB2(float b2) {
        this.b2 = b2;
    }

    public void mB1() {
        System.out.println("Método mB1 da classe B");
    }

    public void mB2() {
        System.out.println("Método mB2 da classe B");
    }

}
