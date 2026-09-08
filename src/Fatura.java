import java.util.ArrayList;

public class Fatura {

    private ArrayList<Item> itens;

    public Fatura() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(int indice) {
        itens.remove(indice);
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public double calcularTotal() {

        double total = 0;

        for (Item item : itens) {
            total += item.calcularTotal();
        }

        return total;
    }
}