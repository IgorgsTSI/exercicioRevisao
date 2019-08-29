package principal.control;

import principal.model.Automovel;

import java.util.ArrayList;
import java.util.List;

public class AppAutomovel {

    public static void main(String[] args){
        Automovel automovel = new Automovel();
        automovel.setRenavan(1234);
        automovel.setChassi(4321);
        automovel.setCombustivel("Gasolina");
        automovel.setCor("Preto");
        automovel.setNum_rodas(4);
        automovel.setPlaca("iou4633");
        automovel.setQuilometragem(0);
        automovel.setValor_locacao(500);


        List<Automovel> automoveis = new ArrayList<>();
        automoveis.add(automovel);

        Automovel automovel1 = new Automovel(789,"ABC123","cinza", 4, "Gasolina", 0, 240145, 800);
        automoveis.add(automovel1);
    }

}
