package Blo;

public class ClassExam {
    private String Pais;
    private String Regio;
    private int Temperatura;
    private float Pressio;

    public ClassExam() {
    }

    public ClassExam(String Pais, String Regio, int Temperatura, float Pressio) {
        this.Pais = Pais;
        this.Regio = Regio;
        this.Temperatura = Temperatura;
        this.Pressio = Pressio;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getRegio() {
        return Regio;
    }

    public void setRegio(String Regio) {
        this.Regio = Regio;
    }

    public int getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(int Temperatura) {
        this.Temperatura = Temperatura;
    }

    public float getPressio() {
        return Pressio;
    }

    public void setPressio(float Pressio) {
        this.Pressio = Pressio;
    }
    
}
