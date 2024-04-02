package graphic;

public class MasterMenu {
    public MasterMenu() {
    }

    @Override
    public String toString() {
        return "MasterMenu{}";
    }

    public  void menu(){
        int tamMenu = 50;
        System.out.println("-".repeat(tamMenu));
        System.out.println("[0] Criar Cadrastro");
        System.out.println("[1] Atualizar Cliente");
        System.out.println("[2] Remover Cliente");
        System.out.println("[3] Sair.");
        System.out.println("-".repeat(tamMenu));
    }


}

