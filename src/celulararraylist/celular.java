package celulararraylist;

import java.text.DecimalFormat;

public class celular {
    DecimalFormat df = new DecimalFormat("###.##");
    
    private int num, sgnC; 
    private String name;
    private double prcSgn;
    int aumentSgnC = 20;
    double prcSgnMenos = 0.05;
    
    public celular(int num, int sgnC, String name, double prcSgn) {
        this.num = num;
        this.sgnC = sgnC;
        this.name = name;
        this.prcSgn = prcSgn;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSgnC() {
        return sgnC;
    }

    public void setSgnC(int sgnC) {
        this.sgnC = sgnC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrcSgn() {
        return prcSgn;
    }

    public void setPrcSgn(double prcSgn) {
        this.prcSgn = prcSgn;
    }

    public Double cosCsm() {
        return (sgnC * prcSgn);
    }
    
    public Double prcIgv () {
        return (0.18 * cosCsm());
    }
    
    public Double ttPg () {
        return (cosCsm() + prcIgv());
    }
    
    public int amntSgnC () {
        return (sgnC + aumentSgnC);
    }
    
    public double dsmSgnc () {
        return ((prcSgn) - (prcSgn * prcSgnMenos));
    }
    
    // NUEVOS DATOS
    public Double cosCsmA() {
        return (amntSgnC()*dsmSgnc());
    }
    
    public Double prcIgvA () {
        return (0.18 * cosCsmA());
    }
    
    public Double ttPgA () {
        return (cosCsmA() + prcIgvA());
    }
    
    public void mostrar () {
        System.out.println("Numero : " + getNum() + "\n" +
               "\nUsuario : " + getName() + "\n" +
               "\nSegundo consumidos : " + getSgnC() + "\n" +
               "\nPrecio por segundo : " + getPrcSgn() + "\n" +
               "----------- CALCULOS ----------- " + 
               "\nCosto de consumo : S/" + df.format(cosCsm()) +
               "\nImpuesto IGV : S/" + df.format(prcIgv()) +
               "\nTOTAL A PAGAR : S/" + ttPg() + "\n");
    }
    
    public void mostrar2 () {
        System.out.println("Numero : " + getNum() + "\n" +
               "\nUsuario : " + getName() + "\n" +
               "\nSegundo consumidos : " + amntSgnC() + "\n" +
               "\nPrecio por segundo : " + dsmSgnc() + "\n" +
               "----------- CALCULOS ----------- " + 
               "\nCosto de consumo : S/" + df.format(cosCsmA()) +
               "\nImpuesto IGV : S/" + df.format(prcIgvA()) +
               "\nTOTAL A PAGAR : S/" + df.format(ttPgA()) + "\n");
    }
}
