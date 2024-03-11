package Esercizio2;

public class LitriKilometri {
    private double litri;
    private double kilometri;

    public LitriKilometri() {
        this.litri =litri;
        this.kilometri =kilometri;
}

    public void setLitri(int litri) {
        this.litri = litri;
    }


    public void setKilometri(int kilometri) {
        this.kilometri = kilometri;
    }

    public double kilometriAlLitro(){
        try{
            return this.kilometri/this.litri;
        }catch (ArithmeticException e){
            System.out.println ("Errore: divisione per zero");
            return 0;
    }
    }
}
