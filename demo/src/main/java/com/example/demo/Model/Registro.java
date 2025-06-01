package com.example.demo.Model;

public class Registro {

    private int id;          // nuevo campo ID
    private String campo1;
    private String campo2;
    private String campo3;
    private String campo4;

    public Registro(int id, String campo1, String campo2, String campo3, String campo4) {
        this.id = id;
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
        this.campo4 = campo4;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCampo1() { return campo1; }
    public void setCampo1(String campo1) { this.campo1 = campo1; }

    public String getCampo2() { return campo2; }
    public void setCampo2(String campo2) { this.campo2 = campo2; }

    public String getCampo3() { return campo3; }
    public void setCampo3(String campo3) { this.campo3 = campo3; }

    public String getCampo4() { return campo4; }
    public void setCampo4(String campo4) { this.campo4 = campo4; }
}
