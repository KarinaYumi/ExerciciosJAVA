public class Main{
    public static void main(String[] args){
        Moto moto = new Moto();
        Carro carro = new Carro();
        Caminhao caminhao = new Caminhao();

        moto.modelo = "xJ6";
        moto.marca = "YAMAHA";
        moto.cor = "Azul";

        carro.setModelo("Triton L200");
        carro.setMarca("Mitsubishi");
        carro.setCor("Black Piano");

        caminhao.setModelo("Scania 124 C");
        caminhao.setMarca("Scania");
        caminhao.setEixos(8);

        System.out.println("MOTO\nModelo: "+moto.modelo+"\nMarca: "+moto.marca+"\nCor: "+moto.cor);
        System.out.println("CARRO\nModelo: "+carro.getModelo()+"\nMarca: "+carro.getMarca()+"\nCor: "+carro.getCor());
        System.out.println("CAMINHAO\nModelo: "+caminhao.getModelo()+"\nMarca: "+caminhao.getMarca()+"\nEixos: "+caminhao.getEixos());
    }
}
