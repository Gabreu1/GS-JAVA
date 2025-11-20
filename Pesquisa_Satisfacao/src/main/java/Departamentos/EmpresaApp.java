package Departamentos;

public class EmpresaApp {
    public static void main(String[] args) {
        Departamento rh = new Departamento("Recursos Humanos (RH)");
        Departamento marketing = new Departamento("Marketing");
        Departamento ti = new Departamento("Tecnologia da Informação (TI)");



        rh.adicionarFuncionario(new Funcionario("Alice", 1001, true));
        rh.adicionarFuncionario(new Funcionario("Bob", 1002, true));
        rh.adicionarFuncionario(new Funcionario("Carol", 1003, true));
        rh.adicionarFuncionario(new Funcionario("David", 1004, true));
        rh.adicionarFuncionario(new Funcionario("Eva", 1005, true));
        rh.adicionarFuncionario(new Funcionario("Frank", 1006, true));
        rh.adicionarFuncionario(new Funcionario("Grace", 1007, true));
        rh.adicionarFuncionario(new Funcionario("Henry", 1008, false));
        rh.adicionarFuncionario(new Funcionario("Ivy", 1009, false));
        rh.adicionarFuncionario(new Funcionario("Jack", 1010, false));


        marketing.adicionarFuncionario(new Funcionario("Mark A", 2001, true));
        marketing.adicionarFuncionario(new Funcionario("Mark B", 2002, true));
        marketing.adicionarFuncionario(new Funcionario("Mark C", 2003, true));
        marketing.adicionarFuncionario(new Funcionario("Mark D", 2004, true));
        marketing.adicionarFuncionario(new Funcionario("Mark E", 2005, true));
        marketing.adicionarFuncionario(new Funcionario("Mark F", 2006, true));
        marketing.adicionarFuncionario(new Funcionario("Mark G", 2007, true));
        marketing.adicionarFuncionario(new Funcionario("Mark H", 2008, true));
        marketing.adicionarFuncionario(new Funcionario("Mark I", 2009, true));
        marketing.adicionarFuncionario(new Funcionario("Mark J", 2010, true));
        marketing.adicionarFuncionario(new Funcionario("Mark K", 2011, true));
        marketing.adicionarFuncionario(new Funcionario("Mark L", 2012, true));
        marketing.adicionarFuncionario(new Funcionario("Mark M", 2013, false));
        marketing.adicionarFuncionario(new Funcionario("Mark N", 2014, false));
        marketing.adicionarFuncionario(new Funcionario("Mark O", 2015, false));


        ti.adicionarFuncionario(new Funcionario("Tech 1", 3001, true));
        ti.adicionarFuncionario(new Funcionario("Tech 2", 3002, true));
        ti.adicionarFuncionario(new Funcionario("Tech 3", 3003, true));
        ti.adicionarFuncionario(new Funcionario("Tech 4", 3004, true));
        ti.adicionarFuncionario(new Funcionario("Tech 5", 3005, true));
        ti.adicionarFuncionario(new Funcionario("Tech 6", 3006, true));
        ti.adicionarFuncionario(new Funcionario("Tech 7", 3007, true));
        ti.adicionarFuncionario(new Funcionario("Tech 8", 3008, true));
        ti.adicionarFuncionario(new Funcionario("Tech 9", 3009, true));
        ti.adicionarFuncionario(new Funcionario("Tech 10", 3010, true));
        ti.adicionarFuncionario(new Funcionario("Tech 11", 3011, true));
        ti.adicionarFuncionario(new Funcionario("Tech 12", 3012, true));
        ti.adicionarFuncionario(new Funcionario("Tech 13", 3013, true));
        ti.adicionarFuncionario(new Funcionario("Tech 14", 3014, true));
        ti.adicionarFuncionario(new Funcionario("Tech 15", 3015, true));
        ti.adicionarFuncionario(new Funcionario("Tech 16", 3016, false));
        ti.adicionarFuncionario(new Funcionario("Tech 17", 3017, false));
        ti.adicionarFuncionario(new Funcionario("Tech 18", 3018, false));
        ti.adicionarFuncionario(new Funcionario("Tech 19", 3019, false));
        ti.adicionarFuncionario(new Funcionario("Tech 20", 3020, false));


        rh.exibirRelatorio();
        marketing.exibirRelatorio();
        ti.exibirRelatorio();
    }
}