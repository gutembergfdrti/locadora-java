package Calculos;

public class Veiculo {

    public String placa, carro, consumo;
    public float cobustivel, km, valorGasolina, valorAlcool, quantidadaLitros;

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public void mostraRendimento(int tipo) {

        switch (tipo) {
            case 1:
                consumo = "10 km/l";

                break;
            case 2:
                consumo = "11,00 km/l";
                break;
            case 3:
                consumo = "10 km/l";
                break;
            default:
                break;
        }

    }

    public float getCobustivel() {
        return cobustivel;
    }

    public void setCobustivel(float cobustivel) {
        this.cobustivel = cobustivel;
    }

    public float getValorGasolina() {
        return valorGasolina;
    }

    public void setValorGasolina(float valorGasolina) {
        this.valorGasolina = valorGasolina;
    }

    public float getValorAlcool() {
        return valorAlcool;
    }

    public void setValorAlcool(float valorAlcool) {
        this.valorAlcool = valorAlcool;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public float getQuantidadaLitros() {
        return quantidadaLitros;
    }

    public void setQuantidadaLitros(float quantidadaLitros) {
        this.quantidadaLitros = quantidadaLitros;
    }

    public void mostraGasolina(int tipo, float km, float gasolina) {

        switch (tipo) {
            case 1:
                quantidadaLitros = km / 10;
                valorGasolina = gasolina * quantidadaLitros;

                break;
            case 2:
                quantidadaLitros = km / 11;
                valorGasolina = gasolina * quantidadaLitros;

                break;
            case 3:
                quantidadaLitros = km / 10;
                valorGasolina = gasolina * quantidadaLitros;

                break;
            default:
                break;
        }

    }

    public void mostraAlcool(int tipo, float km, float alcool) {

        switch (tipo) {
            case 1:
                quantidadaLitros = km / 10;
                valorAlcool = alcool * quantidadaLitros;

                break;
            case 2:
                quantidadaLitros = km / 11;
                valorAlcool = alcool * quantidadaLitros;

                break;
            case 3:
                quantidadaLitros = km / 10;
                valorAlcool = alcool * quantidadaLitros;

                break;
            default:
                break;
        }

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void mostraRodizio(int tipo) {

        switch (tipo) {
            case 1:
                placa = " Segunda-Feira";

                break;
            case 2:
                placa = " Terça-Feira";
                break;
            case 3:
                placa = " Sexta-Feira";
                break;
            default:
                break;
        }

    }

}
