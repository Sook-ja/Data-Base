public class Ex5_4 {
    //응용 문제
    public static void main(String [] args){
        float a[] = new float[]{4,3,5,0};
        float b[] = new float[]{3,1,0,2,1};
        Polynomial A = new Polynomial(3,a);
        Polynomial B = new Polynomial(4,b);
        OperatePoly optPoly = new OperatePoly();
        Polynomial C = optPoly.addPoly(A,B);//A+B의 값을 출력함
        System.out.printf("A(x) ="); A.printPoly();
        System.out.printf("B(x) ="); B.printPoly();
        System.out.printf("C(x) ="); C.printPoly();
    }
}

/* 과정은 따로 노트에 필기되어있음
    처음 부분은 expo A가 B보다 작으므로, else 에 걸리므로 c coef엔 indexC(0번째 지수를 뜻함)은 B의 첫번째 지수가 들어가게됨
    다음 부분은 expo A와 B가 같으므로, if else에 걸리게됨 , 오리 인해 coef엔 indexC(1번째 지수를 뜻함)은 A의 첫 지수와 B의 두번째 지수의 합이 들어가게됨
 */
