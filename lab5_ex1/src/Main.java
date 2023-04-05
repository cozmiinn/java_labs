
class PerecheNumere{
    private int a;
    private int b;

    public PerecheNumere( int a, int b){
        this.a=a;
        this.b=b;
    }

    public PerecheNumere(){}

    public int getA(){
        return a;
    }
    public int getB(){ return b;}

    public int setA(int a){
        this.a=a;
        return a;
    }
    public int setB(int b){
        this.b=b;
        return b;
    }

    public String toString(){
        String text = "";
        text="A= " + this.a + "B= " + this.b;
        return text;
    }

    public int Fibonacci(){
        int c;
        if(((a==1)&&(b=1)||(a==1)&&(b==0)))
            return true;
        else if((a==b)||(b==0))
            return false;

        c=a=b;

        if(c>=0)
            return Fibonacci();
        else return false;
    }

}
public class Main {
    public static void main(String[] args) {

    }
}