import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        ContaDao dao;
        String url = "jdbc:postgresql://aws-1-us-east-1.pooler.supabase.co:5432/postgres?user=postgres.tslgwtmgsonxiuzfypgo";
        dao = new ContaDao(ConnectionFactory.getConnection(url));
        List<Conta> contas;
        contas = dao.lerTodas();
        System.out.println(contas);
    }
}
