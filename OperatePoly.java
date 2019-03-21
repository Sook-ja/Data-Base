public class OperatePoly {
    private int degree_A=0,degree_B=0,degree_C=0,index_A=0,index_B=0,index_C=0;
    private int expo_A,expo_B;
    private float coef_A,coef_B,coef_C;

    public Polynomial addPoly(Polynomial A, Polynomial B){ //더하기 작용
        degree_A = A.getDegree();//A의 차수를 얻어와 저장
        degree_B = B.getDegree();//B의 차수를 얻어와 저장
        expo_A = degree_A;
        expo_B = degree_B;

        if(degree_A >= degree_B) degree_C=degree_A; //a의 차수가 큰 경우 c에 a의 차수를 넣음
        else degree_C=degree_B;//b의 차수가 큰 경우 c에 b의 차수를 넣음

        Polynomial C =  new Polynomial(degree_C);

        while(index_A<=degree_A && index_B<=degree_B) //A의 차수가 0이 되거나 B의 차수가 0이 될때 까지 반복됨
            {
                if(expo_A>expo_B){//비교 A의 차수 > 비교 B의 차수
                    C.setCoef(index_C++, A.getCoef(index_A++)); //C의 계수 설정(안에 걸로)
                    //안에 건?(C의 인덱스는 0, A의 계수 설정(A의 인덱스는 1이다.)==> A의 n째 계수를 C의 n번째 인덱스로 넣어준다.)
                    expo_A--; // A의 차수를 내림
                }

                else if(expo_A == expo_B){//비교 A의 차수 == 비교 B의 차수 일 경우?
                    C.setCoef(index_C++,A.getCoef(index_A++)+B.getCoef(index_B++));
                }
                else{ //비교 A의 차수 < 비교 B의 차수수
                    C.setCoef(index_C++,B.getCoef(index_B++)); // B의 n번째 계수를 C의 n번째 인덱스로 넣어준다.
                    expo_B--;
                }
            }

        return C;
    }


}
