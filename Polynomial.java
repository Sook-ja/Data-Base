public class Polynomial {
    private int degree; //지수(차수)를 의미함
    private float coef[] = new float[20];// degree+1의 갯수의 차수가 들어옴

    public Polynomial(int degree, float coef[]) { //차수와 지수가 들어옴
        this.degree = degree;
        this.coef = coef;
    }

    Polynomial(int degree) { //차수만 들어온경우 빈칸처리
        this.degree = degree;
        for (int i = 0; i <= degree; i++) {
            this.coef = coef;
        }
    }

    public int getDegree() { //차수 뱉어냄
        return this.degree;
    }

    public float getCoef(int i) { //i번째 지수를 뱉어냄
        return this.coef[i];
    }

    public float setCoef(int i, float coef) { //i번째 지수를 지정해줌
        return this.coef[i] = coef;
    }

    public void printPoly(){
        int temp = this.degree;
        for(int i=0;i<this.degree;i++){
            System.out.printf("3.f x ^%d",this.coef[i],temp--);
        }

        System.out.println();
    }
}
