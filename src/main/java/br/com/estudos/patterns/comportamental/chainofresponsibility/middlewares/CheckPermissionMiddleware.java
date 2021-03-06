package br.com.estudos.patterns.comportamental.chainofresponsibility.middlewares;

/**
 * Handler: Verifica as permissões do usuário.
 */
public class CheckPermissionMiddleware extends Middleware {

    @Override
    public boolean check(String email, String passaword) {
        if (email.equals("master@dev.com.br")) {
            System.out.println("Bem vindo Administrador!");
            return true;
        }
        System.out.println("Bem vindo!");
        return checkNext(email, passaword);
    }
}
