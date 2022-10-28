package Game;

public class DieCup {

    private int faceValue1, faceValue2, sum, maxFaceValue;//hvad øjnene viser
    public DieCup(int dieSides){
        maxFaceValue = dieSides;
    }

    public void roll () {                    //terninger ruller
        faceValue1 = (int)(Math.random()*maxFaceValue)+1;
        faceValue2 = (int) (Math.random()*maxFaceValue)+1;
    }
    public int getFaceValue1 () {            //Terningeøje 1
        return faceValue1;
    }
    public int getFaceValue2 () {            //Terningeøje 2
        return faceValue2;
    }
    public int getSum() {
        sum = faceValue1+faceValue2;
        return sum;
    }
}