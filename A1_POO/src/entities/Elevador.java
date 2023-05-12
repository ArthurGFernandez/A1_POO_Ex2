package entities;

public class Elevador {
    private int pessoas = 0;
    private int andar = 0;
    private int totalAndar;
    private int capacidadePessoas;

    public int getPessoas() {
        return pessoas;
    }

    public int getAndar() {
        return andar;
    }

    public int getTotalAndar() {
        return totalAndar;
    }

    public void setTotalAndar(int totalAndar) {
        this.totalAndar = totalAndar;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public void entrar(int pessoas) {
        if((pessoas + this.pessoas) > capacidadePessoas){
            throw new RuntimeException("\nFalha. Número máximo de " + this.capacidadePessoas + " pessoas excedido.");
        }else if(pessoas == 0){
            throw new RuntimeException("\nFalha. Número mínimo de 1 pessoa para entrar.");
        }else this.pessoas += pessoas;
    }

    public void sair(int pessoas) {
        if(this.pessoas <= 0){
            throw new RuntimeException("\nNão tem mais ninguém no elevador.");
        }else if(pessoas > this.pessoas){
            throw new RuntimeException("\nFalha. Quantidade digitada é maior do que a quantidade de pessoas no elevador.");
        }else this.pessoas -= pessoas;
    }

    public void subirAndar(int andar){
        if(this.andar == totalAndar){
            throw new RuntimeException("Falha. Já está no último andar.");
        }else if((andar + this.andar) > totalAndar){
            throw new RuntimeException("Falha. Não é possível subir esta quantidade de andares. Último andar é o" + getTotalAndar() + "º");
        }else this.andar += andar;
    }

    public void descerAndar(int andar){
        if(this.andar == 0){
            throw new RuntimeException("Falha. Já está no térreo.");
        }else if((this.andar - andar) < 0){
            throw new RuntimeException("Falha. Não é possível descer esta quantidade de andares. Menor andar é o térreo (Andar Nº 0)");
        }else this.andar -= andar;
    }
}